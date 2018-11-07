<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-dc1e51fe2b436e18f5ee.css" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<title>动态</title>
</head>
<body class="reader-black-font" style="overflow-y: scroll;" lang="zh-CN">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container person">
		<div class="row">
			<div class="col-xs-16 main">

				<%@include file="main.jsp"%>
				<div id="list-container">
					<!-- 动态列表模块 -->
					<ul class="note-list"
						infinite-scroll-url="/users/b91cc2d507d0/timeline">

						<!-- 发表了文章 -->
						<li class="have-img" id="feed-374866967"><a class="wrap-img"
							href="/p/72c638fc6417"> <img
								src="//upload-images.jianshu.io/upload_images/8972166-4f7784a694aae0bc.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/150/h/120"
								alt="120">
						</a>
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="share_note"
											data-datetime="2018-11-07T17:55:39+08:00"> 发表了文章 ·
											11.7 17:55</span>
									</div>
								</div>

								<a class="title" href="/p/72c638fc6417">一位来访者的内心独白(上)</a>
								<p class="abstract">准确地说，我是一名菜鸟级别的来访者，因为我只做过两次咨询，还是不同的两位咨询师。
									说实话，我对“来访者”这个称呼并不是很满意，好像我很脆弱似的，我更喜欢称自己是心理学爱好者，...</p>

								<div class="meta">
									<a href="/p/72c638fc6417"> <i class="iconfont ic-list-read"></i>
										70
									</a> <a href="/p/72c638fc6417"> <i
										class="iconfont ic-list-comments"></i> 0
									</a> <span><i class="iconfont ic-list-like"></i> 5</span>
								</div>

							</div></li>

						<!-- 关注了文集 -->
						<li id="feed-373300602">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="like_notebook"
											data-datetime="2018-11-04T07:17:23+08:00">关注了文集 · 11.4
											07:17</span>
									</div>
								</div>
								<div class="follow-detail">
									<div class="info">
										<a class="avatar-collection" href="/nb/19246714"> <img
											src="//cdn2.jianshu.io/assets/default_avatar/avatar-notebook-default-640f7dde88592bdf6417d8ce1902636e.png"
											alt="Avatar notebook default">
										</a> <a class="btn btn-success follow"><i
											class="iconfont ic-follow"></i> <span>关注</span></a> <a
											class="title" href="/nb/19246714">交道口风云录</a>
										<p>
											<a class="creater" href="/u/78f970537a5e">名贵的考拉熊</a> 编，10
											篇文章，117 人关注
										</p>
									</div>
								</div>
							</div>
						</li>

						<!-- 喜欢了评论 -->
						<li id="feed-372929417">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <em> ·
										</em> <span data-type="like_comment"
											data-datetime="2018-11-03T06:57:27+08:00"> 赞了评论 · 11.3
											06:57</span>
									</div>
								</div>
								<p class="comment">金庸这个名字是一代人的记忆！</p>
								<blockquote>
									<div class="origin-author single-line">
										<a href="/u/367755869aca">心甬</a> <span>评论自<a
											href="/p/f0d068ff1d3e">金庸辞世：有一种体验，叫丧失</a></span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-372929411">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-11-03T06:57:26+08:00"> 发表了评论 ·
											11.3 06:57</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/45bb8310e4c9" class="maleskine-author"
										target="_blank" data-user-slug="45bb8310e4c9">@蕙舒</a> 一起努力🙏
								</p>

								<blockquote>
									<a class="title" href="/p/f0d068ff1d3e">金庸辞世：有一种体验，叫丧失</a>
									<p class="abstract">01 秋天，是个别离的季节，知道金庸走的时候，我刚接待完一个来访。
										我工作室阳光满满，虽是深秋依然暖意浓浓，可我，突然觉得好冷。 于是披了件加绒外套，双臂紧抱，依然不怎么管用...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/f0d068ff1d3e"> <i
											class="iconfont ic-list-read"></i> 575
										</a> <a href="/p/f0d068ff1d3e"> <i
											class="iconfont ic-list-comments"></i> 10
										</a> <span><i class="iconfont ic-list-like"></i> 19</span> <span><i
											class="iconfont ic-list-money"></i> 2</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-372929218">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-11-03T06:56:12+08:00"> 发表了评论 ·
											11.3 06:56</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/c7ea5e1aca2d" class="maleskine-author"
										target="_blank" data-user-slug="c7ea5e1aca2d">@驽马渡江</a> 🙏🙏🙏
								</p>

								<blockquote>
									<a class="title" href="/p/f0d068ff1d3e">金庸辞世：有一种体验，叫丧失</a>
									<p class="abstract">01 秋天，是个别离的季节，知道金庸走的时候，我刚接待完一个来访。
										我工作室阳光满满，虽是深秋依然暖意浓浓，可我，突然觉得好冷。 于是披了件加绒外套，双臂紧抱，依然不怎么管用...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/f0d068ff1d3e"> <i
											class="iconfont ic-list-read"></i> 575
										</a> <a href="/p/f0d068ff1d3e"> <i
											class="iconfont ic-list-comments"></i> 10
										</a> <span><i class="iconfont ic-list-like"></i> 19</span> <span><i
											class="iconfont ic-list-money"></i> 2</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 喜欢了评论 -->
						<li id="feed-372929165">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <em> ·
										</em> <span data-type="like_comment"
											data-datetime="2018-11-03T06:55:59+08:00"> 赞了评论 · 11.3
											06:55</span>
									</div>
								</div>
								<p class="comment">
									“就像孩子把糖果藏在柜子里，暂时延迟甜蜜的滋味<br> <br>就像你承认孩子不是你，也不可能承载你未完成的夙愿<br>
									<br>你父母在那些年里能给你的爱，也就那么多了<br> <br>爱人离开并不是你不够好，而是他也有心结未解<br>
									<br>婚姻有时就是乏味，伴侣永远无法满足你所有需要<br> <br>你赚钱就是不如那个谁谁谁，你们就是有差距”是你吗？<img
										src="//static.jianshu.io/assets/emojis/blush.png"
										alt=":blush:" title=":blush:" class="emoji" width="20"
										height="20"> 是的话不要吝惜你的<img
										src="//static.jianshu.io/assets/emojis/+1.png" alt=":+1:"
										title=":+1:" class="emoji" width="20" height="20"> 呦
								</p>
								<blockquote>
									<div class="origin-author single-line">
										<a href="/u/5b4e49761f4b">感谢您的关注</a> <span>评论自<a
											href="/p/f0d068ff1d3e">金庸辞世：有一种体验，叫丧失</a></span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 关注了作者 -->
						<li id="feed-372442022">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="like_user"
											data-datetime="2018-11-01T22:59:52+08:00">关注了作者 · 11.1
											22:59</span>
									</div>
								</div>
								<div class="follow-detail">
									<div class="info">
										<a class="avatar" href="/u/3a28129a9e18"> <img
											src="//upload.jianshu.io/users/upload_avatars/14773778/1888ce78-9069-4fec-8ac6-0d667851b430?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
											alt="180">
										</a> <a class="btn btn-success follow"><i
											class="iconfont ic-follow"></i><span>关注</span></a> <a
											class="title" href="/u/3a28129a9e18">OKFAN</a>
										<p>写了 0 字，被 6 人关注，获得了 0 个喜欢</p>
									</div>
								</div>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-372180387">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-11-01T11:58:29+08:00"> 发表了评论 ·
											11.1 11:58</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/93336e83c6d3" class="maleskine-author"
										target="_blank" data-user-slug="93336e83c6d3">@亭玉子</a> 😀☕好久不见
								</p>

								<blockquote>
									<a class="title" href="/p/28a8cbcdbd72">为什么有些人喜欢喃喃自语</a>
									<p class="abstract">01
										一次团体小组中，有位女士说：“不知从什么时候开始，我喜欢自言自语，常常一边拖地一边嘟囔，有的没的说一通，刚开始偶然发生，最近这段时间会经常如此，每次说完都觉得轻松。”
										...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-read"></i> 733
										</a> <a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-comments"></i> 11
										</a> <span><i class="iconfont ic-list-like"></i> 25</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了文章 -->
						<li class="have-img" id="feed-372140923"><a class="wrap-img"
							href="/p/f0d068ff1d3e"> <img
								src="//upload-images.jianshu.io/upload_images/8972166-4f9dc73410b08014.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/150/h/120"
								alt="120">
						</a>
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="share_note"
											data-datetime="2018-11-01T10:24:26+08:00"> 发表了文章 ·
											11.1 10:24</span>
									</div>
								</div>

								<a class="title" href="/p/f0d068ff1d3e">金庸辞世：有一种体验，叫丧失</a>
								<p class="abstract">01 秋天，是个别离的季节，知道金庸走的时候，我刚接待完一个来访。
									我工作室阳光满满，虽是深秋依然暖意浓浓，可我，突然觉得好冷。 于是披了件加绒外套，双臂紧抱，依然不怎么管用...</p>

								<div class="meta">
									<a href="/p/f0d068ff1d3e"> <i class="iconfont ic-list-read"></i>
										575
									</a> <a href="/p/f0d068ff1d3e"> <i
										class="iconfont ic-list-comments"></i> 10
									</a> <span><i class="iconfont ic-list-like"></i> 19</span> <span><i
										class="iconfont ic-list-money"></i> 2</span>
								</div>

							</div></li>

						<!-- 发表了评论 -->
						<li id="feed-371662361">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-31T08:26:07+08:00"> 发表了评论 ·
											10.31 08:26</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/c7ea5e1aca2d" class="maleskine-author"
										target="_blank" data-user-slug="c7ea5e1aca2d">@驽马渡江</a>
									有人找我推荐过这本书，戒不掉还是有心结吧或许
								</p>

								<blockquote>
									<a class="title" href="/p/1ca5acefdca7">李咏离世：面对死亡，我们恐惧的究竟是什么？</a>
									<p class="abstract">01
										正在浏览朋友圈时突然蹦出来条信息，点击一看，是央视著名主持人李咏去世的消息，我不太相信自己的眼睛，记得去年他好像还主持过节目呢。
										又看到他的妻子哈文留下的一句：永失我爱...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-read"></i> 1224
										</a> <a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-comments"></i> 17
										</a> <span><i class="iconfont ic-list-like"></i> 23</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-371662083">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-31T08:25:16+08:00"> 发表了评论 ·
											10.31 08:25</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/aa5e93a1dec7" class="maleskine-author"
										target="_blank" data-user-slug="aa5e93a1dec7">@清心倾心</a>
									是啊，有些人终究要离开的
								</p>

								<blockquote>
									<a class="title" href="/p/1ca5acefdca7">李咏离世：面对死亡，我们恐惧的究竟是什么？</a>
									<p class="abstract">01
										正在浏览朋友圈时突然蹦出来条信息，点击一看，是央视著名主持人李咏去世的消息，我不太相信自己的眼睛，记得去年他好像还主持过节目呢。
										又看到他的妻子哈文留下的一句：永失我爱...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-read"></i> 1224
										</a> <a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-comments"></i> 17
										</a> <span><i class="iconfont ic-list-like"></i> 23</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-371661921">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-31T08:24:44+08:00"> 发表了评论 ·
											10.31 08:24</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/e2197894c785" class="maleskine-author"
										target="_blank" data-user-slug="e2197894c785">@Dong_8ec2</a>
									🙏️🙏️
								</p>

								<blockquote>
									<a class="title" href="/p/1ca5acefdca7">李咏离世：面对死亡，我们恐惧的究竟是什么？</a>
									<p class="abstract">01
										正在浏览朋友圈时突然蹦出来条信息，点击一看，是央视著名主持人李咏去世的消息，我不太相信自己的眼睛，记得去年他好像还主持过节目呢。
										又看到他的妻子哈文留下的一句：永失我爱...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-read"></i> 1224
										</a> <a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-comments"></i> 17
										</a> <span><i class="iconfont ic-list-like"></i> 23</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-371451419">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-30T17:32:49+08:00"> 发表了评论 ·
											10.30 17:32</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/c7ea5e1aca2d" class="maleskine-author"
										target="_blank" data-user-slug="c7ea5e1aca2d">@驽马渡江</a> 好的
								</p>

								<blockquote>
									<a class="title" href="/p/1ca5acefdca7">李咏离世：面对死亡，我们恐惧的究竟是什么？</a>
									<p class="abstract">01
										正在浏览朋友圈时突然蹦出来条信息，点击一看，是央视著名主持人李咏去世的消息，我不太相信自己的眼睛，记得去年他好像还主持过节目呢。
										又看到他的妻子哈文留下的一句：永失我爱...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-read"></i> 1224
										</a> <a href="/p/1ca5acefdca7"> <i
											class="iconfont ic-list-comments"></i> 17
										</a> <span><i class="iconfont ic-list-like"></i> 23</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-371451146">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-30T17:31:51+08:00"> 发表了评论 ·
											10.30 17:31</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/c7ea5e1aca2d" class="maleskine-author"
										target="_blank" data-user-slug="c7ea5e1aca2d">@驽马渡江</a>
									看来你已经看到喃喃自语的魅力了
								</p>

								<blockquote>
									<a class="title" href="/p/28a8cbcdbd72">为什么有些人喜欢喃喃自语</a>
									<p class="abstract">01
										一次团体小组中，有位女士说：“不知从什么时候开始，我喜欢自言自语，常常一边拖地一边嘟囔，有的没的说一通，刚开始偶然发生，最近这段时间会经常如此，每次说完都觉得轻松。”
										...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-read"></i> 733
										</a> <a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-comments"></i> 11
										</a> <span><i class="iconfont ic-list-like"></i> 25</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了文章 -->
						<li class="have-img" id="feed-371439851"><a class="wrap-img"
							href="/p/1ca5acefdca7"> <img
								src="//upload-images.jianshu.io/upload_images/8972166-febff5b6774240b7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/150/h/120"
								alt="120">
						</a>
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="share_note"
											data-datetime="2018-10-30T16:55:47+08:00"> 发表了文章 ·
											10.30 16:55</span>
									</div>
								</div>

								<a class="title" href="/p/1ca5acefdca7">李咏离世：面对死亡，我们恐惧的究竟是什么？</a>
								<p class="abstract">01
									正在浏览朋友圈时突然蹦出来条信息，点击一看，是央视著名主持人李咏去世的消息，我不太相信自己的眼睛，记得去年他好像还主持过节目呢。
									又看到他的妻子哈文留下的一句：永失我爱...</p>

								<div class="meta">
									<a href="/p/1ca5acefdca7"> <i class="iconfont ic-list-read"></i>
										1224
									</a> <a href="/p/1ca5acefdca7"> <i
										class="iconfont ic-list-comments"></i> 17
									</a> <span><i class="iconfont ic-list-like"></i> 23</span> <span><i
										class="iconfont ic-list-money"></i> 1</span>
								</div>

							</div></li>

						<!-- 发表了评论 -->
						<li id="feed-369995924">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-26T19:47:47+08:00"> 发表了评论 ·
											10.26 19:47</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/e74677c0e490" class="maleskine-author"
										target="_blank" data-user-slug="e74677c0e490">@国家二级心理咨询师南宫无争</a>
									有道理，客观看待😀😀😀
								</p>

								<blockquote>
									<a class="title" href="/p/6fe62f4d39ec">讨好型人格背后都带着一把刀</a>
									<p class="abstract">著名心理学家霍妮在《我们内心的冲突》中描述了一种讨好型人格：讨好型人格，也叫服从型人格，他们在童年时候，由于生活环境的影响，担心自己被抛弃，因而拼命压抑自己、讨好父母。长大成...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/6fe62f4d39ec"> <i
											class="iconfont ic-list-read"></i> 1558
										</a> <a href="/p/6fe62f4d39ec"> <i
											class="iconfont ic-list-comments"></i> 24
										</a> <span><i class="iconfont ic-list-like"></i> 24</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了评论 -->
						<li id="feed-369995717">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-26T19:47:17+08:00"> 发表了评论 ·
											10.26 19:47</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/45bb8310e4c9" class="maleskine-author"
										target="_blank" data-user-slug="45bb8310e4c9">@蕙舒</a> 👍👍
								</p>

								<blockquote>
									<a class="title" href="/p/6fe62f4d39ec">讨好型人格背后都带着一把刀</a>
									<p class="abstract">著名心理学家霍妮在《我们内心的冲突》中描述了一种讨好型人格：讨好型人格，也叫服从型人格，他们在童年时候，由于生活环境的影响，担心自己被抛弃，因而拼命压抑自己、讨好父母。长大成...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/6fe62f4d39ec"> <i
											class="iconfont ic-list-read"></i> 1558
										</a> <a href="/p/6fe62f4d39ec"> <i
											class="iconfont ic-list-comments"></i> 24
										</a> <span><i class="iconfont ic-list-like"></i> 24</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

						<!-- 发表了文章 -->
						<li class="have-img" id="feed-369937270"><a class="wrap-img"
							href="/p/6fe62f4d39ec"> <img
								src="//upload-images.jianshu.io/upload_images/8972166-34320dc73bb2b4de.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/150/h/120"
								alt="120">
						</a>
							<div class="content">
								<div class="author">
									<a class="avatar" href="/users/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="share_note"
											data-datetime="2018-10-26T16:52:49+08:00"> 发表了文章 ·
											10.26 16:52</span>
									</div>
								</div>

								<a class="title" href="/p/6fe62f4d39ec">讨好型人格背后都带着一把刀</a>
								<p class="abstract">著名心理学家霍妮在《我们内心的冲突》中描述了一种讨好型人格：讨好型人格，也叫服从型人格，他们在童年时候，由于生活环境的影响，担心自己被抛弃，因而拼命压抑自己、讨好父母。长大成...</p>

								<div class="meta">
									<a href="/p/6fe62f4d39ec"> <i class="iconfont ic-list-read"></i>
										1558
									</a> <a href="/p/6fe62f4d39ec"> <i
										class="iconfont ic-list-comments"></i> 24
									</a> <span><i class="iconfont ic-list-like"></i> 24</span> <span><i
										class="iconfont ic-list-money"></i> 1</span>
								</div>

							</div></li>

						<!-- 发表了评论 -->
						<li id="feed-369065894">
							<div class="content">
								<div class="author">
									<a class="avatar" href="/u/b91cc2d507d0"> <img
										src="//upload.jianshu.io/users/upload_avatars/8972166/065e6770-aacc-4365-9abf-c46a59cdf7f6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"
										alt="180">
									</a>
									<div class="info">
										<a class="nickname" href="/u/b91cc2d507d0">冰千里</a> <span
											data-type="comment_note"
											data-datetime="2018-10-24T15:44:27+08:00"> 发表了评论 ·
											10.24 15:44</span>
									</div>
								</div>

								<p class="comment">
									<a href="/u/1a0d1e332c8d" class="maleskine-author"
										target="_blank" data-user-slug="1a0d1e332c8d">@于格YUGE</a>
									试完了之后，告诉我你的体验和感受
								</p>

								<blockquote>
									<a class="title" href="/p/28a8cbcdbd72">为什么有些人喜欢喃喃自语</a>
									<p class="abstract">01
										一次团体小组中，有位女士说：“不知从什么时候开始，我喜欢自言自语，常常一边拖地一边嘟囔，有的没的说一通，刚开始偶然发生，最近这段时间会经常如此，每次说完都觉得轻松。”
										...</p>

									<div class="meta">
										<div class="origin-author">
											<a href="/users/b91cc2d507d0">冰千里</a>
										</div>
										<a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-read"></i> 733
										</a> <a href="/p/28a8cbcdbd72"> <i
											class="iconfont ic-list-comments"></i> 11
										</a> <span><i class="iconfont ic-list-like"></i> 25</span> <span><i
											class="iconfont ic-list-money"></i> 1</span>
									</div>
								</blockquote>
							</div>
						</li>

					</ul>
				</div>
			</div>

			<%@include file="right.jsp"%>

		</div>
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

</body>
</html>