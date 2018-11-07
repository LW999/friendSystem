<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Friends-设置</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-dc1e51fe2b436e18f5ee.css" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container setting">
		<div class="row">
			<%@include file="leftSetting.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
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
							<td class="weixin-qrcode"><input type="file" class="hide">
								<a class="btn btn-hollow"><input type="file" class="hide">
									更换图片 </a>
								<p class="pull-right">上传后会在个人主页显示图标</p></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-success setting-save" value="保存">
				<!---->
				<!---->
				<!---->
			</div>
		</div>
	</div>

	<!---->
</body>
</html>