package com.haoda.common.net.service.mall.memberExplore

import com.haoda.common.net.annotation.Description

class Constants {
	interface API {
		companion object {
			@Description("评论点赞")
			const val COMMENT_STAR_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/commentStar";
			@Description("取消关注")
			const val CANCEL_FOLLOW_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/cancelFollow";
			@Description("点赞")
			const val STAR_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/star";
			@Description("评论举报")
			const val COMMENT_REPORT_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/commentReport";
			@Description("分页获取关注文章信息")
			const val GET_FOLLOWED_ARTICLE_PAGE_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/getFollowedArticlePage";
			@Description("用户关注数量")
			const val MEMBERFOLLOW_COUNT_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/memberfollowCount";
			@Description("关注")
			const val FOLLOW_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/follow";
			@Description("评论取消点赞")
			const val COMMENT_CANCEL_STAR_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/commentCancelStar";
			@Description("分页获取发布者信息")
			const val FOLLOWED_PUBLISHER_PAGE_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/followedPublisherPage";
			@Description("取消点赞")
			const val CANCEL_STAR_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/cancelStar";
			@Description("发布文章评论")
			const val ARTICLE_COMMENT_MEMBER_EXPLORE_Url = "memberExplore/memberExplore/articleComment";
		}
	}
}
