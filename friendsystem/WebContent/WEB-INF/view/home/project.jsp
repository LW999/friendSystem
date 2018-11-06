<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专题</title>
</head>
<body>
	<div class="recommend-collection">
		<c:forEach items="${listProject}" var="listP">
			<a class="collection" target="_blank" href="#"> <img
				src="${listP.projectImg}" alt="">
				<div class="name">${listP.projectName }</div>
			</a>
		</c:forEach>
		<a class="more-hot-collection" target="_blank" href="#"> 更多热门专题 <i
			class="iconfont ic-link"></i>
		</a>
	</div>
	<%-- <form action="${pageContext.request.contextPath }/rest/pro.do" method="post" id="index"></form>
	<script>
		window.onload = function() {
			document.getElementById("index").submit();
		}
	</script> --%>
</body>
</html>