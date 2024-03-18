package org.kotlin.annotationProcessor

import java.io.File
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.Element
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic.Kind.ERROR
import javax.tools.Diagnostic.Kind.WARNING

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes("org.kotlin.annotationProcessor.Router")
@SupportedOptions(RouterProcessor.KAPT_KOTLIN_GENERATED_OPTION_NAME)
class RouterProcessor : AbstractProcessor() {
    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }

    override fun process(annotations: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment): Boolean {
        val annotatedElements = roundEnv.getElementsAnnotatedWith(Router::class.java)
        if (annotatedElements.isEmpty()) return false

        val kaptKotlinGeneratedDir = processingEnv.options[KAPT_KOTLIN_GENERATED_OPTION_NAME] ?: run {
            processingEnv.messager.printMessage(ERROR, "Can't find the target directory for generated Kotlin files.")
            return false
        }

        var sbConstants = StringBuilder()
        var sbRules = StringBuilder()
        var sbImports = StringBuilder()
        var strPackage = ""

        for(elememt:Element in annotatedElements){
            sbImports.append("import $elememt\n")

            var routerKey: String = elememt.getAnnotation(Router::class.java).key
            val routerDescription: String = elememt.getAnnotation(Router::class.java).description
            val routerVisible: RouterVisibleLevel = elememt.getAnnotation(Router::class.java).visible
            if (routerKey == null || routerKey.trim { it <= ' ' }.length == 0) {
                routerKey = "$elememt"
                routerKey = routerKey.substring(routerKey.lastIndexOf(".")+1)
            }
            var module = "$elememt".replace("com.haoda.","")
            module = module.substring(0,module.indexOf("."))
            routerKey = String.format("%s_%s",module.toUpperCase(),routerKey.toUpperCase())
            if(strPackage.trim().length==0) strPackage = "package com.haoda.$module\n\n"

            var className = "$elememt"
            className = className.substring(className.lastIndexOf(".")+1)

            sbConstants.append("\t\t@JvmStatic\n")
            if(routerDescription!=null&&routerDescription.trim().length>0){
                sbConstants.append("\t\t@Description(\"$routerDescription\")\n")
            }
            sbConstants.append("\t\t")
            if(routerVisible == RouterVisibleLevel.Module) sbConstants.append("private ")
            sbConstants.append("val $routerKey : String = \"$elememt\"\n")

            sbRules.append("RouterManager.registerRule($routerKey,$className::class.java)\n")
        }

        var sbClass = StringBuilder(
                "$strPackage" +
                "import kotlin.jvm.JvmStatic\n"+
                "import com.haoda.common.core.RouterManager\n" +
                "import org.kotlin.annotationProcessor.Description\n" +
                "import com.haoda.common.core.IRouterRegister\n"+
                "$sbImports" +
                "\n" +
                "/**\n" +
                " * @author Isidore\n" +
                " * @AutoGennerate 全局路由注册器\n" +
                " * @see org.kotlin.annotationProcessor.RouterProcessor\n" +
                " */\n" +
                "open class RouterFactory : IRouterRegister{\n" +
                "    companion object{\n" +
                "$sbConstants" +
                "    }\n\n" +
                "   override fun registerRouter(){\n" +
                "       $sbRules" +
                "   }\n" +
                "}")

        File(kaptKotlinGeneratedDir, "RouterFactory.kt").apply {
            parentFile.mkdirs()
            writeText(sbClass.toString())
        }

        return true
    }
}