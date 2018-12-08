<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/toastr.css">
<title>专题</title>
</head>
<body>
	<div class="recommend-collection">
		<c:forEach items="${listProject}" var="listP">
			<a class="collection" href="javascript:kk(1);">
				<img src="${listP.projectImg}" alt="暂无">
				<div class="name">${listP.projectName }</div>
			</a>
		</c:forEach>
		<a class="more-hot-collection"  href="javascript:kk(2);">
			更多热门专题
			<i class="iconfont ic-link"></i>
		</a>
	</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/toastr.js"></script>
		<script type="text/javascript">
			function kk(a) {
				if (a == 1) {
					toastr.info("还没弄好哟");
				} else {
					toastr.info("对不起这些也没弄···");
				}
			}
		</script>
</body>
</html>