function clearUl() {
	$("#qwe").children().remove();
}

function ww() {
	var s = '${sessionScope.session.userType}';
	$
			.post(
					"${pageContext.request.contextPath}/homePage/otherUser.do",
					{
						"page" : 'dd'
					},
					function(data) {
						console.log(data)
						clearUl();

						$
								.each(
										data,
										function() {
											var k = '<li><a href=\"${pageContext.request.contextPath}/user/myHome.do?user_Id='
													+ this.user.userId
													+ '\" target=\"_blank\" class=\"avatar\">'
													+ '<img src=\"${pageContext.request.contextPath}/img/user.do?fileFileName='
													+ this.user.userPortrait
													+ '\"></a>';

											if (s == 'tourists') {
												k = k
														+ '<a href=\"${pageContext.request.contextPath }/jump/login.do\" class=\"following\" style=\"color: #42c02e\">'
														+ '<i class=\"iconfont ic-follow\" style=\"color: #42c02e\">'
														+ '</i>关注 </a>';
											} else {
												k = k
														+ '<a id=\"'
														+ this.user.userId
														+ '\" href=\"javascript:jj(\''
														+ this.user.userId
														+ '\');\" class=\"following ddd\" style=\"color: #42c02e\">'
														+ '<i class=\"iconfont ic-follow\" style=\"color: #42c02e\"></i>关注 </a>';
											}
											k = k
													+ '<a href=\"#\" target=\"_blank\" class=\"name\"> '
													+ this.user.userName
													+ '</a>' + '<p>一共获得了'
													+ this.like + '个喜欢</p>'
													+ '</li>';

											$("#qwe").append(k);

										});

					}, "json");
}