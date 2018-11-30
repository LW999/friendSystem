<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-f2044e800265d8edbb60.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-3dc2382e82e51b288fde.css" />
<title>搜索-</title>
</head>
<body lang="zh-CN" class="reader-black-font">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container search">
		<div class="row">
			<%@include file="menu.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
				<div class="top">
					<div class="relevant">
						<div class="title">相关用户</div>
						<a class="function-btn"> 查看全部 <i class="iconfont ic-arrow"></i>
						</a>
						<div class="container-fluid list">
							<c:choose>
								<c:when test="${keywordDTO.listU eq null}">
									<div class="col-xs-8">
										<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=bb38223dcca747baa7a10b4850a6f049.png">
										</a>
										<div class="info">
											<a href="#" target="_blank" class="name">空空如也</a>
											<div class="meta">空空如也</div>
										</div>
									</div>
								</c:when>
								<c:otherwise>
									<c:forEach items="${keywordDTO.listU }" var="U">
										<div class="col-xs-8">
											<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${U.user.userPortrait }">
											</a>
											<div class="info">
												<a href="#" target="_blank" class="name">${U.user.userName }</a>
												<div class="meta">${U.user.userId }</div>
											</div>
										</div>
									</c:forEach>
								</c:otherwise>
							</c:choose>


						</div>
					</div>
					<!-- 	<div class="relevant">
						<div class="title">相关专题</div>
						<a class="function-btn"> 查看全部 <i class="iconfont ic-arrow"></i>
						</a>
						<div class="container-fluid list">
							<div class="col-xs-8">
								<a href="/c/b2a7c5622a52" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/1450/%E6%9C%AA%E6%A0%87%E9%A2%98-1.png?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/b2a7c5622a52" target="_blank" class="name">0岁的产品经理</a>
									<div class="meta">8570 文章・30659 关注</div>
								</div>
							</div>
							<div class="col-xs-8">
								<a href="/c/ae989ceb7d65" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/2285/chaineye-logo%281%29500pxs.png?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/ae989ceb7d65" target="_blank" class="name">链眼</a>
									<div class="meta">-1 文章・9035 关注</div>
								</div>
							</div>
							<div class="col-xs-8">
								<a href="/c/b17f09dc2831" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/345402/%E7%A0%94%E4%B9%A0%E7%A4%BELOGO.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/b17f09dc2831" target="_blank" class="name">区块链研习社</a>
									<div class="meta">12238 文章・7225 关注</div>
								</div>
							</div>
						</div>
					</div> -->
				</div>
				<div class="search-content">
					<div class="sort-type">
						<a class="active"> 综合排序 · </a> <a class=""> 热门文章 · </a> <a class=""> 最新发布 · </a> <span> &nbsp;&nbsp;|&nbsp; </span>
						<div class="v-select-wrap">
							<div class="v-select-submit-wrap">
								<svg viewBox="0 0 10 6" aria-hidden="true"> <path d="M8.716.217L5.002 4 1.285.218C.99-.072.514-.072.22.218c-.294.29-.294.76 0 1.052l4.25 4.512c.292.29.77.29 1.063 0L9.78 1.27c.293-.29.293-.76 0-1.052-.295-.29-.77-.29-1.063 0z"></path></svg>
							</div>
							<div class="v-select-text-area-wrap">
								<div class="v-select-input-wrap">
									<ul class="v-select-selected-item-wrap">
										<li class="v-select-selected-item">
											<!----> 时间不限
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<!---->
					<div class="result">个结果</div>
					<ul class="note-list">
						<c:forEach items="${keywordDTO.listA }" var="A">
							<li>
								<div class="content">
									<div class="author">
										<a href="/u/a234cae11e43" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/13753996/865fe6a8-79e1-4d72-9849-61759c5d0501.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
										</a>
										<div class="info">
											<a href="/u/a234cae11e43" class="nickname"> 火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 研究院
											</a> <span class="time"> 3 个月前 </span>
										</div>
									</div>
									<a href="#" target="_blank" class="title">${A.article.articleTitle }</a>
									<p class="abstract">${A.article.outline }</p>
									<div class="meta">
										<a href="/p/0bb81e00404a" target="_blank"> <i class="iconfont ic-list-read"></i> 7234
										</a> <a href="/p/0bb81e00404a#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 13
										</a> <span> <i class="iconfont ic-list-like"></i> 26
										</span>
										<!---->
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
					<!---->
					<!---->
					<!---->
					<div>
						<ul class="pagination">
							<!---->
							<li><a href="javascript:void(null)" class="active">1</a></li>
							<li><a>2</a></li>
							<li><a>3</a></li>
							<li><a>4</a></li>
							<li><a>下一页</a></li>
						</ul>
					</div>
					<!---->
				</div>
			</div>
		</div>
	</div>




	<div id="qb-sougou-search" style="display: none; opacity: 0;">
		<p>搜索</p>
		<p class="last-btn">复制</p>
		<iframe src=""></iframe>
	</div>
</body>
</html>