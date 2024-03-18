package com.haoda.common.net.service.console.exploreArticle

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("添加")
			const val SAVE_3_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/save";
			@Description("获取以选择商品id列表")
			const val GET_SELECTED_PRODECT_IDSEXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/getSelectedProdectIds";
			@Description("评论删除")
			const val ARTICLE_COMMENT_DELETE_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/articleCommentDelete";
			@Description("分页查询")
			const val PAGE_4_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/page";
			@Description("取消发布")
			const val UNPUBLISH_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/unpublish";
			@Description("分页获取文章评论信息")
			const val GET_ARTICLE_COMMENT_PAGE_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/getArticleCommentPage";
			@Description("发布")
			const val PUBLISH_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/publish";
			@Description("详情")
			const val DETAIL_3_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/detail";
			@Description("设置商品")
			const val SET_PRODUCTS_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/setProducts";
			@Description("修改")
			const val UPDATE_3_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/update";
			@Description("删除")
			const val DELETE_3_EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/delete";
			@Description("上传图片")
			const val UPLOAD_PICTURE_1EXPLORE_ARTICLE_Url = "exploreArticle/exploreArticle/uploadPicture";
		}
	}
}
