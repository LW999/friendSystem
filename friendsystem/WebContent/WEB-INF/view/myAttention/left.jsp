<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>我的关注</title>
</head>
<body>
	<div class="aside">
		<span class="change-type">我的所有关注<i class="iconfont ic-list-like" style="margin-left: 10px;"></i></span>
			 <a href="${pageContext.request.contextPath }/jump/recommend.do" class="add-people router-link-exact-active active"><i class="iconfont ic-addpeople"></i> <span>添加关注</span></a>
		<ul class="js-subscription-list">
			<li class=""><a
				href="${pageContext.request.contextPath }/jump/attention.do"
				class="wrap">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120">
					</div>
					<div class="name">friends</div> <!---->
			</a></li>
			<li class=""><a href="#/subscriptions/13909018/user"
				class="wrap">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120">
					</div>
					<div class="name">关注的专题</div> <!---->
			</a></li>
			<li class="">
				<a href="${pageContext.request.contextPath }/jump/people.do" class="wrap">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120">
					</div>
					<div class="name">关注的人</div> <!---->
			</a>
			</li>

		</ul>
		<!---->
		<!---->
	</div>
</body>
</html>