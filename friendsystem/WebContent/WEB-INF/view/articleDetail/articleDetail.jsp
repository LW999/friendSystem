<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/stream.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-00e12f5a757a30f65da3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<style type="text/css">
@charset "UTF-8";
/*
 * 变量
*/
.like[data-v-6ddd02c6] {
	display: inline-block;
}

.like .like-group[data-v-6ddd02c6] {
	position: relative;
	padding: 13px 0 15px 0;
	font-size: 0;
	border: 1px solid #EA6F5A;
	border-radius: 40px;
}

.like .like-group[data-v-6ddd02c6]:hover {
	background-color: rgba(236, 97, 73, 0.05);
}

.like .like-group .btn-like[data-v-6ddd02c6] {
	display: inline-block;
	font-size: 19px;
}

.like .like-group .btn-like[data-v-6ddd02c6]:before {
	content: '';
	position: absolute;
	left: 12px;
	top: 2px;
	width: 50px;
	height: 50px;
	background-image:
		url(//cdn2.jianshu.io/assets/web/like_animation_steps-62a00a7b52377d3069927cdb8e61fd34.png);
	background-position: left;
	background-repeat: no-repeat;
	background-size: 1000px 50px;
}

.like .like-group .btn-like a[data-v-6ddd02c6] {
	position: relative;
	padding: 18px 30px 18px 55px;
	color: #EA6F5A;
}

.like .like-group .modal-wrap[data-v-6ddd02c6] {
	font-size: 18px;
	border-left: 1px solid rgba(236, 97, 73, 0.4);
	display: inline-block;
	margin-left: -15px;
}

.like .like-group .modal-wrap a[data-v-6ddd02c6] {
	color: #EA6F5A;
	padding: 18px 26px 18px 18px;
}

.like .like-group.like-animation[data-v-6ddd02c6], .like .like-group.active[data-v-6ddd02c6]
	{
	background-color: #EA6F5A;
}

.like .like-group.like-animation .btn-like a[data-v-6ddd02c6], .like .like-group.active .btn-like a[data-v-6ddd02c6]
	{
	color: white;
}

.like .like-group.like-animation .modal-wrap[data-v-6ddd02c6], .like .like-group.active .modal-wrap[data-v-6ddd02c6]
	{
	border-left: 1px solid white;
}

.like .like-group.like-animation .modal-wrap a[data-v-6ddd02c6], .like .like-group.active .modal-wrap a[data-v-6ddd02c6]
	{
	color: white;
}

.like .like-group.like-animation .btn-like[data-v-6ddd02c6]:before {
	-webkit-animation: likeBlast-data-v-6ddd02c6 0.6s 1 steps(19);
	animation: likeBlast-data-v-6ddd02c6 0.6s 1 steps(19);
	background-position: right;
}

@
-webkit-keyframes likeBlast { 0% {
	background-position: left;
}

100%
{
background-position




:


 


right




;
}
}
@
keyframes likeBlast-data-v-6ddd02c6 { 0% {
	background-position: left;
}

100%
{
background-position




:


 


right




;
}
}
.like .like-group.active .btn-like[data-v-6ddd02c6]:before {
	background-position: right;
}
</style>
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<title>${article_DetailsDTO.article.articleTitle }</title>
</head>
<body class="reader-black-font" lang="zh-CN">
	<!-- 头部 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="note">
		<div class="post">
			<div class="article">
				<h1 class="title">${article_DetailsDTO.article.articleTitle }</h1>

				<!-- 作者区域 -->
				<div class="author">
					<a class="avatar" href="#"> <img
						src="${pageContext.request.contextPath}/img/user.do?fileFileName=${article_DetailsDTO.user.userPortrait}"
						alt="96">
					</a>
					<div class="info">
						<span class="name"><a href="#">${article_DetailsDTO.user.userName}</a></span>
						<!-- 关注用户按钮 -->
						<a class="btn btn-success follow"><i
							class="iconfont ic-follow"></i><span>关注</span></a>
						<!-- 文章数据信息 -->
						<div class="meta">
							<!-- 如果文章更新时间大于发布时间，那么使用 tooltip 显示更新时间 -->
							<span class="publish-time">${article_DetailsDTO.article.articleModifytime}</span>
							<span class="wordage">字数 715</span> <span class="views-count">阅读
								${article_DetailsDTO.article.articleViews} </span><span
								class="comments-count">评论</span><span class="likes-count">喜欢
								${article_DetailsDTO.like }</span>
						</div>
					</div>
					<!-- 如果是当前作者，加入编辑按钮 -->
				</div>

				<!-- 文章内容 -->
				<div data-note-content="" class="show-content">
					<div class="show-content-free">
						<div class="image-package">
							<div class="image-container"
								style="max-width: 589px; max-height: 645px; background-color: transparent;">
								<div class="image-caption"></div>
							</div>

							<!-- 文章显示区域 -->
							${article_DetailsDTO.article.articleContent }
						</div>
					</div>
				</div>

				<div class="show-foot">
					<a class="notebook" href="/nb/3856427"> <i
						class="iconfont ic-search-notebook"></i> <span>${article_DetailsDTO.user.userName }</span>
					</a>
					<div class="copyright" data-toggle="tooltip" data-html="true"
						data-original-title="转载请联系作者获得授权，并标注“简书作者”。">© 著作权归作者所有</div>
					<div class="modal-wrap" data-report-note="">
						<a id="report-modal">举报文章</a>
					</div>
				</div>

				<!-- 文章底部作者信息 -->
				<div class="follow-detail">
					<div class="info">
						<a class="avatar" href="#"> <img
							src="${pageContext.request.contextPath}/img/user.do?fileFileName=${article_DetailsDTO.user.userPortrait}"
							alt="96">
						</a> <a class="btn btn-success follow"><i
							class="iconfont ic-follow"></i><span>关注</span></a> <a class="title"
							href="/u/cee06b2093af">${article_DetailsDTO.user.userName } </a>
						<p>总浏览量${views}，被 2人关注，获得了${article_DetailsDTO.allLike } 个喜欢</p>
					</div>
					<div class="signature">个人简介:${article_DetailsDTO.user.userSynopsis }</div>
				</div>

				<div class="meta-bottom">
					<div data-v-6ddd02c6="" class="like">

						<div data-v-6ddd02c6="" class="btn like-group">
							<!-- btn like-group like-animation -->

							<div data-v-6ddd02c6="" class="btn-like">
								<a data-v-6ddd02c6="" >喜欢</a>
							</div>

							<div data-v-6ddd02c6="" class="modal-wrap" id="qwe">
								<a data-v-6ddd02c6="" onclick="like(this)" >${article_DetailsDTO.like }</a>
							</div>

						</div>
						<!---->
					</div>
					<div id="comment-list" class="comment-list">
						<div>
							<form class="new-comment">
								<a class="avatar"><img
									src="${pageContext.request.contextPath}/img/user.do?fileFileName=bb38223dcca747baa7a10b4850a6f049.png"></a>
								<div class="sign-container">
									<a
										href="/sign_in?utm_source=desktop&amp;utm_medium=not-signed-in-comment-form"
										class="btn btn-sign">登录</a> <span>后发表评论</span>
								</div>
							</form>
							<!---->
						</div>
						<!---->
						<div class="comments-placeholder" style="display: none;">
							<div class="author">
								<div class="avatar"></div>
								<div class="info">
									<div class="name"></div>
									<div class="meta"></div>
								</div>
							</div>
							<div class="text"></div>
							<div class="text animation-delay"></div>
							<div class="tool-group">
								<i class="iconfont ic-zan-active"></i>
								<div class="zan"></div>
								<i class="iconfont ic-list-comments"></i>
								<div class="zan"></div>
							</div>
						</div>
						<div id="normal-comment-list" class="normal-comment-list">
							<div>
								<div>
									<div class="top-title">
										<span>25条评论</span> <a class="author-only">只看作者</a> <a
											class="close-btn" style="display: none;">关闭评论</a>
										<div class="pull-right">
											<a class="active">按时间倒序</a> <a class="">按时间正序</a>
										</div>
									</div>
								</div>
								<!---->
								<!---->
								<div class="comments-placeholder" style="display: none;">
									<div class="author">
										<div class="avatar"></div>
										<div class="info">
											<div class="name"></div>
											<div class="meta"></div>
										</div>
									</div>
									<div class="text"></div>
									<div class="text animation-delay"></div>
									<div class="tool-group">
										<i class="iconfont ic-zan-active"></i>
										<div class="zan"></div>
										<i class="iconfont ic-list-comments"></i>
										<div class="zan"></div>
									</div>
								</div>

								<div id="comment-29705040" class="comment">
									<div>
										<div class="author">
											<div data-v-f3bf5228="" class="v-tooltip-container"
												style="z-index: 0;">
												<div class="v-tooltip-content">
													<a href="#" target="_blank" class="avatar"><img
														src="//upload.jianshu.io/users/upload_avatars/8312573/0a89da57-65e5-423c-8d8a-f257eba1388a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
												</div>
												<!---->
											</div>
											<div class="info">
												<a href="/u/6c43219713a5" target="_blank" class="name">暖暖的柠檬树</a>
												<!---->
												<!---->
												<div class="meta">
													<span>10楼 · 2018.10.17 21:20</span>
												</div>
											</div>
										</div>
										<div class="comment-wrap">
											<p>
												大道至简<img src="//static.jianshu.io/assets/emojis/+1.png"
													alt=":+1:" title=":+1:" class="emoji" width="20"
													height="20"><img
													src="//static.jianshu.io/assets/emojis/+1.png" alt=":+1:"
													title=":+1:" class="emoji" width="20" height="20">
											</p>
											<div class="tool-group">
												<a data-v-cdecbe24="" id="like-button-29705040"
													class="like-button"><span data-v-cdecbe24="">赞</span></a> <a
													class=""><i class="iconfont ic-comment"></i> <span>回复</span></a>
												<!---->
												<!---->
											</div>
										</div>
									</div>
									<div class="sub-comment-list hide">
										<!---->
										<!---->
									</div>
								</div>

								<div id="comment-29539196" class="comment">
									<div>
										<div class="author">
											<div data-v-f3bf5228="" class="v-tooltip-container"
												style="z-index: 0;">
												<div class="v-tooltip-content">
													<a href="/u/336801e4b84d" target="_blank" class="avatar"><img
														src="//upload.jianshu.io/users/upload_avatars/3773633/6c967515-aadf-451c-85f2-de2748a3b380.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
												</div>
												<!---->
											</div>
											<div class="info">
												<a href="/u/336801e4b84d" target="_blank" class="name">高颖苗Darren</a>
												<!---->
												<!---->
												<div class="meta">
													<span>8楼 · 2018.10.12 23:26</span>
												</div>
											</div>
										</div>
										<div class="comment-wrap">
											<p>还门道呢，想骗你钱而已，自己还没赚的够开花呢，会傻不拉几的告你一个陌生人？</p>
											<div class="tool-group">
												<a data-v-cdecbe24="" id="like-button-29539196"
													class="like-button"><span data-v-cdecbe24="">赞</span></a> <a
													class=""><i class="iconfont ic-comment"></i> <span>回复</span></a>
												<!---->
												<!---->
											</div>
										</div>
									</div>
									<div class="sub-comment-list hide">
										<!---->
										<!---->
									</div>
								</div>

								<div id="comment-28793185" class="sub-comment">
									<p>
									<div data-v-f3bf5228="" class="v-tooltip-container"
										style="z-index: 0;">
										<div class="v-tooltip-content">
											<a href="/u/c1ee0cbb0bfb" target="_blank">星流瀑布</a>：
										</div>
										<!---->
									</div>
									<span><a href="/u/79174c45f369" class="maleskine-author"
										target="_blank" data-user-slug="79174c45f369">@米米心</a>
										我有门道，可以聊聊</span>
									</p>
									<div class="sub-tool-group">
										<span>2018.09.19 07:39</span> <a class=""><i
											class="iconfont ic-comment"></i> <span>回复</span></a>
										<!---->
										<!---->
									</div>
								</div>

								<!---->
								<!---->
							</div>
							<!---->
						</div>
					</div>
				</div>
			</div>
			<!---->
		</div>

	</div>

	<%-- 	<%@include file="more.jsp"%>
 --%>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
	<script type="text/javascript">
		function like(obj) {
			var g = obj;
			var $obj = $(obj)
				$.post("${pageContext.request.contextPath}/homePage/likeArticle.do",{
					"article_Id" : '${article_DetailsDTO.article.articleId }',
					"user_Id" : '${sessionScope.session.userId}'
				},function(data){
					$obj.text(data.likes)
					if('cancel' == data.message.trim()){
						$obj.parent().parent().removeClass("like-animation");
					}else{
						$obj.parent().parent().addClass("like-animation");
					}
				},"json");
		}
	</script>


</body>

</html>