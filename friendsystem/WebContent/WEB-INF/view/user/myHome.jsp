<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-71aa880fd9d7cbb38465.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<title>${UALDTO.user.userName }</title>
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container person">
		<div class="row">
			<div class="col-xs-16 main">
				<!--  主页的基本信息-->
				<%@include file="top.jsp"%>

				<ul class="trigger-menu" data-pjax-container="#list-container">
					<li class="active"><a href="#"><i
							class="iconfont ic-articles"></i> 文章</a></li>
					<li class=""><a href="#"><i class="#"></i> 动态</a></li>
					<li class=""><a href="#"><i class="iconfont ic-hot"></i>
							热门</a></li>
				</ul>
				<div id="list-container">
					<!-- 动态列表模块 -->
					<ul class="note-list"
						infinite-scroll-url="/users/b91cc2d507d0/timeline">

						<!-- 遍历用户发表了文章 -->
						<c:forEach items="${UALDTO.listA }" var="listA">
							<li class="have-img" id="feed-374866967"><a class="wrap-img"
								href="#"> <img
									src="${pageContext.request.contextPath}/img/user.do?fileFileName=${listA.articleImg}"
									alt="120">
							</a>
								<div class="content">
									<div class="author">
										<a class="avatar" href="#"> <img
											src="${pageContext.request.contextPath}/img/user.do?fileFileName=${UALDTO.user.userPortrait }"
											alt="180">
										</a>
										<div class="info">
											<a class="nickname" href="#">${UALDTO.user.userName }</a> <span
												data-type="share_note"
												data-datetime="2018-11-07T17:55:39+08:00"> 发表了文章 ·
												${listA.articleModifytime }</span>
										</div>
									</div>

									<a class="title"
										href="${pageContext.request.contextPath}/homePage/articleDetail.do?article_Id=${listA.articleId}"
										target="_blank">${listA.articleTitle }</a>
									<p class="abstract">${listA.outline }...</p>

									<div class="meta">
										<a href="#"> <i class="iconfont ic-list-read"></i>
											${listA.articleViews }
										</a> <a href="/p/72c638fc6417"> <i
											class="iconfont ic-list-comments"></i> 0
										</a> <span><i class="iconfont ic-list-like"></i>
											${UALDTO.like }</span>

										<c:choose>
											<c:when test="${sessionScope.session.userType eq 'tourists'}">
											</c:when>
											<c:when
												test="${sessionScope.session.userId eq UALDTO.user.userId }">
												<button class="btn btn-delete" style="margin-left: 260px;"
													onclick="javascript:jj('${listA.articleId }');">
													<i class="iconfont ic-delete"></i> 删除
												</button>
											</c:when>
											<c:otherwise>

											</c:otherwise>
										</c:choose>

									</div>

								</div></li>
						</c:forEach>


						<!--右边  -->
					</ul>
				</div>
			</div>
			<div class="col-xs-7 col-xs-offset-1 aside">
				<ul class="list user-dynamic">
					<li class="badge-icon"><a target="_blank" href="/mobile/club">
							<img heigth="20"
							src="//upload.jianshu.io/user_badge/22d8d123-271c-4d80-9c59-6990844a9e37"
							alt="22d8d123 271c 4d80 9c59 6990844a9e37" width="20"> 会员
					</a></li>
				</ul>
				<div class="title">个人介绍</div>
				<div class="description">
					<div class="js-intro">${UALDTO.user.userSynopsis }</div>

				</div>
				<div id="user-publications">
					<!---->
				</div>
				<div id="user-courses">
					<!---->
				</div>
				<ul class="list user-dynamic">
					<li><a href="#"> <i class="iconfont ic-collection"></i> <span>他关注的专题</span>
					</a></li>
					<li><a href="#"> <i class="iconfont ic-like"></i> <span>他喜欢的文章</span>
					</a></li>
				</ul>
				<!-- 专题和文集 -->
				<div></div>
				<div class="user-action">
					<a class="js-block-button" data-user-id="8972166" href="#">加入黑名单</a>
					· <a class="js-report-button" data-reportable-id="8972166"
						data-reportable-type="user">举报用户</a>
				</div>
			</div>

		</div>
	</div>
	<div class="side-tool">
		<ul>
			<li data-placement="left" data-toggle="tooltip" data-container="body"
				data-original-title="回到顶部" style="display: none;"><a
				class="function-button"><i class="iconfont ic-backtop"></i></a></li>
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
		</ul>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
	<script type="text/javascript">
		function jj(id) {
			$.get("${pageContext.request.contextPath}/user/del.do?article_Id="
					+ id + "", function(data) {
				console.log('dd:' + data)
				if (data.trim() == "success") {
					toastr.success("删除成功成功")
				}
				if (data.trim() == "error") {
					toastr.warning("已删除，请刷新")
				}
			})
		}

		
	</script>
</body>

</html>