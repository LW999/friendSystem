<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-378ceb50d759a4e567e3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />

<style type="text/css">
.toolbar {
	border: 1px solid #ccc;
}

.text {
	border: 1px solid #ccc;
	height: 400px;
}

.write-btn {
	float: right;
	width: 100px;
	height: 40px;
	line-height: 24px;
	margin: 8px 15px 0;
	border-radius: 20px;
	font-size: 15px;
	color: #fff;
	background-color: #ea6f5a;
}
</style>
<title></title>
</head>

<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<!-- 头部 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container subscription">
		<div class="row">

			<!-- 左边 -->
			<%@include file="left.jsp"%>

			<div class="col-xs-16 col-xs-offset-8 main">
				<div>
					<!--换成编辑器-->
					<form
						action="${pageContext.request.contextPath}/user/createArticle.do"
						method="post" enctype="multipart/form-data">
						<input type="hidden" id="w" value="" name="content">
						<div id="div1" class="toolbar" style="width: 500px"></div>
						<div style="padding: 5px 0;">
							<input type="text" placeholder="請輸入標題" id="title"
								name="titleName">
						</div>
						<div id="div2" class="text">
							<!--可使用 min-height 实现编辑区域自动增加高度-->
							<p>使用 base64 保存图片</p>

						</div>
						<br />
						<!-- <button onclick="myFirst()">获取text</button> -->
						<tbody class="information">
							<tr>
								<td class="weixin-qrcode"><img src="" id="selectImg2"
									style="height: 139px; width: 139px;" alt="未上传首页封面"> <a
									class="btn btn-hollow"><input type="file" class="hide"
										name="pictureFile" onchange="xmTanUploadImg2(this)"
										id="fileName"> 上传首页封面图 </a></td>
							</tr>
						</tbody>

						<button onclick="myFirst()" class="btn btn-hollow">保存</button>
						<a class="btn btn-delete" style="margin-left: 260px;"> <i
							class="iconfont ic-write"></i>发布
						</a>
				</div>
			</div>
		</div>

		</form>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery1.8.2.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/wangEditor.js"></script>

	<script type="text/javascript">
		$.support.transition = false;
		var E = window.wangEditor;
		var ed = new E('#div1', '#div2');
		ed.customConfig.uploadImgShowBase64 = true;
		ed.create();

		function myFirst() {
			var v2 = document.getElementById("title").value;
			var v3 = document.getElementById("fileName").value;
			var v1 = ed.txt.html();
			alert(v1);
			alert(v2);
			alert(v3);
			$("#w").val(ed.txt.html());
		}
		/* 图片预览功能 */
		function xmTanUploadImg2(obj) {
			var file = obj.files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function(e) { //成功读取文件
				var img = document.getElementById("selectImg2");
				img.src = e.target.result; //或 img.src = this.result / e.target == this

			};
		}
	</script>
</body>

</html>