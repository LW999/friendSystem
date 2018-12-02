<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 图标 -->
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>我的关注</title>
</head>
<body>
	<div class="aside">
		<span class="change-type">
			我的所有关注
			<i class="iconfont ic-list-like" style="margin-left: 10px; color: #ea6f5a"></i>
			<a href="${pageContext.request.contextPath }/jump/recommend.do">
				<i class="iconfont ic-addpeople" style="margin-left: 62px"></i>
				<span>添加关注</span>
			</a>
		</span>
		<ul class="js-subscription-list">
			<li class="router-link-exact-active active">
				<a href="${pageContext.request.contextPath}/user/myAttention.do" class="wrap">
					<div class="avatar">
						<img src="${pageContext.request.contextPath}/img/user.do?fileFileName=bb38223dcca747baa7a10b4850a6f049.png">
					</div>
					<div class="name">friends</div>
					<!---->
				</a>
			</li>

			<!-- 遍历所有关注的人 -->
			<c:forEach items="${allUserAttentionDTO.listPeople }" var="listPeople">

				<li class="">
					<a href="${pageContext.request.contextPath }/user/whoPeople.do?user_Id=${listPeople.userId}" class="wrap">
						<div class="avatar">
							<img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${listPeople.userPortrait }">
						</div>
						<div class="name">${listPeople.userName}</div>
						<!---->
					</a>
				</li>
			</c:forEach>
			<!-- 遍历所有关注专题 -->
			<c:forEach items="${allUserAttentionDTO.listProject }" var="listProject">

				<li class="">
					<a href="#" class="wrap">
						<div class="avatar">
							<img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${listProject.userPortrait }">
						</div>
						<div class="name">${listPeople.projectImg}</div>
						<!---->
					</a>
				</li>
			</c:forEach>


		</ul>
		<!---->
		<!---->
	</div>


	<script type="application/json" data-name="page-data">
		{}
	</script>
	<script src="${pageContext.request.contextPath }/js/one.js" crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/two.js" crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/there.js" crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/fore.js" crossorigin="anonymous"></script>
</body>
</html>