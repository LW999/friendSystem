<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css" />
<title>推荐作者</title>
</head>
<body>
	<div class="recommended-authors">
		<div class="title">
			<span>推荐作者</span> <a class="page-change"><i
				class="iconfont ic-search-change" style="transform: rotate(0deg);"></i>
				换一批 </a>
		</div>
		<ul class="list">
			<c:forEach items="${listRandomUserDTO}" var="listR">
				<li><a href="" target="_blank" class="avatar"><img
						src="${listR.user.userPortrait }"></a> <!-- <a class="follow" ><i class="iconfont ic-follow"></i>关注 </a>  -->
					<a class="following" style="color: #42c02e"><i class="iconfont ic-follow" style="color: #42c02e"></i>关注 </a> <!-- <a class="following"><i class="iconfont ic-unfollow"></i>取消关注</a> -->
					<a href="#" target="_blank" class="name"> ${listR.user.userName }
				</a>
					<p>一共获得了${listR.like}个喜欢</p></li>
			</c:forEach>

		</ul>
		<a href="" target="_blank" class="find-more"> 查看全部<i
			class="iconfont ic-link"></i></a>
	</div>
</body>
</html>