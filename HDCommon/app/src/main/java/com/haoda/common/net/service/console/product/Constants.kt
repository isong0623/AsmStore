package com.haoda.common.net.service.console.product

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("下架")
			const val UNPUBLISH_1_PRODUCT_Url = "product/product/unpublish";
			@Description("获取列表")
			const val LIST_3_PRODUCT_Url = "product/product/list";
			@Description("修改商品分享图片")
			const val UPDATE_IMG_PRODUCT_Url = "product/product/upImage";
			@Description("修改")
			const val UPDATE_15_PRODUCT_Url = "product/product/update";
			@Description("详情")
			const val DETAIL_19_PRODUCT_Url = "product/product/detail";
			@Description("商品分类ID获取商品列表")
			const val PAGE_BY_CATEGORY_ID_PRODUCT_Url = "product/product/pageByCategoryId";
			@Description("删除")
			const val DELETE_14_PRODUCT_Url = "product/product/delete";
			@Description("搜索刷新")
			const val REFRESH_ALL_PRODUCT_Url = "product/product/refreshAll";
			@Description("上架")
			const val PUBLISH_1_PRODUCT_Url = "product/product/publish";
			@Description("分页查询")
			const val PAGE_21_PRODUCT_Url = "product/product/page";
			@Description("添加")
			const val SAVE_15_PRODUCT_Url = "product/product/save";
			@Description("上传图片")
			const val UPLOAD_PICTURE_7PRODUCT_Url = "product/product/uploadPicture";
		}
	}
}
