<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<div class="aside">
		<div>
			<ul class="menu">
				<li class="active"><a>
						<div class="setting-icon">
							<i class="iconfont ic-search-note"></i>
						</div> <span>文章</span>
				</a></li>
				<li class=""><a>
						<div class="setting-icon">
							<i class="iconfont ic-search-user"></i>
						</div> <span>用户</span>
				</a></li>
				<li class=""><a>
						<div class="setting-icon">
							<i class="iconfont ic-search-collection"></i>
						</div> <span>专题</span>
				</a></li>
			</ul>
		</div>
		<div class="search-trending">
			<div class="search-trending-header clearfix" style="margin-bottom: 30px;">
				<span>热门搜索</span> 
				<a onclick="javascript:change();"> 
					<i class="iconfont ic-search-change" style="transform: rotate(0deg);" onclick="javascript:change();"></i> 换一批
				</a>
			</div>
			<ul class="search-trending-tag-wrap" id="search2">
			</ul>
		</div>
	</div>
	<script type="text/javascript">
		se();
		function se() {

			$.post("${pageContext.request.contextPath}/homePage/getKeyword.do",
					function(data) {

						$.each(data, function() {
							var k = '<li><a href=\"#\" target=\"_blank\">'
									+ this.keywordContent + '</a></li>'
							$("#search2").append(k);
						});
					}, "json");
		}
		function change() {
			clearUl2()
			$.post("${pageContext.request.contextPath}/homePage/change.do",
					function(data) {

						$.each(data, function() {
							var k = '<li><a href=\"#\" target=\"_blank\">'
									+ this.keywordContent + '</a></li>'
							$("#search2").append(k);
						});
					}, "json");
		}
		function clearUl() {
			$("#search2").children().remove();
		}
		function clearUl2() {
			$("#search2").children().remove();
		}
	</script>
</body>
</html>