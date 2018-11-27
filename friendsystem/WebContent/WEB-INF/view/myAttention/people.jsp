<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-378ceb50d759a4e567e3.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
<title>Friends-我关注的人</title>
</head>

<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<!-- 头部 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container subscription">
		<div class="row">
			<!-- 左边 -->
			<%@include file="left.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
				<div>
					<div>
						<div class="main-top">
							<a href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${UALDTO.user.userId }" target="_blank" class="avatar">
								<img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${UALDTO.user.userPortrait }">
							</a>
							<a href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${UALDTO.user.userId }" target="_blank" class="btn btn-hollow">
								个人主页
								<i class="iconfont ic-link"></i>
							</a>
							<a href="#" target="_blank" class="btn btn-hollow">发简信</a>
							<div class="title">
								<a href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${UALDTO.user.userId }" target="_blank" class="name">${UALDTO.user.userName }</a>
								<img src="//upload.jianshu.io/user_badge/1014d32a-bf93-4005-aa0c-fac198d25377" data-toggle="tooltip" data-original-title="优秀" class="badge-icon">
								<!---->
							</div>
							<div class="info">个人简介:${UALDTO.user.userSynopsis }，获得了${UALDTO.like}个喜欢</div>
						</div>
						<ul class="trigger-menu">
							<li class="active">
								<a>
									<i class="iconfont ic-articles"></i>
									最新发布
								</a>
							</li>

							<li class="">
								<a>
									<i class="iconfont ic-hot"></i>
									热门
								</a>
							</li>
						</ul>
						<ul class="note-list">

							<div>
								<c:forEach items="${UALDTO.listA}" var="A">
									<li class="">
										<!---->
										<div class="content">
											<a href="${pageContext.request.contextPath}/homePage/articleDetail.do?article_Id=${A.articleId}" target="_blank" class="title">${A.articleTitle}</a>
											<p class="abstract">...</p>
											<div class="meta">
												<!---->
												<iclass ="iconfontic-list-read">
												</i> 107</a> <a href="/p/bf885466f77f#comments" target="_blank">
													<i class="iconfont ic-list-comments"></i>
													0
												</a> <span>
													<i class="iconfont ic-list-like"></i>
													${UALDTO.like}
												</span> <!----> <span>发布时间${A.articleCreatetime}</span>
											</div>
										</div>
									</li>
								</c:forEach>

							</div>
						</ul>
						<div class="notes-placeholder" style="display: none;">
							<div class="img"></div>
							<div class="content">
								<div class="title"></div>
								<div class="sub-title"></div>
								<div class="text"></div>
								<div class="text animation-delay"></div>
								<div class="meta">
									<div class="read"></div>
									<i class="iconfont ic-list-comments"></i>
									<div class="small"></div>
									<i class="iconfont ic-list-like"></i>
									<div class="small"></div>
								</div>
							</div>
						</div>
						<a class="load-more">阅读更多</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!---->
</body>
</html>