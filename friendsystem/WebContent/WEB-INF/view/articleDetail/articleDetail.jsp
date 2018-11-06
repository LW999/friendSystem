<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/stream.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/entry-00e12f5a757a30f65da3.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/web-bfc15fabb3b20492f7d4.css" />
<style type="text/css">
			@charset "UTF-8";
			/*
 * 变量
*/
			
			.like[data-v-6ddd02c6] {
				display: inline-block;
			}
			
			.like .like-group[data-v-6ddd02c6] {
				position: relative;
				padding: 13px 0 15px 0;
				font-size: 0;
				border: 1px solid #EA6F5A;
				border-radius: 40px;
			}
			
			.like .like-group[data-v-6ddd02c6]:hover {
				background-color: rgba(236, 97, 73, 0.05);
			}
			
			.like .like-group .btn-like[data-v-6ddd02c6] {
				display: inline-block;
				font-size: 19px;
			}
			
			.like .like-group .btn-like[data-v-6ddd02c6]:before {
				content: '';
				position: absolute;
				left: 12px;
				top: 2px;
				width: 50px;
				height: 50px;
				background-image: url(//cdn2.jianshu.io/assets/web/like_animation_steps-62a00a7b52377d3069927cdb8e61fd34.png);
				background-position: left;
				background-repeat: no-repeat;
				background-size: 1000px 50px;
			}
			
			.like .like-group .btn-like a[data-v-6ddd02c6] {
				position: relative;
				padding: 18px 30px 18px 55px;
				color: #EA6F5A;
			}
			
			.like .like-group .modal-wrap[data-v-6ddd02c6] {
				font-size: 18px;
				border-left: 1px solid rgba(236, 97, 73, 0.4);
				display: inline-block;
				margin-left: -15px;
			}
			
			.like .like-group .modal-wrap a[data-v-6ddd02c6] {
				color: #EA6F5A;
				padding: 18px 26px 18px 18px;
			}
			
			.like .like-group.like-animation[data-v-6ddd02c6],
			.like .like-group.active[data-v-6ddd02c6] {
				background-color: #EA6F5A;
			}
			
			.like .like-group.like-animation .btn-like a[data-v-6ddd02c6],
			.like .like-group.active .btn-like a[data-v-6ddd02c6] {
				color: white;
			}
			
			.like .like-group.like-animation .modal-wrap[data-v-6ddd02c6],
			.like .like-group.active .modal-wrap[data-v-6ddd02c6] {
				border-left: 1px solid white;
			}
			
			.like .like-group.like-animation .modal-wrap a[data-v-6ddd02c6],
			.like .like-group.active .modal-wrap a[data-v-6ddd02c6] {
				color: white;
			}
			
			.like .like-group.like-animation .btn-like[data-v-6ddd02c6]:before {
				-webkit-animation: likeBlast-data-v-6ddd02c6 0.6s 1 steps(19);
				animation: likeBlast-data-v-6ddd02c6 0.6s 1 steps(19);
				background-position: right;
			}
			
			@-webkit-keyframes likeBlast {
				0% {
					background-position: left;
				}
				100% {
					background-position: right;
				}
			}
			
			@keyframes likeBlast-data-v-6ddd02c6 {
				0% {
					background-position: left;
				}
				100% {
					background-position: right;
				}
			}
			
			.like .like-group.active .btn-like[data-v-6ddd02c6]:before {
				background-position: right;
			}
		</style>
<!-- 图标 -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/img/logo.ico" />
<title>文章详情</title>
</head>
<body class="reader-black-font" lang="zh-CN">
<!-- 头部 -->
<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="note">
		<div class="post">
			<div class="article">
				<h1 class="title">死磕一个方向，傻傻的坚持做下去，让我月赚五万</h1>

				<!-- 作者区域 -->
				<div class="author">
					<a class="avatar" href="/u/cee06b2093af"> <img
						src="//upload.jianshu.io/users/upload_avatars/1876193/d1916f70a5ef.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96"
						alt="96">
					</a>
					<div class="info">
						<span class="name"><a href="/u/cee06b2093af">北壹辰</a></span>
						<!-- 关注用户按钮 -->
						<a class="btn btn-success follow"><i
							class="iconfont ic-follow"></i><span>关注</span></a>
						<!-- 文章数据信息 -->
						<div class="meta">
							<!-- 如果文章更新时间大于发布时间，那么使用 tooltip 显示更新时间 -->
							<span class="publish-time">2018.09.07 18:24</span> <span
								class="wordage">字数 715</span> <span class="views-count">阅读
								4873</span><span class="comments-count">评论 25</span><span
								class="likes-count">喜欢 74</span>
						</div>
					</div>
					<!-- 如果是当前作者，加入编辑按钮 -->
				</div>

				<!-- 文章内容 -->
				<div data-note-content="" class="show-content">
					<div class="show-content-free">
						<div class="image-package">
							<div class="image-container"
								style="max-width: 589px; max-height: 645px; background-color: transparent;">
								<div class="image-caption"></div>
							</div>
							<p>赚钱的本质，就是“大道至简”，动作越简单越好，一招顶破天，其实很多时候我有一个理念，越是傻乎乎的人越能赚到钱，如果你太聪明，反而还会错过。</p>
							<p>互联网上的例子特别多，就比如说现在的互联网创业吧。很多人扯淡一些捷径，技巧，该走的路不走，该寻找的成功案例不去寻找，该做激活系统一个不做，该去做外部流量系统的时间浪费在打游戏上，那么请问你如何去赚钱？</p>
							<p>
								<br>
							</p>
							<div class="image-package"></div>
							<p>
								<br>
							</p>
							<p>尤其是在互联网上面，越是纯种傻逼，越是坚持做一个动作，反而越赚钱，就比如做恋爱咨询项目，在百度贴吧里面有280万人。能够常年累月混迹在里面的人，每个人的月收入是不会低于5万。</p>
							<p>相反那些聪明的人，总是投机，不停的寻找新的平台啊、赚钱方法啊，到最后却一无所获。赚钱的人是怎么做到了，他们就是几个贴吧的账号，和一些好的软文素材，加上早就写好的回复模版，每天重复一个动作，粘贴复制，粘贴复制，日日重复，简单吗？简单到了极致，就这样老老实实的去干。很多人就是没有这个魄力，没有耐心，特别喜欢思考！</p>
							<p>
								<br>
							</p>
							<p>就比如你可以讲自己的特长放到网上，有一个家伙，专门去网吧拍一些吃鸡的视频，调戏女网管的搞笑段子，居然也有几十万的粉丝，一次直播收钱收到手软，一次就能收几百上千，还不算后端继续消费粉丝。</p>
							<p>在互联网，赚钱这个事情，就是不断的持续的输出价值，不论是搞笑，还是鸡汤，还是奇葩，或者是技巧，利用直播和微信变现，只要你真正的去做了，一天几千块钱跟玩似的，组建起来自己的团队，一天几万块钱不是传说，关键是，你会去做吗？</p>
							<p>当你一无所有的时候，你应该跪下来再一步一步的爬起来，赚钱也是如此，从来没有捷径。其实我们这一代人是非常的幸运，在互联网上所有的资源和信息都准备好了，你只需要去挖就行了，你能挖多少个口子，你的赚钱的渠道就有多少。</p>
						</div>
					</div>
				</div>

				<div class="show-foot">
					<a class="notebook" href="/nb/3856427"> <i
						class="iconfont ic-search-notebook"></i> <span>上官北辰</span>
					</a>
					<div class="copyright" data-toggle="tooltip" data-html="true"
						data-original-title="转载请联系作者获得授权，并标注“简书作者”。">© 著作权归作者所有</div>
					<div class="modal-wrap" data-report-note="">
						<a id="report-modal">举报文章</a>
					</div>
				</div>

				<!-- 文章底部作者信息 -->
				<div class="follow-detail">
					<div class="info">
						<a class="avatar" href="/u/cee06b2093af"> <img
							src="//upload.jianshu.io/users/upload_avatars/1876193/d1916f70a5ef.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96"
							alt="96">
						</a> <a class="btn btn-success follow"><i
							class="iconfont ic-follow"></i><span>关注</span></a> <a class="title"
							href="/u/cee06b2093af">北壹辰</a>
						<p>写了 215976 字，被 5600 人关注，获得了 4896 个喜欢</p>
					</div>
					<div class="signature">个人微信号:XPwGZJJ 微信公众号：北壹辰（AK-4688）
						今日头条原创作者，网络营销骨灰级玩家</div>
				</div>

				<div class="meta-bottom">
					<div data-v-6ddd02c6="" class="like">
						<div data-v-6ddd02c6="" class="btn like-group">
							<div data-v-6ddd02c6="" class="btn-like">
								<a data-v-6ddd02c6="">喜欢</a>
							</div>
							<div data-v-6ddd02c6="" class="modal-wrap">
								<a data-v-6ddd02c6="">74</a>
							</div>
						</div>
						<!---->
					</div>
					<div id="comment-list" class="comment-list">
						<div>
							<form class="new-comment">
								<a class="avatar"><img
									src="img/avatar_default-78d4d1f68984cd6d4379508dd94b4210.png"></a>
								<div class="sign-container">
									<a
										href="/sign_in?utm_source=desktop&amp;utm_medium=not-signed-in-comment-form"
										class="btn btn-sign">登录</a> <span>后发表评论</span>
								</div>
							</form>
							<!---->
						</div>
						<!---->
						<div class="comments-placeholder" style="display: none;">
							<div class="author">
								<div class="avatar"></div>
								<div class="info">
									<div class="name"></div>
									<div class="meta"></div>
								</div>
							</div>
							<div class="text"></div>
							<div class="text animation-delay"></div>
							<div class="tool-group">
								<i class="iconfont ic-zan-active"></i>
								<div class="zan"></div>
								<i class="iconfont ic-list-comments"></i>
								<div class="zan"></div>
							</div>
						</div>
						<div id="normal-comment-list" class="normal-comment-list">
							<div>
								<div>
									<div class="top-title">
										<span>25条评论</span> <a class="author-only">只看作者</a> <a
											class="close-btn" style="display: none;">关闭评论</a>
										<div class="pull-right">
											<a class="active">按时间倒序</a> <a class="">按时间正序</a>
										</div>
									</div>
								</div>
								<!---->
								<!---->
								<div class="comments-placeholder" style="display: none;">
									<div class="author">
										<div class="avatar"></div>
										<div class="info">
											<div class="name"></div>
											<div class="meta"></div>
										</div>
									</div>
									<div class="text"></div>
									<div class="text animation-delay"></div>
									<div class="tool-group">
										<i class="iconfont ic-zan-active"></i>
										<div class="zan"></div>
										<i class="iconfont ic-list-comments"></i>
										<div class="zan"></div>
									</div>
								</div>

								<div id="comment-29705040" class="comment">
									<div>
										<div class="author">
											<div data-v-f3bf5228="" class="v-tooltip-container"
												style="z-index: 0;">
												<div class="v-tooltip-content">
													<a href="/u/6c43219713a5" target="_blank" class="avatar"><img
														src="//upload.jianshu.io/users/upload_avatars/8312573/0a89da57-65e5-423c-8d8a-f257eba1388a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
												</div>
												<!---->
											</div>
											<div class="info">
												<a href="/u/6c43219713a5" target="_blank" class="name">暖暖的柠檬树</a>
												<!---->
												<!---->
												<div class="meta">
													<span>10楼 · 2018.10.17 21:20</span>
												</div>
											</div>
										</div>
										<div class="comment-wrap">
											<p>
												大道至简<img src="//static.jianshu.io/assets/emojis/+1.png"
													alt=":+1:" title=":+1:" class="emoji" width="20"
													height="20"><img
													src="//static.jianshu.io/assets/emojis/+1.png" alt=":+1:"
													title=":+1:" class="emoji" width="20" height="20">
											</p>
											<div class="tool-group">
												<a data-v-cdecbe24="" id="like-button-29705040"
													class="like-button"><span data-v-cdecbe24="">赞</span></a> <a
													class=""><i class="iconfont ic-comment"></i> <span>回复</span></a>
												<!---->
												<!---->
											</div>
										</div>
									</div>
									<div class="sub-comment-list hide">
										<!---->
										<!---->
									</div>
								</div>

								<div id="comment-29539196" class="comment">
									<div>
										<div class="author">
											<div data-v-f3bf5228="" class="v-tooltip-container"
												style="z-index: 0;">
												<div class="v-tooltip-content">
													<a href="/u/336801e4b84d" target="_blank" class="avatar"><img
														src="//upload.jianshu.io/users/upload_avatars/3773633/6c967515-aadf-451c-85f2-de2748a3b380.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
												</div>
												<!---->
											</div>
											<div class="info">
												<a href="/u/336801e4b84d" target="_blank" class="name">高颖苗Darren</a>
												<!---->
												<!---->
												<div class="meta">
													<span>8楼 · 2018.10.12 23:26</span>
												</div>
											</div>
										</div>
										<div class="comment-wrap">
											<p>还门道呢，想骗你钱而已，自己还没赚的够开花呢，会傻不拉几的告你一个陌生人？</p>
											<div class="tool-group">
												<a data-v-cdecbe24="" id="like-button-29539196"
													class="like-button"><span data-v-cdecbe24="">赞</span></a> <a
													class=""><i class="iconfont ic-comment"></i> <span>回复</span></a>
												<!---->
												<!---->
											</div>
										</div>
									</div>
									<div class="sub-comment-list hide">
										<!---->
										<!---->
									</div>
								</div>

								<div id="comment-28793185" class="sub-comment">
									<p>
									<div data-v-f3bf5228="" class="v-tooltip-container"
										style="z-index: 0;">
										<div class="v-tooltip-content">
											<a href="/u/c1ee0cbb0bfb" target="_blank">星流瀑布</a>：
										</div>
										<!---->
									</div>
									<span><a href="/u/79174c45f369" class="maleskine-author"
										target="_blank" data-user-slug="79174c45f369">@米米心</a>
										我有门道，可以聊聊</span>
									</p>
									<div class="sub-tool-group">
										<span>2018.09.19 07:39</span> <a class=""><i
											class="iconfont ic-comment"></i> <span>回复</span></a>
										<!---->
										<!---->
									</div>
								</div>

								<!---->
								<!---->
							</div>
							<!---->
						</div>
					</div>
				</div>
			</div>
			<!---->
		</div>

	</div>
	<div class="note-bottom">

		<!---->
		<div class="meta">
			<div class="title">
				推荐阅读 <a target="_blank" href="/" class="more"> 更多精彩内容<i
					class="iconfont ic-link"></i></a>
			</div>
		</div>
		<!-- 相关文章 -->
		<div class="seo-recommended-notes">

			<div class="note have-img">
				<a class="cover" target="_blank"
					href="/p/91244795e803?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<img
					src="//upload-images.jianshu.io/upload_images/7567196-a0e5d2eb3791fbc6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"
					alt="240">
				</a> <a class="title" target="_blank"
					href="/p/91244795e803?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">拉卡拉控股董事长孙陶然先生做客格局商学，为我们带来了“创始人法则
					—— 一次成功的创业，至少需...</a>
				<p class="description">拉卡拉控股董事长孙陶然先生做客格局商学，为我们带来了“创始人法则 ——
					一次成功的创业，至少需要十年”的精彩演讲，你的企业是在坚持还是在维持？作为企业老大你有没有制定好战略？你是否清楚自己的企业处于哪一个发展阶段？孙陶然董事长抛出的这些问题发人深思、引人深省，给出的分析和解...</p>
				<a class="author" target="_blank"
					href="/u/c35e9009c64d?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/7567196/c8e2f658-328f-46bc-9ea5-292a6288f89f?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">天正商道</span>
				</a>
			</div>

			<div class="note have-img">
				<a class="cover" target="_blank"
					href="/p/a809bf8fe899?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<img
					src="//upload-images.jianshu.io/upload_images/62559-5b4cc0ebb68e3f71?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"
					alt="240">
				</a> <a class="title" target="_blank"
					href="/p/a809bf8fe899?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">深度｜15张图告诉你，下一家BAT长这样</a>
				<p class="description">演讲｜钱致远（星辰资本合伙人）笔记｜笔记侠 雷波Raybo编辑｜笔记侠
					Even欢迎投稿到硅谷堂，投稿联系硅谷君：zs981436532
					人物名片：迂回式创新创始人，星辰资本合伙人，互联网+创新导师，被誉为最接地气的实战派创业导师，迂回式创新和精益创业的实战方法论专家。擅长...</p>
				<a class="author" target="_blank"
					href="/u/a5694d848a9e?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/62559/94c431d70bb3.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">硅谷堂</span>
				</a>
			</div>

			<div class="note have-img">
				<a class="cover" target="_blank"
					href="/p/2abcbc55946d?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<img
					src="//upload-images.jianshu.io/upload_images/12619425-825bbb2b993b1a12.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"
					alt="240">
				</a> <a class="title" target="_blank"
					href="/p/2abcbc55946d?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">我年赚百万的秘密是什么？</a>
				<p class="description">首先创业做生意这东西没想象中的那么难，看你怎么去对待。多了的我没体验过也不知道，但从白手起家到百万的过程，我只用了3年左右把。这还算上我在网吧里耗费的时间。一个人如果想创业，必须吃得了苦。我指的“苦”不是身体上的疲惫，而是精神上的煎熬。在一次次失败的打击下还能坚持的下来的人...</p>
				<a class="author" target="_blank"
					href="/u/dde481074219?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//cdn2.jianshu.io/assets/default_avatar/7-0993d41a595d6ab6ef17b19496eb2f21.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">V1B9flC2</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/2da9e1124676?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">借鉴商业力量</a>
				<p class="description">___________________________________________________________________________
					一、小额融资聚集人气 一个网站，要想能够发展起来，必须具备三大因素：定位，流量，资金。三者缺一不可，有创新的定位，足够...</p>
				<a class="author" target="_blank"
					href="/u/7eb3e0c72bb5?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/1119452/65674655-aca0-47e0-959b-e3cbc8540c30.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">9927刘</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/298b0ec6b553?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">罪心•魂断流梦‖2初识</a>
				<p class="description">那年21岁，多姿多彩的大学生活就在眼前，在学校一如既往的我行我素，独立的个性一是独生子女的通病二则是家里因素造成的，兼具两者原因的我更是独来独往的，班级里朋友不多敌人超多，经常有麻烦上身，也是摸爬滚打过来的。
					同桌一个女孩子土里土气的但有心气，常常因为鸡皮蒜毛的小事跟我吵吵...</p>
				<a class="author" target="_blank"
					href="/u/4a5c938f3bdf?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/3292511/4966b7d87635.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">大红羊</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/8f534dcfea1a?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">变量Variable介绍：3-const关键字</a>
				<p class="description">如果不想让某些变量的值改变，可以使用const关键字来修饰这些变量，如果添加const关键字，这些变量的值从头到尾都不会改变了。在iOS开发中，经常把字符串常量添加const关键字，从而替代宏（#define），因为const的执行性能要比宏定义要高。
					1、const介绍 ...</p>
				<a class="author" target="_blank"
					href="/u/8914dddfcab3?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//cdn2.jianshu.io/assets/default_avatar/14-0651acff782e7a18653d7530d6b27661.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">雨夜的泪</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/9b1dc43ff5b7?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">苏州河的情怀</a>
				<p class="description">苏州河边 留下了我曾经的童年 春风荡漾 杨柳献媚 乌蓬小船 满载我童年的记忆
					苏州河边 如梦的年华 摘一片柳叶 放在河水里 让它顺流而下 稍上我的眷恋 苏州河边 甜美四季 驻在心底 月光下听潺潺流水 两岸柳枝
					跳起了欢快的舞 苏州河边 绿树成荫风光美 清澈见底映倩影 多姿多...</p>
				<a class="author" target="_blank"
					href="/u/24d0cbf45854?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/8928049/cc7685df-a780-4247-9e04-75b3ea72a907.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">诗韵钟鸣</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/86664ee241cf?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">七夕有点傻</a>
				<p class="description">牛郎织女的美好爱情传说，颠覆了当今所有的爱情，是一首穿越中华民族时空的婚恋爱情颂歌。“河汉清且浅，相去复几许。盈盈一水间，脉脉不得语。”但“两情若是长久时，又岂在朝朝暮暮”。牛郎织女是情人，更是夫妻，相恋相爱相期相思，他们俩亘古不变的爱情，让当今世人既嫉妒又想诋毁。因为当今...</p>
				<a class="author" target="_blank"
					href="/u/112b6fad9468?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/7894201/c0bdfe7e-2132-476e-8588-f8833ee9dc1e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">晴晖映雪</span>
				</a>
			</div>

			<div class="note ">
				<a class="title" target="_blank"
					href="/p/e49adc275040?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=seo_notes&amp;utm_source=recommendation">2018-04-02</a>
				<p class="description">20180326~20180401 有梦就大胆飞！ 一、我的三个标签： 1.
					两个孩子的妈妈；2. 学习者践行者；3. 寻梦者 二、我的90天践行目标：
					🍀早睡早起；🍀积极锻炼减重，目前105斤，目标95斤；🍀每周读一本书，并写读书笔记。🍅 三、上周检视 （一）学习成长： ...</p>
				<a class="author" target="_blank"
					href="/u/4ff26cc1fe3d?utm_campaign=maleskine&amp;utm_content=user&amp;utm_medium=seo_notes&amp;utm_source=recommendation">
					<div class="avatar">
						<img
							src="//upload.jianshu.io/users/upload_avatars/4578640/da3e55b74c7d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/48/h/48"
							alt="48">
					</div> <span class="name">小舟2017</span>
				</a>
			</div>
		</div>
	</div>


</body>

</html>