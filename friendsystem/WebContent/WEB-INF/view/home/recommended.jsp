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
			<span>推荐作者</span> <a class="page-change" onclick="www(this)"><i
				class="iconfont ic-search-change" style="transform: rotate(5deg);"></i>
				换一批 </a>
		</div>
		<ul class="list" id="qwe">
		<%-- 	<c:forEach items="${listRandomUserDTO}" var="listR">
				<li><a href="${pageContext.request.contextPath}/user/myHome.do?user_Id=${listR.user.userId}" target="_blank"
					class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${listR.user.userPortrait }"></a> <!-- <a class="follow" ><i class="iconfont ic-follow"></i>关注 </a>  -->
					<!--   如果是游客就跳转到登陆界面 --> <c:choose>
						<c:when test="${sessionScope.session.userType eq 'tourists'}">
							<a href="${pageContext.request.contextPath }/jump/login.do"
								class="following" style="color: #42c02e"><i
								class="iconfont ic-follow" style="color: #42c02e"></i>关注 </a>
						</c:when>
						<c:otherwise>
							<a id="${listR.user.userId }"
								href="javascript:jj('${listR.user.userId }');"
								class="following ddd" style="color: #42c02e"><i
								class="iconfont ic-follow" style="color: #42c02e"></i>关注 </a>

						</c:otherwise>

					</c:choose> 


					<a href="#" target="_blank" class="name"> ${listR.user.userName }
				</a>
					<p>一共获得了${listR.like}个喜欢</p></li>
			</c:forEach> --%>

		</ul>
		<a href="" target="_blank" class="find-more"> 查看全部<i
			class="iconfont ic-link"></i></a>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/toastr.js"></script>
		
	<script type="text/javascript">
	www();
	function www() {
		var s = '${sessionScope.session.userType}';
		$.post("${pageContext.request.contextPath}/homePage/otherUser.do",
				{
			"page" : 'dd'
		},function(data){
		
			console.log(data)
			clearUl();
			$.each(data,function(){
				var k = '<li><a href=\"${pageContext.request.contextPath}/user/myHome.do?user_Id='+this.user.userId+'\" target=\"_blank\" class=\"avatar\">'
						+'<img src=\"${pageContext.request.contextPath}/img/user.do?fileFileName='+this.user.userPortrait+'\"></a>' ;
						
						if(s == 'tourists'){
							k = k+'<a href=\"${pageContext.request.contextPath }/jump/login.do\" class=\"following\" style=\"color: #42c02e\">'+'<i class=\"iconfont ic-follow\" style=\"color: #42c02e\">'+'</i>关注 </a>';
						}else{
							k = k+'<a id=\"'+this.user.userId+'\" href=\"javascript:jj(\''+this.user.userId+'\');\" class=\"following ddd\" style=\"color: #42c02e\">'+'<i class=\"iconfont ic-follow\" style=\"color: #42c02e\"></i>关注 </a>';
						}
						k = k+'<a href=\"#\" target=\"_blank\" class=\"name\"> '+this.user.userName+'</a>'+'<p>一共获得了'+this.like+'个喜欢</p>'+'</li>';
						
						$("#qwe").append(k);
				
			});
			attentionHover();
		},"json");
		
	}
		function attentionHover(){
			$(".ddd").hover(function() {	
				var l = $(this).html();
				if (l.indexOf("已关注") != -1) {
					$(this).html('<i class="iconfont ic-unfollow "></i>取消关注')
					$(this).css("color", "#000");
				}
			},
			function() {
				var l = $(this).html();
				if (l.indexOf("取消关注") != -1) {
					$(this).html('<i class="iconfont ic-follow" style="color: #000">已关注</i>')
					console.log('d:',$(this))
					$(this).css("color","#000");
				}
			});
		}
	
		function jj(id) {
			$.get("${pageContext.request.contextPath}/user/attentionUser.do?user_Id="+ id + "",
			function(data) {
				if (data.trim() == 'success') {
					$('#' + id).html('<i class="iconfont ic-followed" style="color: #000"></i>已关注')
					$('#' + id).css("color","#000");
				} else if (data.trim() == 'cancelAttention') {
					$('#' + id).html('<i class="iconfont ic-follow" style="color: #42c02e">关注</i>')
				}
				if (data.trim() == "success") {
					toastr.success("关注成功")
				}
				if (data.trim() == "cancelAttention") {
					toastr.warning("取消关注")
				}
			})
		}
		function clearUl() {
			$("#qwe").children().remove();
		}
	</script> 
	
	
	
</body>
</html>