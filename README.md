@[TOC](扑货团子项目架构设计概要)
<br />
# 开发环境
***
* IDE:Android Studio 4.0.2(193.6911.18.40.6821437)+
* JDK: 1.8.0+
* 开发语言：Java、Kotlin（主要）

<br />

# 架构设计概述
***
* ***整个项目采用多模块化的组件式开发用于解决编译时间过长及协作开发耦合过高的问题。***
* **整体架构** 采用MVP解耦方案（Activity、Fragment、View），后期将会采用动态架构（根据业务复杂程度决定使用MVC、MVP或MVVM）。
* **网络请求** 采用Retrofit2+rxJava+cache生成。
* **路由方案** 在参考诸多解决方案后采用基于kapt+SPI动态注册的自研路由方案。
* **数据库及本地存储方案** 采用realm（多版本并发控制数据库），允许在持久层直接和数据对象工作，函数式风格的查询api，比传统的SQLite 操作更快 。
* **图片加载** 普通图片采用目前较为成熟的Glide加载，GIF则采用[gif-drawable](https://github.com/koral--/android-gif-drawable)，背景采用[ShadowLayout](https://github.com/lihangleo2/ShadowLayout/tree/3.0.4)。
* **日志系统** 采用[XLOG](https://github.com/elvishew/XLog/blob/master/README_ZH.md)记录日志及本地存储，后期将接入WorkManager上传本地异常日志到服务器。
***
<br />
<br />

# 项目模块划分
***
### 公共 project-common
* 测试 module-test
	- 该模块主要完成自动化测试工作

### 商城 project-mall
* 商品 module-commodity
	* 会员推送列表
	* 购物车推送列表
	* 热卖推送列表
	* 商品详情
	* 猜你喜欢
* 金刚区 module-category
* 购物车 module-cart
* 订单 module-order
* 收货地址 module-address
* 优惠券 module-coupon

### 发现 project-discovery
* 发现列表 module-find

### 直播 project-live
* 主播端 module-host
* 观众端 module-viewer

### 用户 project-user
* 基本信息 module-userinfo
* 会员 module-vip
* 积分 module-score
* 关注列表 module-follow
* 收益 module-earnings
* 粉丝 module-fans

### 首页 project-home
* 抽奖 module-lottery
* 搜索 module-search

<br />
<br />

# 代码规范
***
### 风格规范
* 采用阿里巴巴基于IDEA的[P3C](https://github.com/alibaba/p3c)风格约束，接入[Demo](https://blog.csdn.net/qq_39560484/article/details/81087010)
### 标识符命名方法
* **小驼峰命名法** 除首单词外，其余所有单词的第一个字母大写。如：allPrice，getAllNames
* **驼峰命名法** 所有单词的第一个字母大写。如：GuideActivity，StudentInfoBean
* **小写下划线命名法**采用小写下划线命名法:单词与单词间用下划线做间隔。如：activity_main,select_background_color
* **大写下划线命名法** 采用大写下划线命名法:单词与单词间用下划线做间隔，且尽量包含充足的信息。如：LIVE_SOCKET_TYPE_STATUS_OK

### 包（packages）的命名规范
采用反域名命名规则，全部使用小写字母。前二级包名固定为com.haoda.，三级级包名为project名（如：common、mall、find等），四级包名ui或utils等（模块名或层级名），根据实际情况也是可以用五级包名，六级包名等。
* base 基类相关
* core 核心服务或调度相关
* utils 函数工具类相关
* ui 页面相关
* net 网络请求相关
* tools UI工具类相关
* widget 自定义控件相关
* framework 页面框架相关

### 其他命名规范
* **类（classes）的命名规范**  ：
	采用大驼峰命名法，尽量避免缩写。
* **接口（interface）** ：
	命名规则与类一样采用大驼峰命名法，多以able或ible结尾或以I开头，如Runnable、Accessible、IUser。
* **方法（methods）的命名规则** ：
	一般使用动词或动名词，采用小驼峰命名法。
* 	**变量（variables）** ：
	采用小驼峰命名法。
* **常量（constants）**：
	采用大写下划线命名法.。
* **XML文件（布局文件）**：
	全部小写，采用下划线命名法，必须包含模块名，对于拆分的文件应加part标识。
* **资源文件（图片）**：
	采用下划线命名法，加前缀区分。
* **动画文件（anim包）**：
	全部小写，采用下划线命名法，加前缀区分。
* **资源ID（resources id）**：
	采用小驼峰命名法。