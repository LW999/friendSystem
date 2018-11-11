<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<div class="aside"
		style="width: 250px; padding-left: 0px; margin-left: 135px; border-right-width: 0px;">
		<span class="change-type">未发表的文章<i
			class="iconfont ic-article-s"
			style="margin-left: 10px; color: #ea6f5a"></i>
			<ul class="js-subscription-list">
				<li class="router-link-exact-active active"><a
					href="${pageContext.request.contextPath }/jump/attention.do"
					class="wrap">
						<div>
							<img
								src="//upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120">
						</div>
						<div class="name">
							friends<i class="iconfont ic-article-s"
								style="margin-left: 10px; color: #ea6f5a"></i>
							<ul class="js-subscription-list">
						</div> <!---->
				</a></li>

				<!-- 遍历所有关注的人 -->
				<c:forEach items="${allUserAttentionDTO.listPeople }"
					var="listPeople">

					<li class=""><a
						href="${pageContext.request.contextPath }/user/whoPeople.do?user_Id=${listPeople.userId}"
						class="wrap">
							<div class="avatar">
								<img src="${listPeople.userPortrait }">
							</div>
							<div class="name">${listPeople.userName}</div> <!---->
					</a></li>
				</c:forEach>
				<!-- 遍历所有关注专题 -->
				<c:forEach items="${allUserAttentionDTO.listProject }"
					var="listProject">

					<li class=""><a href="#" class="wrap">
							<div class="avatar">
								<img src="${listProject.userPortrait }">
							</div>
							<div class="name">${listPeople.projectImg}</div> <!---->
					</a></li>
				</c:forEach>


			</ul> <!----> <!---->
	</div>


</body>
</html>