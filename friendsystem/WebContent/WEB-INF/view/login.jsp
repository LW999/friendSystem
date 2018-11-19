<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>阿伟登陆系统</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-1a3678e27fe77011521b.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/style_https.1.5.2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-d5108cec60c4ed55f041.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
</head>
<body class="no-padding reader-black-font" lang="zh-CN">
	<div class="sign">
		<div class="logo">
			<a href="#"><img
				src="${pageContext.request.contextPath }/img/logo.png" alt="Logo"></a>
		</div>
		<div class="main">

			<h4 class="title">
				<div class="normal-title">
					<a class="active"
						href="${pageContext.request.contextPath }/jump/login.do">登录</a> <b>·</b>
					<a id="js-sign-up-btn" class=""
						href="${pageContext.request.contextPath }/jump/reg.do">注册</a>
				</div>
			</h4>
			<div class="js-sign-in-container">
				<form action="${pageContext.request.contextPath }/login/login.do" accept-charset="UTF-8" method="post">
					<!-- 正常登录登录名输入框 -->
					<div class="input-prepend restyle js-normal">
						<input placeholder="账号或邮箱" name="account" type="text"
							class="form-control"> <i class="iconfont ic-user"></i>
					</div>
					<div class="input-prepend">
						<input placeholder="密码" name="password" type="password"
							class="form-control"> <i class="iconfont ic-password"></i>
					</div>
					<div class="remember-btn"></div>
					<button class="sign-in-button" type="submit">
						<span id="sign-in-loading"></span>登录
					</button>
				</form>
			</div>

		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
		<script type="text/javascript">
			function myfun() {
				var val = "${check}";
				var va2 = "${message}";
				if (val == "Login") {
					toastr.info("欢迎登陆")
				}
				if(va2 == "error2"){
					toastr.warning("请输入账号或密码")
				}
				if(va2 == "error"){
					toastr.error("密码或账号有误")
				}
				
			}
			window.onload = myfun;
		</script>
</body>
</html>