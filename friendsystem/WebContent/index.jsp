<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Friends 阿伟最帅</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-2dd01f1ba455dc6d65b3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-d5108cec60c4ed55f041.css" />
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />

</head>
<body lang="zh-CN" class="reader-black-font">
	<!-- 全局顶部导航栏 -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="width-limit">
		<!-- 左上方 Logo -->
		<!--<a class="logo" href="/"><img src="//cdn2.jianshu.io/assets/web/nav-logo-4c7bbafe27adc892f3046e6978459bac.png" alt="Nav logo"></a>-->

		<!-- 右上角 -->
		<!-- 未登录显示登录/注册/写文章 -->
		<a class="btn write-btn" target="_blank" href="/writer#/"> <i
			class="iconfont ic-write"></i>写文章
		</a> <a class="btn sign-up" id="sign_up" href="/sign_up">注册</a> <a
			class="btn log-in" id="sign_in" href="/sign_in">登录</a>

		<!-- 如果用户登录，显示下拉菜单 -->
		<div class="user">
			<div data-hover="dropdown">
				<a class="avatar" href=""><img src="" alt="120"></a>
			</div>
			<ul class="dropdown-menu">
				<li><a href="/u/d355083d142b"> <i
						class="iconfont ic-navigation-profile"></i><span>我的主页</span>
				</a></li>
				<li>
					<!-- TODO bookmarks_path --> <a href="/bookmarks"> <i
						class="iconfont ic-navigation-mark"></i><span>收藏的文章</span>
				</a>
				</li>
				<li><a href="/users/d355083d142b/liked_notes"> <i
						class="iconfont ic-navigation-like"></i><span>喜欢的文章</span>
				</a></li>
				<li><a href="/my/paid_notes"> <i class="iconfont ic-paid"></i><span>已购内容</span>
				</a></li>
				<li><a href="/wallet"> <i
						class="iconfont ic-navigation-wallet"></i><span>我的钱包</span>
				</a></li>
				<li><a href="/settings"> <i
						class="iconfont ic-navigation-settings"></i><span>设置</span>
				</a></li>
				<li><a href="/faqs"> <i
						class="iconfont ic-navigation-feedback"></i><span>帮助与反馈</span>
				</a></li>
				<li><a rel="nofollow" data-method="delete" href="/sign_out">
						<i class="iconfont ic-navigation-signout"></i><span>退出</span>
				</a></li>
			</ul>
		</div>

		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#menu" aria-expanded="false">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav navbar-nav">
					<li class="tab active"><a href="/"> <span
							class="menu-text">首页</span><i
							class="iconfont ic-navigation-discover menu-icon"></i>
					</a></li>
					<!--登陆后出现-->
					<ul class="nav navbar-nav">

						<li class="tab "><a href="#"> <span class="menu-text">关注</span><i
								class="iconfont ic-navigation-follow menu-icon"></i>
						</a></li>
						<li class="tab notification"><a data-hover="dropdown"
							href="#" class="notification-btn"><span class="menu-text">消息</span>
								<i class="iconfont ic-navigation-notification menu-icon"></i> <!---->
								<!----> </a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="iconfont ic-comments"></i> <span><span
											class="badge pull-left">8</span>评论</span> <!----> </a></li>
								<li><a href="3"><i class="iconfont ic-chats"></i> <span>简信</span>
										<!----> </a></li>

								<li><a href="#"><i class="iconfont ic-likes"></i> <span>喜欢和赞</span>
										<!----> </a></li>
								<li><a href="#"><i class="iconfont ic-follows"></i> <span>关注</span>
										<!----> </a></li>

							</ul></li>

						<li class="search">
							<form target="_blank" action="#" accept-charset="UTF-8"
								method="get">
								<input type="text" name="" autocomplete="off" placeholder="搜索"
									class="search-input" data-mounted="1"> <a
									class="search-btn" href=""><i class="iconfont ic-search"></i></a>
								<div id="navbar-search-tips" style="">
									<div class="search-trending">
										<div class="search-trending-header clearfix">
											<span>热门搜索</span> <a><i class="iconfont ic-search-change"
												style="transform: rotate(0deg);"></i> 换一批</a>
										</div>

										<ul class="search-trending-tag-wrap">

											<li><a href="#" target="_blank">美食</a></li>
										</ul>
									</div>
									<div class="search-recent">
										<!---->
										<ul class="search-recent-item-wrap">
											<li><a href="" target="_blank"><i
													class="iconfont ic-search-history"></i> <span>vue</span> <i
													class="iconfont ic-unfollow"></i></a></li>
										</ul>
									</div>
								</div>
							</form>
						</li>
					</ul>
			</div>
		</div>
	</div>
	</nav>

	<div class="container index">
		<div class="row">
			<div class="col-xs-16 main">
				<!-- Banner -->
				<div id="indexCarousel" class="carousel slide">
					<div class="carousel-inner">
						<div class="item active">
							<div class="banner">
								<a target="_blank" href="#"><img
									src="img/banner-s-3-7123fd94750759acf7eca05b871e9d17.png"
									alt="1"></a>
							</div>
						</div>
						<div class="item">
							<div class="banner" data-banner-name="赛末点02">
								<a target="_blank" href="#"><img
									src="img/banner-s-7-1a0222c91694a1f38e610be4bf9669be.png"
									alt="540"></a>
							</div>
						</div>
					</div>
					<ol class="carousel-indicators">
						<li data-target="#indexCarousel" data-slide-to="0" class=""></li>
						<li data-target="#indexCarousel" data-slide-to="1" class=""></li>
						<li data-target="#indexCarousel" data-slide-to="2" class=""></li>

					</ol>
					<a class="left carousel-control" href="#indexCarousel"
						role="button" data-slide="prev"><i
						class="iconfont ic-previous-s"></i></a> <a
						class="right carousel-control" href="#indexCarousel" role="button"
						data-slide="next"><i class="iconfont ic-next-s"></i></a>
				</div>
				<!--专题0分类需要遍历-->
				<div class="recommend-collection">

					<a class="collection" target="_blank"
						href="/c/5AUzod?utm_medium=index-collections&amp;utm_source=desktop">
						<img
						src="//upload.jianshu.io/collections/images/13/%E5%95%8A.png?imageMogr2/auto-orient/strip|imageView2/1/w/64/h/64"
						alt="64">
						<div class="name">旅行·在路上</div>
					</a> <a class="more-hot-collection" target="_blank"
						href="/recommendations/collections?utm_medium=index-collections&amp;utm_source=desktop">
						更多热门专题 <i class="iconfont ic-link"></i>
					</a>
				</div>
				<div class="split-line"></div>
				<div id="list-container">

					<!-- 文章列表模块需要遍历 -->
					<ul class="note-list" infinite-scroll-url="/">

						<li class="have-img"><a class="wrap-img" href="#"
							target="_blank"> <img class="img-blur-done" src="img/QQ.png"
								alt="">
						</a>
							<div class="content">
								<a class="title" target="__blank" href="">步根本不减肥，但是为什么跑</a>
								<p class="abstract">
									前几天接到一个推销电话，虽明确表示不需要，依然无理纠缠没完没了，渐怒火中烧，语气不善。 突然，办公室电话响起，点名找我。
									接起电话就听到一句“我...</p>
								<div class="meta">
									<a class="nickname" target="_blank" href="">作者李伟</a> <a
										target="_blank" href="#"> <i
										class="iconfont ic-list-comments"></i> 评论数8
									</a> <span><i class="iconfont ic-list-like"></i> 点赞数：89</span>
								</div>
							</div></li>

						<li class="have-img"><a class="wrap-img" href=""
							target="_blank"> <img class="img-blur-done" src="img/QQ.png"
								alt="120">
						</a>
							<div class="content">
								<a class="title" target="_blank" href="">跑步根本不减肥，但是为什么跑步的人都瘦了呢？</a>
								<p class="abstract">
									很多人都看到跑步的人变瘦了，以为跑步可以减肥，但是作为过来人，说一句，跑步根本不减肥，这是真的，要想用跑步来减肥需要长距离长时间的训练
									那么为什...</p>
								<div class="meta">
									<a class="nickname" target="_blank" href="/u/a52fb53f9ace">晓艳说财富管理</a>
									<a target="_blank" href=""> <i
										class="iconfont ic-list-comments"></i> 25
									</a> <span><i class="iconfont ic-list-like"></i> 21</span> <span><i
										class="iconfont ic-list-money"></i> 1</span>
								</div>
							</div></li>

					</ul>

					<!-- 文章列表模块 -->
				</div>
				<a data-page="3" href="#" class="load-more">阅读更多</a>
			</div>
			<div class="col-xs-7 col-xs-offset-1 aside">
				<div class="board">
					<a target="_blank" href="#"><img
						src="img/banner-s-3-7123fd94750759acf7eca05b871e9d17.png"
						alt="Banner s 3"></a> <a target="_blank" href="#"><img
						src="img/banner-s-4-b70da70d679593510ac93a172dfbaeaa.png"
						alt="Banner s 4"></a> <a utm_medium="index-banner-s"
						target="_blank" href="#"><img
						src="img/banner-s-5-4ba25cf5041931a0ed2062828b4064cb.png"
						alt="Banner s 7"></a> <a utm_medium="index-banner-s"
						target="_blank" href="#"><img
						src="img/banner-s-6-c4d6335bfd688f2ca1115b42b04c28a7.png"
						alt="Banner s 5"></a> <a target="_blank" href="#"><img
						src="img/banner-s-7-1a0222c91694a1f38e610be4bf9669be.png"
						alt="Banner s 6"></a>
				</div>

				<!-- 首页右侧 App 下载提示 -->
				<a id="index-aside-download-qrbox" class="col-xs-8 download"> <img
					class="qrcode" src="img/QQ.png" alt="李伟你是最帅的
						">
					<div class="info">
						<div class="title">
							李伟还没想好的功能<i class="iconfont ic-link"></i>
						</div>
						<div class="description">应该是设置的地方</div>
					</div>
				</a>
				<!-- 推荐作者 -->
				<div class="recommended-authors">
					<div class="title">
						<span>推荐作者</span> <a class="page-change"><i
							class="iconfont ic-search-change"
							style="transform: rotate(0deg);"></i> 换一批 </a>
					</div>
					<ul class="list">
						<li><a href="" target="_blank" class="avatar"><img
								src="img/QQ.png"></a> <a class="follow" state="0"><i
								class="iconfont ic-follow"></i>关注 </a> <a class="following"
							state="0"><i class="iconfont ic-followed"></i>已关注 </a> <a
							class="following" state="0"><i class="iconfont ic-unfollow"></i>取消关注
						</a> <a href="#" target="_blank" class="name"> 李伟 </a>
							<p>写了438k字 · 1.7k喜欢</p></li>

					</ul>
					<a href="" target="_blank" class="find-more"> 查看全部<i
						class="iconfont ic-link"></i></a>
				</div>
			</div>
		</div>
	</div>
	<div class="side-tool">
		<ul>
			<li data-placement="left" data-toggle="tooltip" data-container="body"
				data-original-title="回到顶部" style=""><a class="function-button"><i
					class="iconfont ic-backtop"></i></a></li>
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
		</ul>
	</div>
	<footer class="container">
	<div class="row">
		<div class="col-xs-17 main">

			<a target="_blank" href="http://www.jianshu.com/c/jppzD2">关于简书</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/contact">联系我们</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/c/bfeec2e13990">加入我们</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/p/fc1c113e5b6b">简书出版</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/press">品牌与徽标</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/faqs">帮助中心</a><em>
				· </em> <a target="_blank" href="http://www.jianshu.com/p/cabc8fa39830">合作伙伴</a>
			<div class="icp">
				©2012-2018 上海佰集信息科技有限公司 / 简书 / 沪ICP备11018329号-5 / <a target="_blank"
					href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31010402002252">
					<img
					src="//cdn2.jianshu.io/assets/web/smrz-557fa318122c99a66523209bf9753a27.png"
					alt="Smrz">
				</a> <a target="_blank"
					href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31010402002252">沪公网安备31010402002252号
					/ </a> <a target="_blank" href="http://www.shjbzx.cn/"> <img
					src="//cdn2.jianshu.io/assets/web/wxb-a216456895eb66c17497dbd3da443cf8.png"
					alt="Wxb">
				</a> 举报电话：021-34770013 / <a target="_blank"
					href="http://218.242.124.22:8081/businessCheck/verifKey.do?showType=extShow&amp;serial=9031000020171107081457000002158769-SAIC_SHOW_310000-20171115131223587837&amp;signData=MEQCIADWZ5aTcBeER5SOVp0ly+ElvKnwtjczum6Gi6wZ7/wWAiB9MAPM22hp947ZaBobux5PDkd0lfqoCOkVV7zjCYME6g==">
					<img
					src="//cdn2.jianshu.io/assets/web/zggsrz-5695587dccf490ca3e651f4228f7479e.png"
					alt="Zggsrz">
				</a>
			</div>
		</div>
	</div>
	</footer>
	<script type="application/json" data-name="page-data">
		{}
	</script>
	<script src="${pageContext.request.contextPath }/js/one.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/two.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/there.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath }/js/fore.js"
		crossorigin="anonymous"></script>

	<div id="qb-sougou-search" style="display: none; opacity: 0;">
		<p>搜索</p>
		<p class="last-btn">复制</p>
		<iframe src=""></iframe>
	</div>
	<div id="qb_collection_img_mask"
		style="display: none; top: 59px; left: 867.1px;">
		<div class="qb_collection_img_icon"></div>
		<span>收藏</span>
	</div>
</body>
</html>