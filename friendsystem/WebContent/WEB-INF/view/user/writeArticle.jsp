<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-dc1e51fe2b436e18f5ee.css" />
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
<title>${sessionScope.session.userName }</title>
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<div class="container setting" style="width: 1150px;">
		<div class="row">
			<div class="aside">
				<ul>
					<li class="router-link-exact-active active"><a href="#">
							<div class="setting-icon">
								<i class="iconfont ic-article-s"></i>
							</div> <span>未发布文章</span> <!---->
					</a></li>


					<c:forEach items="${listA }" var="A">
						<li class="router-link-exact-active"><a
							href="${pageContext.request.contextPath }/jump/createArticle.do?article_Id=${A.articleId }">
								<div class="setting-icon">
									<i class="iconfont ic-article-s"></i>
								</div> <span>${A.articleTitle }</span> <!---->
						</a></li>

					</c:forEach>
					<li class="router-link-exact-active"><a
						href="${pageContext.request.contextPath }/jump/createArticle.do">
							<div class="setting-icon">
								<i class="iconfont ic-article-s"></i>
							</div> <span>新建文章</span> <!---->
					</a></li>
				</ul>
			</div>
			<div class="col-xs-16 col-xs-offset-8 main">
				<!--换成编辑器-->
				<form
					action="${pageContext.request.contextPath}/user/createArticle.do"
					method="post" enctype="multipart/form-data" name="article">
					<input type="hidden" id="w" value="" name="content"> <input
						type="hidden" value="${article.articleId }" name="article_Id">
					<div id="div1" class="toolbar"></div>
					<div style="padding: 5px 0;">
						<input type="text" placeholder="${article.articleTitle }"
							id="title" name="titleName"><p class="pull-right">请输入标题</p>
					</div>
					<div id="div2" class="text">
						<!--可使用 min-height 实现编辑区域自动增加高度-->
						${article.articleContent }

					</div>
					<br />
					<tbody class="information">
						<tr>
							<td class="weixin-qrcode"><img
								src="${pageContext.request.contextPath}/img/user.do?fileFileName=${article.articleImg }"
								id="selectImg2" style="height: 139px; width: 139px;"
								alt="未上传首页封面"> <a class="btn btn-hollow"><input
									type="file" class="hide" onchange="xmTanUploadImg2(this)"
									id="fileName" name="pictureFile"> 上传首页封面图 </a></td>
						</tr>
					</tbody>

					<button onclick="myFirst()" class="btn btn-hollow">保存</button>
					<button class="btn btn-delete" style="margin-left: 260px;"
						onclick="release()">
						<i class="iconfont ic-write"></i>发布
					</button></form>
			</div>

		</div>
		
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
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
		/* 用户发表文章 */
		function release() {
			var v1 = ed.txt.html();
			alert(v1);
			$("#w").val(ed.txt.html());
			alert('ddd')
			document.article.action = '${pageContext.request.contextPath }/user/release.do';
			document.Article.submit();
		}
	</script>
</body>

</html>