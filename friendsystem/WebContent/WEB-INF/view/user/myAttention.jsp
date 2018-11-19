<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 图标 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-71aa880fd9d7cbb38465.css" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<title>${UALDTO.user.userName }</title>
</head>

<body class="reader-song-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container person">
		<div class="row">
			<div class="col-xs-16 main">
				<div class="main-top">

					<a class="avatar" href="#"> <img
						src="${pageContext.request.contextPath}/img/user.do?fileFileName=${UALDTO.user.userPortrait}"
						alt="240">
					</a>

					<!-- 关注 -->
					<c:choose>
						<c:when
							test="${sessionScope.session.userId}==${UALDTO.user.userId }"></c:when>
						<c:otherwise>
							<c:choose>
								<c:when test="${isAttention eq 'success' }">
									<button data-v-6292e408=""
										class="on  user-follow-button followed">
										<i data-v-6292e408="" class="iconfont"></i><span
											data-v-6292e408="">已关注</span>
									</button>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${sessionScope.session.userType eq 'tourists'}">
											<a href="${pageContext.request.contextPath }/jump/login.do">
												<button data-v-6292e408="" class="off  user-follow-button">
													<i data-v-6292e408="" class="iconfont"></i><span
														data-v-6292e408="">关注</span>
												</button>
											</a>
										</c:when>

										<c:otherwise>
											<button data-v-6292e408="" class="off  user-follow-button">
												<i data-v-6292e408="" class="iconfont"></i><span
													data-v-6292e408="">关注</span>
											</button>

										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>

							<a class="btn btn-hollow" href="#">发简信</a>
						</c:otherwise>
					</c:choose>

					<div class="title">
						<a class="name" href="#">${UALDTO.user.userName }</a>
					</div>
					<div class="info">
						<ul>
							<li>
								<div class="meta-block">
									<a href="#">
										<p>${allAttention }</p> 关注 <i class="iconfont ic-arrow"></i>
									</a>
								</div>
							</li>
							<li>
								<div class="meta-block">
									<a href="#">
										<p>${fansNumber }</p> 粉丝 <i class="iconfont ic-arrow"></i>
									</a>
								</div>
							</li>
							<li>
								<div class="meta-block">
									<a href="#">
										<p>${articlesNumber}</p> 文章 <i class="iconfont ic-arrow"></i>
									</a>
								</div>
							</li>
							<li>
								<div class="meta-block">
									<p>0</p>
									<div>字数</div>
								</div>
							</li>
							<li>
								<div class="meta-block">
									<p>${userLikes }</p>
									<div>收获喜欢</div>
								</div>
							</li>
						</ul>
					</div>
				</div>

				<ul class="trigger-menu" data-pjax-container="#list-container">
					<li class=""><a data-placeholder="user" href="#">关注用户${allAttention }</a></li>
					<c:choose>
						<c:when
							test="${sessionScope.session.userId}==${UALDTO.user.userId }"></c:when>
						<c:when test="${sessionScope.session.userType eq 'tourists'}"></c:when>
						<c:otherwise>
							<li class=""><a data-placeholder="user" href="#">共同关注
									${fansNumber }</a></li>
						</c:otherwise>
					</c:choose>



					<li class=""><a data-placeholder="user" href="#">粉丝
							${fansNumber }</a></li>
				</ul>

				<div id="list-container">
					<ul class="user-list" infinite-scroll-url="#"
						data-placeholder="user">
						<c:forEach items="${listU }" var="U">
							<li><a class="avatar" href="#"> <img
									src="${pageContext.request.contextPath}/img/user.do?fileFileName=${U.user.userPortrait}"
									alt="180">
							</a>
								<div class="info">
									<a class="name" href="#">${U.user.userName}</a>
									<div class="meta">
										<span>关注${U.attention }</span><span>粉丝 ${U.fans }</span><span>文章
											${U.article }</span>
									</div>
									<div class="meta">被浏览了${U.view }次，获得了 ${U.likes }个喜欢</div>
								</div> <c:choose>
									<c:when test="${sessionScope.session.userType eq 'tourists'}">
										<a class="btn btn-success follow"><i
											class="iconfont ic-follow"></i><span>关注</span></a>
									</c:when>
									<c:otherwise>
										<a class="btn btn-default following"><i
											class="iconfont ic-followed"></i><span>已关注</span></a></li>
							</c:otherwise>
							</c:choose>


						</c:forEach>
					</ul>

				</div>
			</div>

			<div class="col-xs-7 col-xs-offset-1 aside">
				<div class="description">
					<div class="js-intro"></div>

					<a class="social-icon-sprite social-icon-weixin"
						data-toggle="popover" data-placement="bottom" data-html="true"
						data-trigger="hover" href="javascript:void(0);"
						data-content="
  						<div class=&quot;qrcode&quot;>
  						  <div class=&quot;arrow-top&quot;></div>
   					 <img src=&quot;//upload.jianshu.io/users/qrcodes/14515067/QQ%E5%9B%BE%E7%89%8720181101195807.png?imageMogr2/auto-orient/strip|imageView2/1/w/320/h/320&quot; alt=&quot;320&quot; />
  					</div>
				"
						data-original-title="" title=""></a>

				</div>
				<div id="user-publications">
					<!---->
				</div>
				<div id="user-courses">
					<!---->
				</div>
				<ul class="list user-dynamic">
					<li><a href="/users/d355083d142b/subscriptions"> <i
							class="iconfont ic-collection"></i> <span>我关注的专题/文集/连载</span>
					</a></li>
					<li><a href="/users/d355083d142b/liked_notes"> <i
							class="iconfont ic-like"></i> <span>我喜欢的文章</span>
					</a></li>
				</ul>
				<!-- 专题和文集 -->
				<div>
					<div>
						<!---->
						<div class="title">我创建的专题</div>
						<div class="new-collection-block">
							<a href="/collections/new" class="new-collection-btn"><i
								class="iconfont ic-follow"></i><span>创建一个新专题</span></a>
						</div>
					</div>
					<!---->
					<!---->
				</div>
			</div>

		</div>
		<div id="extwaiimpotscp" style="display: none" v="{4170"
			f="ZXpReE56Qm1ZV0ZoTFdWbE9EY3ROR0V3WlMxaU5UZGhMVEZoWldNME9USTRNamc0TjMwPQ=="
			q="c35bd907" c="144.2" i="154.9" u="0.735" s="18110919" w="false"
			m="BMe=" vn="0trzh"></div>
	</div>
	<div class="side-tool">
		<ul>
			<li data-placement="left" data-toggle="tooltip" data-container="body"
				data-original-title="回到顶部" style="display: none;"><a
				class="function-button"><i class="iconfont ic-backtop"></i></a></li>
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
		</ul>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/js/jquery-2.11.min.js"></script>
	<script type="text/javascript">
		function login() {
			alert('dd')
			$.post("${pageContext.request.contextPath }/jump/login.do");
		}
	</script>

</body>

</html>