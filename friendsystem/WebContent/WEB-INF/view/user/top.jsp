<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${UALDTO.user.userName }</title>
</head>
<body>
	<div class="main-top">

		<a class="avatar" href="/u/b91cc2d507d0"> <img
			src="${pageContext.request.contextPath}/img/user.do?fileFileName=${UALDTO.user.userPortrait }"
			alt="240">
		</a>
		<button data-v-6292e408="" class="off  user-follow-button">
			<i data-v-6292e408="" class="iconfont"></i>
			<span data-v-6292e408="">关注</span>
		</button>
		<a class="btn btn-hollow" href="#">发私信</a>

		<div class="title">
			<a class="name" href="#">${UALDTO.user.userName }</a>
		</div>
		<div class="info">
			<ul>
				<li>
					<div class="meta-block">
						<a href="${pageContext.request.contextPath}/homePage/userAttention.do?user_Id=${UALDTO.user.userId }">
							<p>${allAttention}</p> 关注 <i class="iconfont ic-arrow"></i>
						</a>
					</div>
				</li>
				<li>
					<div class="meta-block">
						<a href="">
							<p>${fansNumber }</p> 粉丝 <i class="iconfont ic-arrow"></i>
						</a>
					</div>
				</li>
				<li>
					<div class="meta-block">
						<a href="">
							<p>${articlesNumber }</p> 文章 <i class="iconfont ic-arrow"></i>
						</a>
					</div>
				</li>
				<li>
					<div class="meta-block">
						<p>${UALDTO.view }</p>
						<div>浏览量</div>
					</div>
				</li>
				<li>
					<div class="meta-block">
						<p>${UALDTO.like}</p>
						<div>收获喜欢</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>