<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-dc1e51fe2b436e18f5ee.css" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
<title>${sessionScope.session.userName }—设置</title>
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container setting">
		<div class="row">
			<%@include file="leftSetting.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
				<form action="${pageContext.request.contextPath }/user/basic.do"
					method="post" enctype="multipart/form-data">
					<table>
						<thead>
							<tr>
								<th class="setting-head responsive-head"></th>
								<th></th>
							</tr>
						</thead>
						<tbody class="base">
							<tr>
								<td class="top-line">
									<div class="avatar">
										<img
											src="${pageContext.request.contextPath}/img/user.do?fileFileName=${sessionScope.session.userPortrait }"
											id="selectImg">
									</div>
								</td>
								<td class="top-line"><a class="btn btn-hollow"><input
										unselectable="on" type="file" class="hide" id="pictureFile"
										name="pictureFile" onchange="xmTanUploadImg(this)">
										更改头像 </a></td>
							</tr>
							<tr>
								<td class="setting-title">昵称${sessionScope.session.userName }</td>
								<td id=""><input type="text"
									placeholder="${sessionScope.session.userName }" id="textName"
									name="textName"></td>
							</tr>
							<tr>
								<td class="setting-title">电子邮件</td>
								<td><span>835621887@qq.com</span> <!----></td>
							</tr>
						</tbody>
					</table>
					<table>
						<thead>
							<tr>
								<th class="setting-head"></th>
								<th></th>
							</tr>
						</thead>
						<tbody class="information">
							<tr>
								<td class="top-line setting-title setting-verticle">性别</td>
								<td class="top-line"><input type="radio" value="1">
									<span>男</span> <input type="radio" value="2"> <span>女</span>
									<input type="radio" value="0"> <span>保密</span></td>
							</tr>
							<tr>
								<td class="setting-title pull-left">个人简介</td>
								<td>
									<form>
										<textarea placeholder="填写你的个人简介"></textarea>
									</form>
								</td>
							</tr>
							<tr>
								<td class="setting-title">微信二维码</td>
								<td class="weixin-qrcode"><img src="" id="selectImg2">
									<a class="btn btn-hollow"><input type="file" class="hide"
										onchange="xmTanUploadImg2(this)"> 更换图片 </a>
									<p class="pull-right">上传后会在个人主页显示图标</p></td>
							</tr>
						</tbody>
					</table>
					<input type="submit" class="btn btn-success setting-save"
						value="保存">
				</form>
				<!---->
				<!---->
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery1.8.2.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>

	<script type="text/javascript">
		myfun();
		function myfun() {
			var va2 = "${message}";
			if (va2 == "ok") {
				toastr.success("修改成功")
			}
			if (va2 == "noAmend") {
				toastr.error("请输入修改内容")
			}

		}

		/* 图片预览功能 */
		function xmTanUploadImg(obj) {
			var file = obj.files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function(e) { //成功读取文件
				var img = document.getElementById("selectImg");
				img.src = e.target.result; //或 img.src = this.result / e.target == this

			};
		}

		/* 图片预览功能 */
		function xmTanUploadImg2(obj) {
			var file = obj.files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function(e) { //成功读取文件
				var img = document.getElementById("selectImg2");
				img.src = e.target.result; //或 img.src = this.result / e.target == this

			};
		}
	</script>


	<!---->
</body>
</html>