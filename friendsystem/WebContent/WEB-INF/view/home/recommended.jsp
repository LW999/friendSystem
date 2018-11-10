<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/toastr.css">
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
				<li><a href="${listR.user.userId }" target="_blank"
					class="avatar"> <img src="${listR.user.userPortrait }"></a> <!-- <a class="follow" ><i class="iconfont ic-follow"></i>关注 </a>  -->
					<!--   如果是游客就跳转到登陆界面 --> <c:choose>
						<c:when test="${sessionScope.session.userType eq 'tourists'}">
							<a href="${pageContext.request.contextPath }/jump/login.do"
								class="following" style="color: #42c02e"><i
								class="iconfont ic-follow" style="color: #42c02e"></i>关注 </a>
						</c:when>
						<c:otherwise>
							<a id="${listR.user.userId }"
								href="javascript:jj();"
								class="following ddd" style="color: #42c02e"><i
								class="iconfont ic-follow" style="color: #42c02e"></i>关注 </a>

						</c:otherwise>

					</c:choose> 


					<a href="#" target="_blank" class="name"> ${listR.user.userName }
				</a>
					<p>一共获得了${listR.like}个喜欢</p></li>
			</c:forEach>

		</ul>
		<a href="" target="_blank" class="find-more"> 查看全部<i
			class="iconfont ic-link"></i></a>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery1.8.2.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
	<script type="text/javascript">
		$(".ddd")
				.hover(
						function() {
							var l = $(this).html();
							if (l.indexOf("已关注") != -1) {
								$(this)
										.html(
												'<i class="iconfont ic-unfollow"></i>取消关注')
								$(this).css("color", "#000");
							}

						},
						function() {
							var l = $(this).html();
							if (l.indexOf("取消关注") != -1) {
								$(this)
										.html(
												'<i class="iconfont ic-follow" style="color: #000">已关注</i>')
								$(this).removeCSS("color");
							}
						});
		function jj(id) {
			$
					.get(
							"${pageContext.request.contextPath}/user/attentionUser.do?user_Id="
									+ id + "",
							function(data) {
								console.log('dd:' + data)
								if (data.trim() == 'success') {
									$('#' + id)
											.html(
													'<i class="iconfont ic-followed" style="color: #42c02e"></i>已关注')
								} else if (data.trim() == 'cancelAttention') {
									$('#' + id)
											.html(
													'<i class="iconfont ic-follow" style="color: #42c02e">关注</i>')
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