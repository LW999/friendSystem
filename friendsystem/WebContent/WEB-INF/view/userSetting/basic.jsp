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
<title>Friends—设置</title>
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
							<th class="setting-head responsive-head"></th>
							<th></th>
						</tr>
					</thead>
					<tbody class="base">
						<tr>
							<td class="top-line">
								<div class="avatar">
									<img
										src="//upload.jianshu.io/users/upload_avatars/14515067/e84801f3-ad80-4f9d-aedf-412ac3c03965?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/300">
								</div>
							</td>
							<td class="top-line"><a class="btn btn-hollow"><input
									unselectable="on" type="file" class="hide"> 更改头像 </a></td>
						</tr>
						<tr>
							<td class="setting-title">昵称</td>
							<td><input type="text" placeholder="请输入昵称"></td>
						</tr>
						<tr>
							<td class="setting-title">电子邮件</td>
							<td><span>835621887@qq.com</span> <!----></td>
						</tr>
						<tr>
							<td class="setting-title setting-verticle">接收谁的简信</td>
							<td>
								<div class="col-xs-8">
									<input type="radio" value="true"> <span
										class="responsive-span">所有人</span>
								</div>
								<div class="col-xs-16">
									<input type="radio" value="false"> <span
										class="responsive-span">我关注的人、我发过简信的人</span>
								</div>
							</td>
						</tr>
						<tr>
							<td class="setting-title setting-verticle">提醒邮件通知</td>
							<td>
								<div class="col-xs-8">
									<input type="radio" value="instantly"> <span
										class="responsive-span">所有动态</span>
								</div>
								<div class="col-xs-11">
									<input type="radio" value="later"> <span
										class="responsive-span">每天未读汇总</span>
								</div>
								<div class="col-xs-5">
									<input type="radio" value="none"> <span
										class="responsive-span">不接收</span>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-success setting-save" value="保存">
				<!---->
				<!---->
			</div>
		</div>
	</div>

	<!---->
</body>
</html>