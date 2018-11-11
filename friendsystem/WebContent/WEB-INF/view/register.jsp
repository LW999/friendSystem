<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>阿伟注册系统</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/entry-1a3678e27fe77011521b.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style_https.1.5.2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/web-d5108cec60c4ed55f041.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />

</head>
<body class="no-padding reader-black-font" lang="zh-CN">
	<div class="sign">
		<div class="logo">
			<a href="">
				<img src="${pageContext.request.contextPath }/img/logo.png"
					alt="Logo">
			</a>
		</div>
		<div class="main">
			<h4 class="title">
				<div class="normal-title">
					<a class=""
						href="${pageContext.request.contextPath }/jump/login.do">登录</a>
					<b>·</b>
					<a id="js-sign-up-btn" class="active"
						href="${pageContext.request.contextPath }/jump/reg.do">注册</a>
				</div>
			</h4>
			<div class="js-sign-up-container">
				<form class="new_user"
					action="${pageContext.request.contextPath }/register/reg.do"
					accept-charset="UTF-8" method="POST">
					<div class="input-prepend restyle">
						<input placeholder="你的昵称" value="" name="name" type="text"
							class="form-control">
						<i class="iconfont ic-user"></i>
					</div>

					<div class="input-prepend restyle no-radius js-normal">
						<input placeholder="邮箱账号" name="mail" type="email"
							class="form-control">
						<i class="iconfont ic-email"></i>
					</div>
					<!--password-->
					<div class="input-prepend">
						<input placeholder="设置密码" name="password" type="password"
							class="form-control">
						<i class="iconfont ic-password"></i>
					</div>
					<input name="commit" value="注册" class="sign-up-button"
						id="sign_up_btn" data-disable-with="注册" type="submit">
					<p class="sign-up-msg">
						点击 “注册” 即表示您同意并愿意遵守阿伟规则<br>
						<a target="_blank" href="#">阿伟协议</a>
						和
						<a target="_blank" href="#">隐私政策</a>
						。
					</p>
				</form>
			</div>

		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery1.8.2.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
	<script type="text/javascript">
		function myfun() {
			var val = "${check}";
			console.log(val)
			alert(val)
			if (val == "reg") {
				toastr.success("注册")
			}
			if (val == "Pass") {
				toastr.success("注册成功！请激活")
			}
			if (val == "NoActivation") {
				toastr.warning("该邮箱未激活！")
			}
			if (val == "HasBeenRegistered") {
				toastr.error("该邮箱已经注册！")
			}
			if (val == "InvalidFormat") {
				toastr.warning("邮箱格式错误")
			}

		}
		window.onload = myfun;
	</script>
</body>
</html>