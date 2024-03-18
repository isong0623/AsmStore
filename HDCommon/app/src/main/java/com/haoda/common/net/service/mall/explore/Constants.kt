package com.haoda.common.net.service.mall.explore

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("分页获取发布者点赞文章信息")
			const val APP_PUBLISHER_STAR_PAGE_EXPLORE_Url = "explore/explore/appPublisherStarPage";
			@Description("分页获取发布者文章信息")
			const val GET_PUBLISHER_ARTICLE_PAGE_EXPLORE_Url = "explore/explore/getPublisherArticlePage";
			@Description("分页获取文章评论信息")
			const val GET_ARTICLE_COMMENT_PAGE_EXPLORE_Url = "explore/explore/getArticleCommentPage";
			@Description("文章详细信息")
			const val ARTICLE_DETAIL_EXPLORE_Url = "explore/explore/articleDetail";
			@Description("发布者详细信息")
			const val PUBLISHER_INDEX_EXPLORE_Url = "explore/explore/publisherIndex";
			@Description("分页获取文章信息")
			const val GET_ARTICLE_PAGE_EXPLORE_Url = "explore/explore/getArticlePage";
		}
	}
}
