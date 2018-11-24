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

		<a class="avatar"> <img
			src="${pageContext.request.contextPath}/img/user.do?fileFileName=${UALDTO.user.userPortrait }"
			alt="240">
		</a>
		<c:choose>
			<c:when test="${sessionScope.session.userId eq UALDTO.user.userId }"></c:when>
			<c:when test="${isAttention eq 'yes'}">
				<a href="javascript:qqq('${UALDTO.user.userId}');"
					id="${UALDTO.user.userId}">
					<button data-v-6292e408="" class="on  user-follow-button">
						<i data-v-6292e408="" class="iconfont"></i> <span
							data-v-6292e408="">已关注</span>
					</button>
				</a>
				<a class="btn btn-hollow" href="#">发私信</a>
			</c:when>
			<c:when test="${sessionScope.session.userType eq 'tourists'}">
				<a href="${pageContext.request.contextPath }/jump/login.do">
					<button data-v-6292e408="" class="off  user-follow-button">
						<i data-v-6292e408="" class="iconfont"></i> <span
							data-v-6292e408="">关注</span>
					</button>
				</a>
				<a class="btn btn-hollow" href="#">发私信</a>
			</c:when>
			<c:otherwise>
				<a href="javascript:qqq('${UALDTO.user.userId}');"
					id="${UALDTO.user.userId}">
					<button data-v-6292e408="" class="off  user-follow-button">
						<i data-v-6292e408="" class="iconfont"></i> <span
							data-v-6292e408="">关注</span>
					</button>
				</a>
				<a class="btn btn-hollow" href="#">发私信</a>
			</c:otherwise>
		</c:choose>


		<div class="title">
			<a class="name" href="#">${UALDTO.user.userName }</a>
		</div>
		<div class="info">
			<ul>
				<li>
					<div class="meta-block">
						<a
							href="${pageContext.request.contextPath}/homePage/userAttention.do?user_Id=${UALDTO.user.userId }">
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
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript">
		function qqq(id) {
			$
					.post(
							"${pageContext.request.contextPath}/user/attentionUser.do?user_Id="
									+ id + "",
							function(data) {
								if (data.trim() == 'cancelAttention') {
									$('#' + id)
											.html(
													'<button data-v-6292e408=\"\" class=\"off  user-follow-button\"> <i data-v-6292e408=\"\" class=\"iconfont\"></i> <span data-v-6292e408=\"\">关注</span></button>')
								} else if (data.trim() == 'success') {
									$('#' + id)
											.html(
													'<button data-v-6292e408=\"\" class=\"on  user-follow-button\"> <i data-v-6292e408=\"\" class=\"iconfont\"></i> <span data-v-6292e408=\"\">已关注</span></button>')
								}
								if (data.trim() == "success") {
									toastr.success("关注成功")
								}
								if (data.trim() == "cancelAttention") {
									toastr.warning("取消关注")
								}
							})
		}
	</script>
</body>
</html>