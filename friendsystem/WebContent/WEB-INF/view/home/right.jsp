<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>右边</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/toastr.css">
</head>
<body>
	<div class="col-xs-7 col-xs-offset-1 aside">
		<div class="board">
			<a href="javascript:kk(1);"> <img src="${pageContext.request.contextPath }/img/banner-s-3-7123fd94750759acf7eca05b871e9d17.png" alt="Banner s 3">
			</a> <a href="javascript:kk(2);"> <img src="${pageContext.request.contextPath }/img/banner-s-4-b70da70d679593510ac93a172dfbaeaa.png" alt="Banner s 4">
			</a> <a href="javascript:kk(2);"> <img src="${pageContext.request.contextPath }/img/banner-s-5-4ba25cf5041931a0ed2062828b4064cb.png" alt="Banner s 7">
			</a> <a href="javascript:kk(2);"> <img src="${pageContext.request.contextPath }/img/banner-s-6-c4d6335bfd688f2ca1115b42b04c28a7.png" alt="Banner s 5">
			</a> <a href="javascript:kk(2);"> <img src="${pageContext.request.contextPath }/img/banner-s-7-1a0222c91694a1f38e610be4bf9669be.png" alt="Banner s 6">
			</a>
		</div>

		<!-- 首页右侧 App 下载提示 -->
		<a id="index-aside-download-qrbox" class="col-xs-8 download"> <img class="qrcode" src="${pageContext.request.contextPath }/img/QQ.png" alt="李伟你是最帅的
						">
			<div class="info">
				<div class="title">
					李伟还没想好的功能 <i class="iconfont ic-link"></i>
				</div>
				<div class="description">应该是设置的地方</div>
			</div>
		</a>
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