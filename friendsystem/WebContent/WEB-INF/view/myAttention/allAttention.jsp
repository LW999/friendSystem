<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Friends-我的关注</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-378ceb50d759a4e567e3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
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
					<ul class="note-list">
						<c:forEach items="${listAllUserArticleDTO }" var="listAUDTO">

							<li class="have-img">
								<a href="#" target="_blank" class="wrap-img">
									<img src="${listAUDTO.user.userPortrait}">
								</a>
								<div class="content">
									<div class="author">
										<a href="#" target="_blank" class="avatar">
											<img src="${listAUDTO.user.userPortrait}">
										</a>
										<div class="info">
											<a href="#" target="_blank" class="nickname"></a>
											<span>发表了文章 ·${listAUDTO.article.articleCreatetime} </span>
										</div>
									</div>
									<a href="#" target="_blank" class="title">${listAUDTO.article.articleTitle}</a>
									<p class="abstract">作者简介：${listAUDTO.user.userSynopsis}
										作品简介：平静的小城，突然惊现连环杀人案。宛若幽灵一般的凶手残忍地将被害者杀害...</p>
									<div class="meta">
										<div class="origin-author">
											<a href="/u/22e02eafab5c" target="_blank">${listAUDTO.user.userName}</a>
										</div>
										<a href="/p/c1cc83e74393#comments" target="_blank">
											<i class="iconfont ic-list-comments"></i> 21
										</a>
										<span><i class="iconfont ic-list-like"></i>${listAUDTO.like}</span>
										<!---->
									</div>
								</div>
							</li>
						</c:forEach>
						<!---->
						<a class="load-more">阅读更多</a>
					</ul>
					<!---->
				</div>
			</div>
		</div>
	</div>
	<!---->
</body>
</html>