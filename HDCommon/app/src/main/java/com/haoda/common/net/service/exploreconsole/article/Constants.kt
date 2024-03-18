package com.haoda.common.net.service.exploreconsole.article

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("发布")
			const val PUBLISH_ARTICLE_Url = "article/article/publish";
			@Description("分页查询")
			const val PAGE_ARTICLE_Url = "article/article/page";
			@Description("修改")
			const val CONSOLE_UPDATE_ARTICLE_Url = "article/article/consoleUpdate";
			@Description("评论删除")
			const val ARTICLE_COMMENT_DELETE_ARTICLE_Url = "article/article/articleCommentDelete";
			@Description("获取商品列表")
			const val GET_PORDUCTS_ARTICLE_Url = "article/article/getPorducts";
			@Description("删除")
			const val CONSOLE_DELETE_ARTICLE_Url = "article/article/consoleDelete";
			@Description("文章详细信息")
			const val DETAIL_ARTICLE_Url = "article/article/detail";
			@Description("添加")
			const val CONSOLE_SAVE_ARTICLE_Url = "article/article/consoleSave";
			@Description("取消发布")
			const val UNPUBLISH_ARTICLE_Url = "article/article/unpublish";
			@Description("分页获取文章评论信息")
			const val GET_ARTICLE_COMMENT_PAGE_ARTICLE_Url = "article/article/getArticleCommentPage";
			@Description("上传图片")
			const val UPLOAD_PICTURE_ARTICLE_Url = "article/article/uploadPicture";
		}
	}
}
