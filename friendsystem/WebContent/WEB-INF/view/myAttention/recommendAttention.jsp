<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-378ceb50d759a4e567e3.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
<title>Friends-推荐关注</title>
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 头部 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container subscription">
		<div class="row">
			<!-- 左边 -->
			<%@include file="left.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
				<div>
					<ul class="trigger-menu">
						<li class="active">
							<a>全部推荐</a>
						</li>
						<li class="">
							<a>
								<i class="iconfont ic-user"></i>
								推荐作者
							</a>
						</li>
						<li class="">
							<a>
								<i class="iconfont ic-search-collection"></i>
								推荐专题
							</a>
						</li>
					</ul>
					<ul class="add-follow-list">
						<li>
							<div>
								<a class="btn btn-success follow">
									<i class="iconfont ic-follow"></i>
									<span>关注</span>
								</a>
								<!---->
								<a href="/u/0f20947bf3a0" target="_blank" class="avatar">
									<img src="//upload.jianshu.io/users/upload_avatars/6898748/7272a6f4-0220-4a7a-96db-7d5b4871baa6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144">
								</a>
								<div class="info">
									<a href="/u/0f20947bf3a0" target="_blank" class="name">欣之助</a>
									<p>オレにはかんけいないだろう</p>
									<a href="/p/a9a36eec4422" target="_blank">
										<i class="iconfont ic-article-s"></i>
										<span>莫比乌斯环</span>
									</a>
									<a href="/p/a38c140c00d7" target="_blank">
										<i class="iconfont ic-article-s"></i>
										<span>有点冷的天气里，我想逗逗你</span>
									</a>
									<div class="meta">
										<a href="/u/080bb4eac1c9" target="_blank">
											无限猴子
											<!---->
										</a>
										<span>关注了作者</span>
									</div>
								</div>
							</div>
						</li>
					</ul>
					<!---->
					<a class="load-more">阅读更多</a>
				</div>
			</div>
		</div>
	</div>

</body>

</html>