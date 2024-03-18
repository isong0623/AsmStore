package com.haoda.common.net.service.console.category

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("详情")
			const val DETAIL_CATEGORY_Url = "category/category/detail";
			@Description("上传图片")
			const val UPLOAD_PICTURE_CATEGORY_Url = "category/category/uploadPicture";
			@Description("删除")
			const val DELETE_CATEGORY_Url = "category/category/delete";
			@Description("修改")
			const val UPDATE_CATEGORY_Url = "category/category/update";
			@Description("分页查询")
			const val PAGE_CATEGORY_Url = "category/category/page";
			@Description("获取带等级商品分类")
			const val LEVEL_LIST_CATEGORY_Url = "category/category/levelList";
			@Description("添加")
			const val SAVE_CATEGORY_Url = "category/category/save";
			@Description("获取一级商品分类")
			const val GET_FIRST_CATEGORY_CATEGORY_Url = "category/category/getFirstCategory";
		}
	}
}
