<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/logo.ico" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/web-f2044e800265d8edbb60.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/entry-3dc2382e82e51b288fde.css" />
<title>搜索-</title>
</head>
<body lang="zh-CN" class="reader-black-font">
	<!-- 全局顶部导航栏 -->
	<%@include file="/WEB-INF/view/home/head.jsp"%>
	<div class="container search">
		<div class="row">
			<%@include file="menu.jsp"%>
			<div class="col-xs-16 col-xs-offset-8 main">
				<div class="top">
					<div class="relevant">
						<div class="title">相关用户</div>
						<a class="function-btn"> 查看全部 <i class="iconfont ic-arrow"></i>
						</a>
						<div class="container-fluid list">
							<c:choose>
								<c:when test="${keywordDTO.listU eq null}">
									<div class="col-xs-8">
										<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=bb38223dcca747baa7a10b4850a6f049.png">
										</a>
										<div class="info">
											<a href="#" target="_blank" class="name">空空如也</a>
											<div class="meta">空空如也</div>
										</div>
									</div>
								</c:when>
								<c:otherwise>
									<c:forEach items="${keywordDTO.listU }" var="U">
										<div class="col-xs-8">
											<a href="#" target="_blank" class="avatar"> <img src="${pageContext.request.contextPath}/img/user.do?fileFileName=${U.user.userPortrait }">
											</a>
											<div class="info">
												<a href="#" target="_blank" class="name">${U.user.userName }</a>
												<div class="meta">${U.user.userId }</div>
											</div>
										</div>
									</c:forEach>
								</c:otherwise>
							</c:choose>


						</div>
					</div>
					<!-- 	<div class="relevant">
						<div class="title">相关专题</div>
						<a class="function-btn"> 查看全部 <i class="iconfont ic-arrow"></i>
						</a>
						<div class="container-fluid list">
							<div class="col-xs-8">
								<a href="/c/b2a7c5622a52" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/1450/%E6%9C%AA%E6%A0%87%E9%A2%98-1.png?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/b2a7c5622a52" target="_blank" class="name">0岁的产品经理</a>
									<div class="meta">8570 文章・30659 关注</div>
								</div>
							</div>
							<div class="col-xs-8">
								<a href="/c/ae989ceb7d65" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/2285/chaineye-logo%281%29500pxs.png?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/ae989ceb7d65" target="_blank" class="name">链眼</a>
									<div class="meta">-1 文章・9035 关注</div>
								</div>
							</div>
							<div class="col-xs-8">
								<a href="/c/b17f09dc2831" target="_blank" class="avatar-collection"> <img src="//upload.jianshu.io/collections/images/345402/%E7%A0%94%E4%B9%A0%E7%A4%BELOGO.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/144/h/144/format/webp">
								</a>
								<div class="info">
									<a href="/c/b17f09dc2831" target="_blank" class="name">区块链研习社</a>
									<div class="meta">12238 文章・7225 关注</div>
								</div>
							</div>
						</div>
					</div> -->
				</div>
				<div class="search-content">
					<div class="sort-type">
						<a class="active"> 综合排序 · </a> <a class=""> 热门文章 · </a> <a class=""> 最新发布 · </a> <span> &nbsp;&nbsp;|&nbsp; </span>
						<div class="v-select-wrap">
							<div class="v-select-submit-wrap">
								<svg viewBox="0 0 10 6" aria-hidden="true"> <path d="M8.716.217L5.002 4 1.285.218C.99-.072.514-.072.22.218c-.294.29-.294.76 0 1.052l4.25 4.512c.292.29.77.29 1.063 0L9.78 1.27c.293-.29.293-.76 0-1.052-.295-.29-.77-.29-1.063 0z"></path></svg>
							</div>
							<div class="v-select-text-area-wrap">
								<div class="v-select-input-wrap">
									<ul class="v-select-selected-item-wrap">
										<li class="v-select-selected-item">
											<!----> 时间不限
										</li>
									</ul>
								</div>
							</div>
							<ul class="v-select-options-wrap" style="display: none;">
								<li class="v-select-options-item selected">时间不限</li>
								<li class="v-select-options-item">最近一周</li>
								<li class="v-select-options-item">最近一天</li>
								<li class="v-select-options-item">最近三月</li>
							</ul>
						</div>
					</div>
					<!---->
					<div class="result">132031 个结果</div>
					<ul class="note-list">
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/a234cae11e43" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/13753996/865fe6a8-79e1-4d72-9849-61759c5d0501.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/a234cae11e43" class="nickname"> 火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 研究院
										</a> <span class="time"> 3 个月前 </span>
									</div>
								</div>
								<a href="/p/0bb81e00404a" target="_blank" class="title"> 【火币研究院】全球 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 产业全景与趋势报告（2018年上半年）
								</a>
								<p class="abstract">
									……本报告由火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 研究院出品，报告发布时间2018年5月，作者：袁煜明、朱翊邦、肖晓、郭大治。 &#8203; 摘要 2017年数字资产市场经历了自比特币问世以来的第三次牛市，这次牛市不再是比特币一枝独秀，而是……，同时美国众筹正转向合规，Reg A+，Reg D也将开始流行。 未来数字资产市场将存在六大逻辑。渗透逻辑：加密金融向传统金融渗透；应用逻辑：市场将由“场景+ <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ”的升级逻辑引领；并购逻辑：将出现……并行的状态。短期之内世界联盟监管仍存在空窗期。 我们将 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 产业划分为硬件、基础设施； <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 底层平台；通用技术；垂直应用；服务设施五大板块。2017年平台与基础层的竞争尤为激烈。下半年仍需重点关注底层……
								</p>
								<div class="meta">
									<a href="/p/0bb81e00404a" target="_blank"> <i class="iconfont ic-list-read"></i> 7234
									</a> <a href="/p/0bb81e00404a#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 13
									</a> <span> <i class="iconfont ic-list-like"></i> 26
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/8da360d9b7e5" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/11864346/33044bc5-3c19-4bf4-a623-6cf88a0211da?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/8da360d9b7e5" class="nickname"> FAC时尚 <em class="search-result-highlight">链</em> 高级顾问_3fc0
										</a> <span class="time"> 6 个月前 </span>
									</div>
								</div>
								<a href="/p/46f28d04325a" target="_blank" class="title"> 央视《对话》：探寻 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 如何改变生活
								</a>
								<p class="abstract">
									……央视携《对话》栏目走进大众视野，在思维碰撞间帮助电视机前的观众们更好的探寻 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 是什么、会为我们的生活带来哪些改变、这项技术具体应该如何应用。 贵阳市委常委常务副市长徐昊、中国信息通信研究院副院长……王志勤、中关村 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 产业联盟理事长元道、特普斯科集团主席Don Tapscott、斯坦福大学讲座教授张首晟、迅雷集团首席执行官陈磊、北大光华管理学院金融系主任刘晓蕾等嘉宾参与本期《对话》。 金色财经根据……《对话》内容进行整理，以下是对话实录（有删减）： 主持人：用最简洁、通俗易懂的语言解释什么是 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ？ 张首晟：互联网交换的是信息， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 交换的是价值。比如，我们要写一本书，全世界网民一起写一本书，已经……
								</p>
								<div class="meta">
									<a href="/p/46f28d04325a" target="_blank"> <i class="iconfont ic-list-read"></i> 9065
									</a> <a href="/p/46f28d04325a#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 29
									</a> <span> <i class="iconfont ic-list-like"></i> 134
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/1c052825b8de" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/11119173/a44a6c1f-93e5-465a-b8de-4b513010495e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/1c052825b8de" class="nickname">八书</a> <span class="time"> 4 个月前 </span>
									</div>
								</div>
								<a href="/p/2ac6f264aecd" target="_blank" class="title"> 京东 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术实践白皮书
								</a>
								<p class="abstract">
									……序一 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术推动价值大数据的高效、可信流动“技术引领，正道成功”！这是京东集团董事局主席刘强东先生在 2017 年 618 购物节期间，对外界正式发布的京东未来发展战略。在过去的十四年中，京东……），Big Data（大数据），Cloud（云计算）等新兴领域的投入，加速了京东向全社会提供“零售即服务‘Retail as a Service, RaaS’”的零售基础设施服务的步伐。 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 作为分布式数据……起来的正道形象非常匹配。目前， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 将在技术领域成为云计算、大数据、及人工智能之后，并列于移动互联网从中心到边缘、5G 物联网等新一代信息技术，共同引发并推动新一轮的技术创新和产业变革。为推动 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术……
								</p>
								<div class="meta">
									<a href="/p/2ac6f264aecd" target="_blank"> <i class="iconfont ic-list-read"></i> 4542
									</a> <a href="/p/2ac6f264aecd#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 6
									</a> <span> <i class="iconfont ic-list-like"></i> 28
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/ced020bebb6c" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/12759292/0b9920b2-6a9d-4e4d-9715-2912d2711532?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/ced020bebb6c" class="nickname">独角的犀牛</a> <span class="time"> 3 个月前 </span>
									</div>
								</div>
								<a href="/p/a12049bfc461" target="_blank" class="title"> 干货！ <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 入门、进阶、行业专家观点！1000篇好文帮你破解 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 密码！（下篇）
								</a>
								<p class="abstract">
									……随着 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 概念理论的不断成熟以及强劲技术的不断深耕， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 已经成为投资圈中备受关注的热点，从 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 1.0时代落地数字货币比特币、莱特币等，打开了 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 通向新弯道的高速路口，到 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 2.0时代开始通过……智能合约来解决货币支付难题，再到3.0时代 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 尝试向各传统行业发力，标志着 <em class="search-result-highlight">区块</em> <em
										class="search-result-highlight">链</em> 逐渐由萌芽状态走向实际满足人们渴求状态。 互联网时代已经深入整个世界， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 问世时，人们感受到的是另一个全新时代脚步……正在靠近，春节期间引发社区热点的“三点钟无眠 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ”给了2018年开场红， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 正要迎来它的新元年。 云栖社区特整理出1000篇关于 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 的文章分享给大家，从技术原理到应用实践，应有尽有。以下为下篇……
								</p>
								<div class="meta">
									<a href="/p/a12049bfc461" target="_blank"> <i class="iconfont ic-list-read"></i> 4105
									</a> <a href="/p/a12049bfc461#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 13
									</a> <span> <i class="iconfont ic-list-like"></i> 70
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/a234cae11e43" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/13753996/865fe6a8-79e1-4d72-9849-61759c5d0501.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/a234cae11e43" class="nickname"> 火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 研究院
										</a> <span class="time"> 3 个月前 </span>
									</div>
								</div>
								<a href="/p/707ba37aa8aa" target="_blank" class="title"> 【火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 产业专题报告】游戏篇-“新的财富金矿？游戏产业的割裂与与重构″
								</a>
								<p class="abstract">
									……本报告由火币 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 研究院出品，报告发布时间2018年8月1日，作者：袁煜明、朱翊邦 摘要 游戏是互联网时代三大变现模式之首，孕育了腾讯、暴雪、Steam等巨头。然而传统游戏正面临越来越深的割裂：（1……体系不互通，玩家沉没成本高昂。 我们认为，游戏是 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 落地最快的领域和重要引爆点，而游戏类Dapp，也将是未来Dapp生态最重要的组成部分。针对传统游戏弊端， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 将进行彻底重构：（1）上 <em class="search-result-highlight">链</em> ，公平可信……，同时Token激励让游戏社区化，革新不再单纯是开发者的责任；（2）借助 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ，打破渠道垄断，产生新的自分销网络；（3）用户真实拥有游戏内资产（True Ownership），并可借助智能合约去信任……
								</p>
								<div class="meta">
									<a href="/p/707ba37aa8aa" target="_blank"> <i class="iconfont ic-list-read"></i> 951
									</a> <a href="/p/707ba37aa8aa#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 2
									</a> <span> <i class="iconfont ic-list-like"></i> 9
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/036c0e9a03f1" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/219889/70085ffb-a942-402e-80c9-48293026442b.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/036c0e9a03f1" class="nickname"> 人人都懂 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em>
										</a> <span class="time"> 10 个月前 </span>
									</div>
								</div>
								<a href="/p/b2b348df4801" target="_blank" class="title"> 学习 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 该读什么书？
								</a>
								<p class="abstract">
									……最近刷屏票圈的 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ，大部分人其实都看的云里雾里，根据各大图书榜和电商平台的销量及评论量数据以及在社交网络的词频热度，为想要抓住新时代的新科技的新浪潮的新机遇的你们，精选了下面21本 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 的热书好书…….huobipro.com/zh-cn/topic/invited/?invite_code=dc523 1、《 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ：从数字货币到信用社会》 本书从历史与背景、发展现状、基础原理与技术、应用生态、存在的……问题与挑战等方面论述了 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 是怎样立起来的,为什么人人都在谈论 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> , <em class="search-result-highlight">区块</em>
									<em class="search-result-highlight">链</em> 的秘密在哪里、进阶 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> （第二代 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术）是什么, <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 怎么玩,怎样从信息互联网走向价值互联网,如何用法规约束和监管 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> ……
								</p>
								<div class="meta">
									<a href="/p/b2b348df4801" target="_blank"> <i class="iconfont ic-list-read"></i> 2768
									</a> <a href="/p/b2b348df4801#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 4
									</a> <span> <i class="iconfont ic-list-like"></i> 49
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/7eec5d773101" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/5330968/a5012019-38a1-4d97-a943-c8af584d041a.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/7eec5d773101" class="nickname">每日潮流汇</a> <span class="time"> 4 个月前 </span>
									</div>
								</div>
								<a href="/p/3ae71ea9a53a" target="_blank" class="title"> 图文实录：2018年第六届中国创业者大会·暨 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术与应用峰会
								</a>
								<p class="abstract">
									……2018年第六届中国创业者大会·暨 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术与应用峰会 时间：2018年7月19日下午 地点：河南省郑州市国际会展中心轩辕堂A厅 主持人男：尊敬的各位来宾、各位朋友，女士们，先生，再次感谢各位家人的……支持和配合，今天相聚在这里共同创变未来，感受幸福。 主持人女：各位领导，各位创业者同仁们，大家下午好！现在您所在的位置是2018第六届中国创业者大会·暨 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术与应用峰会，我是今天的主持人 姚远……。 主持人男：大家好，我是郑州电视台主持人王旭，本次 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术与应用峰会由源质未来、麦子钱包冠名，金色财经、多谢资本联合主办。在此，我谨代表 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术与应用峰会组委会对现场各位家人和朋友们的到来表示热烈的……
								</p>
								<div class="meta">
									<a href="/p/3ae71ea9a53a" target="_blank"> <i class="iconfont ic-list-read"></i> 2848
									</a> <a href="/p/3ae71ea9a53a#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 5
									</a> <span> <i class="iconfont ic-list-like"></i> 5
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/0c59a9ab5139" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/12564730/6c5e88e3-bb13-4d34-bd2e-4b7d14e685de?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/0c59a9ab5139" class="nickname">爱接力电商创始人汤乾伟</a> <span class="time"> 5 个月前 </span>
									</div>
								</div>
								<a href="/p/8392318b2475" target="_blank" class="title"> 纪元控股张铭博士分享 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 从技术价值迭加到社会价值提升，将是新经济时代的必然
								</a>
								<p class="abstract">
									……共享 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 5月18日 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 结算中心，交易中心，被谁控制，谁将是未来数字技术革命下的新经济主导者，数字资产是新经济的进步的基础，将上升迭代成为新时代的一门社会学科，新经济下 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术的核心概念将会……发生根本性的改变，上升为社会数字经济的主体，改变资产金融与经济秩序认知，颠覆各行场景应用，纪元控股张铭博士分享的是 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 的趋势，更是对于未来 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术理性思考。 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em>
									时代是一个将数据当作核心资产的时代……，数据呈现出战略化、资产化和社会化等特征。随着 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 大数据作为国家战略资产意识的增强，以及越来越多的国家将数据管理上升到战略层面， <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 大数据势必会以更加积极的姿态进入到公共管理和政府治理范畴内。无论……
								</p>
								<div class="meta">
									<a href="/p/8392318b2475" target="_blank"> <i class="iconfont ic-list-read"></i> 4033
									</a> <a href="/p/8392318b2475#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 5
									</a> <span> <i class="iconfont ic-list-like"></i> 9
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/67db49bb620f" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/12956609/ec4ee676-4d66-4a3a-bfb0-bc33343969bc.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/67db49bb620f" class="nickname"> 星际 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 社区
										</a> <span class="time"> 5 个月前 </span>
									</div>
								</div>
								<a href="/p/a6f8f8efc885" target="_blank" class="title"> <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 的前世今生
								</a>
								<p class="abstract">
									……之前网上有瞬间秒懂 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 是什么的图，也是好懂的；认真的打杂人士可参考以下报告；打酱油的人就随便逛逛吧。 主要资料来源有： 工信部编写的《中国 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术和应用白皮书》链接：http://www…….shujuju.cn/lecture/detail/2134 麦肯锡《 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> —银行业游戏规则的颠覆者》链接：http://www.shujuju.cn/lecture/detail/2129 36Kr： <em class="search-result-highlight">区块</em> …… <em class="search-result-highlight">链</em> 研究报告 链接：http://www.shujuju.cn/lecture/detail/2131 穆迪： <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 技术的现状和未来
									链接：http://www.shujuju.cn/lecture……
								</p>
								<div class="meta">
									<a href="/p/a6f8f8efc885" target="_blank"> <i class="iconfont ic-list-read"></i> 1743
									</a> <a href="/p/a6f8f8efc885#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 5
									</a> <span> <i class="iconfont ic-list-like"></i> 34
									</span>
									<!---->
								</div>
							</div>
						</li>
						<li>
							<div class="content">
								<div class="author">
									<a href="/u/a78a1a2a847e" target="_blank" class="avatar"> <img src="//upload.jianshu.io/users/upload_avatars/4582835/c5c82693df58.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp">
									</a>
									<div class="info">
										<a href="/u/a78a1a2a847e" class="nickname">大圣2017</a> <span class="time"> 1 年前 </span>
									</div>
								</div>
								<a href="/p/45e0eef2f34c" target="_blank" class="title"> ***（银联） <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 成熟度评测报告（2017）
								</a>
								<p class="abstract">
									…… <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 成熟度评测报告（2018）——5家 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 成熟度评测报告（2017）——4家 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 成熟度评测报告（2018）——5家 2018-09-29 电子商务电子支付国家工程实验室 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> 成熟度评测……报告（5家） | 联系人： 刘为怀 021-20631824 <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> A. 开源Fabric原生版（PBFT） <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> B. 美的Fabric改进版（PBFT，节点无限制） <em
										class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> C. 开源……Ripple改进版（RCP+SQL，100节点） <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> D. 杭州趣 <em class="search-result-highlight">链</em> HyperChain（RBFT，K-V+Mysql，100节点） <em class="search-result-highlight">区块</em> <em class="search-result-highlight">链</em> E. 杭州秘猿CITA-Tendermint（类PBFT……
								</p>
								<div class="meta">
									<a href="/p/45e0eef2f34c" target="_blank"> <i class="iconfont ic-list-read"></i> 6556
									</a> <a href="/p/45e0eef2f34c#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 12
									</a> <span> <i class="iconfont ic-list-like"></i> 103
									</span>
									<!---->
								</div>
							</div>
						</li>
					</ul>
					<!---->
					<!---->
					<!---->
					<div>
						<ul class="pagination">
							<!---->
							<li><a href="javascript:void(null)" class="active">1</a></li>
							<li><a>2</a></li>
							<li><a>3</a></li>
							<li><a>4</a></li>
							<li><a>下一页</a></li>
						</ul>
					</div>
					<!---->
				</div>
			</div>
		</div>
	</div>




	<div id="qb-sougou-search" style="display: none; opacity: 0;">
		<p>搜索</p>
		<p class="last-btn">复制</p>
		<iframe src=""></iframe>
	</div>
</body>
</html>