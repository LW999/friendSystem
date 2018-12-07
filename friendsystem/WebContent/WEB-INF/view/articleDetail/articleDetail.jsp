<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/stream.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-00e12f5a757a30f65da3.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/toastr.css">
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
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

100%{
background-position

:right

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

right

;
}
}
.like .like-group.active .btn-like[data-v-6ddd02c6]:before {
	background-position: right;
}

.w-e-text-container {
	height: 100px !important;
}
.v-tooltip-container,
.v-tooltip-content {
  display: inline-block;
}
.v-tooltip-container {
  position: relative;
}
.v-tooltip-container .v-tooltip-content {
    -webkit-user-select: none;
       -moz-user-select: none;
        -ms-user-select: none;
            user-select: none;
}
.v-tooltip-container .v-tooltip-wrap {
    position: absolute;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-top {
      bottom: 100%;
      left: 50%;
      -webkit-transform: translateX(-50%);
          -ms-transform: translateX(-50%);
              transform: translateX(-50%);
      padding-bottom: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-bottom {
      top: 100%;
      left: 50%;
      -webkit-transform: translateX(-50%);
          -ms-transform: translateX(-50%);
              transform: translateX(-50%);
      padding-top: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-left {
      top: 50%;
      right: 100%;
      -webkit-transform: translateY(-50%);
          -ms-transform: translateY(-50%);
              transform: translateY(-50%);
      padding-right: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-right {
      top: 50%;
      left: 100%;
      -webkit-transform: translateY(-50%);
          -ms-transform: translateY(-50%);
              transform: translateY(-50%);
      padding-left: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-top-start {
      bottom: 100%;
      left: 0;
      padding-bottom: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-top-end {
      bottom: 100%;
      right: 0;
      padding-bottom: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-bottom-start {
      top: 100%;
      left: 0;
      padding-top: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-bottom-end {
      top: 100%;
      right: 0;
      padding-top: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-left-start {
      top: 0;
      right: 100%;
      padding-right: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-left-end {
      bottom: 0;
      right: 100%;
      padding-right: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-right-start {
      top: 0;
      left: 100%;
      padding-left: 10px;
}
.v-tooltip-container .v-tooltip-wrap.v-tooltip-wrap-right-end {
      bottom: 0;
      left: 100%;
      padding-left: 10px;
}

</style>
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
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
					<a class="avatar" href="#"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${article_DetailsDTO.user.userPortrait}" alt="96">
					</a>
					<div class="info">
						<span class="name"> <a href="#">${article_DetailsDTO.user.userName}</a>
						</span>
						<!-- 关注用户按钮 -->
						<a class="btn btn-success follow"> <i class="iconfont ic-follow"></i> <span>关注</span>
						</a>
						<!-- 文章数据信息 -->
						<div class="meta">
							<!-- 如果文章更新时间大于发布时间，那么使用 tooltip 显示更新时间 -->
							<span class="publish-time">${article_DetailsDTO.article.articleModifytime}</span> <span class="wordage">字数 715</span> <span class="views-count">阅读 ${article_DetailsDTO.article.articleViews} </span> <span class="comments-count">评论</span> <span class="likes-count">喜欢 ${article_DetailsDTO.like }</span>
						</div>
					</div>
					<!-- 如果是当前作者，加入编辑按钮 -->
				</div>

				<!-- 文章内容 -->
				<div data-note-content="" class="show-content">
					<div class="show-content-free">
						<div class="image-package">
							<div class="image-container" style="max-width: 589px; max-height: 645px; background-color: transparent;">
								<div class="image-caption"></div>
							</div>

							<!-- 文章显示区域 -->
							${article_DetailsDTO.article.articleContent }
						</div>
					</div>
				</div>

				<div class="show-foot">
					<a class="notebook" href="/nb/3856427"> <i class="iconfont ic-search-notebook"></i> <span>${article_DetailsDTO.user.userName }</span>
					</a>
					<div class="copyright" data-toggle="tooltip" data-html="true" data-original-title="转载请联系作者获得授权，并标注“简书作者”。">© 著作权归作者所有</div>
					<div class="modal-wrap" data-report-note="">
						<a id="report-modal">举报文章</a>
					</div>
				</div>

				<!-- 文章底部作者信息 -->
				<div class="follow-detail">
					<div class="info">
						<a class="avatar" href="#"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${article_DetailsDTO.user.userPortrait}" alt="96">
						</a> <a class="btn btn-success follow"> <i class="iconfont ic-follow"></i> <span>关注</span>
						</a> <a class="title" href="/u/cee06b2093af">${article_DetailsDTO.user.userName } </a>
						<p>总浏览量${views}，被 2人关注，获得了${article_DetailsDTO.allLike } 个喜欢</p>
					</div>
					<div class="signature">个人简介:${article_DetailsDTO.user.userSynopsis }</div>
				</div>

				<div class="meta-bottom">
					<div data-v-6ddd02c6="" class="like">
						<c:choose>
							<c:when test="${isLike eq 'no'}">
								<div data-v-6ddd02c6="" class="btn like-group">
							</c:when>
							<c:when test="${isLike eq 'already2'}">
								<div data-v-6ddd02c6="" class="btn like-group">
							</c:when>
							<c:otherwise>
								<div data-v-6ddd02c6="" class="btn like-group like-animation">
							</c:otherwise>

						</c:choose>

						<!-- btn like-group like-animation -->

						<div data-v-6ddd02c6="" class="btn-like">
							<a data-v-6ddd02c6="" onclick="userlike()" data-toggle="modal" data-target="#myModal"> 喜欢 <i class="iconfont ic-like"></i>
							</a>
							<!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
   									 打开模态框
 								 </button> -->

						</div>
						<div data-v-6ddd02c6="" class="modal-wrap">
							<c:choose>
								<c:when test="${sessionScope.session.userType eq 'tourists'}">
									<a data-v-6ddd02c6="" href="${pageContext.request.contextPath }/jump/login.do">点赞 ${article_DetailsDTO.like }</a>
								</c:when>
								<c:when test="${sessionScope.session.userType eq 'user'}">
									<a data-v-6ddd02c6="" onclick="like(this)">点赞 ${article_DetailsDTO.like }</a>
								</c:when>
							</c:choose>


						</div>

					</div>
					<!---->
				</div>
				<div id="comment-list" class="comment-list">
					<c:choose>
						<c:when test="${sessionScope.session.userType eq 'tourists'}">
							<div>
								<form class="new-comment">
									<a class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=bb38223dcca747baa7a10b4850a6f049.png">
									</a>
									<div class="sign-container">
										<a href="/sign_in?utm_source=desktop&amp;utm_medium=not-signed-in-comment-form" class="btn btn-sign">登录</a> <span>后发表评论</span>
									</div>
								</form>
								<!---->
							</div>
						</c:when>
						<c:otherwise>
							<div>
								<div class="new-comment">
									<a class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${sessionScope.session.userPortrait }">
									</a>
									<textarea rows="" cols="" name="content" id="contentRRR"></textarea>
									<div class="write-function-block">
										<div data-v-b36e9416="" class="emoji-modal-wrap">
											<a data-v-b36e9416="" class="emoji"> <i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i>
											</a>
											<!---->
										</div>
										<div class="hint">Ctrl+Enter 发表</div>
										<a class="btn btn-send" onclick="javascript:addCommentOne();">发送</a> <a class="cancel">取消</a>
									</div>
								</div>
							</div>
						</c:otherwise>
					</c:choose>

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
					<div class="normal-comment-list" id="addComment">
						<div>
							<div>
								<div class="top-title">
									<span>25条评论</span> <a class="author-only">只看作者</a> <a class="close-btn" style="display: none;">关闭评论</a>
									<div class="pull-right">
										<a class="active">按时间倒序</a> <a class="">按时间正序</a>
									</div>
								</div>
							</div>
							<div id="comment-29705040" class="comment">
								<!-- <div> -->
									<!-- <div class="author">
										<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">
											<div class="v-tooltip-content">
												<a href="#" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/8312573/0a89da57-65e5-423c-8d8a-f257eba1388a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114">
												</a>
											</div>
											
										</div>
										<div class="info">
											<a href="/u/6c43219713a5" target="_blank" class="name">暖暖的柠檬树</a>
											
											
											<div class="meta">
												<span>10楼 · 2018.10.17 21:20</span>
											</div>
										</div>
									</div>
									<div class="comment-wrap">
										<p>
											大道至简 <img src="//static.jianshu.io/assets/emojis/+1.png" alt=":+1:" title=":+1:" class="emoji" width="20" height="20"> <img src="//static.jianshu.io/assets/emojis/+1.png" alt=":+1:" title=":+1:" class="emoji" width="20" height="20">
										</p>
										<div class="tool-group">
											<a data-v-cdecbe24="" id="like-button-29705040" class="like-button"> <span data-v-cdecbe24="">赞</span>
											</a> <a class=""> <i class="iconfont ic-comment"></i> <span>回复</span>
											</a>
											
											
										</div>
									</div>
								</div>
								<div class="sub-comment-list">
									显示二级
									<div id="comment-31027416" class="sub-comment">
										<p>
										<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">
											<div class="v-tooltip-content">
												<a href="/u/f4190525d303" target="_blank">毅达Stylish</a>：
											</div>
											
										</div>
										<span><a href="/u/c812a1622b1d" class="maleskine-author" target="_blank" data-user-slug="c812a1622b1d">@佳佳_7b7d</a> 先看看书</span>
										</p>
										<div class="sub-tool-group">
											<span>2018.11.21 19:22</span> <a class=""><i class="iconfont ic-comment"></i> <span>回复</span></a> <a class="report"><span>举报</span></a>
											
										</div>
									</div> -->
									<!--添加新回复 -->
<!-- 									<div class="sub-comment more-comment">
										<a class="add-comment-btn"><i class="iconfont ic-subcomment"></i> <span>添加新评论</span></a>
										
										
										
									</div>
									<form class="new-comment">
										<textarea placeholder="写下你的评论..."></textarea>
										<div class="write-function-block">
											<div data-v-b36e9416="" class="emoji-modal-wrap">
												<a data-v-b36e9416="" class="emoji"><i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i></a>

											</div>
											<div class="hint">Ctrl+Enter 发表</div>
											<a class="btn btn-send">发送</a> <a class="cancel">取消</a>
										</div>
									</form> -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!---->
	</div>
	<!-- ；模态框显示 -->
	<!-- 模态框 -->
	<div class="modal fade" id="myModal">
		<div class="modal-dialog" style="left: 34%; top: 20%; width: 600px;">
			<div class="modal-content">

				<!-- 模态框头部 -->
				<div class="modal-header" style="border-bottom-width: 0px; padding-bottom: 10px; padding-top: 20px;">
					<table>
						<tr>
							<td>
								<h4 class="modal-title">喜欢的人</h4>
							</td>

						</tr>

					</table>


				</div>

				<!-- 模态框主体 -->
				<div class="modal-body" style="padding-top: 10px;">
					<ul id="userRRR" style="list-style: none;">
						<li>1das <span>hhahha</span>
						</li>
					</ul>
				</div>

				<!-- 模态框底部 -->
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
				</div>

			</div>
		</div>
	</div>


	<%-- 	<%@include file="more.jsp"%>
 --%>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/toastr.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap-3.37.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/wangEditor.js"></script>
	<script type="text/javascript">

		function subComment(a){
			var $a = $(a)
			var $comment = $a.parent().parent().next();
			var attr = $comment.attr("style")
			if(typeof attr !== typeof undefined && attr !== false){
				$comment.removeAttr("style");
			}else{
				$comment.attr("style","display:none;");
			}
		}
		function like(obj) {
			var g = obj;
			var $obj = $(obj)
			$
					.post(
							"${pageContext.request.contextPath}/homePage/likeArticle.do",
							{
								"article_Id" : '${article_DetailsDTO.article.articleId }',
								"user_Id" : '${sessionScope.session.userId}'
							}, function(data) {
								$obj.text('点赞 ' + data.likes)
								if ('cancel' == data.message.trim()) {
									$obj.parent().parent().removeClass(
											"like-animation");
									toastr.warning("取消点赞")
								} else {
									$obj.parent().parent().addClass(
											"like-animation");
									toastr.success("点赞成功")
								}
							}, "json");
		}
		function cacle(obj){
			var $obj = $(obj);
			var $div = $obj.parent().parent();
			$div.attr("style","display:none;");
		}
		function userlike() {

			$
					.post(
							"${pageContext.request.contextPath}/homePage/userLike.do",
							{
								"article_Id" : '${article_DetailsDTO.article.articleId }'
							},
							function(date) {
								clearUl();
								var skr = '';
								$
										.each(
												date,
												function(i) {

													skr = skr
															+ '<li>'
															+ '<table class=\"table\" style=\"margin-bottom: 0px;\"> <tr><td style=\"width: 66px;\">'
															+ '<a class=\"avatar\" style=\"width: 32px;height: 32px;\">'
															+ '<img style=\"margin-left: 10px;\"src=\"${pageContext.request.contextPath}/img/user.do?fileFileName='
															+ date[i].user.userPortrait
															+ '\">'
															+ '</a></td>'
															+ '<td><a>'
															+ date[i].user.userName
															+ '</a></td>'
															+ '<td><p class=\"pull-right\">'
															+ date[i].time
															+ '</p></td></tr></table>'
															+ '</li>';

												});
								$("#userRRR").append(skr);

							}, "json");
		}

		function clearUl() {
			$("#userRRR").children().remove();
		}
	</script>

	<!-- 评论 -->
	<script type="text/javascript">
		function addCommentOne() {
			var a = document.getElementById("contentRRR").value;
			$.post("${pageContext.request.contextPath}/homePage/commentOne.do",
					{
						"not_id" : '${article_DetailsDTO.article.articleId }',
						"content" : a
					}, function(data) {
						var skr ='';
							skr=skr+'<div class="comment">';
							skr=skr+'	<div>'
							skr=skr+'			<div class="author">'
							skr=skr+'			<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">'
							skr=skr+'				<div class="v-tooltip-content">'
							skr=skr+'						<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName='+data.userOne.userPortrait+'">'
							skr=skr+'					</a>'
							skr=skr+'				</div>'
							skr=skr+'				</div>'
							skr=skr+'			<div class="info">'
							skr=skr+'					<a href="#" target="_blank" class="name">'+data.userOne.userName+'</a>'
							skr=skr+'					<div class="meta">'
							skr=skr+'					<span>'+data.comment.commentFloor+'楼 · '+data.comment.commentCreateAt+'</span>'
							skr=skr+'					</div>'
							skr=skr+'			</div>'
							skr=skr+'			</div>'
							skr=skr+'			<div class="comment-wrap">'
							skr=skr+'				<p>'+data.comment.commentContent+'</p>'
							skr=skr+'				<div class="tool-group">'
							skr=skr+'				 <a class=""> <i class="iconfont ic-comment"></i> <span>回复</span>'
							skr=skr+'				</a>'
							skr=skr+'				</div>'
							skr=skr+'			</div>'
							skr=skr+'		</div>'
							skr=skr+'		<div class="sub-comment-list"  id="list'+data.comment.commentId+'">'
							skr=skr+'		</div>'
							skr=skr+'		<div class="new-comment" style="display:none;">'
							skr=skr+'			<textarea placeholder="写下你的评论..."id=two'+data.comment.commentId+'\></textarea>'
							skr=skr+'			<div class="write-function-block">'
							skr=skr+'				<div data-v-b36e9416="" class="emoji-modal-wrap">'
							skr=skr+'					<a data-v-b36e9416="" class="emoji"><i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i></a>'
							skr=skr+'				</div>'
							skr=skr+'				<div class="hint">Ctrl+Enter 发表</div>'
							skr=skr+'				<a class="btn btn-send" onclick="javascript:addCommentTwo(\''+data.userOne.userId+'\',\''+data.comment.commentFloor+'\',\''+data.comment.commentId+'\',1);">发送</a> <a class="cancel">取消</a>'
							skr=skr+'			</div>'
							skr=skr+'		</div>'
							skr=skr+'		</div>'
							skr=skr+'	</div>'
							$("#addComment").append(skr);
					}, "json");
		}
		function addCommentTwo(s,f,c,m){
			if(m==1){
				var a = document.getElementById("two"+c).value;
			}
			else{
				var a = document.getElementById("two"+m).value;
			}
			alert('评论谁'+s);
			alert('内容'+a);
			alert('一级ID'+f);
			$.post("${pageContext.request.contextPath}/homePage/commentTwo.do",
			{
				"not_id" : '${article_DetailsDTO.article.articleId }',
				"content" : a,
				"userTwo_id": s,
				"floor" : f,
				"parent_id" : c
			},
				function(data){
					var skr ='';
					skr=skr+'<div class="sub-comment">'
					skr=skr+'	<p>'
					skr=skr+'		<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">'
					skr=skr+'			<div class="v-tooltip-content">'
					skr=skr+'				<a href="#" target="_blank">'+data.userOne.userName+'</a>：'
					skr=skr+'			</div>'
					skr=skr+'		</div>'
					skr=skr+'		<span><a href="#" class="maleskine-author" target="_blank" data-user-slug="c812a1622b1d">@'+data.userTWo.userName+'</a> '+data.comment.commentContent+'</span>'
					skr=skr+'	</p>'
					skr=skr+'	<div class="sub-tool-group">'
					skr=skr+'		<span>2018.11.21 19:22</span> <a class=""><i class="iconfont ic-comment"></i> <span>回复</span></a> <a class="report"><span>举报</span></a>'
					skr=skr+'	</div>'
					skr=skr+'</div>'
					skr=skr+'		<div class="new-comment" style="display:none;">'
					skr=skr+'			<textarea placeholder="写下你的评论..."id=two'+data.comment.commentId+'></textarea>'
					skr=skr+'			<div class="write-function-block">'
					skr=skr+'				<div data-v-b36e9416="" class="emoji-modal-wrap">'
					skr=skr+'					<a data-v-b36e9416="" class="emoji"><i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i></a>'
					skr=skr+'				</div>'
					skr=skr+'				<div class="hint">Ctrl+Enter 发表</div>'
					skr=skr+'				<a class="btn btn-send" onclick="javascript:addCommentTwo(\''+data.userOne.userId+'\',\''+data.comment.commentFloor+'\',\''+c+'\',\''+data.comment.commentId+'\');">发送</a> <a class="cancel">取消</a>'
					skr=skr+'			</div>'
					skr=skr+'		</div>'
					$("#list"+c).append(skr);
				},"json");
		}
	</script>
	<script type="text/javascript">
		getComment();
		function getComment(){
			$.post("${pageContext.request.contextPath}/homePage/getComment.do",
			{
				"not_id" :'${article_DetailsDTO.article.articleId }'
			},function(data){
				$.each(data,function(){
					var skr ='';
					skr=skr+'<div class="comment">'
					skr=skr+'	<div>'
					skr=skr+'			<div class="author">'
					skr=skr+'			<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">'
					skr=skr+'				<div class="v-tooltip-content">'
					skr=skr+'						<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName='+this.userOne.userPortrait+'">'
					skr=skr+'					</a>'
					skr=skr+'				</div>'
					skr=skr+'				</div>'
					skr=skr+'			<div class="info">'
					skr=skr+'					<a href="#" target="_blank" class="name">'+this.userOne.userName+'</a>'
					skr=skr+'					<div class="meta">'
					skr=skr+'					<span>'+this.comment.commentFloor+'楼 · '+this.comment.commentCreateAt+'</span>'
					skr=skr+'					</div>'
					skr=skr+'			</div>'
					skr=skr+'			</div>'
					skr=skr+'			<div class="comment-wrap">'
					skr=skr+'				<p>'+this.comment.commentContent+'</p>'
					skr=skr+'				<div class="tool-group">'
					skr=skr+'				 <a class="" onclick="subCommentBottom(this)"><i class="iconfont ic-comment"></i> <span>回复</span></a> <a class="report"><span>举报</span></a>'
					skr=skr+'				</a>'
					skr=skr+'				</div>'
					skr=skr+'			</div>'
					skr=skr+'		</div>'
					skr=skr+'		<div class="sub-comment-list"  id="list'+this.comment.commentId+'">'
					if(this.comment_exist == 1){
						
							$.each(this.listCommentDTO,function(){
							 			 skr=skr+'<div class="sub-comment">'
										skr=skr+'	<p>'
										skr=skr+'		<div data-v-f3bf5228="" class="v-tooltip-container" style="z-index: 0;">'
										skr=skr+'			<div class="v-tooltip-content">'
										skr=skr+'				<a href="#" target="_blank">'+this.userOne.userName+'</a>：'
										skr=skr+'			</div>'
										skr=skr+'		</div>'
										skr=skr+'		<span><a href="#" class="maleskine-author" target="_blank" data-user-slug="c812a1622b1d">@'+this.userTWo.userName+'</a> '+this.comment.commentContent+'</span>'
										skr=skr+'	</p>'
										skr=skr+'	<div class="sub-tool-group">'
										skr=skr+'		<span>'+this.comment.commentCreateAt+'</span> <a class="" onclick="subComment(this)"><i class="iconfont ic-comment"></i> <span>回复</span></a> <a class="report"><span>举报</span></a>'
										skr=skr+'	</div>'
										skr=skr+'</div>'
										skr=skr+'		<div class="new-comment" style="display:none;">'
										skr=skr+'			<textarea placeholder="写下你的评论..."id=two'+this.comment.commentId+'></textarea>'
										skr=skr+'			<div class="write-function-block">'
										skr=skr+'				<div data-v-b36e9416="" class="emoji-modal-wrap">'
										skr=skr+'					<a data-v-b36e9416="" class="emoji"><i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i></a>'
										skr=skr+'				</div>'
										skr=skr+'				<div class="hint">Ctrl+Enter 发表</div>'
							  			skr=skr+'				<a class="btn btn-send" onclick="javascript:addCommentTwo(\''+this.userOne.userId+'\',\''+this.comment.commentFloor+'\',\''+this.comment.commentParentId+'\',\''+this.comment.commentId+'\');">发送</a> <a href="javascript:;" onclick="cacle(this)" class="cancel">取消</a>'
										skr=skr+'			</div>'
										skr=skr+'		</div>'
									},"json");
									
								}
					skr=skr+'		</div>'
					skr=skr+'		<div class="new-comment" style="display:none;">'
					skr=skr+'			<textarea placeholder="写下你的评论..."id=two'+this.comment.commentId+'\></textarea>'
					skr=skr+'			<div class="write-function-block">'
					skr=skr+'				<div data-v-b36e9416="" class="emoji-modal-wrap">'
					skr=skr+'					<a data-v-b36e9416="" class="emoji"><i data-v-b36e9416="" class="iconfont ic-comment-emotions"></i></a>'
					skr=skr+'				</div>'
					skr=skr+'				<div class="hint">Ctrl+Enter 发表</div>'
					skr=skr+'				<a class="btn btn-send" onclick="javascript:addCommentTwo(\''+this.userOne.userId+'\',\''+this.comment.commentFloor+'\',\''+this.comment.commentId+'\',1);">发送</a> <a href="javascript:;" onclick="cacle(this)" class="cancel">取消</a>'
					skr=skr+'			</div>'
					skr=skr+'		</div>'
					skr=skr+'		</div>'
					skr=skr+'	</div>'
					$("#addComment").append(skr);
				});
			
				},"json");
			}
		function subCommentBottom(obj){
			var $obj = $(obj);
			var $comment = $obj.parent().parent().parent().siblings(".new-comment");
			$comment.removeAttr("style");
		}
	</script>
</body>

</html>