<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>头部</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-d5108cec60c4ed55f041.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="width-limit">
		<!-- 左上方 Logo -->
		<!--<a class="logo" href="/"><img src="//cdn2.jianshu.io/assets/web/nav-logo-4c7bbafe27adc892f3046e6978459bac.png" alt="Nav logo"></a>-->
		<!-- 右上角 -->
		<!-- 未登录显示登录/注册/写文章 -->
		<c:choose>
			<c:when test="${sessionScope.session.userType eq 'tourists'}">

				<a class="btn write-btn" target="_blank" href="${pageContext.request.contextPath }/jump/login.do">
					<i class="iconfont ic-write"></i>
					写文章
				</a>
			</c:when>
			<c:otherwise>
				<a class="btn write-btn" target="_blank" href="${pageContext.request.contextPath}/jump/createArticle.do">
					<i class="iconfont ic-write"></i>
					写文章
				</a>
			</c:otherwise>
		</c:choose>
		<c:if test="${sessionScope.session.userType eq 'tourists'}">
			<a class="btn sign-up" href="${pageContext.request.contextPath }/jump/reg.do">注册</a>
			<a class="btn log-in" href="${pageContext.request.contextPath }/jump/login.do">登录</a>
		</c:if>
		<!-- 如果用户登录，显示下拉菜单 -->
		<c:choose>
			<c:when test="${sessionScope.session.userType eq 'tourists'}">
			</c:when>
			<c:otherwise>
				<!-- 用户头像那些 -->
				<div class="user">
					<div data-hover="dropdown">
						<a class="avatar" href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${sessionScope.session.userId}">
							<img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${sessionScope.session.userPortrait }" alt="130">
						</a>
					</div>
					<ul class="dropdown-menu">
						<li>
							<a href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${sessionScope.session.userId}">
								<i class="iconfont ic-navigation-profile"></i>
								<span>${sessionScope.session.userName }</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="iconfont ic-navigation-mark"></i>
								<span>收藏的文章</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="iconfont ic-navigation-like"></i>
								<span>喜欢的文章</span>
							</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath }/jump/setting.do">
								<i class="iconfont ic-navigation-settings"></i>
								<span>设置</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="iconfont ic-navigation-feedback"></i>
								<span>帮助与反馈</span>
							</a>
						</li>
						<li>
							<a rel="nofollow" data-method="delete" href="${pageContext.request.contextPath }/login/logout.do">
								<i class="iconfont ic-navigation-signout"></i>
								<span>注销</span>
							</a>
						</li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu" aria-expanded="false">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav navbar-nav">
					<li class="tab active">
						<a href="${pageContext.request.contextPath}/homePage/index.do">
							<span class="menu-text">首页</span>
							<i class="iconfont ic-navigation-discover menu-icon"></i>
						</a>
					</li>


					<ul class="nav navbar-nav">
						<c:choose>
							<c:when test="${sessionScope.session.userType eq 'tourists'}">
							</c:when>
							<c:otherwise>
								<!--登陆后出现-->
								<li class="tab ">
									<a href="${pageContext.request.contextPath}/user/myAttention.do">
										<span class="menu-text">关注</span>
										<i class="iconfont ic-navigation-follow menu-icon"></i>
									</a>
								</li>
								<li class="tab notification">
									<a data-hover="dropdown" href="#" class="notification-btn">
										<span class="menu-text">消息</span>
										<i class="iconfont ic-navigation-notification menu-icon"></i>
										<!---->
										<!---->
									</a>
									<ul class="dropdown-menu">
										<li>
											<a href="#">
												<i class="iconfont ic-comments"></i>
												<span>
													<span class="badge pull-left">8</span>
													评论
												</span>
												<!---->
											</a>
										</li>
										<li>
											<a href="3">
												<i class="iconfont ic-chats"></i>
												<span>
													<span>
														<span class="badge pull-left">56</span>
														私信
													</span>
													<!---->
											</a>
										</li>

										<li>
											<a href="#">
												<i class="iconfont ic-likes"></i>
												<span>
													<span>
														<span class="badge pull-left">41</span>
														喜欢和赞
													</span>
													<!---->
											</a>
										</li>
										<li>
											<a href="#">
												<i class="iconfont ic-follows"></i>
												<span>
													<span>
														<span class="badge pull-left">999</span>
														关注
													</span>
													<!---->
											</a>
										</li>

									</ul>
								</li>

							</c:otherwise>
						</c:choose>
						<li class="search">
							<form target="_blank" action="${pageContext.request.contextPath }/homePage/keyword.do" accept-charset="UTF-8" method="POST" id="searchForm">
								<input type="text" name="search" placeholder="搜索" class="search-input" autocomplete="off" value="${search }">
								<a class="search-btn" onclick="document:searchForm.submit()">
									<i class="iconfont ic-search"></i>
								</a>
								<div id="navbar-search-tips" style="">
									<div class="search-trending">
										<div class="search-trending-header clearfix" style="margin-bottom: 10px;">
											<span>热门搜索</span>
											<a onclick="javascript:change();">
												<i class="iconfont ic-search-change" style="transform: rotate(0deg);" onclick="javascript:change();"></i>
												换一批
											</a>
										</div>
										<ul class="search-trending-tag-wrap" id="search">
										</ul>
									</div>
									<!---->
								</div>
							</form>
						</li>
					</ul>
			</div>
		</div>
	</div>
	</nav>
	<script type="application/json" data-name="page-data">
		{}
	</script>
	<script src="${pageContext.request.contextPath }/js/two.js"></script>
	<script src="${pageContext.request.contextPath }/js/there.js"></script>
	<script type="text/javascript">
		se();
		function se() {
			
			$.post("${pageContext.request.contextPath}/homePage/getKeyword.do",
			function(data) {
				
				$.each(data, function() {
					var k = '<li><a href=\"#\" target=\"_blank\">'+ this.keywordContent + '</a></li>'
					$("#search").append(k);
				});
			}, "json");
}
		function change() {
			clearUl2()
			$.post("${pageContext.request.contextPath}/homePage/change.do",
					function(data) {
					
						$.each(data, function() {
							var k = '<li><a href=\"#\" target=\"_blank\">'+ this.keywordContent + '</a></li>'
							$("#search").append(k);
						});
					}, "json");
		} 
		function clearUl() {
			$("#search").children().remove();
		}
		function clearUl2() {
			$("#search").children().remove();
		}
	</script>
</body>
</html>