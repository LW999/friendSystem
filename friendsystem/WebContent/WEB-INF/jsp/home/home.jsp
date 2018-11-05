<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Friends 阿伟最帅</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-d5108cec60c4ed55f041.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />

<style type="text/css">
</style>

</head>
<body lang="zh-CN" class="reader-black-font">
	<!-- 全局顶部导航栏 -->
	<jsp:include page="head.jsp"></jsp:include>
	<!-- 中间内容 -->
	<div class="container index">
		<div class="row">
			<div class="col-xs-16 main">
				<!-- Banner -->
				<div id="indexCarousel" class="carousel slide">
					<!-- 轮播图 -->
					<div class="carousel-inner">
						<div class="item active">
							<div class="banner">
								<a target="_blank" href="#"><img
									src="${pageContext.request.contextPath }/img/timg.jpg" alt="1"></a>
							</div>
						</div>
						<div class="item">
							<div class="banner" data-banner-name="赛末点02">
								<a target="_blank" href="#"><img
									src="${pageContext.request.contextPath }/img/59c8621b2b5f2.png"
									alt="540"></a>
							</div>
						</div>
						<div class="item">
							<div class="banner" data-banner-name="赛末点02">
								<a target="_blank" href="#"><img
									src="${pageContext.request.contextPath }/img/59c8621b2b5f2.png"
									alt="540"></a>
							</div>
						</div>
					</div>
					<ol class="carousel-indicators">
						<li data-target="#indexCarousel" data-slide-to="0" class=""></li>
						<li data-target="#indexCarousel" data-slide-to="1" class=""></li>
						<li data-target="#indexCarousel" data-slide-to="2" class=""></li>

					</ol>
					<a class="left carousel-control" href="#indexCarousel"
						role="button" data-slide="prev"><i
						class="iconfont ic-previous-s"></i></a> <a
						class="right carousel-control" href="#indexCarousel" role="button"
						data-slide="next"><i class="iconfont ic-next-s"></i></a>
				</div>
				<!--专题分类需要遍历-->
				<div class="recommend-collection">
					<c:forEach items="${listProject}" var="listP">
						<a class="collection" target="_blank" href="#"> <img
							src="${listP.projectImg}" alt="">
							<div class="name">${listP.projectName }</div>
						</a>
					</c:forEach>
					<a class="more-hot-collection" target="_blank" href="#"> 更多热门专题
						<i class="iconfont ic-link"></i>
					</a>
				</div>
				<div class="split-line"></div>
				<div id="list-container">

					<!-- 文章列表模块需要遍历 -->
					<ul class="note-list" infinite-scroll-url="/">

						<li class="have-img"><a class="wrap-img" href="#"
							target="_blank"> <img class="img-blur-done"
								src="${pageContext.request.contextPath }/img/QQ.png" alt="">
						</a>
							<div class="content">
								<a class="title" target="__blank" href="">步根本不减肥，但是为什么跑</a>
								<p class="abstract">
									前几天接到一个推销电话，虽明确表示不需要，依然无理纠缠没完没了，渐怒火中烧，语气不善。 突然，办公室电话响起，点名找我。
									接起电话就听到一句“我...</p>
								<div class="meta">
									<a class="nickname" target="_blank" href="">作者李伟</a> <a
										target="_blank" href="#"> <i
										class="iconfont ic-list-comments"></i> 评论数8
									</a> <span><i class="iconfont ic-list-like"></i> 点赞数：89</span>
								</div>
							</div></li>

						<li class="have-img"><a class="wrap-img" href="#"
							target="_blank"> <img class="img-blur-done"
								src="${pageContext.request.contextPath }/img/QQ.png" alt="">
						</a>
							<div class="content">
								<a class="title" target="__blank" href="">步根本不减肥，但是为什么跑</a>
								<p class="abstract">
									前几天接到一个推销电话，虽明确表示不需要，依然无理纠缠没完没了，渐怒火中烧，语气不善。 突然，办公室电话响起，点名找我。
									接起电话就听到一句“我...</p>
								<div class="meta">
									<a class="nickname" target="_blank" href="">作者李伟</a> <a
										target="_blank" href="#"> <i
										class="iconfont ic-list-comments"></i> 评论数8
									</a> <span><i class="iconfont ic-list-like"></i> 点赞数：89</span>
								</div>
							</div></li>
					</ul>
				</div>
				<a data-page="3" href="#" class="load-more">阅读更多</a>
			</div>
			<!-- 右边的导航 -->
			<jsp:include page="right.jsp"></jsp:include>
			<!-- 推荐作者 -->
			<div class="recommended-authors">
				<div class="title">
					<span>推荐作者</span> <a class="page-change"><i
						class="iconfont ic-search-change" style="transform: rotate(0deg);"></i>
						换一批 </a>
				</div>
				<ul class="list">
					<c:forEach items="${listRandomUserDTO}" var="listR">
						<li><a href="" target="_blank" class="avatar"><img
								src="${listR.user.userPortrait }"></a> <!-- <a class="follow" ><i class="iconfont ic-follow"></i>关注 </a>  -->
							<a class="following"><i class="iconfont ic-follow"></i>已关注 </a> <!-- <a class="following"><i class="iconfont ic-unfollow"></i>取消关注</a> -->
							<a href="#" target="_blank" class="name">
								${listR.user.userName } </a>
							<p>一共获得了${listR.like}个喜欢</p></li>
					</c:forEach>

				</ul>
				<a href="" target="_blank" class="find-more"> 查看全部<i
					class="iconfont ic-link"></i></a>
			</div>
		</div>
	</div>
	</div>
	<div class="side-tool">
		<ul>
			<li data-placement="left" data-toggle="tooltip" data-container="body"
				data-original-title="回到顶部" style=""><a class="function-button"><i
					class="iconfont ic-backtop"></i></a></li>
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
		</ul>
	</div>


	<!-- 底部 -->
	<jsp:include page="bottom.jsp"></jsp:include>


	<script type="application/json" data-name="page-data">
		{}
	</script>
	<script src="${pageContext.request.contextPath }/js/one.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/two.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/there.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/fore.js"
		crossorigin="anonymous"></script>

</body>
</html>