webpackJsonp([13], { "../../../../shared/node_modules/axios/index.js": function(e, t, n) { e.exports = n("../../../../shared/node_modules/axios/lib/axios.js") }, "../../../../shared/node_modules/axios/lib/adapters/xhr.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js"),
			r = n("../../../../shared/node_modules/axios/lib/core/settle.js"),
			s = n("../../../../shared/node_modules/axios/lib/helpers/buildURL.js"),
			i = n("../../../../shared/node_modules/axios/lib/helpers/parseHeaders.js"),
			a = n("../../../../shared/node_modules/axios/lib/helpers/isURLSameOrigin.js"),
			u = n("../../../../shared/node_modules/axios/lib/core/createError.js"),
			l = "undefined" != typeof window && window.btoa && window.btoa.bind(window) || n("../../../../shared/node_modules/axios/lib/helpers/btoa.js");
		e.exports = function(e) { return new Promise(function(t, d) { var c = e.data,
					f = e.headers;
				o.isFormData(c) && delete f["Content-Type"]; var p = new XMLHttpRequest,
					h = "onreadystatechange",
					m = !1; if("undefined" == typeof window || !window.XDomainRequest || "withCredentials" in p || a(e.url) || (p = new window.XDomainRequest, h = "onload", m = !0, p.onprogress = function() {}, p.ontimeout = function() {}), e.auth) { var b = e.auth.username || "",
						y = e.auth.password || "";
					f.Authorization = "Basic " + l(b + ":" + y) } if(p.open(e.method.toUpperCase(), s(e.url, e.params, e.paramsSerializer), !0), p.timeout = e.timeout, p[h] = function() { if(p && (4 === p.readyState || m) && (0 !== p.status || p.responseURL && 0 === p.responseURL.indexOf("file:"))) { var n = "getAllResponseHeaders" in p ? i(p.getAllResponseHeaders()) : null,
								o = e.responseType && "text" !== e.responseType ? p.response : p.responseText,
								s = { data: o, status: 1223 === p.status ? 204 : p.status, statusText: 1223 === p.status ? "No Content" : p.statusText, headers: n, config: e, request: p };
							r(t, d, s), p = null } }, p.onerror = function() { d(u("Network Error", e, null, p)), p = null }, p.ontimeout = function() { d(u("timeout of " + e.timeout + "ms exceeded", e, "ECONNABORTED", p)), p = null }, o.isStandardBrowserEnv()) { var g = n("../../../../shared/node_modules/axios/lib/helpers/cookies.js"),
						v = (e.withCredentials || a(e.url)) && e.xsrfCookieName ? g.read(e.xsrfCookieName) : void 0;
					v && (f[e.xsrfHeaderName] = v) } if("setRequestHeader" in p && o.forEach(f, function(e, t) { void 0 === c && "content-type" === t.toLowerCase() ? delete f[t] : p.setRequestHeader(t, e) }), e.withCredentials && (p.withCredentials = !0), e.responseType) try { p.responseType = e.responseType } catch(t) { if("json" !== e.responseType) throw t }
				"function" == typeof e.onDownloadProgress && p.addEventListener("progress", e.onDownloadProgress), "function" == typeof e.onUploadProgress && p.upload && p.upload.addEventListener("progress", e.onUploadProgress), e.cancelToken && e.cancelToken.promise.then(function(e) { p && (p.abort(), d(e), p = null) }), void 0 === c && (c = null), p.send(c) }) } }, "../../../../shared/node_modules/axios/lib/axios.js": function(e, t, n) { "use strict";

		function o(e) { var t = new i(e),
				n = s(i.prototype.request, t); return r.extend(n, i.prototype, t), r.extend(n, t), n } var r = n("../../../../shared/node_modules/axios/lib/utils.js"),
			s = n("../../../../shared/node_modules/axios/lib/helpers/bind.js"),
			i = n("../../../../shared/node_modules/axios/lib/core/Axios.js"),
			a = n("../../../../shared/node_modules/axios/lib/defaults.js"),
			u = o(a);
		u.Axios = i, u.create = function(e) { return o(r.merge(a, e)) }, u.Cancel = n("../../../../shared/node_modules/axios/lib/cancel/Cancel.js"), u.CancelToken = n("../../../../shared/node_modules/axios/lib/cancel/CancelToken.js"), u.isCancel = n("../../../../shared/node_modules/axios/lib/cancel/isCancel.js"), u.all = function(e) { return Promise.all(e) }, u.spread = n("../../../../shared/node_modules/axios/lib/helpers/spread.js"), e.exports = u, e.exports.default = u }, "../../../../shared/node_modules/axios/lib/cancel/Cancel.js": function(e, t, n) { "use strict";

		function o(e) { this.message = e } o.prototype.toString = function() { return "Cancel" + (this.message ? ": " + this.message : "") }, o.prototype.__CANCEL__ = !0, e.exports = o }, "../../../../shared/node_modules/axios/lib/cancel/CancelToken.js": function(e, t, n) { "use strict";

		function o(e) { if("function" != typeof e) throw new TypeError("executor must be a function."); var t;
			this.promise = new Promise(function(e) { t = e }); var n = this;
			e(function(e) { n.reason || (n.reason = new r(e), t(n.reason)) }) } var r = n("../../../../shared/node_modules/axios/lib/cancel/Cancel.js");
		o.prototype.throwIfRequested = function() { if(this.reason) throw this.reason }, o.source = function() { var e; return { token: new o(function(t) { e = t }), cancel: e } }, e.exports = o }, "../../../../shared/node_modules/axios/lib/cancel/isCancel.js": function(e, t, n) { "use strict";
		e.exports = function(e) { return !(!e || !e.__CANCEL__) } }, "../../../../shared/node_modules/axios/lib/core/Axios.js": function(e, t, n) { "use strict";

		function o(e) { this.defaults = e, this.interceptors = { request: new i, response: new i } } var r = n("../../../../shared/node_modules/axios/lib/defaults.js"),
			s = n("../../../../shared/node_modules/axios/lib/utils.js"),
			i = n("../../../../shared/node_modules/axios/lib/core/InterceptorManager.js"),
			a = n("../../../../shared/node_modules/axios/lib/core/dispatchRequest.js"),
			u = n("../../../../shared/node_modules/axios/lib/helpers/isAbsoluteURL.js"),
			l = n("../../../../shared/node_modules/axios/lib/helpers/combineURLs.js");
		o.prototype.request = function(e) { "string" == typeof e && (e = s.merge({ url: arguments[0] }, arguments[1])), e = s.merge(r, this.defaults, { method: "get" }, e), e.method = e.method.toLowerCase(), e.baseURL && !u(e.url) && (e.url = l(e.baseURL, e.url)); var t = [a, void 0],
				n = Promise.resolve(e); for(this.interceptors.request.forEach(function(e) { t.unshift(e.fulfilled, e.rejected) }), this.interceptors.response.forEach(function(e) { t.push(e.fulfilled, e.rejected) }); t.length;) n = n.then(t.shift(), t.shift()); return n }, s.forEach(["delete", "get", "head", "options"], function(e) { o.prototype[e] = function(t, n) { return this.request(s.merge(n || {}, { method: e, url: t })) } }), s.forEach(["post", "put", "patch"], function(e) { o.prototype[e] = function(t, n, o) { return this.request(s.merge(o || {}, { method: e, url: t, data: n })) } }), e.exports = o }, "../../../../shared/node_modules/axios/lib/core/InterceptorManager.js": function(e, t, n) { "use strict";

		function o() { this.handlers = [] } var r = n("../../../../shared/node_modules/axios/lib/utils.js");
		o.prototype.use = function(e, t) { return this.handlers.push({ fulfilled: e, rejected: t }), this.handlers.length - 1 }, o.prototype.eject = function(e) { this.handlers[e] && (this.handlers[e] = null) }, o.prototype.forEach = function(e) { r.forEach(this.handlers, function(t) { null !== t && e(t) }) }, e.exports = o }, "../../../../shared/node_modules/axios/lib/core/createError.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/core/enhanceError.js");
		e.exports = function(e, t, n, r, s) { var i = new Error(e); return o(i, t, n, r, s) } }, "../../../../shared/node_modules/axios/lib/core/dispatchRequest.js": function(e, t, n) { "use strict";

		function o(e) { e.cancelToken && e.cancelToken.throwIfRequested() } var r = n("../../../../shared/node_modules/axios/lib/utils.js"),
			s = n("../../../../shared/node_modules/axios/lib/core/transformData.js"),
			i = n("../../../../shared/node_modules/axios/lib/cancel/isCancel.js"),
			a = n("../../../../shared/node_modules/axios/lib/defaults.js");
		e.exports = function(e) { return o(e), e.headers = e.headers || {}, e.data = s(e.data, e.headers, e.transformRequest), e.headers = r.merge(e.headers.common || {}, e.headers[e.method] || {}, e.headers || {}), r.forEach(["delete", "get", "head", "post", "put", "patch", "common"], function(t) { delete e.headers[t] }), (e.adapter || a.adapter)(e).then(function(t) { return o(e), t.data = s(t.data, t.headers, e.transformResponse), t }, function(t) { return i(t) || (o(e), t && t.response && (t.response.data = s(t.response.data, t.response.headers, e.transformResponse))), Promise.reject(t) }) } }, "../../../../shared/node_modules/axios/lib/core/enhanceError.js": function(e, t, n) { "use strict";
		e.exports = function(e, t, n, o, r) { return e.config = t, n && (e.code = n), e.request = o, e.response = r, e } }, "../../../../shared/node_modules/axios/lib/core/settle.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/core/createError.js");
		e.exports = function(e, t, n) { var r = n.config.validateStatus;
			n.status && r && !r(n.status) ? t(o("Request failed with status code " + n.status, n.config, null, n.request, n)) : e(n) } }, "../../../../shared/node_modules/axios/lib/core/transformData.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = function(e, t, n) { return o.forEach(n, function(n) { e = n(e, t) }), e } }, "../../../../shared/node_modules/axios/lib/defaults.js": function(e, t, n) { "use strict";
		(function(t) {
			function o(e, t) {!r.isUndefined(e) && r.isUndefined(e["Content-Type"]) && (e["Content-Type"] = t) } var r = n("../../../../shared/node_modules/axios/lib/utils.js"),
				s = n("../../../../shared/node_modules/axios/lib/helpers/normalizeHeaderName.js"),
				i = { "Content-Type": "application/x-www-form-urlencoded" },
				a = { adapter: function() { var e; return "undefined" != typeof XMLHttpRequest ? e = n("../../../../shared/node_modules/axios/lib/adapters/xhr.js") : void 0 !== t && (e = n("../../../../shared/node_modules/axios/lib/adapters/xhr.js")), e }(), transformRequest: [function(e, t) { return s(t, "Content-Type"), r.isFormData(e) || r.isArrayBuffer(e) || r.isBuffer(e) || r.isStream(e) || r.isFile(e) || r.isBlob(e) ? e : r.isArrayBufferView(e) ? e.buffer : r.isURLSearchParams(e) ? (o(t, "application/x-www-form-urlencoded;charset=utf-8"), e.toString()) : r.isObject(e) ? (o(t, "application/json;charset=utf-8"), JSON.stringify(e)) : e }], transformResponse: [function(e) { if("string" == typeof e) try { e = JSON.parse(e) } catch(e) {}
						return e }], timeout: 0, xsrfCookieName: "XSRF-TOKEN", xsrfHeaderName: "X-XSRF-TOKEN", maxContentLength: -1, validateStatus: function(e) { return e >= 200 && e < 300 } };
			a.headers = { common: { Accept: "application/json, text/plain, */*" } }, r.forEach(["delete", "get", "head"], function(e) { a.headers[e] = {} }), r.forEach(["post", "put", "patch"], function(e) { a.headers[e] = r.merge(i) }), e.exports = a }).call(t, n("../../../../shared/node_modules/webpack/node_modules/process/browser.js")) }, "../../../../shared/node_modules/axios/lib/helpers/bind.js": function(e, t, n) { "use strict";
		e.exports = function(e, t) { return function() { for(var n = new Array(arguments.length), o = 0; o < n.length; o++) n[o] = arguments[o]; return e.apply(t, n) } } }, "../../../../shared/node_modules/axios/lib/helpers/btoa.js": function(e, t, n) { "use strict";

		function o() { this.message = "String contains an invalid character" }

		function r(e) { for(var t, n, r = String(e), i = "", a = 0, u = s; r.charAt(0 | a) || (u = "=", a % 1); i += u.charAt(63 & t >> 8 - a % 1 * 8)) { if((n = r.charCodeAt(a += .75)) > 255) throw new o;
				t = t << 8 | n } return i } var s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
		o.prototype = new Error, o.prototype.code = 5, o.prototype.name = "InvalidCharacterError", e.exports = r }, "../../../../shared/node_modules/axios/lib/helpers/buildURL.js": function(e, t, n) { "use strict";

		function o(e) { return encodeURIComponent(e).replace(/%40/gi, "@").replace(/%3A/gi, ":").replace(/%24/g, "$").replace(/%2C/gi, ",").replace(/%20/g, "+").replace(/%5B/gi, "[").replace(/%5D/gi, "]") } var r = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = function(e, t, n) { if(!t) return e; var s; if(n) s = n(t);
			else if(r.isURLSearchParams(t)) s = t.toString();
			else { var i = [];
				r.forEach(t, function(e, t) { null !== e && void 0 !== e && (r.isArray(e) && (t += "[]"), r.isArray(e) || (e = [e]), r.forEach(e, function(e) { r.isDate(e) ? e = e.toISOString() : r.isObject(e) && (e = JSON.stringify(e)), i.push(o(t) + "=" + o(e)) })) }), s = i.join("&") } return s && (e += (-1 === e.indexOf("?") ? "?" : "&") + s), e } }, "../../../../shared/node_modules/axios/lib/helpers/combineURLs.js": function(e, t, n) { "use strict";
		e.exports = function(e, t) { return t ? e.replace(/\/+$/, "") + "/" + t.replace(/^\/+/, "") : e } }, "../../../../shared/node_modules/axios/lib/helpers/cookies.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = o.isStandardBrowserEnv() ? function() { return { write: function(e, t, n, r, s, i) { var a = [];
					a.push(e + "=" + encodeURIComponent(t)), o.isNumber(n) && a.push("expires=" + new Date(n).toGMTString()), o.isString(r) && a.push("path=" + r), o.isString(s) && a.push("domain=" + s), !0 === i && a.push("secure"), document.cookie = a.join("; ") }, read: function(e) { var t = document.cookie.match(new RegExp("(^|;\\s*)(" + e + ")=([^;]*)")); return t ? decodeURIComponent(t[3]) : null }, remove: function(e) { this.write(e, "", Date.now() - 864e5) } } }() : function() { return { write: function() {}, read: function() { return null }, remove: function() {} } }() }, "../../../../shared/node_modules/axios/lib/helpers/isAbsoluteURL.js": function(e, t, n) { "use strict";
		e.exports = function(e) { return /^([a-z][a-z\d\+\-\.]*:)?\/\//i.test(e) } }, "../../../../shared/node_modules/axios/lib/helpers/isURLSameOrigin.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = o.isStandardBrowserEnv() ? function() {
			function e(e) { var t = e; return n && (r.setAttribute("href", t), t = r.href), r.setAttribute("href", t), { href: r.href, protocol: r.protocol ? r.protocol.replace(/:$/, "") : "", host: r.host, search: r.search ? r.search.replace(/^\?/, "") : "", hash: r.hash ? r.hash.replace(/^#/, "") : "", hostname: r.hostname, port: r.port, pathname: "/" === r.pathname.charAt(0) ? r.pathname : "/" + r.pathname } } var t, n = /(msie|trident)/i.test(navigator.userAgent),
				r = document.createElement("a"); return t = e(window.location.href),
				function(n) { var r = o.isString(n) ? e(n) : n; return r.protocol === t.protocol && r.host === t.host } }() : function() { return function() { return !0 } }() }, "../../../../shared/node_modules/axios/lib/helpers/normalizeHeaderName.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = function(e, t) { o.forEach(e, function(n, o) { o !== t && o.toUpperCase() === t.toUpperCase() && (e[t] = n, delete e[o]) }) } }, "../../../../shared/node_modules/axios/lib/helpers/parseHeaders.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/axios/lib/utils.js");
		e.exports = function(e) { var t, n, r, s = {}; return e ? (o.forEach(e.split("\n"), function(e) { r = e.indexOf(":"), t = o.trim(e.substr(0, r)).toLowerCase(), n = o.trim(e.substr(r + 1)), t && (s[t] = s[t] ? s[t] + ", " + n : n) }), s) : s } }, "../../../../shared/node_modules/axios/lib/helpers/spread.js": function(e, t, n) { "use strict";
		e.exports = function(e) { return function(t) { return e.apply(null, t) } } }, "../../../../shared/node_modules/axios/lib/utils.js": function(e, t, n) { "use strict";

		function o(e) { return "[object Array]" === C.call(e) }

		function r(e) { return "[object ArrayBuffer]" === C.call(e) }

		function s(e) { return "undefined" != typeof FormData && e instanceof FormData }

		function i(e) { return "undefined" != typeof ArrayBuffer && ArrayBuffer.isView ? ArrayBuffer.isView(e) : e && e.buffer && e.buffer instanceof ArrayBuffer }

		function a(e) { return "string" == typeof e }

		function u(e) { return "number" == typeof e }

		function l(e) { return void 0 === e }

		function d(e) { return null !== e && "object" == typeof e }

		function c(e) { return "[object Date]" === C.call(e) }

		function f(e) { return "[object File]" === C.call(e) }

		function p(e) { return "[object Blob]" === C.call(e) }

		function h(e) { return "[object Function]" === C.call(e) }

		function m(e) { return d(e) && h(e.pipe) }

		function b(e) { return "undefined" != typeof URLSearchParams && e instanceof URLSearchParams }

		function y(e) { return e.replace(/^\s*/, "").replace(/\s*$/, "") }

		function g() { return("undefined" == typeof navigator || "ReactNative" !== navigator.product) && ("undefined" != typeof window && "undefined" != typeof document) }

		function v(e, t) { if(null !== e && void 0 !== e)
				if("object" == typeof e || o(e) || (e = [e]), o(e))
					for(var n = 0, r = e.length; n < r; n++) t.call(null, e[n], n, e);
				else
					for(var s in e) Object.prototype.hasOwnProperty.call(e, s) && t.call(null, e[s], s, e) }

		function j() {
			function e(e, n) { "object" == typeof t[n] && "object" == typeof e ? t[n] = j(t[n], e) : t[n] = e } for(var t = {}, n = 0, o = arguments.length; n < o; n++) v(arguments[n], e); return t }

		function _(e, t, n) { return v(t, function(t, o) { e[o] = n && "function" == typeof t ? x(t, n) : t }), e } var x = n("../../../../shared/node_modules/axios/lib/helpers/bind.js"),
			w = n("../../../../shared/node_modules/axios/node_modules/is-buffer/index.js"),
			C = Object.prototype.toString;
		e.exports = { isArray: o, isArrayBuffer: r, isBuffer: w, isFormData: s, isArrayBufferView: i, isString: a, isNumber: u, isObject: d, isUndefined: l, isDate: c, isFile: f, isBlob: p, isFunction: h, isStream: m, isURLSearchParams: b, isStandardBrowserEnv: g, forEach: v, merge: j, extend: _, trim: y } }, "../../../../shared/node_modules/axios/node_modules/is-buffer/index.js": function(e, t) {
		function n(e) { return !!e.constructor && "function" == typeof e.constructor.isBuffer && e.constructor.isBuffer(e) }

		function o(e) { return "function" == typeof e.readFloatLE && "function" == typeof e.slice && n(e.slice(0, 0)) } e.exports = function(e) { return null != e && (n(e) || o(e) || !!e._isBuffer) } }, "../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/common/LoadButton.vue": function(e, t, n) { "use strict";
		Object.defineProperty(t, "__esModule", { value: !0 }); var o = n("./javascripts/common/mixins/i18nMixin.js"),
			r = function(e) { return e && e.__esModule ? e : { default: e } }(o);
		t.default = { mixins: [r.default], data: function() { return { i18nPrefix: "common:", page: 1, url: "javascripts:void(null)" } } }, e.exports = t.default }, "../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue": function(e, t, n) { "use strict";

		function o(e) { return e && e.__esModule ? e : { default: e } } Object.defineProperty(t, "__esModule", { value: !0 }); var r = n("../../../../shared/node_modules/babel-runtime/core-js/get-iterator.js"),
			s = o(r);
		n("./javascripts/web/components/home/style.scss"); var i = n("./javascripts/web/api/recommendApi.js"),
			a = o(i),
			u = n("./javascripts/web/components/home/UserFollowButton.vue"),
			l = o(u),
			d = n("./javascripts/common/mixins/resizeImage.js"),
			c = o(d),
			f = n("./javascripts/common/mixins/i18nMixin.js"),
			p = o(f);
		i18next.addResourceBundle("zh-CN", "recommendedAuthorList", n("./javascripts/web/components/home/zh-CN.json")), i18next.addResourceBundle("zh-TW", "recommendedAuthorList", n("./javascripts/web/components/home/zh-TW.json")), t.default = { name: "RecommendedAuthorList", components: { UserFollowButton: l.default }, mixins: [c.default, p.default], data: function() { return { i18nPrefix: "recommendedAuthorList:", api: new a.default, users: [], seenIds: [], page: 0, take: 5, totalPage: 0, noMore: !1, loading: !1, counter: 0 } }, computed: { filter: function() { var e = (this.page - 1) * this.take; return this.users.slice(e, e + this.take) } }, created: function() { this.fetchRecommendedAuthors() }, methods: { fetchRecommendedAuthors: function() { var e = this; if(!this.loading) { if(this.noMore) return void(this.page === this.totalPage ? this.page = 1 : this.page++);
						this.loading = !0, this.api.getUsers({ seen_ids: this.seenIds.join(","), count: this.take, only_unfollowed: !0 }).then(function(t) { var n = !0,
								o = !1,
								r = void 0; try { for(var i, a = (0, s.default)(t.data.users); !(n = (i = a.next()).done); n = !0) { var u = i.value;
									u.followState = 0, e.users.push(u), e.seenIds.push(u.id) } } catch(e) { o = !0, r = e } finally { try {!n && a.return && a.return() } finally { if(o) throw r } } var l = t.data.users.length;
							l < e.take && (e.noMore = !0, e.totalPage = Math.ceil(e.users.length / e.take)), l ? e.page++ : e.page = 1, e.loading = !1 }).catch(function() { e.loading = !1 }) } } } }, e.exports = t.default }, "../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/home/UserFollowButton.vue": function(e, t, n) { "use strict";

		function o(e) { return e && e.__esModule ? e : { default: e } } Object.defineProperty(t, "__esModule", { value: !0 }); var r = n("./javascripts/common/mixins/i18nMixin.js"),
			s = o(r),
			i = n("./javascripts/web/api/followApi.js"),
			a = o(i);
		t.default = { name: "UserFollowButton", mixins: [s.default], data: function() { return { userSignedIn: M.pageData.user_signed_in, following: !1, hovering: !1, api: new a.default } }, props: { userId: { type: Number, required: !0 } }, computed: { buttonText: function() { return this.userSignedIn && this.following ? this.hovering ? this.t("unfollow") : this.t("following") : this.t("follow") }, buttonClasses: function() { return this.following ? "following" : "follow" }, iconClasses: function() { return this.userSignedIn && this.following ? this.hovering ? "iconfont ic-unfollow" : "iconfont ic-followed" : "iconfont ic-follow" } }, methods: { handleMouseEnter: function() { this.userSignedIn && this.following && (this.hovering = !0) }, handleMouseLeave: function() { this.userSignedIn && this.following && (this.hovering = !1) }, handleClick: function() { this.userSignedIn ? this.following ? this.unsubscribe() : this.subscribe() : window.location = Routes.new_user_session_path({ utm_source: "desktop", utm_medium: "not-signed-in-index-user-follow-button" }) }, unsubscribe: function() { var e = this;
					this.api.user(this.userId).then(function() { e.following = !1 }).catch(function(e) { M.flash.error(e.response.data.error) }) }, subscribe: function() { var e = this;
					this.api.user(this.userId).then(function() { e.following = !0 }).catch(function(e) { M.flash.error(e.response.data.error) }) } }, watch: { following: function() { this.hovering = !1 } } }, e.exports = t.default }, "../../../../shared/node_modules/babel-runtime/core-js/get-iterator.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/get-iterator.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/object/assign.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/assign.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/object/create.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/create.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/object/define-property.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/define-property.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/object/get-prototype-of.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/get-prototype-of.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/object/set-prototype-of.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/set-prototype-of.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/core-js/symbol.js": function(e, t, n) { e.exports = { default: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/symbol/index.js"), __esModule: !0 } }, "../../../../shared/node_modules/babel-runtime/helpers/classCallCheck.js": function(e, t, n) { "use strict";
		t.__esModule = !0, t.default = function(e, t) { if(!(e instanceof t)) throw new TypeError("Cannot call a class as a function") } }, "../../../../shared/node_modules/babel-runtime/helpers/createClass.js": function(e, t, n) { "use strict";
		t.__esModule = !0; var o = n("../../../../shared/node_modules/babel-runtime/core-js/object/define-property.js"),
			r = function(e) { return e && e.__esModule ? e : { default: e } }(o);
		t.default = function() {
			function e(e, t) { for(var n = 0; n < t.length; n++) { var o = t[n];
					o.enumerable = o.enumerable || !1, o.configurable = !0, "value" in o && (o.writable = !0), (0, r.default)(e, o.key, o) } } return function(t, n, o) { return n && e(t.prototype, n), o && e(t, o), t } }() }, "../../../../shared/node_modules/babel-runtime/helpers/inherits.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/core-js/object/create.js").default,
			r = n("../../../../shared/node_modules/babel-runtime/core-js/object/set-prototype-of.js").default;
		t.default = function(e, t) { if("function" != typeof t && null !== t) throw new TypeError("Super expression must either be null or a function, not " + typeof t);
			e.prototype = o(t && t.prototype, { constructor: { value: e, enumerable: !1, writable: !0, configurable: !0 } }), t && (r ? r(e, t) : e.__proto__ = t) }, t.__esModule = !0 }, "../../../../shared/node_modules/babel-runtime/helpers/possibleConstructorReturn.js": function(e, t, n) { "use strict";
		t.__esModule = !0; var o = n("../../../../shared/node_modules/babel-runtime/helpers/typeof.js"),
			r = function(e) { return e && e.__esModule ? e : { default: e } }(o);
		t.default = function(e, t) { if(!e) throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); return !t || "object" !== (void 0 === t ? "undefined" : (0, r.default)(t)) && "function" != typeof t ? e : t } }, "../../../../shared/node_modules/babel-runtime/helpers/typeof.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/core-js/symbol.js").default;
		t.default = function(e) { return e && e.constructor === o ? "symbol" : typeof e }, t.__esModule = !0 }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/get-iterator.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/web.dom.iterable.js"), n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.string.iterator.js"), e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/core.get-iterator.js") }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/assign.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.assign.js"), e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").Object.assign }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/create.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js");
		e.exports = function(e, t) { return o.create(e, t) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/define-property.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js");
		e.exports = function(e, t, n) { return o.setDesc(e, t, n) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/get-prototype-of.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.get-prototype-of.js"), e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").Object.getPrototypeOf }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/object/set-prototype-of.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.set-prototype-of.js"), e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").Object.setPrototypeOf }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/fn/symbol/index.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.symbol.js"), n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.to-string.js"), e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").Symbol }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.a-function.js": function(e, t) { e.exports = function(e) { if("function" != typeof e) throw TypeError(e + " is not a function!"); return e } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.add-to-unscopables.js": function(e, t) { e.exports = function() {} }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.an-object.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.is-object.js");
		e.exports = function(e) { if(!o(e)) throw TypeError(e + " is not an object!"); return e } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.classof.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.cof.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js")("toStringTag"),
			s = "Arguments" == o(function() { return arguments }());
		e.exports = function(e) { var t, n, i; return void 0 === e ? "Undefined" : null === e ? "Null" : "string" == typeof(n = (t = Object(e))[r]) ? n : s ? o(t) : "Object" == (i = o(t)) && "function" == typeof t.callee ? "Arguments" : i } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.cof.js": function(e, t) { var n = {}.toString;
		e.exports = function(e) { return n.call(e).slice(8, -1) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js": function(e, t) { var n = e.exports = { version: "1.2.6" }; "number" == typeof __e && (__e = n) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.ctx.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.a-function.js");
		e.exports = function(e, t, n) { if(o(e), void 0 === t) return e; switch(n) {
				case 1:
					return function(n) { return e.call(t, n) };
				case 2:
					return function(n, o) { return e.call(t, n, o) };
				case 3:
					return function(n, o, r) { return e.call(t, n, o, r) } } return function() { return e.apply(t, arguments) } } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.defined.js": function(e, t) { e.exports = function(e) { if(void 0 == e) throw TypeError("Can't call method on  " + e); return e } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.descriptors.js": function(e, t, n) { e.exports = !n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.fails.js")(function() { return 7 != Object.defineProperty({}, "a", { get: function() { return 7 } }).a }) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.enum-keys.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js");
		e.exports = function(e) { var t = o.getKeys(e),
				n = o.getSymbols; if(n)
				for(var r, s = n(e), i = o.isEnum, a = 0; s.length > a;) i.call(e, r = s[a++]) && t.push(r); return t } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.global.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.ctx.js"),
			i = function(e, t, n) { var a, u, l, d = e & i.F,
					c = e & i.G,
					f = e & i.S,
					p = e & i.P,
					h = e & i.B,
					m = e & i.W,
					b = c ? r : r[t] || (r[t] = {}),
					y = c ? o : f ? o[t] : (o[t] || {}).prototype;
				c && (n = t); for(a in n)(u = !d && y && a in y) && a in b || (l = u ? y[a] : n[a], b[a] = c && "function" != typeof y[a] ? n[a] : h && u ? s(l, o) : m && y[a] == l ? function(e) { var t = function(t) { return this instanceof e ? new e(t) : e(t) }; return t.prototype = e.prototype, t }(l) : p && "function" == typeof l ? s(Function.call, l) : l, p && ((b.prototype || (b.prototype = {}))[a] = l)) };
		i.F = 1, i.G = 2, i.S = 4, i.P = 8, i.B = 16, i.W = 32, e.exports = i }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.fails.js": function(e, t) { e.exports = function(e) { try { return !!e() } catch(e) { return !0 } } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.get-names.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-iobject.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js").getNames,
			s = {}.toString,
			i = "object" == typeof window && Object.getOwnPropertyNames ? Object.getOwnPropertyNames(window) : [],
			a = function(e) { try { return r(e) } catch(e) { return i.slice() } };
		e.exports.get = function(e) { return i && "[object Window]" == s.call(e) ? a(e) : r(o(e)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.global.js": function(e, t) { var n = e.exports = "undefined" != typeof window && window.Math == Math ? window : "undefined" != typeof self && self.Math == Math ? self : Function("return this")(); "number" == typeof __g && (__g = n) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.has.js": function(e, t) { var n = {}.hasOwnProperty;
		e.exports = function(e, t) { return n.call(e, t) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.hide.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.property-desc.js");
		e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.descriptors.js") ? function(e, t, n) { return o.setDesc(e, t, r(1, n)) } : function(e, t, n) { return e[t] = n, e } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iobject.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.cof.js");
		e.exports = Object("z").propertyIsEnumerable(0) ? Object : function(e) { return "String" == o(e) ? e.split("") : Object(e) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.is-array.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.cof.js");
		e.exports = Array.isArray || function(e) { return "Array" == o(e) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.is-object.js": function(e, t) { e.exports = function(e) { return "object" == typeof e ? null !== e : "function" == typeof e } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-create.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.property-desc.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-to-string-tag.js"),
			i = {};
		n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.hide.js")(i, n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js")("iterator"), function() { return this }), e.exports = function(e, t, n) { e.prototype = o.create(i, { next: r(1, n) }), s(e, t + " Iterator") } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-define.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.library.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.redefine.js"),
			i = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.hide.js"),
			a = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.has.js"),
			u = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iterators.js"),
			l = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-create.js"),
			d = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-to-string-tag.js"),
			c = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js").getProto,
			f = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js")("iterator"),
			p = !([].keys && "next" in [].keys()),
			h = function() { return this };
		e.exports = function(e, t, n, m, b, y, g) { l(n, t, m); var v, j, _ = function(e) { if(!p && e in T) return T[e]; switch(e) {
						case "keys":
						case "values":
							return function() { return new n(this, e) } } return function() { return new n(this, e) } },
				x = t + " Iterator",
				w = "values" == b,
				C = !1,
				T = e.prototype,
				S = T[f] || T["@@iterator"] || b && T[b],
				k = S || _(b); if(S) { var E = c(k.call(new e));
				d(E, x, !0), !o && a(T, "@@iterator") && i(E, f, h), w && "values" !== S.name && (C = !0, k = function() { return S.call(this) }) } if(o && !g || !p && !C && T[f] || i(T, f, k), u[t] = k, u[x] = h, b)
				if(v = { values: w ? k : _("values"), keys: y ? k : _("keys"), entries: w ? _("entries") : k }, g)
					for(j in v) j in T || s(T, j, v[j]);
				else r(r.P + r.F * (p || C), t, v); return v } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-step.js": function(e, t) { e.exports = function(e, t) { return { value: t, done: !!e } } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iterators.js": function(e, t) { e.exports = {} }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js": function(e, t) { var n = Object;
		e.exports = { create: n.create, getProto: n.getPrototypeOf, isEnum: {}.propertyIsEnumerable, getDesc: n.getOwnPropertyDescriptor, setDesc: n.defineProperty, setDescs: n.defineProperties, getKeys: n.keys, getNames: n.getOwnPropertyNames, getSymbols: n.getOwnPropertySymbols, each: [].forEach } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.keyof.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-iobject.js");
		e.exports = function(e, t) { for(var n, s = r(e), i = o.getKeys(s), a = i.length, u = 0; a > u;)
				if(s[n = i[u++]] === t) return n } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.library.js": function(e, t) { e.exports = !0 }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.object-assign.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-object.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iobject.js");
		e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.fails.js")(function() { var e = Object.assign,
				t = {},
				n = {},
				o = Symbol(),
				r = "abcdefghijklmnopqrst"; return t[o] = 7, r.split("").forEach(function(e) { n[e] = e }), 7 != e({}, t)[o] || Object.keys(e({}, n)).join("") != r }) ? function(e, t) { for(var n = r(e), i = arguments, a = i.length, u = 1, l = o.getKeys, d = o.getSymbols, c = o.isEnum; a > u;)
				for(var f, p = s(i[u++]), h = d ? l(p).concat(d(p)) : l(p), m = h.length, b = 0; m > b;) c.call(p, f = h[b++]) && (n[f] = p[f]); return n } : Object.assign }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.object-sap.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.fails.js");
		e.exports = function(e, t) { var n = (r.Object || {})[e] || Object[e],
				i = {};
			i[e] = t(n), o(o.S + o.F * s(function() { n(1) }), "Object", i) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.property-desc.js": function(e, t) { e.exports = function(e, t) { return { enumerable: !(1 & e), configurable: !(2 & e), writable: !(4 & e), value: t } } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.redefine.js": function(e, t, n) { e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.hide.js") }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-proto.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js").getDesc,
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.is-object.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.an-object.js"),
			i = function(e, t) { if(s(e), !r(t) && null !== t) throw TypeError(t + ": can't set as prototype!") };
		e.exports = { set: Object.setPrototypeOf || ("__proto__" in {} ? function(e, t, r) { try { r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.ctx.js")(Function.call, o(Object.prototype, "__proto__").set, 2), r(e, []), t = !(e instanceof Array) } catch(e) { t = !0 } return function(e, n) { return i(e, n), t ? e.__proto__ = n : r(e, n), e } }({}, !1) : void 0), check: i } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-to-string-tag.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js").setDesc,
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.has.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js")("toStringTag");
		e.exports = function(e, t, n) { e && !r(e = n ? e : e.prototype, s) && o(e, s, { configurable: !0, value: t }) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.shared.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.global.js"),
			r = o["__core-js_shared__"] || (o["__core-js_shared__"] = {});
		e.exports = function(e) { return r[e] || (r[e] = {}) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.string-at.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-integer.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.defined.js");
		e.exports = function(e) { return function(t, n) { var s, i, a = String(r(t)),
					u = o(n),
					l = a.length; return u < 0 || u >= l ? e ? "" : void 0 : (s = a.charCodeAt(u), s < 55296 || s > 56319 || u + 1 === l || (i = a.charCodeAt(u + 1)) < 56320 || i > 57343 ? e ? a.charAt(u) : s : e ? a.slice(u, u + 2) : i - 56320 + (s - 55296 << 10) + 65536) } } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-integer.js": function(e, t) { var n = Math.ceil,
			o = Math.floor;
		e.exports = function(e) { return isNaN(e = +e) ? 0 : (e > 0 ? o : n)(e) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-iobject.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iobject.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.defined.js");
		e.exports = function(e) { return o(r(e)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-object.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.defined.js");
		e.exports = function(e) { return Object(o(e)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.uid.js": function(e, t) { var n = 0,
			o = Math.random();
		e.exports = function(e) { return "Symbol(".concat(void 0 === e ? "" : e, ")_", (++n + o).toString(36)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.shared.js")("wks"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.uid.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.global.js").Symbol;
		e.exports = function(e) { return o[e] || (o[e] = s && s[e] || (s || r)("Symbol." + e)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/core.get-iterator-method.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.classof.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js")("iterator"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iterators.js");
		e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").getIteratorMethod = function(e) { if(void 0 != e) return e[r] || e["@@iterator"] || s[o(e)] } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/core.get-iterator.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.an-object.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/core.get-iterator-method.js");
		e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.core.js").getIterator = function(e) { var t = r(e); if("function" != typeof t) throw TypeError(e + " is not iterable!"); return o(t.call(e)) } }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.array.iterator.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.add-to-unscopables.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-step.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iterators.js"),
			i = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-iobject.js");
		e.exports = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-define.js")(Array, "Array", function(e, t) { this._t = i(e), this._i = 0, this._k = t }, function() { var e = this._t,
				t = this._k,
				n = this._i++; return !e || n >= e.length ? (this._t = void 0, r(1)) : "keys" == t ? r(0, n) : "values" == t ? r(0, e[n]) : r(0, [n, e[n]]) }, "values"), s.Arguments = s.Array, o("keys"), o("values"), o("entries") }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.assign.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js");
		o(o.S + o.F, "Object", { assign: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.object-assign.js") }) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.get-prototype-of.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-object.js");
		n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.object-sap.js")("getPrototypeOf", function(e) { return function(t) { return e(o(t)) } }) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.set-prototype-of.js": function(e, t, n) { var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js");
		o(o.S, "Object", { setPrototypeOf: n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-proto.js").set }) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.object.to-string.js": function(e, t) {}, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.string.iterator.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.string-at.js")(!0);
		n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iter-define.js")(String, "String", function(e) { this._t = String(e), this._i = 0 }, function() { var e, t = this._t,
				n = this._i; return n >= t.length ? { value: void 0, done: !0 } : (e = o(t, n), this._i += e.length, { value: e, done: !1 }) }) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.symbol.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.js"),
			r = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.global.js"),
			s = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.has.js"),
			i = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.descriptors.js"),
			a = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.export.js"),
			u = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.redefine.js"),
			l = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.fails.js"),
			d = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.shared.js"),
			c = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.set-to-string-tag.js"),
			f = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.uid.js"),
			p = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.wks.js"),
			h = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.keyof.js"),
			m = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.get-names.js"),
			b = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.enum-keys.js"),
			y = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.is-array.js"),
			g = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.an-object.js"),
			v = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.to-iobject.js"),
			j = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.property-desc.js"),
			_ = o.getDesc,
			x = o.setDesc,
			w = o.create,
			C = m.get,
			T = r.Symbol,
			S = r.JSON,
			k = S && S.stringify,
			E = !1,
			$ = p("_hidden"),
			A = o.isEnum,
			N = d("symbol-registry"),
			L = d("symbols"),
			D = "function" == typeof T,
			R = Object.prototype,
			O = i && l(function() { return 7 != w(x({}, "a", { get: function() { return x(this, "a", { value: 7 }).a } })).a }) ? function(e, t, n) { var o = _(R, t);
				o && delete R[t], x(e, t, n), o && e !== R && x(R, t, o) } : x,
			q = function(e) { var t = L[e] = w(T.prototype); return t._k = e, i && E && O(R, e, { configurable: !0, set: function(t) { s(this, $) && s(this[$], e) && (this[$][e] = !1), O(this, e, j(1, t)) } }), t },
			M = function(e) { return "symbol" == typeof e },
			P = function(e, t, n) { return n && s(L, t) ? (n.enumerable ? (s(e, $) && e[$][t] && (e[$][t] = !1), n = w(n, { enumerable: j(0, !1) })) : (s(e, $) || x(e, $, j(1, {})), e[$][t] = !0), O(e, t, n)) : x(e, t, n) },
			F = function(e, t) { g(e); for(var n, o = b(t = v(t)), r = 0, s = o.length; s > r;) P(e, n = o[r++], t[n]); return e },
			H = function(e, t) { return void 0 === t ? w(e) : F(w(e), t) },
			I = function(e) { var t = A.call(this, e); return !(t || !s(this, e) || !s(L, e) || s(this, $) && this[$][e]) || t },
			B = function(e, t) { var n = _(e = v(e), t); return !n || !s(L, t) || s(e, $) && e[$][t] || (n.enumerable = !0), n },
			W = function(e) { for(var t, n = C(v(e)), o = [], r = 0; n.length > r;) s(L, t = n[r++]) || t == $ || o.push(t); return o },
			U = function(e) { for(var t, n = C(v(e)), o = [], r = 0; n.length > r;) s(L, t = n[r++]) && o.push(L[t]); return o },
			z = function(e) { if(void 0 !== e && !M(e)) { for(var t, n, o = [e], r = 1, s = arguments; s.length > r;) o.push(s[r++]); return t = o[1], "function" == typeof t && (n = t), !n && y(t) || (t = function(e, t) { if(n && (t = n.call(this, e, t)), !M(t)) return t }), o[1] = t, k.apply(S, o) } },
			X = l(function() { var e = T(); return "[null]" != k([e]) || "{}" != k({ a: e }) || "{}" != k(Object(e)) });
		D || (T = function() { if(M(this)) throw TypeError("Symbol is not a constructor"); return q(f(arguments.length > 0 ? arguments[0] : void 0)) }, u(T.prototype, "toString", function() { return this._k }), M = function(e) { return e instanceof T }, o.create = H, o.isEnum = I, o.getDesc = B, o.setDesc = P, o.setDescs = F, o.getNames = m.get = W, o.getSymbols = U, i && !n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.library.js") && u(R, "propertyIsEnumerable", I, !0)); var V = { for: function(e) { return s(N, e += "") ? N[e] : N[e] = T(e) }, keyFor: function(e) { return h(N, e) }, useSetter: function() { E = !0 }, useSimple: function() { E = !1 } };
		o.each.call("hasInstance,isConcatSpreadable,iterator,match,replace,search,species,split,toPrimitive,toStringTag,unscopables".split(","), function(e) { var t = p(e);
			V[e] = D ? t : q(t) }), E = !0, a(a.G + a.W, { Symbol: T }), a(a.S, "Symbol", V), a(a.S + a.F * !D, "Object", { create: H, defineProperty: P, defineProperties: F, getOwnPropertyDescriptor: B, getOwnPropertyNames: W, getOwnPropertySymbols: U }), S && a(a.S + a.F * (!D || X), "JSON", { stringify: z }), c(T, "Symbol"), c(Math, "Math", !0), c(r.JSON, "JSON", !0) }, "../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/web.dom.iterable.js": function(e, t, n) { n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/es6.array.iterator.js"); var o = n("../../../../shared/node_modules/babel-runtime/node_modules/core-js/library/modules/$.iterators.js");
		o.NodeList = o.HTMLCollection = o.Array }, '../../../../shared/node_modules/css-loader/index.js!../../../../shared/node_modules/vue-loader/lib/style-compiler/index.js?{"vue":true,"id":"data-v-eefe4e0c","scoped":false,"hasInlineConfig":true}!../../../../shared/node_modules/sass-loader/lib/loader.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=styles&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue': function(e, t, n) { t = e.exports = n("../../../../shared/node_modules/css-loader/lib/css-base.js")(), t.push([e.i, '\n@charset "UTF-8";\n/*\n * å˜é‡\n*/\n.user-follow-button-recommend {\n  float: right;\n  margin-top: 5px;\n  padding: 0;\n  background-color: transparent !important;\n  border-width: 0 !important;\n}\n.user-follow-button-recommend i, .user-follow-button-recommend span {\n    font-size: 12px !important;\n}\n.user-follow-button-recommend span {\n    margin-left: 0 !important;\n}\n.user-follow-button-recommend.normal i, .user-follow-button-recommend.normal span {\n    color: #42C02E !important;\n}\n.user-follow-button-recommend.toggle i, .user-follow-button-recommend.toggle span {\n    color: #969696 !important;\n}\n', ""]) }, "../../../../shared/node_modules/css-loader/lib/css-base.js": function(e, t) { e.exports = function() { var e = []; return e.toString = function() { for(var e = [], t = 0; t < this.length; t++) { var n = this[t];
					n[2] ? e.push("@media " + n[2] + "{" + n[1] + "}") : e.push(n[1]) } return e.join("") }, e.i = function(t, n) { "string" == typeof t && (t = [
					[null, t, ""]
				]); for(var o = {}, r = 0; r < this.length; r++) { var s = this[r][0]; "number" == typeof s && (o[s] = !0) } for(r = 0; r < t.length; r++) { var i = t[r]; "number" == typeof i[0] && o[i[0]] || (n && !i[2] ? i[2] = n : n && (i[2] = "(" + i[2] + ") and (" + n + ")"), e.push(i)) } }, e } }, "../../../../shared/node_modules/jquery/dist/jquery.js": function(e, t, n) { var o, r;! function(t, n) { "object" == typeof e && "object" == typeof e.exports ? e.exports = t.document ? n(t, !0) : function(e) { if(!e.document) throw new Error("jQuery requires a window with a document"); return n(e) } : n(t) }("undefined" != typeof window ? window : this, function(n, s) {
			function i(e) { var t = !!e && "length" in e && e.length,
					n = ue.type(e); return "function" !== n && !ue.isWindow(e) && ("array" === n || 0 === t || "number" == typeof t && t > 0 && t - 1 in e) }

			function a(e, t, n) { if(ue.isFunction(t)) return ue.grep(e, function(e, o) { return !!t.call(e, o, e) !== n }); if(t.nodeType) return ue.grep(e, function(e) { return e === t !== n }); if("string" == typeof t) { if(ge.test(t)) return ue.filter(t, e, n);
					t = ue.filter(t, e) } return ue.grep(e, function(e) { return oe.call(t, e) > -1 !== n }) }

			function u(e, t) { for(;
					(e = e[t]) && 1 !== e.nodeType;); return e }

			function l(e) { var t = {}; return ue.each(e.match(we) || [], function(e, n) { t[n] = !0 }), t }

			function d() { Z.removeEventListener("DOMContentLoaded", d), n.removeEventListener("load", d), ue.ready() }

			function c() { this.expando = ue.expando + c.uid++ }

			function f(e, t, n) { var o; if(void 0 === n && 1 === e.nodeType)
					if(o = "data-" + t.replace(Ae, "-$&").toLowerCase(), "string" == typeof(n = e.getAttribute(o))) { try { n = "true" === n || "false" !== n && ("null" === n ? null : +n + "" === n ? +n : $e.test(n) ? ue.parseJSON(n) : n) } catch(e) {} Ee.set(e, t, n) } else n = void 0; return n }

			function p(e, t, n, o) { var r, s = 1,
					i = 20,
					a = o ? function() { return o.cur() } : function() { return ue.css(e, t, "") },
					u = a(),
					l = n && n[3] || (ue.cssNumber[t] ? "" : "px"),
					d = (ue.cssNumber[t] || "px" !== l && +u) && Le.exec(ue.css(e, t)); if(d && d[3] !== l) { l = l || d[3], n = n || [], d = +u || 1;
					do { s = s || ".5", d /= s, ue.style(e, t, d + l) } while (s !== (s = a() / u) && 1 !== s && --i) } return n && (d = +d || +u || 0, r = n[1] ? d + (n[1] + 1) * n[2] : +n[2], o && (o.unit = l, o.start = d, o.end = r)), r }

			function h(e, t) { var n = void 0 !== e.getElementsByTagName ? e.getElementsByTagName(t || "*") : void 0 !== e.querySelectorAll ? e.querySelectorAll(t || "*") : []; return void 0 === t || t && ue.nodeName(e, t) ? ue.merge([e], n) : n }

			function m(e, t) { for(var n = 0, o = e.length; n < o; n++) ke.set(e[n], "globalEval", !t || ke.get(t[n], "globalEval")) }

			function b(e, t, n, o, r) { for(var s, i, a, u, l, d, c = t.createDocumentFragment(), f = [], p = 0, b = e.length; p < b; p++)
					if((s = e[p]) || 0 === s)
						if("object" === ue.type(s)) ue.merge(f, s.nodeType ? [s] : s);
						else if(Fe.test(s)) { for(i = i || c.appendChild(t.createElement("div")), a = (qe.exec(s) || ["", ""])[1].toLowerCase(), u = Pe[a] || Pe._default, i.innerHTML = u[1] + ue.htmlPrefilter(s) + u[2], d = u[0]; d--;) i = i.lastChild;
					ue.merge(f, i.childNodes), i = c.firstChild, i.textContent = "" } else f.push(t.createTextNode(s)); for(c.textContent = "", p = 0; s = f[p++];)
					if(o && ue.inArray(s, o) > -1) r && r.push(s);
					else if(l = ue.contains(s.ownerDocument, s), i = h(c.appendChild(s), "script"), l && m(i), n)
					for(d = 0; s = i[d++];) Me.test(s.type || "") && n.push(s); return c }

			function y() { return !0 }

			function g() { return !1 }

			function v() { try { return Z.activeElement } catch(e) {} }

			function j(e, t, n, o, r, s) { var i, a; if("object" == typeof t) { "string" != typeof n && (o = o || n, n = void 0); for(a in t) j(e, a, n, o, t[a], s); return e } if(null == o && null == r ? (r = n, o = n = void 0) : null == r && ("string" == typeof n ? (r = o, o = void 0) : (r = o, o = n, n = void 0)), !1 === r) r = g;
				else if(!r) return e; return 1 === s && (i = r, r = function(e) { return ue().off(e), i.apply(this, arguments) }, r.guid = i.guid || (i.guid = ue.guid++)), e.each(function() { ue.event.add(this, t, r, o, n) }) }

			function _(e, t) { return ue.nodeName(e, "table") && ue.nodeName(11 !== t.nodeType ? t : t.firstChild, "tr") ? e.getElementsByTagName("tbody")[0] || e.appendChild(e.ownerDocument.createElement("tbody")) : e }

			function x(e) { return e.type = (null !== e.getAttribute("type")) + "/" + e.type, e }

			function w(e) { var t = Xe.exec(e.type); return t ? e.type = t[1] : e.removeAttribute("type"), e }

			function C(e, t) { var n, o, r, s, i, a, u, l; if(1 === t.nodeType) { if(ke.hasData(e) && (s = ke.access(e), i = ke.set(t, s), l = s.events)) { delete i.handle, i.events = {}; for(r in l)
							for(n = 0, o = l[r].length; n < o; n++) ue.event.add(t, r, l[r][n]) } Ee.hasData(e) && (a = Ee.access(e), u = ue.extend({}, a), Ee.set(t, u)) } }

			function T(e, t) { var n = t.nodeName.toLowerCase(); "input" === n && Oe.test(e.type) ? t.checked = e.checked : "input" !== n && "textarea" !== n || (t.defaultValue = e.defaultValue) }

			function S(e, t, n, o) { t = te.apply([], t); var r, s, i, a, u, l, d = 0,
					c = e.length,
					f = c - 1,
					p = t[0],
					m = ue.isFunction(p); if(m || c > 1 && "string" == typeof p && !ae.checkClone && ze.test(p)) return e.each(function(r) { var s = e.eq(r);
					m && (t[0] = p.call(this, r, s.html())), S(s, t, n, o) }); if(c && (r = b(t, e[0].ownerDocument, !1, e, o), s = r.firstChild, 1 === r.childNodes.length && (r = s), s || o)) { for(i = ue.map(h(r, "script"), x), a = i.length; d < c; d++) u = r, d !== f && (u = ue.clone(u, !0, !0), a && ue.merge(i, h(u, "script"))), n.call(e[d], u, d); if(a)
						for(l = i[i.length - 1].ownerDocument, ue.map(i, w), d = 0; d < a; d++) u = i[d], Me.test(u.type || "") && !ke.access(u, "globalEval") && ue.contains(l, u) && (u.src ? ue._evalUrl && ue._evalUrl(u.src) : ue.globalEval(u.textContent.replace(Ve, ""))) } return e }

			function k(e, t, n) { for(var o, r = t ? ue.filter(t, e) : e, s = 0; null != (o = r[s]); s++) n || 1 !== o.nodeType || ue.cleanData(h(o)), o.parentNode && (n && ue.contains(o.ownerDocument, o) && m(h(o, "script")), o.parentNode.removeChild(o)); return e }

			function E(e, t) { var n = ue(t.createElement(e)).appendTo(t.body),
					o = ue.css(n[0], "display"); return n.detach(), o }

			function $(e) { var t = Z,
					n = Ge[e]; return n || (n = E(e, t), "none" !== n && n || (Je = (Je || ue("<iframe frameborder='0' width='0' height='0'/>")).appendTo(t.documentElement), t = Je[0].contentDocument, t.write(), t.close(), n = E(e, t), Je.detach()), Ge[e] = n), n }

			function A(e, t, n) { var o, r, s, i, a = e.style; return n = n || Qe(e), i = n ? n.getPropertyValue(t) || n[t] : void 0, "" !== i && void 0 !== i || ue.contains(e.ownerDocument, e) || (i = ue.style(e, t)), n && !ae.pixelMarginRight() && Ke.test(i) && Ye.test(t) && (o = a.width, r = a.minWidth, s = a.maxWidth, a.minWidth = a.maxWidth = a.width = i, i = n.width, a.width = o, a.minWidth = r, a.maxWidth = s), void 0 !== i ? i + "" : i }

			function N(e, t) { return { get: function() { return e() ? void delete this.get : (this.get = t).apply(this, arguments) } } }

			function L(e) { if(e in st) return e; for(var t = e[0].toUpperCase() + e.slice(1), n = rt.length; n--;)
					if((e = rt[n] + t) in st) return e }

			function D(e, t, n) { var o = Le.exec(t); return o ? Math.max(0, o[2] - (n || 0)) + (o[3] || "px") : t }

			function R(e, t, n, o, r) { for(var s = n === (o ? "border" : "content") ? 4 : "width" === t ? 1 : 0, i = 0; s < 4; s += 2) "margin" === n && (i += ue.css(e, n + De[s], !0, r)), o ? ("content" === n && (i -= ue.css(e, "padding" + De[s], !0, r)), "margin" !== n && (i -= ue.css(e, "border" + De[s] + "Width", !0, r))) : (i += ue.css(e, "padding" + De[s], !0, r), "padding" !== n && (i += ue.css(e, "border" + De[s] + "Width", !0, r))); return i }

			function O(e, t, o) { var r = !0,
					s = "width" === t ? e.offsetWidth : e.offsetHeight,
					i = Qe(e),
					a = "border-box" === ue.css(e, "boxSizing", !1, i); if(Z.msFullscreenElement && n.top !== n && e.getClientRects().length && (s = Math.round(100 * e.getBoundingClientRect()[t])), s <= 0 || null == s) { if(s = A(e, t, i), (s < 0 || null == s) && (s = e.style[t]), Ke.test(s)) return s;
					r = a && (ae.boxSizingReliable() || s === e.style[t]), s = parseFloat(s) || 0 } return s + R(e, t, o || (a ? "border" : "content"), r, i) + "px" }

			function q(e, t) { for(var n, o, r, s = [], i = 0, a = e.length; i < a; i++) o = e[i], o.style && (s[i] = ke.get(o, "olddisplay"), n = o.style.display, t ? (s[i] || "none" !== n || (o.style.display = ""), "" === o.style.display && Re(o) && (s[i] = ke.access(o, "olddisplay", $(o.nodeName)))) : (r = Re(o), "none" === n && r || ke.set(o, "olddisplay", r ? n : ue.css(o, "display")))); for(i = 0; i < a; i++) o = e[i], o.style && (t && "none" !== o.style.display && "" !== o.style.display || (o.style.display = t ? s[i] || "" : "none")); return e }

			function M(e, t, n, o, r) { return new M.prototype.init(e, t, n, o, r) }

			function P() { return n.setTimeout(function() { it = void 0 }), it = ue.now() }

			function F(e, t) { var n, o = 0,
					r = { height: e }; for(t = t ? 1 : 0; o < 4; o += 2 - t) n = De[o], r["margin" + n] = r["padding" + n] = e; return t && (r.opacity = r.width = e), r }

			function H(e, t, n) { for(var o, r = (W.tweeners[t] || []).concat(W.tweeners["*"]), s = 0, i = r.length; s < i; s++)
					if(o = r[s].call(n, t, e)) return o }

			function I(e, t, n) { var o, r, s, i, a, u, l, d = this,
					c = {},
					f = e.style,
					p = e.nodeType && Re(e),
					h = ke.get(e, "fxshow");
				n.queue || (a = ue._queueHooks(e, "fx"), null == a.unqueued && (a.unqueued = 0, u = a.empty.fire, a.empty.fire = function() { a.unqueued || u() }), a.unqueued++, d.always(function() { d.always(function() { a.unqueued--, ue.queue(e, "fx").length || a.empty.fire() }) })), 1 === e.nodeType && ("height" in t || "width" in t) && (n.overflow = [f.overflow, f.overflowX, f.overflowY], l = ue.css(e, "display"), "inline" === ("none" === l ? ke.get(e, "olddisplay") || $(e.nodeName) : l) && "none" === ue.css(e, "float") && (f.display = "inline-block")), n.overflow && (f.overflow = "hidden", d.always(function() { f.overflow = n.overflow[0], f.overflowX = n.overflow[1], f.overflowY = n.overflow[2] })); for(o in t)
					if(r = t[o], ut.exec(r)) { if(delete t[o], s = s || "toggle" === r, r === (p ? "hide" : "show")) { if("show" !== r || !h || void 0 === h[o]) continue;
							p = !0 } c[o] = h && h[o] || ue.style(e, o) } else l = void 0; if(ue.isEmptyObject(c)) "inline" === ("none" === l ? $(e.nodeName) : l) && (f.display = l);
				else { h ? "hidden" in h && (p = h.hidden) : h = ke.access(e, "fxshow", {}), s && (h.hidden = !p), p ? ue(e).show() : d.done(function() { ue(e).hide() }), d.done(function() { var t;
						ke.remove(e, "fxshow"); for(t in c) ue.style(e, t, c[t]) }); for(o in c) i = H(p ? h[o] : 0, o, d), o in h || (h[o] = i.start, p && (i.end = i.start, i.start = "width" === o || "height" === o ? 1 : 0)) } }

			function B(e, t) { var n, o, r, s, i; for(n in e)
					if(o = ue.camelCase(n), r = t[o], s = e[n], ue.isArray(s) && (r = s[1], s = e[n] = s[0]), n !== o && (e[o] = s, delete e[n]), (i = ue.cssHooks[o]) && "expand" in i) { s = i.expand(s), delete e[o]; for(n in s) n in e || (e[n] = s[n], t[n] = r) } else t[o] = r }

			function W(e, t, n) { var o, r, s = 0,
					i = W.prefilters.length,
					a = ue.Deferred().always(function() { delete u.elem }),
					u = function() { if(r) return !1; for(var t = it || P(), n = Math.max(0, l.startTime + l.duration - t), o = n / l.duration || 0, s = 1 - o, i = 0, u = l.tweens.length; i < u; i++) l.tweens[i].run(s); return a.notifyWith(e, [l, s, n]), s < 1 && u ? n : (a.resolveWith(e, [l]), !1) },
					l = a.promise({ elem: e, props: ue.extend({}, t), opts: ue.extend(!0, { specialEasing: {}, easing: ue.easing._default }, n), originalProperties: t, originalOptions: n, startTime: it || P(), duration: n.duration, tweens: [], createTween: function(t, n) { var o = ue.Tween(e, l.opts, t, n, l.opts.specialEasing[t] || l.opts.easing); return l.tweens.push(o), o }, stop: function(t) { var n = 0,
								o = t ? l.tweens.length : 0; if(r) return this; for(r = !0; n < o; n++) l.tweens[n].run(1); return t ? (a.notifyWith(e, [l, 1, 0]), a.resolveWith(e, [l, t])) : a.rejectWith(e, [l, t]), this } }),
					d = l.props; for(B(d, l.opts.specialEasing); s < i; s++)
					if(o = W.prefilters[s].call(l, e, d, l.opts)) return ue.isFunction(o.stop) && (ue._queueHooks(l.elem, l.opts.queue).stop = ue.proxy(o.stop, o)), o; return ue.map(d, H, l), ue.isFunction(l.opts.start) && l.opts.start.call(e, l), ue.fx.timer(ue.extend(u, { elem: e, anim: l, queue: l.opts.queue })), l.progress(l.opts.progress).done(l.opts.done, l.opts.complete).fail(l.opts.fail).always(l.opts.always) }

			function U(e) { return e.getAttribute && e.getAttribute("class") || "" }

			function z(e) { return function(t, n) { "string" != typeof t && (n = t, t = "*"); var o, r = 0,
						s = t.toLowerCase().match(we) || []; if(ue.isFunction(n))
						for(; o = s[r++];) "+" === o[0] ? (o = o.slice(1) || "*", (e[o] = e[o] || []).unshift(n)) : (e[o] = e[o] || []).push(n) } }

			function X(e, t, n, o) {
				function r(a) { var u; return s[a] = !0, ue.each(e[a] || [], function(e, a) { var l = a(t, n, o); return "string" != typeof l || i || s[l] ? i ? !(u = l) : void 0 : (t.dataTypes.unshift(l), r(l), !1) }), u } var s = {},
					i = e === Et; return r(t.dataTypes[0]) || !s["*"] && r("*") }

			function V(e, t) { var n, o, r = ue.ajaxSettings.flatOptions || {}; for(n in t) void 0 !== t[n] && ((r[n] ? e : o || (o = {}))[n] = t[n]); return o && ue.extend(!0, e, o), e }

			function J(e, t, n) { for(var o, r, s, i, a = e.contents, u = e.dataTypes;
					"*" === u[0];) u.shift(), void 0 === o && (o = e.mimeType || t.getResponseHeader("Content-Type")); if(o)
					for(r in a)
						if(a[r] && a[r].test(o)) { u.unshift(r); break }
				if(u[0] in n) s = u[0];
				else { for(r in n) { if(!u[0] || e.converters[r + " " + u[0]]) { s = r; break } i || (i = r) } s = s || i } if(s) return s !== u[0] && u.unshift(s), n[s] }

			function G(e, t, n, o) { var r, s, i, a, u, l = {},
					d = e.dataTypes.slice(); if(d[1])
					for(i in e.converters) l[i.toLowerCase()] = e.converters[i]; for(s = d.shift(); s;)
					if(e.responseFields[s] && (n[e.responseFields[s]] = t), !u && o && e.dataFilter && (t = e.dataFilter(t, e.dataType)), u = s, s = d.shift())
						if("*" === s) s = u;
						else if("*" !== u && u !== s) { if(!(i = l[u + " " + s] || l["* " + s]))
						for(r in l)
							if(a = r.split(" "), a[1] === s && (i = l[u + " " + a[0]] || l["* " + a[0]])) {!0 === i ? i = l[r] : !0 !== l[r] && (s = a[0], d.unshift(a[1])); break }
					if(!0 !== i)
						if(i && e.throws) t = i(t);
						else try { t = i(t) } catch(e) { return { state: "parsererror", error: i ? e : "No conversion from " + u + " to " + s } } } return { state: "success", data: t } }

			function Y(e, t, n, o) { var r; if(ue.isArray(t)) ue.each(t, function(t, r) { n || Lt.test(e) ? o(e, r) : Y(e + "[" + ("object" == typeof r && null != r ? t : "") + "]", r, n, o) });
				else if(n || "object" !== ue.type(t)) o(e, t);
				else
					for(r in t) Y(e + "[" + r + "]", t[r], n, o) }

			function K(e) { return ue.isWindow(e) ? e : 9 === e.nodeType && e.defaultView } var Q = [],
				Z = n.document,
				ee = Q.slice,
				te = Q.concat,
				ne = Q.push,
				oe = Q.indexOf,
				re = {},
				se = re.toString,
				ie = re.hasOwnProperty,
				ae = {},
				ue = function(e, t) { return new ue.fn.init(e, t) },
				le = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g,
				de = /^-ms-/,
				ce = /-([\da-z])/gi,
				fe = function(e, t) { return t.toUpperCase() };
			ue.fn = ue.prototype = { jquery: "2.2.2", constructor: ue, selector: "", length: 0, toArray: function() { return ee.call(this) }, get: function(e) { return null != e ? e < 0 ? this[e + this.length] : this[e] : ee.call(this) }, pushStack: function(e) { var t = ue.merge(this.constructor(), e); return t.prevObject = this, t.context = this.context, t }, each: function(e) { return ue.each(this, e) }, map: function(e) { return this.pushStack(ue.map(this, function(t, n) { return e.call(t, n, t) })) }, slice: function() { return this.pushStack(ee.apply(this, arguments)) }, first: function() { return this.eq(0) }, last: function() { return this.eq(-1) }, eq: function(e) { var t = this.length,
						n = +e + (e < 0 ? t : 0); return this.pushStack(n >= 0 && n < t ? [this[n]] : []) }, end: function() { return this.prevObject || this.constructor() }, push: ne, sort: Q.sort, splice: Q.splice }, ue.extend = ue.fn.extend = function() { var e, t, n, o, r, s, i = arguments[0] || {},
					a = 1,
					u = arguments.length,
					l = !1; for("boolean" == typeof i && (l = i, i = arguments[a] || {}, a++), "object" == typeof i || ue.isFunction(i) || (i = {}), a === u && (i = this, a--); a < u; a++)
					if(null != (e = arguments[a]))
						for(t in e) n = i[t], o = e[t], i !== o && (l && o && (ue.isPlainObject(o) || (r = ue.isArray(o))) ? (r ? (r = !1, s = n && ue.isArray(n) ? n : []) : s = n && ue.isPlainObject(n) ? n : {}, i[t] = ue.extend(l, s, o)) : void 0 !== o && (i[t] = o)); return i }, ue.extend({ expando: "jQuery" + ("2.2.2" + Math.random()).replace(/\D/g, ""), isReady: !0, error: function(e) { throw new Error(e) }, noop: function() {}, isFunction: function(e) { return "function" === ue.type(e) }, isArray: Array.isArray, isWindow: function(e) { return null != e && e === e.window }, isNumeric: function(e) { var t = e && e.toString(); return !ue.isArray(e) && t - parseFloat(t) + 1 >= 0 }, isPlainObject: function(e) { var t; if("object" !== ue.type(e) || e.nodeType || ue.isWindow(e)) return !1; if(e.constructor && !ie.call(e, "constructor") && !ie.call(e.constructor.prototype || {}, "isPrototypeOf")) return !1; for(t in e); return void 0 === t || ie.call(e, t) }, isEmptyObject: function(e) { var t; for(t in e) return !1; return !0 }, type: function(e) { return null == e ? e + "" : "object" == typeof e || "function" == typeof e ? re[se.call(e)] || "object" : typeof e }, globalEval: function(e) { var t, n = eval;
					(e = ue.trim(e)) && (1 === e.indexOf("use strict") ? (t = Z.createElement("script"), t.text = e, Z.head.appendChild(t).parentNode.removeChild(t)) : n(e)) }, camelCase: function(e) { return e.replace(de, "ms-").replace(ce, fe) }, nodeName: function(e, t) { return e.nodeName && e.nodeName.toLowerCase() === t.toLowerCase() }, each: function(e, t) { var n, o = 0; if(i(e))
						for(n = e.length; o < n && !1 !== t.call(e[o], o, e[o]); o++);
					else
						for(o in e)
							if(!1 === t.call(e[o], o, e[o])) break; return e }, trim: function(e) { return null == e ? "" : (e + "").replace(le, "") }, makeArray: function(e, t) { var n = t || []; return null != e && (i(Object(e)) ? ue.merge(n, "string" == typeof e ? [e] : e) : ne.call(n, e)), n }, inArray: function(e, t, n) { return null == t ? -1 : oe.call(t, e, n) }, merge: function(e, t) { for(var n = +t.length, o = 0, r = e.length; o < n; o++) e[r++] = t[o]; return e.length = r, e }, grep: function(e, t, n) { for(var o = [], r = 0, s = e.length, i = !n; r < s; r++) !t(e[r], r) !== i && o.push(e[r]); return o }, map: function(e, t, n) { var o, r, s = 0,
						a = []; if(i(e))
						for(o = e.length; s < o; s++) null != (r = t(e[s], s, n)) && a.push(r);
					else
						for(s in e) null != (r = t(e[s], s, n)) && a.push(r); return te.apply([], a) }, guid: 1, proxy: function(e, t) { var n, o, r; if("string" == typeof t && (n = e[t], t = e, e = n), ue.isFunction(e)) return o = ee.call(arguments, 2), r = function() { return e.apply(t || this, o.concat(ee.call(arguments))) }, r.guid = e.guid = e.guid || ue.guid++, r }, now: Date.now, support: ae }), "function" == typeof Symbol && (ue.fn[Symbol.iterator] = Q[Symbol.iterator]), ue.each("Boolean Number String Function Array Date RegExp Object Error Symbol".split(" "), function(e, t) { re["[object " + t + "]"] = t.toLowerCase() }); var pe = function(e) {
				function t(e, t, n, o) { var r, s, i, a, l, c, f, p, h = t && t.ownerDocument,
						m = t ? t.nodeType : 9; if(n = n || [], "string" != typeof e || !e || 1 !== m && 9 !== m && 11 !== m) return n; if(!o && ((t ? t.ownerDocument || t : P) !== A && $(t), t = t || A, L)) { if(11 !== m && (c = me.exec(e)))
							if(r = c[1]) { if(9 === m) { if(!(i = t.getElementById(r))) return n; if(i.id === r) return n.push(i), n } else if(h && (i = h.getElementById(r)) && q(t, i) && i.id === r) return n.push(i), n } else { if(c[2]) return Y.apply(n, t.getElementsByTagName(e)), n; if((r = c[3]) && v.getElementsByClassName && t.getElementsByClassName) return Y.apply(n, t.getElementsByClassName(r)), n }
						if(v.qsa && !W[e + " "] && (!D || !D.test(e))) { if(1 !== m) h = t, p = e;
							else if("object" !== t.nodeName.toLowerCase()) { for((a = t.getAttribute("id")) ? a = a.replace(ye, "\\$&") : t.setAttribute("id", a = M), f = w(e), s = f.length, l = de.test(a) ? "#" + a : "[id='" + a + "']"; s--;) f[s] = l + " " + d(f[s]);
								p = f.join(","), h = be.test(e) && u(t.parentNode) || t } if(p) try { return Y.apply(n, h.querySelectorAll(p)), n } catch(e) {} finally { a === M && t.removeAttribute("id") } } } return T(e.replace(se, "$1"), t, n, o) }

				function n() {
					function e(n, o) { return t.push(n + " ") > j.cacheLength && delete e[t.shift()], e[n + " "] = o } var t = []; return e }

				function o(e) { return e[M] = !0, e }

				function r(e) { var t = A.createElement("div"); try { return !!e(t) } catch(e) { return !1 } finally { t.parentNode && t.parentNode.removeChild(t), t = null } }

				function s(e, t) { for(var n = e.split("|"), o = n.length; o--;) j.attrHandle[n[o]] = t }

				function i(e, t) { var n = t && e,
						o = n && 1 === e.nodeType && 1 === t.nodeType && (~t.sourceIndex || z) - (~e.sourceIndex || z); if(o) return o; if(n)
						for(; n = n.nextSibling;)
							if(n === t) return -1; return e ? 1 : -1 }

				function a(e) { return o(function(t) { return t = +t, o(function(n, o) { for(var r, s = e([], n.length, t), i = s.length; i--;) n[r = s[i]] && (n[r] = !(o[r] = n[r])) }) }) }

				function u(e) { return e && void 0 !== e.getElementsByTagName && e }

				function l() {}

				function d(e) { for(var t = 0, n = e.length, o = ""; t < n; t++) o += e[t].value; return o }

				function c(e, t, n) { var o = t.dir,
						r = n && "parentNode" === o,
						s = H++; return t.first ? function(t, n, s) { for(; t = t[o];)
							if(1 === t.nodeType || r) return e(t, n, s) } : function(t, n, i) { var a, u, l, d = [F, s]; if(i) { for(; t = t[o];)
								if((1 === t.nodeType || r) && e(t, n, i)) return !0 } else
							for(; t = t[o];)
								if(1 === t.nodeType || r) { if(l = t[M] || (t[M] = {}), u = l[t.uniqueID] || (l[t.uniqueID] = {}), (a = u[o]) && a[0] === F && a[1] === s) return d[2] = a[2]; if(u[o] = d, d[2] = e(t, n, i)) return !0 } } }

				function f(e) { return e.length > 1 ? function(t, n, o) { for(var r = e.length; r--;)
							if(!e[r](t, n, o)) return !1; return !0 } : e[0] }

				function p(e, n, o) { for(var r = 0, s = n.length; r < s; r++) t(e, n[r], o); return o }

				function h(e, t, n, o, r) { for(var s, i = [], a = 0, u = e.length, l = null != t; a < u; a++)(s = e[a]) && (n && !n(s, o, r) || (i.push(s), l && t.push(a))); return i }

				function m(e, t, n, r, s, i) { return r && !r[M] && (r = m(r)), s && !s[M] && (s = m(s, i)), o(function(o, i, a, u) { var l, d, c, f = [],
							m = [],
							b = i.length,
							y = o || p(t || "*", a.nodeType ? [a] : a, []),
							g = !e || !o && t ? y : h(y, f, e, a, u),
							v = n ? s || (o ? e : b || r) ? [] : i : g; if(n && n(g, v, a, u), r)
							for(l = h(v, m), r(l, [], a, u), d = l.length; d--;)(c = l[d]) && (v[m[d]] = !(g[m[d]] = c)); if(o) { if(s || e) { if(s) { for(l = [], d = v.length; d--;)(c = v[d]) && l.push(g[d] = c);
									s(null, v = [], l, u) } for(d = v.length; d--;)(c = v[d]) && (l = s ? Q(o, c) : f[d]) > -1 && (o[l] = !(i[l] = c)) } } else v = h(v === i ? v.splice(b, v.length) : v), s ? s(null, i, v, u) : Y.apply(i, v) }) }

				function b(e) { for(var t, n, o, r = e.length, s = j.relative[e[0].type], i = s || j.relative[" "], a = s ? 1 : 0, u = c(function(e) { return e === t }, i, !0), l = c(function(e) { return Q(t, e) > -1 }, i, !0), p = [function(e, n, o) { var r = !s && (o || n !== S) || ((t = n).nodeType ? u(e, n, o) : l(e, n, o)); return t = null, r }]; a < r; a++)
						if(n = j.relative[e[a].type]) p = [c(f(p), n)];
						else { if(n = j.filter[e[a].type].apply(null, e[a].matches), n[M]) { for(o = ++a; o < r && !j.relative[e[o].type]; o++); return m(a > 1 && f(p), a > 1 && d(e.slice(0, a - 1).concat({ value: " " === e[a - 2].type ? "*" : "" })).replace(se, "$1"), n, a < o && b(e.slice(a, o)), o < r && b(e = e.slice(o)), o < r && d(e)) } p.push(n) }
					return f(p) }

				function y(e, n) { var r = n.length > 0,
						s = e.length > 0,
						i = function(o, i, a, u, l) { var d, c, f, p = 0,
								m = "0",
								b = o && [],
								y = [],
								g = S,
								v = o || s && j.find.TAG("*", l),
								_ = F += null == g ? 1 : Math.random() || .1,
								x = v.length; for(l && (S = i === A || i || l); m !== x && null != (d = v[m]); m++) { if(s && d) { for(c = 0, i || d.ownerDocument === A || ($(d), a = !L); f = e[c++];)
										if(f(d, i || A, a)) { u.push(d); break }
									l && (F = _) } r && ((d = !f && d) && p--, o && b.push(d)) } if(p += m, r && m !== p) { for(c = 0; f = n[c++];) f(b, y, i, a); if(o) { if(p > 0)
										for(; m--;) b[m] || y[m] || (y[m] = J.call(u));
									y = h(y) } Y.apply(u, y), l && !o && y.length > 0 && p + n.length > 1 && t.uniqueSort(u) } return l && (F = _, S = g), b }; return r ? o(i) : i } var g, v, j, _, x, w, C, T, S, k, E, $, A, N, L, D, R, O, q, M = "sizzle" + 1 * new Date,
					P = e.document,
					F = 0,
					H = 0,
					I = n(),
					B = n(),
					W = n(),
					U = function(e, t) { return e === t && (E = !0), 0 },
					z = 1 << 31,
					X = {}.hasOwnProperty,
					V = [],
					J = V.pop,
					G = V.push,
					Y = V.push,
					K = V.slice,
					Q = function(e, t) { for(var n = 0, o = e.length; n < o; n++)
							if(e[n] === t) return n; return -1 },
					Z = "checked|selected|async|autofocus|autoplay|controls|defer|disabled|hidden|ismap|loop|multiple|open|readonly|required|scoped",
					ee = "[\\x20\\t\\r\\n\\f]",
					te = "(?:\\\\.|[\\w-]|[^\\x00-\\xa0])+",
					ne = "\\[" + ee + "*(" + te + ")(?:" + ee + "*([*^$|!~]?=)" + ee + "*(?:'((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\"|(" + te + "))|)" + ee + "*\\]",
					oe = ":(" + te + ")(?:\\((('((?:\\\\.|[^\\\\'])*)'|\"((?:\\\\.|[^\\\\\"])*)\")|((?:\\\\.|[^\\\\()[\\]]|" + ne + ")*)|.*)\\)|)",
					re = new RegExp(ee + "+", "g"),
					se = new RegExp("^" + ee + "+|((?:^|[^\\\\])(?:\\\\.)*)" + ee + "+$", "g"),
					ie = new RegExp("^" + ee + "*," + ee + "*"),
					ae = new RegExp("^" + ee + "*([>+~]|" + ee + ")" + ee + "*"),
					ue = new RegExp("=" + ee + "*([^\\]'\"]*?)" + ee + "*\\]", "g"),
					le = new RegExp(oe),
					de = new RegExp("^" + te + "$"),
					ce = { ID: new RegExp("^#(" + te + ")"), CLASS: new RegExp("^\\.(" + te + ")"), TAG: new RegExp("^(" + te + "|[*])"), ATTR: new RegExp("^" + ne), PSEUDO: new RegExp("^" + oe), CHILD: new RegExp("^:(only|first|last|nth|nth-last)-(child|of-type)(?:\\(" + ee + "*(even|odd|(([+-]|)(\\d*)n|)" + ee + "*(?:([+-]|)" + ee + "*(\\d+)|))" + ee + "*\\)|)", "i"), bool: new RegExp("^(?:" + Z + ")$", "i"), needsContext: new RegExp("^" + ee + "*[>+~]|:(even|odd|eq|gt|lt|nth|first|last)(?:\\(" + ee + "*((?:-\\d)?\\d*)" + ee + "*\\)|)(?=[^-]|$)", "i") },
					fe = /^(?:input|select|textarea|button)$/i,
					pe = /^h\d$/i,
					he = /^[^{]+\{\s*\[native \w/,
					me = /^(?:#([\w-]+)|(\w+)|\.([\w-]+))$/,
					be = /[+~]/,
					ye = /'|\\/g,
					ge = new RegExp("\\\\([\\da-f]{1,6}" + ee + "?|(" + ee + ")|.)", "ig"),
					ve = function(e, t, n) { var o = "0x" + t - 65536; return o !== o || n ? t : o < 0 ? String.fromCharCode(o + 65536) : String.fromCharCode(o >> 10 | 55296, 1023 & o | 56320) },
					je = function() { $() }; try { Y.apply(V = K.call(P.childNodes), P.childNodes), V[P.childNodes.length].nodeType } catch(e) { Y = { apply: V.length ? function(e, t) { G.apply(e, K.call(t)) } : function(e, t) { for(var n = e.length, o = 0; e[n++] = t[o++];);
							e.length = n - 1 } } } v = t.support = {}, x = t.isXML = function(e) { var t = e && (e.ownerDocument || e).documentElement; return !!t && "HTML" !== t.nodeName }, $ = t.setDocument = function(e) { var t, n, o = e ? e.ownerDocument || e : P; return o !== A && 9 === o.nodeType && o.documentElement ? (A = o, N = A.documentElement, L = !x(A), (n = A.defaultView) && n.top !== n && (n.addEventListener ? n.addEventListener("unload", je, !1) : n.attachEvent && n.attachEvent("onunload", je)), v.attributes = r(function(e) { return e.className = "i", !e.getAttribute("className") }), v.getElementsByTagName = r(function(e) { return e.appendChild(A.createComment("")), !e.getElementsByTagName("*").length }), v.getElementsByClassName = he.test(A.getElementsByClassName), v.getById = r(function(e) { return N.appendChild(e).id = M, !A.getElementsByName || !A.getElementsByName(M).length }), v.getById ? (j.find.ID = function(e, t) { if(void 0 !== t.getElementById && L) { var n = t.getElementById(e); return n ? [n] : [] } }, j.filter.ID = function(e) { var t = e.replace(ge, ve); return function(e) { return e.getAttribute("id") === t } }) : (delete j.find.ID, j.filter.ID = function(e) { var t = e.replace(ge, ve); return function(e) { var n = void 0 !== e.getAttributeNode && e.getAttributeNode("id"); return n && n.value === t } }), j.find.TAG = v.getElementsByTagName ? function(e, t) { return void 0 !== t.getElementsByTagName ? t.getElementsByTagName(e) : v.qsa ? t.querySelectorAll(e) : void 0 } : function(e, t) { var n, o = [],
							r = 0,
							s = t.getElementsByTagName(e); if("*" === e) { for(; n = s[r++];) 1 === n.nodeType && o.push(n); return o } return s }, j.find.CLASS = v.getElementsByClassName && function(e, t) { if(void 0 !== t.getElementsByClassName && L) return t.getElementsByClassName(e) }, R = [], D = [], (v.qsa = he.test(A.querySelectorAll)) && (r(function(e) { N.appendChild(e).innerHTML = "<a id='" + M + "'></a><select id='" + M + "-\r\\' msallowcapture=''><option selected=''></option></select>", e.querySelectorAll("[msallowcapture^='']").length && D.push("[*^$]=" + ee + "*(?:''|\"\")"), e.querySelectorAll("[selected]").length || D.push("\\[" + ee + "*(?:value|" + Z + ")"), e.querySelectorAll("[id~=" + M + "-]").length || D.push("~="), e.querySelectorAll(":checked").length || D.push(":checked"), e.querySelectorAll("a#" + M + "+*").length || D.push(".#.+[+~]") }), r(function(e) { var t = A.createElement("input");
						t.setAttribute("type", "hidden"), e.appendChild(t).setAttribute("name", "D"), e.querySelectorAll("[name=d]").length && D.push("name" + ee + "*[*^$|!~]?="), e.querySelectorAll(":enabled").length || D.push(":enabled", ":disabled"), e.querySelectorAll("*,:x"), D.push(",.*:") })), (v.matchesSelector = he.test(O = N.matches || N.webkitMatchesSelector || N.mozMatchesSelector || N.oMatchesSelector || N.msMatchesSelector)) && r(function(e) { v.disconnectedMatch = O.call(e, "div"), O.call(e, "[s!='']:x"), R.push("!=", oe) }), D = D.length && new RegExp(D.join("|")), R = R.length && new RegExp(R.join("|")), t = he.test(N.compareDocumentPosition), q = t || he.test(N.contains) ? function(e, t) { var n = 9 === e.nodeType ? e.documentElement : e,
							o = t && t.parentNode; return e === o || !(!o || 1 !== o.nodeType || !(n.contains ? n.contains(o) : e.compareDocumentPosition && 16 & e.compareDocumentPosition(o))) } : function(e, t) { if(t)
							for(; t = t.parentNode;)
								if(t === e) return !0; return !1 }, U = t ? function(e, t) { if(e === t) return E = !0, 0; var n = !e.compareDocumentPosition - !t.compareDocumentPosition; return n || (n = (e.ownerDocument || e) === (t.ownerDocument || t) ? e.compareDocumentPosition(t) : 1, 1 & n || !v.sortDetached && t.compareDocumentPosition(e) === n ? e === A || e.ownerDocument === P && q(P, e) ? -1 : t === A || t.ownerDocument === P && q(P, t) ? 1 : k ? Q(k, e) - Q(k, t) : 0 : 4 & n ? -1 : 1) } : function(e, t) { if(e === t) return E = !0, 0; var n, o = 0,
							r = e.parentNode,
							s = t.parentNode,
							a = [e],
							u = [t]; if(!r || !s) return e === A ? -1 : t === A ? 1 : r ? -1 : s ? 1 : k ? Q(k, e) - Q(k, t) : 0; if(r === s) return i(e, t); for(n = e; n = n.parentNode;) a.unshift(n); for(n = t; n = n.parentNode;) u.unshift(n); for(; a[o] === u[o];) o++; return o ? i(a[o], u[o]) : a[o] === P ? -1 : u[o] === P ? 1 : 0 }, A) : A }, t.matches = function(e, n) { return t(e, null, null, n) }, t.matchesSelector = function(e, n) { if((e.ownerDocument || e) !== A && $(e), n = n.replace(ue, "='$1']"), v.matchesSelector && L && !W[n + " "] && (!R || !R.test(n)) && (!D || !D.test(n))) try { var o = O.call(e, n); if(o || v.disconnectedMatch || e.document && 11 !== e.document.nodeType) return o } catch(e) {}
					return t(n, A, null, [e]).length > 0 }, t.contains = function(e, t) { return(e.ownerDocument || e) !== A && $(e), q(e, t) }, t.attr = function(e, t) {
					(e.ownerDocument || e) !== A && $(e); var n = j.attrHandle[t.toLowerCase()],
						o = n && X.call(j.attrHandle, t.toLowerCase()) ? n(e, t, !L) : void 0; return void 0 !== o ? o : v.attributes || !L ? e.getAttribute(t) : (o = e.getAttributeNode(t)) && o.specified ? o.value : null }, t.error = function(e) { throw new Error("Syntax error, unrecognized expression: " + e) }, t.uniqueSort = function(e) { var t, n = [],
						o = 0,
						r = 0; if(E = !v.detectDuplicates, k = !v.sortStable && e.slice(0), e.sort(U), E) { for(; t = e[r++];) t === e[r] && (o = n.push(r)); for(; o--;) e.splice(n[o], 1) } return k = null, e }, _ = t.getText = function(e) { var t, n = "",
						o = 0,
						r = e.nodeType; if(r) { if(1 === r || 9 === r || 11 === r) { if("string" == typeof e.textContent) return e.textContent; for(e = e.firstChild; e; e = e.nextSibling) n += _(e) } else if(3 === r || 4 === r) return e.nodeValue } else
						for(; t = e[o++];) n += _(t); return n }, j = t.selectors = { cacheLength: 50, createPseudo: o, match: ce, attrHandle: {}, find: {}, relative: { ">": { dir: "parentNode", first: !0 }, " ": { dir: "parentNode" }, "+": { dir: "previousSibling", first: !0 }, "~": { dir: "previousSibling" } }, preFilter: { ATTR: function(e) { return e[1] = e[1].replace(ge, ve), e[3] = (e[3] || e[4] || e[5] || "").replace(ge, ve), "~=" === e[2] && (e[3] = " " + e[3] + " "), e.slice(0, 4) }, CHILD: function(e) { return e[1] = e[1].toLowerCase(), "nth" === e[1].slice(0, 3) ? (e[3] || t.error(e[0]), e[4] = +(e[4] ? e[5] + (e[6] || 1) : 2 * ("even" === e[3] || "odd" === e[3])), e[5] = +(e[7] + e[8] || "odd" === e[3])) : e[3] && t.error(e[0]), e }, PSEUDO: function(e) { var t, n = !e[6] && e[2]; return ce.CHILD.test(e[0]) ? null : (e[3] ? e[2] = e[4] || e[5] || "" : n && le.test(n) && (t = w(n, !0)) && (t = n.indexOf(")", n.length - t) - n.length) && (e[0] = e[0].slice(0, t), e[2] = n.slice(0, t)), e.slice(0, 3)) } }, filter: { TAG: function(e) { var t = e.replace(ge, ve).toLowerCase(); return "*" === e ? function() { return !0 } : function(e) { return e.nodeName && e.nodeName.toLowerCase() === t } }, CLASS: function(e) { var t = I[e + " "]; return t || (t = new RegExp("(^|" + ee + ")" + e + "(" + ee + "|$)")) && I(e, function(e) { return t.test("string" == typeof e.className && e.className || void 0 !== e.getAttribute && e.getAttribute("class") || "") }) }, ATTR: function(e, n, o) { return function(r) { var s = t.attr(r, e); return null == s ? "!=" === n : !n || (s += "", "=" === n ? s === o : "!=" === n ? s !== o : "^=" === n ? o && 0 === s.indexOf(o) : "*=" === n ? o && s.indexOf(o) > -1 : "$=" === n ? o && s.slice(-o.length) === o : "~=" === n ? (" " + s.replace(re, " ") + " ").indexOf(o) > -1 : "|=" === n && (s === o || s.slice(0, o.length + 1) === o + "-")) } }, CHILD: function(e, t, n, o, r) { var s = "nth" !== e.slice(0, 3),
								i = "last" !== e.slice(-4),
								a = "of-type" === t; return 1 === o && 0 === r ? function(e) { return !!e.parentNode } : function(t, n, u) { var l, d, c, f, p, h, m = s !== i ? "nextSibling" : "previousSibling",
									b = t.parentNode,
									y = a && t.nodeName.toLowerCase(),
									g = !u && !a,
									v = !1; if(b) { if(s) { for(; m;) { for(f = t; f = f[m];)
												if(a ? f.nodeName.toLowerCase() === y : 1 === f.nodeType) return !1;
											h = m = "only" === e && !h && "nextSibling" } return !0 } if(h = [i ? b.firstChild : b.lastChild], i && g) { for(f = b, c = f[M] || (f[M] = {}), d = c[f.uniqueID] || (c[f.uniqueID] = {}), l = d[e] || [], p = l[0] === F && l[1], v = p && l[2], f = p && b.childNodes[p]; f = ++p && f && f[m] || (v = p = 0) || h.pop();)
											if(1 === f.nodeType && ++v && f === t) { d[e] = [F, p, v]; break } } else if(g && (f = t, c = f[M] || (f[M] = {}), d = c[f.uniqueID] || (c[f.uniqueID] = {}), l = d[e] || [], p = l[0] === F && l[1], v = p), !1 === v)
										for(;
											(f = ++p && f && f[m] || (v = p = 0) || h.pop()) && ((a ? f.nodeName.toLowerCase() !== y : 1 !== f.nodeType) || !++v || (g && (c = f[M] || (f[M] = {}), d = c[f.uniqueID] || (c[f.uniqueID] = {}), d[e] = [F, v]), f !== t));); return(v -= r) === o || v % o == 0 && v / o >= 0 } } }, PSEUDO: function(e, n) { var r, s = j.pseudos[e] || j.setFilters[e.toLowerCase()] || t.error("unsupported pseudo: " + e); return s[M] ? s(n) : s.length > 1 ? (r = [e, e, "", n], j.setFilters.hasOwnProperty(e.toLowerCase()) ? o(function(e, t) { for(var o, r = s(e, n), i = r.length; i--;) o = Q(e, r[i]), e[o] = !(t[o] = r[i]) }) : function(e) { return s(e, 0, r) }) : s } }, pseudos: { not: o(function(e) { var t = [],
								n = [],
								r = C(e.replace(se, "$1")); return r[M] ? o(function(e, t, n, o) { for(var s, i = r(e, null, o, []), a = e.length; a--;)(s = i[a]) && (e[a] = !(t[a] = s)) }) : function(e, o, s) { return t[0] = e, r(t, null, s, n), t[0] = null, !n.pop() } }), has: o(function(e) { return function(n) { return t(e, n).length > 0 } }), contains: o(function(e) { return e = e.replace(ge, ve),
								function(t) { return(t.textContent || t.innerText || _(t)).indexOf(e) > -1 } }), lang: o(function(e) { return de.test(e || "") || t.error("unsupported lang: " + e), e = e.replace(ge, ve).toLowerCase(),
								function(t) { var n;
									do { if(n = L ? t.lang : t.getAttribute("xml:lang") || t.getAttribute("lang")) return(n = n.toLowerCase()) === e || 0 === n.indexOf(e + "-") } while ((t = t.parentNode) && 1 === t.nodeType); return !1 } }), target: function(t) { var n = e.location && e.location.hash; return n && n.slice(1) === t.id }, root: function(e) { return e === N }, focus: function(e) { return e === A.activeElement && (!A.hasFocus || A.hasFocus()) && !!(e.type || e.href || ~e.tabIndex) }, enabled: function(e) { return !1 === e.disabled }, disabled: function(e) { return !0 === e.disabled }, checked: function(e) { var t = e.nodeName.toLowerCase(); return "input" === t && !!e.checked || "option" === t && !!e.selected }, selected: function(e) { return e.parentNode && e.parentNode.selectedIndex, !0 === e.selected }, empty: function(e) { for(e = e.firstChild; e; e = e.nextSibling)
								if(e.nodeType < 6) return !1; return !0 }, parent: function(e) { return !j.pseudos.empty(e) }, header: function(e) { return pe.test(e.nodeName) }, input: function(e) { return fe.test(e.nodeName) }, button: function(e) { var t = e.nodeName.toLowerCase(); return "input" === t && "button" === e.type || "button" === t }, text: function(e) { var t; return "input" === e.nodeName.toLowerCase() && "text" === e.type && (null == (t = e.getAttribute("type")) || "text" === t.toLowerCase()) }, first: a(function() { return [0] }), last: a(function(e, t) { return [t - 1] }), eq: a(function(e, t, n) { return [n < 0 ? n + t : n] }), even: a(function(e, t) { for(var n = 0; n < t; n += 2) e.push(n); return e }), odd: a(function(e, t) { for(var n = 1; n < t; n += 2) e.push(n); return e }), lt: a(function(e, t, n) { for(var o = n < 0 ? n + t : n; --o >= 0;) e.push(o); return e }), gt: a(function(e, t, n) { for(var o = n < 0 ? n + t : n; ++o < t;) e.push(o); return e }) } }, j.pseudos.nth = j.pseudos.eq; for(g in { radio: !0, checkbox: !0, file: !0, password: !0, image: !0 }) j.pseudos[g] = function(e) { return function(t) { return "input" === t.nodeName.toLowerCase() && t.type === e } }(g); for(g in { submit: !0, reset: !0 }) j.pseudos[g] = function(e) { return function(t) { var n = t.nodeName.toLowerCase(); return("input" === n || "button" === n) && t.type === e } }(g); return l.prototype = j.filters = j.pseudos, j.setFilters = new l, w = t.tokenize = function(e, n) { var o, r, s, i, a, u, l, d = B[e + " "]; if(d) return n ? 0 : d.slice(0); for(a = e, u = [], l = j.preFilter; a;) { o && !(r = ie.exec(a)) || (r && (a = a.slice(r[0].length) || a), u.push(s = [])), o = !1, (r = ae.exec(a)) && (o = r.shift(), s.push({ value: o, type: r[0].replace(se, " ") }), a = a.slice(o.length)); for(i in j.filter) !(r = ce[i].exec(a)) || l[i] && !(r = l[i](r)) || (o = r.shift(), s.push({ value: o, type: i, matches: r }), a = a.slice(o.length)); if(!o) break } return n ? a.length : a ? t.error(e) : B(e, u).slice(0) }, C = t.compile = function(e, t) { var n, o = [],
						r = [],
						s = W[e + " "]; if(!s) { for(t || (t = w(e)), n = t.length; n--;) s = b(t[n]), s[M] ? o.push(s) : r.push(s);
						s = W(e, y(r, o)), s.selector = e } return s }, T = t.select = function(e, t, n, o) { var r, s, i, a, l, c = "function" == typeof e && e,
						f = !o && w(e = c.selector || e); if(n = n || [], 1 === f.length) { if(s = f[0] = f[0].slice(0), s.length > 2 && "ID" === (i = s[0]).type && v.getById && 9 === t.nodeType && L && j.relative[s[1].type]) { if(!(t = (j.find.ID(i.matches[0].replace(ge, ve), t) || [])[0])) return n;
							c && (t = t.parentNode), e = e.slice(s.shift().value.length) } for(r = ce.needsContext.test(e) ? 0 : s.length; r-- && (i = s[r], !j.relative[a = i.type]);)
							if((l = j.find[a]) && (o = l(i.matches[0].replace(ge, ve), be.test(s[0].type) && u(t.parentNode) || t))) { if(s.splice(r, 1), !(e = o.length && d(s))) return Y.apply(n, o), n; break } } return(c || C(e, f))(o, t, !L, n, !t || be.test(e) && u(t.parentNode) || t), n }, v.sortStable = M.split("").sort(U).join("") === M, v.detectDuplicates = !!E, $(), v.sortDetached = r(function(e) { return 1 & e.compareDocumentPosition(A.createElement("div")) }), r(function(e) { return e.innerHTML = "<a href='#'></a>", "#" === e.firstChild.getAttribute("href") }) || s("type|href|height|width", function(e, t, n) { if(!n) return e.getAttribute(t, "type" === t.toLowerCase() ? 1 : 2) }), v.attributes && r(function(e) { return e.innerHTML = "<input/>", e.firstChild.setAttribute("value", ""), "" === e.firstChild.getAttribute("value") }) || s("value", function(e, t, n) { if(!n && "input" === e.nodeName.toLowerCase()) return e.defaultValue }), r(function(e) { return null == e.getAttribute("disabled") }) || s(Z, function(e, t, n) { var o; if(!n) return !0 === e[t] ? t.toLowerCase() : (o = e.getAttributeNode(t)) && o.specified ? o.value : null }), t }(n);
			ue.find = pe, ue.expr = pe.selectors, ue.expr[":"] = ue.expr.pseudos, ue.uniqueSort = ue.unique = pe.uniqueSort, ue.text = pe.getText, ue.isXMLDoc = pe.isXML, ue.contains = pe.contains; var he = function(e, t, n) { for(var o = [], r = void 0 !== n;
						(e = e[t]) && 9 !== e.nodeType;)
						if(1 === e.nodeType) { if(r && ue(e).is(n)) break;
							o.push(e) }
					return o },
				me = function(e, t) { for(var n = []; e; e = e.nextSibling) 1 === e.nodeType && e !== t && n.push(e); return n },
				be = ue.expr.match.needsContext,
				ye = /^<([\w-]+)\s*\/?>(?:<\/\1>|)$/,
				ge = /^.[^:#\[\.,]*$/;
			ue.filter = function(e, t, n) { var o = t[0]; return n && (e = ":not(" + e + ")"), 1 === t.length && 1 === o.nodeType ? ue.find.matchesSelector(o, e) ? [o] : [] : ue.find.matches(e, ue.grep(t, function(e) { return 1 === e.nodeType })) }, ue.fn.extend({ find: function(e) { var t, n = this.length,
						o = [],
						r = this; if("string" != typeof e) return this.pushStack(ue(e).filter(function() { for(t = 0; t < n; t++)
							if(ue.contains(r[t], this)) return !0 })); for(t = 0; t < n; t++) ue.find(e, r[t], o); return o = this.pushStack(n > 1 ? ue.unique(o) : o), o.selector = this.selector ? this.selector + " " + e : e, o }, filter: function(e) { return this.pushStack(a(this, e || [], !1)) }, not: function(e) { return this.pushStack(a(this, e || [], !0)) }, is: function(e) { return !!a(this, "string" == typeof e && be.test(e) ? ue(e) : e || [], !1).length } }); var ve, je = /^(?:\s*(<[\w\W]+>)[^>]*|#([\w-]*))$/;
			(ue.fn.init = function(e, t, n) { var o, r; if(!e) return this; if(n = n || ve, "string" == typeof e) { if(!(o = "<" === e[0] && ">" === e[e.length - 1] && e.length >= 3 ? [null, e, null] : je.exec(e)) || !o[1] && t) return !t || t.jquery ? (t || n).find(e) : this.constructor(t).find(e); if(o[1]) { if(t = t instanceof ue ? t[0] : t, ue.merge(this, ue.parseHTML(o[1], t && t.nodeType ? t.ownerDocument || t : Z, !0)), ye.test(o[1]) && ue.isPlainObject(t))
							for(o in t) ue.isFunction(this[o]) ? this[o](t[o]) : this.attr(o, t[o]); return this } return r = Z.getElementById(o[2]), r && r.parentNode && (this.length = 1, this[0] = r), this.context = Z, this.selector = e, this } return e.nodeType ? (this.context = this[0] = e, this.length = 1, this) : ue.isFunction(e) ? void 0 !== n.ready ? n.ready(e) : e(ue) : (void 0 !== e.selector && (this.selector = e.selector, this.context = e.context), ue.makeArray(e, this)) }).prototype = ue.fn, ve = ue(Z); var _e = /^(?:parents|prev(?:Until|All))/,
				xe = { children: !0, contents: !0, next: !0, prev: !0 };
			ue.fn.extend({ has: function(e) { var t = ue(e, this),
						n = t.length; return this.filter(function() { for(var e = 0; e < n; e++)
							if(ue.contains(this, t[e])) return !0 }) }, closest: function(e, t) { for(var n, o = 0, r = this.length, s = [], i = be.test(e) || "string" != typeof e ? ue(e, t || this.context) : 0; o < r; o++)
						for(n = this[o]; n && n !== t; n = n.parentNode)
							if(n.nodeType < 11 && (i ? i.index(n) > -1 : 1 === n.nodeType && ue.find.matchesSelector(n, e))) { s.push(n); break }
					return this.pushStack(s.length > 1 ? ue.uniqueSort(s) : s) }, index: function(e) { return e ? "string" == typeof e ? oe.call(ue(e), this[0]) : oe.call(this, e.jquery ? e[0] : e) : this[0] && this[0].parentNode ? this.first().prevAll().length : -1 }, add: function(e, t) { return this.pushStack(ue.uniqueSort(ue.merge(this.get(), ue(e, t)))) }, addBack: function(e) { return this.add(null == e ? this.prevObject : this.prevObject.filter(e)) } }), ue.each({ parent: function(e) { var t = e.parentNode; return t && 11 !== t.nodeType ? t : null }, parents: function(e) { return he(e, "parentNode") }, parentsUntil: function(e, t, n) { return he(e, "parentNode", n) }, next: function(e) { return u(e, "nextSibling") }, prev: function(e) { return u(e, "previousSibling") }, nextAll: function(e) { return he(e, "nextSibling") }, prevAll: function(e) { return he(e, "previousSibling") }, nextUntil: function(e, t, n) { return he(e, "nextSibling", n) }, prevUntil: function(e, t, n) { return he(e, "previousSibling", n) }, siblings: function(e) { return me((e.parentNode || {}).firstChild, e) }, children: function(e) { return me(e.firstChild) }, contents: function(e) { return e.contentDocument || ue.merge([], e.childNodes) } }, function(e, t) { ue.fn[e] = function(n, o) { var r = ue.map(this, t, n); return "Until" !== e.slice(-5) && (o = n), o && "string" == typeof o && (r = ue.filter(o, r)), this.length > 1 && (xe[e] || ue.uniqueSort(r), _e.test(e) && r.reverse()), this.pushStack(r) } }); var we = /\S+/g;
			ue.Callbacks = function(e) { e = "string" == typeof e ? l(e) : ue.extend({}, e); var t, n, o, r, s = [],
					i = [],
					a = -1,
					u = function() { for(r = e.once, o = t = !0; i.length; a = -1)
							for(n = i.shift(); ++a < s.length;) !1 === s[a].apply(n[0], n[1]) && e.stopOnFalse && (a = s.length, n = !1);
						e.memory || (n = !1), t = !1, r && (s = n ? [] : "") },
					d = { add: function() { return s && (n && !t && (a = s.length - 1, i.push(n)), function t(n) { ue.each(n, function(n, o) { ue.isFunction(o) ? e.unique && d.has(o) || s.push(o) : o && o.length && "string" !== ue.type(o) && t(o) }) }(arguments), n && !t && u()), this }, remove: function() { return ue.each(arguments, function(e, t) { for(var n;
									(n = ue.inArray(t, s, n)) > -1;) s.splice(n, 1), n <= a && a-- }), this }, has: function(e) { return e ? ue.inArray(e, s) > -1 : s.length > 0 }, empty: function() { return s && (s = []), this }, disable: function() { return r = i = [], s = n = "", this }, disabled: function() { return !s }, lock: function() { return r = i = [], n || (s = n = ""), this }, locked: function() { return !!r }, fireWith: function(e, n) { return r || (n = n || [], n = [e, n.slice ? n.slice() : n], i.push(n), t || u()), this }, fire: function() { return d.fireWith(this, arguments), this }, fired: function() { return !!o } }; return d }, ue.extend({ Deferred: function(e) { var t = [
							["resolve", "done", ue.Callbacks("once memory"), "resolved"],
							["reject", "fail", ue.Callbacks("once memory"), "rejected"],
							["notify", "progress", ue.Callbacks("memory")]
						],
						n = "pending",
						o = { state: function() { return n }, always: function() { return r.done(arguments).fail(arguments), this }, then: function() { var e = arguments; return ue.Deferred(function(n) { ue.each(t, function(t, s) { var i = ue.isFunction(e[t]) && e[t];
										r[s[1]](function() { var e = i && i.apply(this, arguments);
											e && ue.isFunction(e.promise) ? e.promise().progress(n.notify).done(n.resolve).fail(n.reject) : n[s[0] + "With"](this === o ? n.promise() : this, i ? [e] : arguments) }) }), e = null }).promise() }, promise: function(e) { return null != e ? ue.extend(e, o) : o } },
						r = {}; return o.pipe = o.then, ue.each(t, function(e, s) { var i = s[2],
							a = s[3];
						o[s[1]] = i.add, a && i.add(function() { n = a }, t[1 ^ e][2].disable, t[2][2].lock), r[s[0]] = function() { return r[s[0] + "With"](this === r ? o : this, arguments), this }, r[s[0] + "With"] = i.fireWith }), o.promise(r), e && e.call(r, r), r }, when: function(e) { var t, n, o, r = 0,
						s = ee.call(arguments),
						i = s.length,
						a = 1 !== i || e && ue.isFunction(e.promise) ? i : 0,
						u = 1 === a ? e : ue.Deferred(),
						l = function(e, n, o) { return function(r) { n[e] = this, o[e] = arguments.length > 1 ? ee.call(arguments) : r, o === t ? u.notifyWith(n, o) : --a || u.resolveWith(n, o) } }; if(i > 1)
						for(t = new Array(i), n = new Array(i), o = new Array(i); r < i; r++) s[r] && ue.isFunction(s[r].promise) ? s[r].promise().progress(l(r, n, t)).done(l(r, o, s)).fail(u.reject) : --a; return a || u.resolveWith(o, s), u.promise() } }); var Ce;
			ue.fn.ready = function(e) { return ue.ready.promise().done(e), this }, ue.extend({ isReady: !1, readyWait: 1, holdReady: function(e) { e ? ue.readyWait++ : ue.ready(!0) }, ready: function(e) {
					(!0 === e ? --ue.readyWait : ue.isReady) || (ue.isReady = !0, !0 !== e && --ue.readyWait > 0 || (Ce.resolveWith(Z, [ue]), ue.fn.triggerHandler && (ue(Z).triggerHandler("ready"), ue(Z).off("ready")))) } }), ue.ready.promise = function(e) { return Ce || (Ce = ue.Deferred(), "complete" === Z.readyState || "loading" !== Z.readyState && !Z.documentElement.doScroll ? n.setTimeout(ue.ready) : (Z.addEventListener("DOMContentLoaded", d), n.addEventListener("load", d))), Ce.promise(e) }, ue.ready.promise(); var Te = function(e, t, n, o, r, s, i) { var a = 0,
						u = e.length,
						l = null == n; if("object" === ue.type(n)) { r = !0; for(a in n) Te(e, t, a, n[a], !0, s, i) } else if(void 0 !== o && (r = !0, ue.isFunction(o) || (i = !0), l && (i ? (t.call(e, o), t = null) : (l = t, t = function(e, t, n) { return l.call(ue(e), n) })), t))
						for(; a < u; a++) t(e[a], n, i ? o : o.call(e[a], a, t(e[a], n))); return r ? e : l ? t.call(e) : u ? t(e[0], n) : s },
				Se = function(e) { return 1 === e.nodeType || 9 === e.nodeType || !+e.nodeType };
			c.uid = 1, c.prototype = { register: function(e, t) { var n = t || {}; return e.nodeType ? e[this.expando] = n : Object.defineProperty(e, this.expando, { value: n, writable: !0, configurable: !0 }), e[this.expando] }, cache: function(e) { if(!Se(e)) return {}; var t = e[this.expando]; return t || (t = {}, Se(e) && (e.nodeType ? e[this.expando] = t : Object.defineProperty(e, this.expando, { value: t, configurable: !0 }))), t }, set: function(e, t, n) { var o, r = this.cache(e); if("string" == typeof t) r[t] = n;
					else
						for(o in t) r[o] = t[o]; return r }, get: function(e, t) { return void 0 === t ? this.cache(e) : e[this.expando] && e[this.expando][t] }, access: function(e, t, n) { var o; return void 0 === t || t && "string" == typeof t && void 0 === n ? (o = this.get(e, t), void 0 !== o ? o : this.get(e, ue.camelCase(t))) : (this.set(e, t, n), void 0 !== n ? n : t) }, remove: function(e, t) { var n, o, r, s = e[this.expando]; if(void 0 !== s) { if(void 0 === t) this.register(e);
						else { ue.isArray(t) ? o = t.concat(t.map(ue.camelCase)) : (r = ue.camelCase(t), t in s ? o = [t, r] : (o = r, o = o in s ? [o] : o.match(we) || [])), n = o.length; for(; n--;) delete s[o[n]] }(void 0 === t || ue.isEmptyObject(s)) && (e.nodeType ? e[this.expando] = void 0 : delete e[this.expando]) } }, hasData: function(e) { var t = e[this.expando]; return void 0 !== t && !ue.isEmptyObject(t) } }; var ke = new c,
				Ee = new c,
				$e = /^(?:\{[\w\W]*\}|\[[\w\W]*\])$/,
				Ae = /[A-Z]/g;
			ue.extend({ hasData: function(e) { return Ee.hasData(e) || ke.hasData(e) }, data: function(e, t, n) { return Ee.access(e, t, n) }, removeData: function(e, t) { Ee.remove(e, t) }, _data: function(e, t, n) { return ke.access(e, t, n) }, _removeData: function(e, t) { ke.remove(e, t) } }), ue.fn.extend({ data: function(e, t) { var n, o, r, s = this[0],
						i = s && s.attributes; if(void 0 === e) { if(this.length && (r = Ee.get(s), 1 === s.nodeType && !ke.get(s, "hasDataAttrs"))) { for(n = i.length; n--;) i[n] && (o = i[n].name, 0 === o.indexOf("data-") && (o = ue.camelCase(o.slice(5)), f(s, o, r[o])));
							ke.set(s, "hasDataAttrs", !0) } return r } return "object" == typeof e ? this.each(function() { Ee.set(this, e) }) : Te(this, function(t) { var n, o; if(s && void 0 === t) { if(void 0 !== (n = Ee.get(s, e) || Ee.get(s, e.replace(Ae, "-$&").toLowerCase()))) return n; if(o = ue.camelCase(e), void 0 !== (n = Ee.get(s, o))) return n; if(void 0 !== (n = f(s, o, void 0))) return n } else o = ue.camelCase(e), this.each(function() { var n = Ee.get(this, o);
							Ee.set(this, o, t), e.indexOf("-") > -1 && void 0 !== n && Ee.set(this, e, t) }) }, null, t, arguments.length > 1, null, !0) }, removeData: function(e) { return this.each(function() { Ee.remove(this, e) }) } }), ue.extend({ queue: function(e, t, n) { var o; if(e) return t = (t || "fx") + "queue", o = ke.get(e, t), n && (!o || ue.isArray(n) ? o = ke.access(e, t, ue.makeArray(n)) : o.push(n)), o || [] }, dequeue: function(e, t) { t = t || "fx"; var n = ue.queue(e, t),
						o = n.length,
						r = n.shift(),
						s = ue._queueHooks(e, t),
						i = function() { ue.dequeue(e, t) }; "inprogress" === r && (r = n.shift(), o--), r && ("fx" === t && n.unshift("inprogress"), delete s.stop, r.call(e, i, s)), !o && s && s.empty.fire() }, _queueHooks: function(e, t) { var n = t + "queueHooks"; return ke.get(e, n) || ke.access(e, n, { empty: ue.Callbacks("once memory").add(function() { ke.remove(e, [t + "queue", n]) }) }) } }), ue.fn.extend({ queue: function(e, t) { var n = 2; return "string" != typeof e && (t = e, e = "fx", n--), arguments.length < n ? ue.queue(this[0], e) : void 0 === t ? this : this.each(function() { var n = ue.queue(this, e, t);
						ue._queueHooks(this, e), "fx" === e && "inprogress" !== n[0] && ue.dequeue(this, e) }) }, dequeue: function(e) { return this.each(function() { ue.dequeue(this, e) }) }, clearQueue: function(e) { return this.queue(e || "fx", []) }, promise: function(e, t) { var n, o = 1,
						r = ue.Deferred(),
						s = this,
						i = this.length,
						a = function() {--o || r.resolveWith(s, [s]) }; for("string" != typeof e && (t = e, e = void 0), e = e || "fx"; i--;)(n = ke.get(s[i], e + "queueHooks")) && n.empty && (o++, n.empty.add(a)); return a(), r.promise(t) } }); var Ne = /[+-]?(?:\d*\.|)\d+(?:[eE][+-]?\d+|)/.source,
				Le = new RegExp("^(?:([+-])=|)(" + Ne + ")([a-z%]*)$", "i"),
				De = ["Top", "Right", "Bottom", "Left"],
				Re = function(e, t) { return e = t || e, "none" === ue.css(e, "display") || !ue.contains(e.ownerDocument, e) },
				Oe = /^(?:checkbox|radio)$/i,
				qe = /<([\w:-]+)/,
				Me = /^$|\/(?:java|ecma)script/i,
				Pe = { option: [1, "<select multiple='multiple'>", "</select>"], thead: [1, "<table>", "</table>"], col: [2, "<table><colgroup>", "</colgroup></table>"], tr: [2, "<table><tbody>", "</tbody></table>"], td: [3, "<table><tbody><tr>", "</tr></tbody></table>"], _default: [0, "", ""] };
			Pe.optgroup = Pe.option, Pe.tbody = Pe.tfoot = Pe.colgroup = Pe.caption = Pe.thead, Pe.th = Pe.td; var Fe = /<|&#?\w+;/;! function() { var e = Z.createDocumentFragment(),
					t = e.appendChild(Z.createElement("div")),
					n = Z.createElement("input");
				n.setAttribute("type", "radio"), n.setAttribute("checked", "checked"), n.setAttribute("name", "t"), t.appendChild(n), ae.checkClone = t.cloneNode(!0).cloneNode(!0).lastChild.checked, t.innerHTML = "<textarea>x</textarea>", ae.noCloneChecked = !!t.cloneNode(!0).lastChild.defaultValue }(); var He = /^key/,
				Ie = /^(?:mouse|pointer|contextmenu|drag|drop)|click/,
				Be = /^([^.]*)(?:\.(.+)|)/;
			ue.event = { global: {}, add: function(e, t, n, o, r) { var s, i, a, u, l, d, c, f, p, h, m, b = ke.get(e); if(b)
						for(n.handler && (s = n, n = s.handler, r = s.selector), n.guid || (n.guid = ue.guid++), (u = b.events) || (u = b.events = {}), (i = b.handle) || (i = b.handle = function(t) { return void 0 !== ue && ue.event.triggered !== t.type ? ue.event.dispatch.apply(e, arguments) : void 0 }), t = (t || "").match(we) || [""], l = t.length; l--;) a = Be.exec(t[l]) || [], p = m = a[1], h = (a[2] || "").split(".").sort(), p && (c = ue.event.special[p] || {}, p = (r ? c.delegateType : c.bindType) || p, c = ue.event.special[p] || {}, d = ue.extend({ type: p, origType: m, data: o, handler: n, guid: n.guid, selector: r, needsContext: r && ue.expr.match.needsContext.test(r), namespace: h.join(".") }, s), (f = u[p]) || (f = u[p] = [], f.delegateCount = 0, c.setup && !1 !== c.setup.call(e, o, h, i) || e.addEventListener && e.addEventListener(p, i)), c.add && (c.add.call(e, d), d.handler.guid || (d.handler.guid = n.guid)), r ? f.splice(f.delegateCount++, 0, d) : f.push(d), ue.event.global[p] = !0) }, remove: function(e, t, n, o, r) { var s, i, a, u, l, d, c, f, p, h, m, b = ke.hasData(e) && ke.get(e); if(b && (u = b.events)) { for(t = (t || "").match(we) || [""], l = t.length; l--;)
							if(a = Be.exec(t[l]) || [], p = m = a[1], h = (a[2] || "").split(".").sort(), p) { for(c = ue.event.special[p] || {}, p = (o ? c.delegateType : c.bindType) || p, f = u[p] || [], a = a[2] && new RegExp("(^|\\.)" + h.join("\\.(?:.*\\.|)") + "(\\.|$)"), i = s = f.length; s--;) d = f[s], !r && m !== d.origType || n && n.guid !== d.guid || a && !a.test(d.namespace) || o && o !== d.selector && ("**" !== o || !d.selector) || (f.splice(s, 1), d.selector && f.delegateCount--, c.remove && c.remove.call(e, d));
								i && !f.length && (c.teardown && !1 !== c.teardown.call(e, h, b.handle) || ue.removeEvent(e, p, b.handle), delete u[p]) } else
								for(p in u) ue.event.remove(e, p + t[l], n, o, !0);
						ue.isEmptyObject(u) && ke.remove(e, "handle events") } }, dispatch: function(e) { e = ue.event.fix(e); var t, n, o, r, s, i = [],
						a = ee.call(arguments),
						u = (ke.get(this, "events") || {})[e.type] || [],
						l = ue.event.special[e.type] || {}; if(a[0] = e, e.delegateTarget = this, !l.preDispatch || !1 !== l.preDispatch.call(this, e)) { for(i = ue.event.handlers.call(this, e, u), t = 0;
							(r = i[t++]) && !e.isPropagationStopped();)
							for(e.currentTarget = r.elem, n = 0;
								(s = r.handlers[n++]) && !e.isImmediatePropagationStopped();) e.rnamespace && !e.rnamespace.test(s.namespace) || (e.handleObj = s, e.data = s.data, void 0 !== (o = ((ue.event.special[s.origType] || {}).handle || s.handler).apply(r.elem, a)) && !1 === (e.result = o) && (e.preventDefault(), e.stopPropagation())); return l.postDispatch && l.postDispatch.call(this, e), e.result } }, handlers: function(e, t) { var n, o, r, s, i = [],
						a = t.delegateCount,
						u = e.target; if(a && u.nodeType && ("click" !== e.type || isNaN(e.button) || e.button < 1))
						for(; u !== this; u = u.parentNode || this)
							if(1 === u.nodeType && (!0 !== u.disabled || "click" !== e.type)) { for(o = [], n = 0; n < a; n++) s = t[n], r = s.selector + " ", void 0 === o[r] && (o[r] = s.needsContext ? ue(r, this).index(u) > -1 : ue.find(r, this, null, [u]).length), o[r] && o.push(s);
								o.length && i.push({ elem: u, handlers: o }) }
					return a < t.length && i.push({ elem: this, handlers: t.slice(a) }), i }, props: "altKey bubbles cancelable ctrlKey currentTarget detail eventPhase metaKey relatedTarget shiftKey target timeStamp view which".split(" "), fixHooks: {}, keyHooks: { props: "char charCode key keyCode".split(" "), filter: function(e, t) { return null == e.which && (e.which = null != t.charCode ? t.charCode : t.keyCode), e } }, mouseHooks: { props: "button buttons clientX clientY offsetX offsetY pageX pageY screenX screenY toElement".split(" "), filter: function(e, t) { var n, o, r, s = t.button; return null == e.pageX && null != t.clientX && (n = e.target.ownerDocument || Z, o = n.documentElement, r = n.body, e.pageX = t.clientX + (o && o.scrollLeft || r && r.scrollLeft || 0) - (o && o.clientLeft || r && r.clientLeft || 0), e.pageY = t.clientY + (o && o.scrollTop || r && r.scrollTop || 0) - (o && o.clientTop || r && r.clientTop || 0)), e.which || void 0 === s || (e.which = 1 & s ? 1 : 2 & s ? 3 : 4 & s ? 2 : 0), e } }, fix: function(e) { if(e[ue.expando]) return e; var t, n, o, r = e.type,
						s = e,
						i = this.fixHooks[r]; for(i || (this.fixHooks[r] = i = Ie.test(r) ? this.mouseHooks : He.test(r) ? this.keyHooks : {}), o = i.props ? this.props.concat(i.props) : this.props, e = new ue.Event(s), t = o.length; t--;) n = o[t], e[n] = s[n]; return e.target || (e.target = Z), 3 === e.target.nodeType && (e.target = e.target.parentNode), i.filter ? i.filter(e, s) : e }, special: { load: { noBubble: !0 }, focus: { trigger: function() { if(this !== v() && this.focus) return this.focus(), !1 }, delegateType: "focusin" }, blur: { trigger: function() { if(this === v() && this.blur) return this.blur(), !1 }, delegateType: "focusout" }, click: { trigger: function() { if("checkbox" === this.type && this.click && ue.nodeName(this, "input")) return this.click(), !1 }, _default: function(e) { return ue.nodeName(e.target, "a") } }, beforeunload: { postDispatch: function(e) { void 0 !== e.result && e.originalEvent && (e.originalEvent.returnValue = e.result) } } } }, ue.removeEvent = function(e, t, n) { e.removeEventListener && e.removeEventListener(t, n) }, ue.Event = function(e, t) { if(!(this instanceof ue.Event)) return new ue.Event(e, t);
				e && e.type ? (this.originalEvent = e, this.type = e.type, this.isDefaultPrevented = e.defaultPrevented || void 0 === e.defaultPrevented && !1 === e.returnValue ? y : g) : this.type = e, t && ue.extend(this, t), this.timeStamp = e && e.timeStamp || ue.now(), this[ue.expando] = !0 }, ue.Event.prototype = { constructor: ue.Event, isDefaultPrevented: g, isPropagationStopped: g, isImmediatePropagationStopped: g, preventDefault: function() { var e = this.originalEvent;
					this.isDefaultPrevented = y, e && e.preventDefault() }, stopPropagation: function() { var e = this.originalEvent;
					this.isPropagationStopped = y, e && e.stopPropagation() }, stopImmediatePropagation: function() { var e = this.originalEvent;
					this.isImmediatePropagationStopped = y, e && e.stopImmediatePropagation(), this.stopPropagation() } }, ue.each({ mouseenter: "mouseover", mouseleave: "mouseout", pointerenter: "pointerover", pointerleave: "pointerout" }, function(e, t) { ue.event.special[e] = { delegateType: t, bindType: t, handle: function(e) { var n, o = this,
							r = e.relatedTarget,
							s = e.handleObj; return r && (r === o || ue.contains(o, r)) || (e.type = s.origType, n = s.handler.apply(this, arguments), e.type = t), n } } }), ue.fn.extend({ on: function(e, t, n, o) { return j(this, e, t, n, o) }, one: function(e, t, n, o) { return j(this, e, t, n, o, 1) }, off: function(e, t, n) { var o, r; if(e && e.preventDefault && e.handleObj) return o = e.handleObj, ue(e.delegateTarget).off(o.namespace ? o.origType + "." + o.namespace : o.origType, o.selector, o.handler), this; if("object" == typeof e) { for(r in e) this.off(r, t, e[r]); return this } return !1 !== t && "function" != typeof t || (n = t, t = void 0), !1 === n && (n = g), this.each(function() { ue.event.remove(this, e, n, t) }) } }); var We = /<(?!area|br|col|embed|hr|img|input|link|meta|param)(([\w:-]+)[^>]*)\/>/gi,
				Ue = /<script|<style|<link/i,
				ze = /checked\s*(?:[^=]|=\s*.checked.)/i,
				Xe = /^true\/(.*)/,
				Ve = /^\s*<!(?:\[CDATA\[|--)|(?:\]\]|--)>\s*$/g;
			ue.extend({ htmlPrefilter: function(e) { return e.replace(We, "<$1></$2>") }, clone: function(e, t, n) { var o, r, s, i, a = e.cloneNode(!0),
						u = ue.contains(e.ownerDocument, e); if(!(ae.noCloneChecked || 1 !== e.nodeType && 11 !== e.nodeType || ue.isXMLDoc(e)))
						for(i = h(a), s = h(e), o = 0, r = s.length; o < r; o++) T(s[o], i[o]); if(t)
						if(n)
							for(s = s || h(e), i = i || h(a), o = 0, r = s.length; o < r; o++) C(s[o], i[o]);
						else C(e, a); return i = h(a, "script"), i.length > 0 && m(i, !u && h(e, "script")), a }, cleanData: function(e) { for(var t, n, o, r = ue.event.special, s = 0; void 0 !== (n = e[s]); s++)
						if(Se(n)) { if(t = n[ke.expando]) { if(t.events)
									for(o in t.events) r[o] ? ue.event.remove(n, o) : ue.removeEvent(n, o, t.handle);
								n[ke.expando] = void 0 } n[Ee.expando] && (n[Ee.expando] = void 0) } } }), ue.fn.extend({ domManip: S, detach: function(e) { return k(this, e, !0) }, remove: function(e) { return k(this, e) }, text: function(e) { return Te(this, function(e) { return void 0 === e ? ue.text(this) : this.empty().each(function() { 1 !== this.nodeType && 11 !== this.nodeType && 9 !== this.nodeType || (this.textContent = e) }) }, null, e, arguments.length) }, append: function() { return S(this, arguments, function(e) { if(1 === this.nodeType || 11 === this.nodeType || 9 === this.nodeType) { _(this, e).appendChild(e) } }) }, prepend: function() { return S(this, arguments, function(e) { if(1 === this.nodeType || 11 === this.nodeType || 9 === this.nodeType) { var t = _(this, e);
							t.insertBefore(e, t.firstChild) } }) }, before: function() { return S(this, arguments, function(e) { this.parentNode && this.parentNode.insertBefore(e, this) }) }, after: function() { return S(this, arguments, function(e) { this.parentNode && this.parentNode.insertBefore(e, this.nextSibling) }) }, empty: function() { for(var e, t = 0; null != (e = this[t]); t++) 1 === e.nodeType && (ue.cleanData(h(e, !1)), e.textContent = ""); return this }, clone: function(e, t) { return e = null != e && e, t = null == t ? e : t, this.map(function() { return ue.clone(this, e, t) }) }, html: function(e) { return Te(this, function(e) { var t = this[0] || {},
							n = 0,
							o = this.length; if(void 0 === e && 1 === t.nodeType) return t.innerHTML; if("string" == typeof e && !Ue.test(e) && !Pe[(qe.exec(e) || ["", ""])[1].toLowerCase()]) { e = ue.htmlPrefilter(e); try { for(; n < o; n++) t = this[n] || {}, 1 === t.nodeType && (ue.cleanData(h(t, !1)), t.innerHTML = e);
								t = 0 } catch(e) {} } t && this.empty().append(e) }, null, e, arguments.length) }, replaceWith: function() { var e = []; return S(this, arguments, function(t) { var n = this.parentNode;
						ue.inArray(this, e) < 0 && (ue.cleanData(h(this)), n && n.replaceChild(t, this)) }, e) } }), ue.each({ appendTo: "append", prependTo: "prepend", insertBefore: "before", insertAfter: "after", replaceAll: "replaceWith" }, function(e, t) { ue.fn[e] = function(e) { for(var n, o = [], r = ue(e), s = r.length - 1, i = 0; i <= s; i++) n = i === s ? this : this.clone(!0), ue(r[i])[t](n), ne.apply(o, n.get()); return this.pushStack(o) } }); var Je, Ge = { HTML: "block", BODY: "block" },
				Ye = /^margin/,
				Ke = new RegExp("^(" + Ne + ")(?!px)[a-z%]+$", "i"),
				Qe = function(e) { var t = e.ownerDocument.defaultView; return t && t.opener || (t = n), t.getComputedStyle(e) },
				Ze = function(e, t, n, o) { var r, s, i = {}; for(s in t) i[s] = e.style[s], e.style[s] = t[s];
					r = n.apply(e, o || []); for(s in t) e.style[s] = i[s]; return r },
				et = Z.documentElement;! function() {
				function e() { a.style.cssText = "-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;position:relative;display:block;margin:auto;border:1px;padding:1px;top:1%;width:50%", a.innerHTML = "", et.appendChild(i); var e = n.getComputedStyle(a);
					t = "1%" !== e.top, s = "2px" === e.marginLeft, o = "4px" === e.width, a.style.marginRight = "50%", r = "4px" === e.marginRight, et.removeChild(i) } var t, o, r, s, i = Z.createElement("div"),
					a = Z.createElement("div");
				a.style && (a.style.backgroundClip = "content-box", a.cloneNode(!0).style.backgroundClip = "", ae.clearCloneStyle = "content-box" === a.style.backgroundClip, i.style.cssText = "border:0;width:8px;height:0;top:0;left:-9999px;padding:0;margin-top:1px;position:absolute", i.appendChild(a), ue.extend(ae, { pixelPosition: function() { return e(), t }, boxSizingReliable: function() { return null == o && e(), o }, pixelMarginRight: function() { return null == o && e(), r }, reliableMarginLeft: function() { return null == o && e(), s }, reliableMarginRight: function() { var e, t = a.appendChild(Z.createElement("div")); return t.style.cssText = a.style.cssText = "-webkit-box-sizing:content-box;box-sizing:content-box;display:block;margin:0;border:0;padding:0", t.style.marginRight = t.style.width = "0", a.style.width = "1px", et.appendChild(i), e = !parseFloat(n.getComputedStyle(t).marginRight), et.removeChild(i), a.removeChild(t), e } })) }(); var tt = /^(none|table(?!-c[ea]).+)/,
				nt = { position: "absolute", visibility: "hidden", display: "block" },
				ot = { letterSpacing: "0", fontWeight: "400" },
				rt = ["Webkit", "O", "Moz", "ms"],
				st = Z.createElement("div").style;
			ue.extend({ cssHooks: { opacity: { get: function(e, t) { if(t) { var n = A(e, "opacity"); return "" === n ? "1" : n } } } }, cssNumber: { animationIterationCount: !0, columnCount: !0, fillOpacity: !0, flexGrow: !0, flexShrink: !0, fontWeight: !0, lineHeight: !0, opacity: !0, order: !0, orphans: !0, widows: !0, zIndex: !0, zoom: !0 }, cssProps: { float: "cssFloat" }, style: function(e, t, n, o) { if(e && 3 !== e.nodeType && 8 !== e.nodeType && e.style) { var r, s, i, a = ue.camelCase(t),
							u = e.style; if(t = ue.cssProps[a] || (ue.cssProps[a] = L(a) || a), i = ue.cssHooks[t] || ue.cssHooks[a], void 0 === n) return i && "get" in i && void 0 !== (r = i.get(e, !1, o)) ? r : u[t];
						s = typeof n, "string" === s && (r = Le.exec(n)) && r[1] && (n = p(e, t, r), s = "number"), null != n && n === n && ("number" === s && (n += r && r[3] || (ue.cssNumber[a] ? "" : "px")), ae.clearCloneStyle || "" !== n || 0 !== t.indexOf("background") || (u[t] = "inherit"), i && "set" in i && void 0 === (n = i.set(e, n, o)) || (u[t] = n)) } }, css: function(e, t, n, o) { var r, s, i, a = ue.camelCase(t); return t = ue.cssProps[a] || (ue.cssProps[a] = L(a) || a), i = ue.cssHooks[t] || ue.cssHooks[a], i && "get" in i && (r = i.get(e, !0, n)), void 0 === r && (r = A(e, t, o)), "normal" === r && t in ot && (r = ot[t]), "" === n || n ? (s = parseFloat(r), !0 === n || isFinite(s) ? s || 0 : r) : r } }), ue.each(["height", "width"], function(e, t) { ue.cssHooks[t] = { get: function(e, n, o) { if(n) return tt.test(ue.css(e, "display")) && 0 === e.offsetWidth ? Ze(e, nt, function() { return O(e, t, o) }) : O(e, t, o) }, set: function(e, n, o) { var r, s = o && Qe(e),
							i = o && R(e, t, o, "border-box" === ue.css(e, "boxSizing", !1, s), s); return i && (r = Le.exec(n)) && "px" !== (r[3] || "px") && (e.style[t] = n, n = ue.css(e, t)), D(e, n, i) } } }), ue.cssHooks.marginLeft = N(ae.reliableMarginLeft, function(e, t) { if(t) return(parseFloat(A(e, "marginLeft")) || e.getBoundingClientRect().left - Ze(e, { marginLeft: 0 }, function() { return e.getBoundingClientRect().left })) + "px" }), ue.cssHooks.marginRight = N(ae.reliableMarginRight, function(e, t) { if(t) return Ze(e, { display: "inline-block" }, A, [e, "marginRight"]) }), ue.each({ margin: "", padding: "", border: "Width" }, function(e, t) { ue.cssHooks[e + t] = { expand: function(n) { for(var o = 0, r = {}, s = "string" == typeof n ? n.split(" ") : [n]; o < 4; o++) r[e + De[o] + t] = s[o] || s[o - 2] || s[0]; return r } }, Ye.test(e) || (ue.cssHooks[e + t].set = D) }), ue.fn.extend({ css: function(e, t) { return Te(this, function(e, t, n) { var o, r, s = {},
							i = 0; if(ue.isArray(t)) { for(o = Qe(e), r = t.length; i < r; i++) s[t[i]] = ue.css(e, t[i], !1, o); return s } return void 0 !== n ? ue.style(e, t, n) : ue.css(e, t) }, e, t, arguments.length > 1) }, show: function() { return q(this, !0) }, hide: function() { return q(this) }, toggle: function(e) { return "boolean" == typeof e ? e ? this.show() : this.hide() : this.each(function() { Re(this) ? ue(this).show() : ue(this).hide() }) } }), ue.Tween = M, M.prototype = { constructor: M, init: function(e, t, n, o, r, s) { this.elem = e, this.prop = n, this.easing = r || ue.easing._default, this.options = t, this.start = this.now = this.cur(), this.end = o, this.unit = s || (ue.cssNumber[n] ? "" : "px") }, cur: function() { var e = M.propHooks[this.prop]; return e && e.get ? e.get(this) : M.propHooks._default.get(this) }, run: function(e) { var t, n = M.propHooks[this.prop]; return this.options.duration ? this.pos = t = ue.easing[this.easing](e, this.options.duration * e, 0, 1, this.options.duration) : this.pos = t = e, this.now = (this.end - this.start) * t + this.start, this.options.step && this.options.step.call(this.elem, this.now, this), n && n.set ? n.set(this) : M.propHooks._default.set(this), this } }, M.prototype.init.prototype = M.prototype, M.propHooks = { _default: { get: function(e) { var t; return 1 !== e.elem.nodeType || null != e.elem[e.prop] && null == e.elem.style[e.prop] ? e.elem[e.prop] : (t = ue.css(e.elem, e.prop, ""), t && "auto" !== t ? t : 0) }, set: function(e) { ue.fx.step[e.prop] ? ue.fx.step[e.prop](e) : 1 !== e.elem.nodeType || null == e.elem.style[ue.cssProps[e.prop]] && !ue.cssHooks[e.prop] ? e.elem[e.prop] = e.now : ue.style(e.elem, e.prop, e.now + e.unit) } } }, M.propHooks.scrollTop = M.propHooks.scrollLeft = { set: function(e) { e.elem.nodeType && e.elem.parentNode && (e.elem[e.prop] = e.now) } }, ue.easing = { linear: function(e) { return e }, swing: function(e) { return .5 - Math.cos(e * Math.PI) / 2 }, _default: "swing" }, ue.fx = M.prototype.init, ue.fx.step = {}; var it, at, ut = /^(?:toggle|show|hide)$/,
				lt = /queueHooks$/;
			ue.Animation = ue.extend(W, { tweeners: { "*": [function(e, t) { var n = this.createTween(e, t); return p(n.elem, e, Le.exec(t), n), n }] }, tweener: function(e, t) { ue.isFunction(e) ? (t = e, e = ["*"]) : e = e.match(we); for(var n, o = 0, r = e.length; o < r; o++) n = e[o], W.tweeners[n] = W.tweeners[n] || [], W.tweeners[n].unshift(t) }, prefilters: [I], prefilter: function(e, t) { t ? W.prefilters.unshift(e) : W.prefilters.push(e) } }), ue.speed = function(e, t, n) { var o = e && "object" == typeof e ? ue.extend({}, e) : { complete: n || !n && t || ue.isFunction(e) && e, duration: e, easing: n && t || t && !ue.isFunction(t) && t }; return o.duration = ue.fx.off ? 0 : "number" == typeof o.duration ? o.duration : o.duration in ue.fx.speeds ? ue.fx.speeds[o.duration] : ue.fx.speeds._default, null != o.queue && !0 !== o.queue || (o.queue = "fx"), o.old = o.complete, o.complete = function() { ue.isFunction(o.old) && o.old.call(this), o.queue && ue.dequeue(this, o.queue) }, o }, ue.fn.extend({ fadeTo: function(e, t, n, o) { return this.filter(Re).css("opacity", 0).show().end().animate({ opacity: t }, e, n, o) }, animate: function(e, t, n, o) { var r = ue.isEmptyObject(e),
							s = ue.speed(t, n, o),
							i = function() { var t = W(this, ue.extend({}, e), s);
								(r || ke.get(this, "finish")) && t.stop(!0) }; return i.finish = i, r || !1 === s.queue ? this.each(i) : this.queue(s.queue, i) }, stop: function(e, t, n) { var o = function(e) { var t = e.stop;
							delete e.stop, t(n) }; return "string" != typeof e && (n = t, t = e, e = void 0), t && !1 !== e && this.queue(e || "fx", []), this.each(function() { var t = !0,
								r = null != e && e + "queueHooks",
								s = ue.timers,
								i = ke.get(this); if(r) i[r] && i[r].stop && o(i[r]);
							else
								for(r in i) i[r] && i[r].stop && lt.test(r) && o(i[r]); for(r = s.length; r--;) s[r].elem !== this || null != e && s[r].queue !== e || (s[r].anim.stop(n), t = !1, s.splice(r, 1));!t && n || ue.dequeue(this, e) }) }, finish: function(e) { return !1 !== e && (e = e || "fx"), this.each(function() { var t, n = ke.get(this),
								o = n[e + "queue"],
								r = n[e + "queueHooks"],
								s = ue.timers,
								i = o ? o.length : 0; for(n.finish = !0, ue.queue(this, e, []), r && r.stop && r.stop.call(this, !0), t = s.length; t--;) s[t].elem === this && s[t].queue === e && (s[t].anim.stop(!0), s.splice(t, 1)); for(t = 0; t < i; t++) o[t] && o[t].finish && o[t].finish.call(this);
							delete n.finish }) } }), ue.each(["toggle", "show", "hide"], function(e, t) { var n = ue.fn[t];
					ue.fn[t] = function(e, o, r) { return null == e || "boolean" == typeof e ? n.apply(this, arguments) : this.animate(F(t, !0), e, o, r) } }), ue.each({ slideDown: F("show"), slideUp: F("hide"), slideToggle: F("toggle"), fadeIn: { opacity: "show" }, fadeOut: { opacity: "hide" }, fadeToggle: { opacity: "toggle" } }, function(e, t) { ue.fn[e] = function(e, n, o) { return this.animate(t, e, n, o) } }), ue.timers = [], ue.fx.tick = function() { var e, t = 0,
						n = ue.timers; for(it = ue.now(); t < n.length; t++)(e = n[t])() || n[t] !== e || n.splice(t--, 1);
					n.length || ue.fx.stop(), it = void 0 }, ue.fx.timer = function(e) { ue.timers.push(e), e() ? ue.fx.start() : ue.timers.pop() }, ue.fx.interval = 13, ue.fx.start = function() { at || (at = n.setInterval(ue.fx.tick, ue.fx.interval)) }, ue.fx.stop = function() { n.clearInterval(at), at = null }, ue.fx.speeds = { slow: 600, fast: 200, _default: 400 }, ue.fn.delay = function(e, t) { return e = ue.fx ? ue.fx.speeds[e] || e : e, t = t || "fx", this.queue(t, function(t, o) { var r = n.setTimeout(t, e);
						o.stop = function() { n.clearTimeout(r) } }) },
				function() { var e = Z.createElement("input"),
						t = Z.createElement("select"),
						n = t.appendChild(Z.createElement("option"));
					e.type = "checkbox", ae.checkOn = "" !== e.value, ae.optSelected = n.selected, t.disabled = !0, ae.optDisabled = !n.disabled, e = Z.createElement("input"), e.value = "t", e.type = "radio", ae.radioValue = "t" === e.value }(); var dt, ct = ue.expr.attrHandle;
			ue.fn.extend({ attr: function(e, t) { return Te(this, ue.attr, e, t, arguments.length > 1) }, removeAttr: function(e) { return this.each(function() { ue.removeAttr(this, e) }) } }), ue.extend({ attr: function(e, t, n) { var o, r, s = e.nodeType; if(3 !== s && 8 !== s && 2 !== s) return void 0 === e.getAttribute ? ue.prop(e, t, n) : (1 === s && ue.isXMLDoc(e) || (t = t.toLowerCase(), r = ue.attrHooks[t] || (ue.expr.match.bool.test(t) ? dt : void 0)), void 0 !== n ? null === n ? void ue.removeAttr(e, t) : r && "set" in r && void 0 !== (o = r.set(e, n, t)) ? o : (e.setAttribute(t, n + ""), n) : r && "get" in r && null !== (o = r.get(e, t)) ? o : (o = ue.find.attr(e, t), null == o ? void 0 : o)) }, attrHooks: { type: { set: function(e, t) { if(!ae.radioValue && "radio" === t && ue.nodeName(e, "input")) { var n = e.value; return e.setAttribute("type", t), n && (e.value = n), t } } } }, removeAttr: function(e, t) { var n, o, r = 0,
						s = t && t.match(we); if(s && 1 === e.nodeType)
						for(; n = s[r++];) o = ue.propFix[n] || n, ue.expr.match.bool.test(n) && (e[o] = !1), e.removeAttribute(n) } }), dt = { set: function(e, t, n) { return !1 === t ? ue.removeAttr(e, n) : e.setAttribute(n, n), n } }, ue.each(ue.expr.match.bool.source.match(/\w+/g), function(e, t) { var n = ct[t] || ue.find.attr;
				ct[t] = function(e, t, o) { var r, s; return o || (s = ct[t], ct[t] = r, r = null != n(e, t, o) ? t.toLowerCase() : null, ct[t] = s), r } }); var ft = /^(?:input|select|textarea|button)$/i,
				pt = /^(?:a|area)$/i;
			ue.fn.extend({ prop: function(e, t) { return Te(this, ue.prop, e, t, arguments.length > 1) }, removeProp: function(e) { return this.each(function() { delete this[ue.propFix[e] || e] }) } }), ue.extend({ prop: function(e, t, n) { var o, r, s = e.nodeType; if(3 !== s && 8 !== s && 2 !== s) return 1 === s && ue.isXMLDoc(e) || (t = ue.propFix[t] || t, r = ue.propHooks[t]), void 0 !== n ? r && "set" in r && void 0 !== (o = r.set(e, n, t)) ? o : e[t] = n : r && "get" in r && null !== (o = r.get(e, t)) ? o : e[t] }, propHooks: { tabIndex: { get: function(e) { var t = ue.find.attr(e, "tabindex"); return t ? parseInt(t, 10) : ft.test(e.nodeName) || pt.test(e.nodeName) && e.href ? 0 : -1 } } }, propFix: { for: "htmlFor", class: "className" } }), ae.optSelected || (ue.propHooks.selected = { get: function(e) { var t = e.parentNode; return t && t.parentNode && t.parentNode.selectedIndex, null }, set: function(e) { var t = e.parentNode;
					t && (t.selectedIndex, t.parentNode && t.parentNode.selectedIndex) } }), ue.each(["tabIndex", "readOnly", "maxLength", "cellSpacing", "cellPadding", "rowSpan", "colSpan", "useMap", "frameBorder", "contentEditable"], function() { ue.propFix[this.toLowerCase()] = this }); var ht = /[\t\r\n\f]/g;
			ue.fn.extend({ addClass: function(e) { var t, n, o, r, s, i, a, u = 0; if(ue.isFunction(e)) return this.each(function(t) { ue(this).addClass(e.call(this, t, U(this))) }); if("string" == typeof e && e)
						for(t = e.match(we) || []; n = this[u++];)
							if(r = U(n), o = 1 === n.nodeType && (" " + r + " ").replace(ht, " ")) { for(i = 0; s = t[i++];) o.indexOf(" " + s + " ") < 0 && (o += s + " ");
								a = ue.trim(o), r !== a && n.setAttribute("class", a) }
					return this }, removeClass: function(e) { var t, n, o, r, s, i, a, u = 0; if(ue.isFunction(e)) return this.each(function(t) { ue(this).removeClass(e.call(this, t, U(this))) }); if(!arguments.length) return this.attr("class", ""); if("string" == typeof e && e)
						for(t = e.match(we) || []; n = this[u++];)
							if(r = U(n), o = 1 === n.nodeType && (" " + r + " ").replace(ht, " ")) { for(i = 0; s = t[i++];)
									for(; o.indexOf(" " + s + " ") > -1;) o = o.replace(" " + s + " ", " ");
								a = ue.trim(o), r !== a && n.setAttribute("class", a) }
					return this }, toggleClass: function(e, t) { var n = typeof e; return "boolean" == typeof t && "string" === n ? t ? this.addClass(e) : this.removeClass(e) : ue.isFunction(e) ? this.each(function(n) { ue(this).toggleClass(e.call(this, n, U(this), t), t) }) : this.each(function() { var t, o, r, s; if("string" === n)
							for(o = 0, r = ue(this), s = e.match(we) || []; t = s[o++];) r.hasClass(t) ? r.removeClass(t) : r.addClass(t);
						else void 0 !== e && "boolean" !== n || (t = U(this), t && ke.set(this, "__className__", t), this.setAttribute && this.setAttribute("class", t || !1 === e ? "" : ke.get(this, "__className__") || "")) }) }, hasClass: function(e) { var t, n, o = 0; for(t = " " + e + " "; n = this[o++];)
						if(1 === n.nodeType && (" " + U(n) + " ").replace(ht, " ").indexOf(t) > -1) return !0; return !1 } }); var mt = /\r/g,
				bt = /[\x20\t\r\n\f]+/g;
			ue.fn.extend({ val: function(e) { var t, n, o, r = this[0]; { if(arguments.length) return o = ue.isFunction(e), this.each(function(n) { var r;
							1 === this.nodeType && (r = o ? e.call(this, n, ue(this).val()) : e, null == r ? r = "" : "number" == typeof r ? r += "" : ue.isArray(r) && (r = ue.map(r, function(e) { return null == e ? "" : e + "" })), (t = ue.valHooks[this.type] || ue.valHooks[this.nodeName.toLowerCase()]) && "set" in t && void 0 !== t.set(this, r, "value") || (this.value = r)) }); if(r) return(t = ue.valHooks[r.type] || ue.valHooks[r.nodeName.toLowerCase()]) && "get" in t && void 0 !== (n = t.get(r, "value")) ? n : (n = r.value, "string" == typeof n ? n.replace(mt, "") : null == n ? "" : n) } } }), ue.extend({ valHooks: { option: { get: function(e) { var t = ue.find.attr(e, "value"); return null != t ? t : ue.trim(ue.text(e)).replace(bt, " ") } }, select: { get: function(e) { for(var t, n, o = e.options, r = e.selectedIndex, s = "select-one" === e.type || r < 0, i = s ? null : [], a = s ? r + 1 : o.length, u = r < 0 ? a : s ? r : 0; u < a; u++)
								if(n = o[u], (n.selected || u === r) && (ae.optDisabled ? !n.disabled : null === n.getAttribute("disabled")) && (!n.parentNode.disabled || !ue.nodeName(n.parentNode, "optgroup"))) { if(t = ue(n).val(), s) return t;
									i.push(t) }
							return i }, set: function(e, t) { for(var n, o, r = e.options, s = ue.makeArray(t), i = r.length; i--;) o = r[i], (o.selected = ue.inArray(ue.valHooks.option.get(o), s) > -1) && (n = !0); return n || (e.selectedIndex = -1), s } } } }), ue.each(["radio", "checkbox"], function() { ue.valHooks[this] = { set: function(e, t) { if(ue.isArray(t)) return e.checked = ue.inArray(ue(e).val(), t) > -1 } }, ae.checkOn || (ue.valHooks[this].get = function(e) { return null === e.getAttribute("value") ? "on" : e.value }) }); var yt = /^(?:focusinfocus|focusoutblur)$/;
			ue.extend(ue.event, { trigger: function(e, t, o, r) { var s, i, a, u, l, d, c, f = [o || Z],
						p = ie.call(e, "type") ? e.type : e,
						h = ie.call(e, "namespace") ? e.namespace.split(".") : []; if(i = a = o = o || Z, 3 !== o.nodeType && 8 !== o.nodeType && !yt.test(p + ue.event.triggered) && (p.indexOf(".") > -1 && (h = p.split("."), p = h.shift(), h.sort()), l = p.indexOf(":") < 0 && "on" + p, e = e[ue.expando] ? e : new ue.Event(p, "object" == typeof e && e), e.isTrigger = r ? 2 : 3, e.namespace = h.join("."), e.rnamespace = e.namespace ? new RegExp("(^|\\.)" + h.join("\\.(?:.*\\.|)") + "(\\.|$)") : null, e.result = void 0, e.target || (e.target = o), t = null == t ? [e] : ue.makeArray(t, [e]), c = ue.event.special[p] || {}, r || !c.trigger || !1 !== c.trigger.apply(o, t))) { if(!r && !c.noBubble && !ue.isWindow(o)) { for(u = c.delegateType || p, yt.test(u + p) || (i = i.parentNode); i; i = i.parentNode) f.push(i), a = i;
							a === (o.ownerDocument || Z) && f.push(a.defaultView || a.parentWindow || n) } for(s = 0;
							(i = f[s++]) && !e.isPropagationStopped();) e.type = s > 1 ? u : c.bindType || p, d = (ke.get(i, "events") || {})[e.type] && ke.get(i, "handle"), d && d.apply(i, t), (d = l && i[l]) && d.apply && Se(i) && (e.result = d.apply(i, t), !1 === e.result && e.preventDefault()); return e.type = p, r || e.isDefaultPrevented() || c._default && !1 !== c._default.apply(f.pop(), t) || !Se(o) || l && ue.isFunction(o[p]) && !ue.isWindow(o) && (a = o[l], a && (o[l] = null), ue.event.triggered = p, o[p](), ue.event.triggered = void 0, a && (o[l] = a)), e.result } }, simulate: function(e, t, n) { var o = ue.extend(new ue.Event, n, { type: e, isSimulated: !0 });
					ue.event.trigger(o, null, t), o.isDefaultPrevented() && n.preventDefault() } }), ue.fn.extend({ trigger: function(e, t) { return this.each(function() { ue.event.trigger(e, t, this) }) }, triggerHandler: function(e, t) { var n = this[0]; if(n) return ue.event.trigger(e, t, n, !0) } }), ue.each("blur focus focusin focusout load resize scroll unload click dblclick mousedown mouseup mousemove mouseover mouseout mouseenter mouseleave change select submit keydown keypress keyup error contextmenu".split(" "), function(e, t) { ue.fn[t] = function(e, n) { return arguments.length > 0 ? this.on(t, null, e, n) : this.trigger(t) } }), ue.fn.extend({ hover: function(e, t) { return this.mouseenter(e).mouseleave(t || e) } }), ae.focusin = "onfocusin" in n, ae.focusin || ue.each({ focus: "focusin", blur: "focusout" }, function(e, t) { var n = function(e) { ue.event.simulate(t, e.target, ue.event.fix(e)) };
				ue.event.special[t] = { setup: function() { var o = this.ownerDocument || this,
							r = ke.access(o, t);
						r || o.addEventListener(e, n, !0), ke.access(o, t, (r || 0) + 1) }, teardown: function() { var o = this.ownerDocument || this,
							r = ke.access(o, t) - 1;
						r ? ke.access(o, t, r) : (o.removeEventListener(e, n, !0), ke.remove(o, t)) } } }); var gt = n.location,
				vt = ue.now(),
				jt = /\?/;
			ue.parseJSON = function(e) { return JSON.parse(e + "") }, ue.parseXML = function(e) { var t; if(!e || "string" != typeof e) return null; try { t = (new n.DOMParser).parseFromString(e, "text/xml") } catch(e) { t = void 0 } return t && !t.getElementsByTagName("parsererror").length || ue.error("Invalid XML: " + e), t }; var _t = /#.*$/,
				xt = /([?&])_=[^&]*/,
				wt = /^(.*?):[ \t]*([^\r\n]*)$/gm,
				Ct = /^(?:about|app|app-storage|.+-extension|file|res|widget):$/,
				Tt = /^(?:GET|HEAD)$/,
				St = /^\/\//,
				kt = {},
				Et = {},
				$t = "*/".concat("*"),
				At = Z.createElement("a");
			At.href = gt.href, ue.extend({ active: 0, lastModified: {}, etag: {}, ajaxSettings: { url: gt.href, type: "GET", isLocal: Ct.test(gt.protocol), global: !0, processData: !0, async: !0, contentType: "application/x-www-form-urlencoded; charset=UTF-8", accepts: { "*": $t, text: "text/plain", html: "text/html", xml: "application/xml, text/xml", json: "application/json, text/javascript" }, contents: { xml: /\bxml\b/, html: /\bhtml/, json: /\bjson\b/ }, responseFields: { xml: "responseXML", text: "responseText", json: "responseJSON" }, converters: { "* text": String, "text html": !0, "text json": ue.parseJSON, "text xml": ue.parseXML }, flatOptions: { url: !0, context: !0 } }, ajaxSetup: function(e, t) { return t ? V(V(e, ue.ajaxSettings), t) : V(ue.ajaxSettings, e) }, ajaxPrefilter: z(kt), ajaxTransport: z(Et), ajax: function(e, t) {
					function o(e, t, o, a) { var l, c, g, v, _, w = t;
						2 !== j && (j = 2, u && n.clearTimeout(u), r = void 0, i = a || "", x.readyState = e > 0 ? 4 : 0, l = e >= 200 && e < 300 || 304 === e, o && (v = J(f, x, o)), v = G(f, v, x, l), l ? (f.ifModified && (_ = x.getResponseHeader("Last-Modified"), _ && (ue.lastModified[s] = _), (_ = x.getResponseHeader("etag")) && (ue.etag[s] = _)), 204 === e || "HEAD" === f.type ? w = "nocontent" : 304 === e ? w = "notmodified" : (w = v.state, c = v.data, g = v.error, l = !g)) : (g = w, !e && w || (w = "error", e < 0 && (e = 0))), x.status = e, x.statusText = (t || w) + "", l ? m.resolveWith(p, [c, w, x]) : m.rejectWith(p, [x, w, g]), x.statusCode(y), y = void 0, d && h.trigger(l ? "ajaxSuccess" : "ajaxError", [x, f, l ? c : g]), b.fireWith(p, [x, w]), d && (h.trigger("ajaxComplete", [x, f]), --ue.active || ue.event.trigger("ajaxStop"))) } "object" == typeof e && (t = e, e = void 0), t = t || {}; var r, s, i, a, u, l, d, c, f = ue.ajaxSetup({}, t),
						p = f.context || f,
						h = f.context && (p.nodeType || p.jquery) ? ue(p) : ue.event,
						m = ue.Deferred(),
						b = ue.Callbacks("once memory"),
						y = f.statusCode || {},
						g = {},
						v = {},
						j = 0,
						_ = "canceled",
						x = { readyState: 0, getResponseHeader: function(e) { var t; if(2 === j) { if(!a)
										for(a = {}; t = wt.exec(i);) a[t[1].toLowerCase()] = t[2];
									t = a[e.toLowerCase()] } return null == t ? null : t }, getAllResponseHeaders: function() { return 2 === j ? i : null }, setRequestHeader: function(e, t) { var n = e.toLowerCase(); return j || (e = v[n] = v[n] || e, g[e] = t), this }, overrideMimeType: function(e) { return j || (f.mimeType = e), this }, statusCode: function(e) { var t; if(e)
									if(j < 2)
										for(t in e) y[t] = [y[t], e[t]];
									else x.always(e[x.status]); return this }, abort: function(e) { var t = e || _; return r && r.abort(t), o(0, t), this } }; if(m.promise(x).complete = b.add, x.success = x.done, x.error = x.fail, f.url = ((e || f.url || gt.href) + "").replace(_t, "").replace(St, gt.protocol + "//"), f.type = t.method || t.type || f.method || f.type, f.dataTypes = ue.trim(f.dataType || "*").toLowerCase().match(we) || [""], null == f.crossDomain) { l = Z.createElement("a"); try { l.href = f.url, l.href = l.href, f.crossDomain = At.protocol + "//" + At.host != l.protocol + "//" + l.host } catch(e) { f.crossDomain = !0 } } if(f.data && f.processData && "string" != typeof f.data && (f.data = ue.param(f.data, f.traditional)), X(kt, f, t, x), 2 === j) return x;
					d = ue.event && f.global, d && 0 == ue.active++ && ue.event.trigger("ajaxStart"), f.type = f.type.toUpperCase(), f.hasContent = !Tt.test(f.type), s = f.url, f.hasContent || (f.data && (s = f.url += (jt.test(s) ? "&" : "?") + f.data, delete f.data), !1 === f.cache && (f.url = xt.test(s) ? s.replace(xt, "$1_=" + vt++) : s + (jt.test(s) ? "&" : "?") + "_=" + vt++)), f.ifModified && (ue.lastModified[s] && x.setRequestHeader("If-Modified-Since", ue.lastModified[s]), ue.etag[s] && x.setRequestHeader("If-None-Match", ue.etag[s])), (f.data && f.hasContent && !1 !== f.contentType || t.contentType) && x.setRequestHeader("Content-Type", f.contentType), x.setRequestHeader("Accept", f.dataTypes[0] && f.accepts[f.dataTypes[0]] ? f.accepts[f.dataTypes[0]] + ("*" !== f.dataTypes[0] ? ", " + $t + "; q=0.01" : "") : f.accepts["*"]); for(c in f.headers) x.setRequestHeader(c, f.headers[c]); if(f.beforeSend && (!1 === f.beforeSend.call(p, x, f) || 2 === j)) return x.abort();
					_ = "abort"; for(c in { success: 1, error: 1, complete: 1 }) x[c](f[c]); if(r = X(Et, f, t, x)) { if(x.readyState = 1, d && h.trigger("ajaxSend", [x, f]), 2 === j) return x;
						f.async && f.timeout > 0 && (u = n.setTimeout(function() { x.abort("timeout") }, f.timeout)); try { j = 1, r.send(g, o) } catch(e) { if(!(j < 2)) throw e;
							o(-1, e) } } else o(-1, "No Transport"); return x }, getJSON: function(e, t, n) { return ue.get(e, t, n, "json") }, getScript: function(e, t) { return ue.get(e, void 0, t, "script") } }), ue.each(["get", "post"], function(e, t) { ue[t] = function(e, n, o, r) { return ue.isFunction(n) && (r = r || o, o = n, n = void 0), ue.ajax(ue.extend({ url: e, type: t, dataType: r, data: n, success: o }, ue.isPlainObject(e) && e)) } }), ue._evalUrl = function(e) { return ue.ajax({ url: e, type: "GET", dataType: "script", async: !1, global: !1, throws: !0 }) }, ue.fn.extend({ wrapAll: function(e) { var t; return ue.isFunction(e) ? this.each(function(t) { ue(this).wrapAll(e.call(this, t)) }) : (this[0] && (t = ue(e, this[0].ownerDocument).eq(0).clone(!0), this[0].parentNode && t.insertBefore(this[0]), t.map(function() { for(var e = this; e.firstElementChild;) e = e.firstElementChild; return e }).append(this)), this) }, wrapInner: function(e) { return ue.isFunction(e) ? this.each(function(t) { ue(this).wrapInner(e.call(this, t)) }) : this.each(function() { var t = ue(this),
							n = t.contents();
						n.length ? n.wrapAll(e) : t.append(e) }) }, wrap: function(e) { var t = ue.isFunction(e); return this.each(function(n) { ue(this).wrapAll(t ? e.call(this, n) : e) }) }, unwrap: function() { return this.parent().each(function() { ue.nodeName(this, "body") || ue(this).replaceWith(this.childNodes) }).end() } }), ue.expr.filters.hidden = function(e) { return !ue.expr.filters.visible(e) }, ue.expr.filters.visible = function(e) { return e.offsetWidth > 0 || e.offsetHeight > 0 || e.getClientRects().length > 0 }; var Nt = /%20/g,
				Lt = /\[\]$/,
				Dt = /\r?\n/g,
				Rt = /^(?:submit|button|image|reset|file)$/i,
				Ot = /^(?:input|select|textarea|keygen)/i;
			ue.param = function(e, t) { var n, o = [],
					r = function(e, t) { t = ue.isFunction(t) ? t() : null == t ? "" : t, o[o.length] = encodeURIComponent(e) + "=" + encodeURIComponent(t) }; if(void 0 === t && (t = ue.ajaxSettings && ue.ajaxSettings.traditional), ue.isArray(e) || e.jquery && !ue.isPlainObject(e)) ue.each(e, function() { r(this.name, this.value) });
				else
					for(n in e) Y(n, e[n], t, r); return o.join("&").replace(Nt, "+") }, ue.fn.extend({ serialize: function() { return ue.param(this.serializeArray()) }, serializeArray: function() { return this.map(function() { var e = ue.prop(this, "elements"); return e ? ue.makeArray(e) : this }).filter(function() { var e = this.type; return this.name && !ue(this).is(":disabled") && Ot.test(this.nodeName) && !Rt.test(e) && (this.checked || !Oe.test(e)) }).map(function(e, t) { var n = ue(this).val(); return null == n ? null : ue.isArray(n) ? ue.map(n, function(e) { return { name: t.name, value: e.replace(Dt, "\r\n") } }) : { name: t.name, value: n.replace(Dt, "\r\n") } }).get() } }), ue.ajaxSettings.xhr = function() { try { return new n.XMLHttpRequest } catch(e) {} }; var qt = { 0: 200, 1223: 204 },
				Mt = ue.ajaxSettings.xhr();
			ae.cors = !!Mt && "withCredentials" in Mt, ae.ajax = Mt = !!Mt, ue.ajaxTransport(function(e) { var t, o; if(ae.cors || Mt && !e.crossDomain) return { send: function(r, s) { var i, a = e.xhr(); if(a.open(e.type, e.url, e.async, e.username, e.password), e.xhrFields)
							for(i in e.xhrFields) a[i] = e.xhrFields[i];
						e.mimeType && a.overrideMimeType && a.overrideMimeType(e.mimeType), e.crossDomain || r["X-Requested-With"] || (r["X-Requested-With"] = "XMLHttpRequest"); for(i in r) a.setRequestHeader(i, r[i]);
						t = function(e) { return function() { t && (t = o = a.onload = a.onerror = a.onabort = a.onreadystatechange = null, "abort" === e ? a.abort() : "error" === e ? "number" != typeof a.status ? s(0, "error") : s(a.status, a.statusText) : s(qt[a.status] || a.status, a.statusText, "text" !== (a.responseType || "text") || "string" != typeof a.responseText ? { binary: a.response } : { text: a.responseText }, a.getAllResponseHeaders())) } }, a.onload = t(), o = a.onerror = t("error"), void 0 !== a.onabort ? a.onabort = o : a.onreadystatechange = function() { 4 === a.readyState && n.setTimeout(function() { t && o() }) }, t = t("abort"); try { a.send(e.hasContent && e.data || null) } catch(e) { if(t) throw e } }, abort: function() { t && t() } } }), ue.ajaxSetup({ accepts: { script: "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript" }, contents: { script: /\b(?:java|ecma)script\b/ }, converters: { "text script": function(e) { return ue.globalEval(e), e } } }), ue.ajaxPrefilter("script", function(e) { void 0 === e.cache && (e.cache = !1), e.crossDomain && (e.type = "GET") }), ue.ajaxTransport("script", function(e) { if(e.crossDomain) { var t, n; return { send: function(o, r) { t = ue("<script>").prop({ charset: e.scriptCharset, src: e.url }).on("load error", n = function(e) { t.remove(), n = null, e && r("error" === e.type ? 404 : 200, e.type) }), Z.head.appendChild(t[0]) }, abort: function() { n && n() } } } }); var Pt = [],
				Ft = /(=)\?(?=&|$)|\?\?/;
			ue.ajaxSetup({ jsonp: "callback", jsonpCallback: function() { var e = Pt.pop() || ue.expando + "_" + vt++; return this[e] = !0, e } }), ue.ajaxPrefilter("json jsonp", function(e, t, o) { var r, s, i, a = !1 !== e.jsonp && (Ft.test(e.url) ? "url" : "string" == typeof e.data && 0 === (e.contentType || "").indexOf("application/x-www-form-urlencoded") && Ft.test(e.data) && "data"); if(a || "jsonp" === e.dataTypes[0]) return r = e.jsonpCallback = ue.isFunction(e.jsonpCallback) ? e.jsonpCallback() : e.jsonpCallback, a ? e[a] = e[a].replace(Ft, "$1" + r) : !1 !== e.jsonp && (e.url += (jt.test(e.url) ? "&" : "?") + e.jsonp + "=" + r), e.converters["script json"] = function() { return i || ue.error(r + " was not called"), i[0] }, e.dataTypes[0] = "json", s = n[r], n[r] = function() { i = arguments }, o.always(function() { void 0 === s ? ue(n).removeProp(r) : n[r] = s, e[r] && (e.jsonpCallback = t.jsonpCallback, Pt.push(r)), i && ue.isFunction(s) && s(i[0]), i = s = void 0 }), "script" }), ue.parseHTML = function(e, t, n) { if(!e || "string" != typeof e) return null; "boolean" == typeof t && (n = t, t = !1), t = t || Z; var o = ye.exec(e),
					r = !n && []; return o ? [t.createElement(o[1])] : (o = b([e], t, r), r && r.length && ue(r).remove(), ue.merge([], o.childNodes)) }; var Ht = ue.fn.load;
			ue.fn.load = function(e, t, n) { if("string" != typeof e && Ht) return Ht.apply(this, arguments); var o, r, s, i = this,
					a = e.indexOf(" "); return a > -1 && (o = ue.trim(e.slice(a)), e = e.slice(0, a)), ue.isFunction(t) ? (n = t, t = void 0) : t && "object" == typeof t && (r = "POST"), i.length > 0 && ue.ajax({ url: e, type: r || "GET", dataType: "html", data: t }).done(function(e) { s = arguments, i.html(o ? ue("<div>").append(ue.parseHTML(e)).find(o) : e) }).always(n && function(e, t) { i.each(function() { n.apply(i, s || [e.responseText, t, e]) }) }), this }, ue.each(["ajaxStart", "ajaxStop", "ajaxComplete", "ajaxError", "ajaxSuccess", "ajaxSend"], function(e, t) { ue.fn[t] = function(e) { return this.on(t, e) } }), ue.expr.filters.animated = function(e) { return ue.grep(ue.timers, function(t) { return e === t.elem }).length }, ue.offset = { setOffset: function(e, t, n) { var o, r, s, i, a, u, l, d = ue.css(e, "position"),
						c = ue(e),
						f = {}; "static" === d && (e.style.position = "relative"), a = c.offset(), s = ue.css(e, "top"), u = ue.css(e, "left"), l = ("absolute" === d || "fixed" === d) && (s + u).indexOf("auto") > -1, l ? (o = c.position(), i = o.top, r = o.left) : (i = parseFloat(s) || 0, r = parseFloat(u) || 0), ue.isFunction(t) && (t = t.call(e, n, ue.extend({}, a))), null != t.top && (f.top = t.top - a.top + i), null != t.left && (f.left = t.left - a.left + r), "using" in t ? t.using.call(e, f) : c.css(f) } }, ue.fn.extend({ offset: function(e) { if(arguments.length) return void 0 === e ? this : this.each(function(t) { ue.offset.setOffset(this, e, t) }); var t, n, o = this[0],
						r = { top: 0, left: 0 },
						s = o && o.ownerDocument; if(s) return t = s.documentElement, ue.contains(t, o) ? (r = o.getBoundingClientRect(), n = K(s), { top: r.top + n.pageYOffset - t.clientTop, left: r.left + n.pageXOffset - t.clientLeft }) : r }, position: function() { if(this[0]) { var e, t, n = this[0],
							o = { top: 0, left: 0 }; return "fixed" === ue.css(n, "position") ? t = n.getBoundingClientRect() : (e = this.offsetParent(), t = this.offset(), ue.nodeName(e[0], "html") || (o = e.offset()), o.top += ue.css(e[0], "borderTopWidth", !0), o.left += ue.css(e[0], "borderLeftWidth", !0)), { top: t.top - o.top - ue.css(n, "marginTop", !0), left: t.left - o.left - ue.css(n, "marginLeft", !0) } } }, offsetParent: function() { return this.map(function() { for(var e = this.offsetParent; e && "static" === ue.css(e, "position");) e = e.offsetParent; return e || et }) } }), ue.each({ scrollLeft: "pageXOffset", scrollTop: "pageYOffset" }, function(e, t) { var n = "pageYOffset" === t;
				ue.fn[e] = function(o) { return Te(this, function(e, o, r) { var s = K(e); if(void 0 === r) return s ? s[t] : e[o];
						s ? s.scrollTo(n ? s.pageXOffset : r, n ? r : s.pageYOffset) : e[o] = r }, e, o, arguments.length) } }), ue.each(["top", "left"], function(e, t) { ue.cssHooks[t] = N(ae.pixelPosition, function(e, n) { if(n) return n = A(e, t), Ke.test(n) ? ue(e).position()[t] + "px" : n }) }), ue.each({ Height: "height", Width: "width" }, function(e, t) { ue.each({ padding: "inner" + e, content: t, "": "outer" + e }, function(n, o) { ue.fn[o] = function(o, r) { var s = arguments.length && (n || "boolean" != typeof o),
							i = n || (!0 === o || !0 === r ? "margin" : "border"); return Te(this, function(t, n, o) { var r; return ue.isWindow(t) ? t.document.documentElement["client" + e] : 9 === t.nodeType ? (r = t.documentElement, Math.max(t.body["scroll" + e], r["scroll" + e], t.body["offset" + e], r["offset" + e], r["client" + e])) : void 0 === o ? ue.css(t, n, i) : ue.style(t, n, o, i) }, t, s ? o : void 0, s, null) } }) }), ue.fn.extend({ bind: function(e, t, n) { return this.on(e, null, t, n) }, unbind: function(e, t) { return this.off(e, null, t) }, delegate: function(e, t, n, o) { return this.on(t, e, n, o) }, undelegate: function(e, t, n) { return 1 === arguments.length ? this.off(e, "**") : this.off(t, e || "**", n) }, size: function() { return this.length } }), ue.fn.andSelf = ue.fn.addBack, o = [], void 0 !== (r = function() { return ue }.apply(t, o)) && (e.exports = r); var It = n.jQuery,
				Bt = n.$; return ue.noConflict = function(e) { return n.$ === ue && (n.$ = Bt), e && n.jQuery === ue && (n.jQuery = It), ue }, s || (n.jQuery = n.$ = ue), ue }) }, "../../../../shared/node_modules/vue-loader/lib/component-normalizer.js": function(e, t) { e.exports = function(e, t, n, o, r) { var s, i = e = e || {},
				a = typeof e.default; "object" !== a && "function" !== a || (s = e, i = e.default); var u = "function" == typeof i ? i.options : i;
			t && (u.render = t.render, u.staticRenderFns = t.staticRenderFns), o && (u._scopeId = o); var l; if(r ? (l = function(e) { e = e || this.$vnode && this.$vnode.ssrContext || this.parent && this.parent.$vnode && this.parent.$vnode.ssrContext, e || "undefined" == typeof __VUE_SSR_CONTEXT__ || (e = __VUE_SSR_CONTEXT__), n && n.call(this, e), e && e._registeredComponents && e._registeredComponents.add(r) }, u._ssrRegister = l) : n && (l = n), l) { var d = u.functional,
					c = d ? u.render : u.beforeCreate;
				d ? u.render = function(e, t) { return l.call(t), c(e, t) } : u.beforeCreate = c ? [].concat(c, l) : [l] } return { esModule: s, exports: i, options: u } } }, '../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-2896c326","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/common/LoadButton.vue': function(e, t) { e.exports = { render: function() { var e = this,
					t = e.$createElement; return(e._self._c || t)("a", { staticClass: "load-more", attrs: { "data-page": e.page, href: e.url } }, [e._v(e._s(e.t("loadmore")))]) }, staticRenderFns: [] } }, '../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-73e90ba8","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/home/UserFollowButton.vue': function(e, t) { e.exports = { render: function() { var e = this,
					t = e.$createElement,
					n = e._self._c || t; return n("a", { class: e.buttonClasses, on: { mouseenter: e.handleMouseEnter, mouseleave: e.handleMouseLeave, click: e.handleClick } }, [n("i", { class: e.iconClasses }), e._v(e._s(e.buttonText) + "\n")]) }, staticRenderFns: [] } }, '../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-eefe4e0c","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue': function(e, t) { e.exports = { render: function() { var e = this,
					t = e.$createElement,
					n = e._self._c || t; return this.users.length ? n("div", { staticClass: "recommended-authors" }, [n("div", { staticClass: "title" }, [n("span", [e._v(e._s(e.t("title")))]), e._v(" "), n("a", { staticClass: "page-change", on: { click: function(t) { e.fetchRecommendedAuthors(), e.counter += 1 } } }, [n("i", { staticClass: "iconfont ic-search-change", style: { transform: "rotate(" + 360 * e.counter + "deg)" } }), e._v("\n      " + e._s(e.t("refresh")) + "\n    ")])]), e._v(" "), n("ul", { staticClass: "list" }, e._l(e.filter, function(t) { return n("li", { key: t.id }, [n("a", { staticClass: "avatar", attrs: { href: e.Routes.show_user_path(t.slug, { utm_source: "desktop", utm_medium: "index-users" }), target: "_blank" } }, [n("img", { attrs: { src: e.resizeImage(t.avatar_source, { width: 96 }) } })]), e._v(" "), n("user-follow-button", { attrs: { "user-id": t.id, state: t.followState } }), e._v(" "), n("a", { staticClass: "name", attrs: { href: e.Routes.show_user_path(t.slug, { utm_source: "desktop", utm_medium: "index-users" }), target: "_blank" } }, [e._v("\n        " + e._s(t.nickname) + "\n      ")]), e._v(" "), n("p", [e._v("\n        " + e._s(e.t("meta_info", { wordage_count: e.M.util.shortenNumber(t.total_wordage), likes_count: e.M.util.shortenNumber(t.total_likes_count) })) + "\n      ")])], 1) })), e._v(" "), n("a", { staticClass: "find-more", attrs: { href: e.Routes.users_recommendations_path({ utm_source: "desktop", utm_medium: "index-users" }), target: "_blank" } }, [e._v("\n    " + e._s(e.t("find_all"))), n("i", { staticClass: "iconfont ic-link" })])]) : e._e() }, staticRenderFns: [] } }, '../../../../shared/node_modules/vue-style-loader/index.js!../../../../shared/node_modules/css-loader/index.js!../../../../shared/node_modules/vue-loader/lib/style-compiler/index.js?{"vue":true,"id":"data-v-eefe4e0c","scoped":false,"hasInlineConfig":true}!../../../../shared/node_modules/sass-loader/lib/loader.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=styles&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue': function(e, t, n) { var o = n('../../../../shared/node_modules/css-loader/index.js!../../../../shared/node_modules/vue-loader/lib/style-compiler/index.js?{"vue":true,"id":"data-v-eefe4e0c","scoped":false,"hasInlineConfig":true}!../../../../shared/node_modules/sass-loader/lib/loader.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=styles&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue'); "string" == typeof o && (o = [
			[e.i, o, ""]
		]), o.locals && (e.exports = o.locals);
		n("../../../../shared/node_modules/vue-style-loader/lib/addStylesClient.js")("0b424728", o, !0) }, "../../../../shared/node_modules/vue-style-loader/lib/addStylesClient.js": function(e, t, n) {
		function o(e) { for(var t = 0; t < e.length; t++) { var n = e[t],
					o = d[n.id]; if(o) { o.refs++; for(var r = 0; r < o.parts.length; r++) o.parts[r](n.parts[r]); for(; r < n.parts.length; r++) o.parts.push(s(n.parts[r]));
					o.parts.length > n.parts.length && (o.parts.length = n.parts.length) } else { for(var i = [], r = 0; r < n.parts.length; r++) i.push(s(n.parts[r]));
					d[n.id] = { id: n.id, refs: 1, parts: i } } } }

		function r() { var e = document.createElement("style"); return e.type = "text/css", c.appendChild(e), e }

		function s(e) { var t, n, o = document.querySelector('style[data-vue-ssr-id~="' + e.id + '"]'); if(o) { if(h) return m;
				o.parentNode.removeChild(o) } if(b) { var s = p++;
				o = f || (f = r()), t = i.bind(null, o, s, !1), n = i.bind(null, o, s, !0) } else o = r(), t = a.bind(null, o), n = function() { o.parentNode.removeChild(o) }; return t(e),
				function(o) { if(o) { if(o.css === e.css && o.media === e.media && o.sourceMap === e.sourceMap) return;
						t(e = o) } else n() } }

		function i(e, t, n, o) { var r = n ? "" : o.css; if(e.styleSheet) e.styleSheet.cssText = y(t, r);
			else { var s = document.createTextNode(r),
					i = e.childNodes;
				i[t] && e.removeChild(i[t]), i.length ? e.insertBefore(s, i[t]) : e.appendChild(s) } }

		function a(e, t) { var n = t.css,
				o = t.media,
				r = t.sourceMap; if(o && e.setAttribute("media", o), r && (n += "\n/*# sourceURL=" + r.sources[0] + " */", n += "\n/*# sourceMappingURL=data:application/json;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(r)))) + " */"), e.styleSheet) e.styleSheet.cssText = n;
			else { for(; e.firstChild;) e.removeChild(e.firstChild);
				e.appendChild(document.createTextNode(n)) } } var u = "undefined" != typeof document; if("undefined" != typeof DEBUG && DEBUG && !u) throw new Error("vue-style-loader cannot be used in a non-browser environment. Use { target: 'node' } in your Webpack config to indicate a server-rendering environment."); var l = n("../../../../shared/node_modules/vue-style-loader/lib/listToStyles.js"),
			d = {},
			c = u && (document.head || document.getElementsByTagName("head")[0]),
			f = null,
			p = 0,
			h = !1,
			m = function() {},
			b = "undefined" != typeof navigator && /msie [6-9]\b/.test(navigator.userAgent.toLowerCase());
		e.exports = function(e, t, n) { h = n; var r = l(e, t); return o(r),
				function(t) { for(var n = [], s = 0; s < r.length; s++) { var i = r[s],
							a = d[i.id];
						a.refs--, n.push(a) } t ? (r = l(e, t), o(r)) : r = []; for(var s = 0; s < n.length; s++) { var a = n[s]; if(0 === a.refs) { for(var u = 0; u < a.parts.length; u++) a.parts[u]();
							delete d[a.id] } } } }; var y = function() { var e = []; return function(t, n) { return e[t] = n, e.filter(Boolean).join("\n") } }() }, "../../../../shared/node_modules/vue-style-loader/lib/listToStyles.js": function(e, t) { e.exports = function(e, t) { for(var n = [], o = {}, r = 0; r < t.length; r++) { var s = t[r],
					i = s[0],
					a = s[1],
					u = s[2],
					l = s[3],
					d = { id: e + ":" + r, css: a, media: u, sourceMap: l };
				o[i] ? o[i].parts.push(d) : n.push(o[i] = { id: i, parts: [d] }) } return n } }, "../../../../shared/node_modules/webpack/node_modules/process/browser.js": function(e, t) {
		function n() { throw new Error("setTimeout has not been defined") }

		function o() { throw new Error("clearTimeout has not been defined") }

		function r(e) { if(d === setTimeout) return setTimeout(e, 0); if((d === n || !d) && setTimeout) return d = setTimeout, setTimeout(e, 0); try { return d(e, 0) } catch(t) { try { return d.call(null, e, 0) } catch(t) { return d.call(this, e, 0) } } }

		function s(e) { if(c === clearTimeout) return clearTimeout(e); if((c === o || !c) && clearTimeout) return c = clearTimeout, clearTimeout(e); try { return c(e) } catch(t) { try { return c.call(null, e) } catch(t) { return c.call(this, e) } } }

		function i() { m && p && (m = !1, p.length ? h = p.concat(h) : b = -1, h.length && a()) }

		function a() { if(!m) { var e = r(i);
				m = !0; for(var t = h.length; t;) { for(p = h, h = []; ++b < t;) p && p[b].run();
					b = -1, t = h.length } p = null, m = !1, s(e) } }

		function u(e, t) { this.fun = e, this.array = t }

		function l() {} var d, c, f = e.exports = {};! function() { try { d = "function" == typeof setTimeout ? setTimeout : n } catch(e) { d = n } try { c = "function" == typeof clearTimeout ? clearTimeout : o } catch(e) { c = o } }(); var p, h = [],
			m = !1,
			b = -1;
		f.nextTick = function(e) { var t = new Array(arguments.length - 1); if(arguments.length > 1)
				for(var n = 1; n < arguments.length; n++) t[n - 1] = arguments[n];
			h.push(new u(e, t)), 1 !== h.length || m || r(a) }, u.prototype.run = function() { this.fun.apply(null, this.array) }, f.title = "browser", f.browser = !0, f.env = {}, f.argv = [], f.version = "", f.versions = {}, f.on = l, f.addListener = l, f.once = l, f.off = l, f.removeListener = l, f.removeAllListeners = l, f.emit = l, f.prependListener = l, f.prependOnceListener = l, f.listeners = function(e) { return [] }, f.binding = function(e) { throw new Error("process.binding is not supported") }, f.cwd = function() { return "/" }, f.chdir = function(e) { throw new Error("process.chdir is not supported") }, f.umask = function() { return 0 } }, "./javascripts/common/m/echo.js": function(e, t, n) { "use strict";

		function o(e, t) { return e.className.match(new RegExp("(\\s|^)" + t + "(\\s|$)")) }

		function r(e, t) { o(e, t) || (e.className += " " + t) }

		function s(e, t) { if(o(e, t)) { var n = new RegExp("(\\s|^)" + t + "(\\s|$)");
				e.className = e.className.replace(n, " ") } }

		function i() { var e, t, n, o, i, a = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : window,
				u = {},
				l = function() {},
				d = function(e) { return null === e.offsetParent },
				c = function(e, t) { if(d(e)) return !1; var n = e.getBoundingClientRect(); return n.right >= t.l && n.bottom >= t.t && n.left <= t.r && n.top <= t.b },
				f = function() { o && (t && clearTimeout(t), t = setTimeout(function() { u.render(), t = null }, n)) }; return u.init = function(t) { t = t || {}; var r = t.offset || 0,
					s = t.offsetVertical || r,
					d = t.offsetHorizontal || r,
					c = function(e, t) { return parseInt(e || t, 10) };
				e = { t: c(t.offsetTop, s), b: c(t.offsetBottom, s), l: c(t.offsetLeft, d), r: c(t.offsetRight, d) }, n = c(t.throttle, 250), o = !1 !== t.debounce, i = !!t.unload, l = t.callback || l, u.render(), document.addEventListener ? (a.addEventListener("scroll", f, !1), a.addEventListener("load", f, !1)) : (a.attachEvent("onscroll", f), a.attachEvent("onload", f)) }, u.render = function() { for(var t, n, o = document.querySelectorAll("img[data-echo], [data-echo-background]"), u = o.length, d = { l: 0 - e.l, t: 0 - e.t, b: (a.innerHeight || document.documentElement.clientHeight) + e.b, r: (a.innerWidth || document.documentElement.clientWidth) + e.r }, f = 0; f < u; f++) n = o[f], c(n, d) ? (i && n.setAttribute("data-echo-placeholder", n.src), null !== n.getAttribute("data-echo-background") ? n.style.backgroundImage = "url(" + n.getAttribute("data-echo-background") + ")" : n.src = n.getAttribute("data-echo"), i || (n.removeAttribute("data-echo"), n.removeAttribute("data-echo-background")), s(n, "img-blur"), r(n, "img-blur-done"), l(n, "load")) : i && (t = n.getAttribute("data-echo-placeholder")) && (null !== n.getAttribute("data-echo-background") ? n.style.backgroundImage = "url(" + t + ")" : n.src = t, n.removeAttribute("data-echo-placeholder"), l(n, "unload")) }, u.detach = function() { document.removeEventListener ? a.removeEventListener("scroll", f) : a.detachEvent("onscroll", f), clearTimeout(t) }, u } Object.defineProperty(t, "__esModule", { value: !0 }), t.default = i, e.exports = t.default }, "./javascripts/common/mixins/i18nMixin.js": function(e, t, n) { "use strict";
		Object.defineProperty(t, "__esModule", { value: !0 }), t.default = { methods: { t: function(e) { var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : {}; if(t && !1 === t.prefix) return delete t.prefix, i18next.t(e, t); var n = this.i18nPrefix || "common:"; return i18next.t("" + n + e, t) } } }, e.exports = t.default }, "./javascripts/common/mixins/resizeImage.js": function(e, t, n) { "use strict";
		Object.defineProperty(t, "__esModule", { value: !0 }), t.default = { methods: { resizeImage: function(e) { var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : {}; if(/\/\/(upload-images|upload|cdn2)\.jianshu\.io/.test(e) && t.width > 0) { var n = e.replace(/http:/, ""); if(/\/\/cdn2\.jianshu\.io/.test(e)) return n; var o = t.width,
							r = t.height || t.width; return "" + (n + "?imageMogr2/auto-orient/strip|imageView2/" + (t.mode || 1) + "/w/" + o + "/h/" + r) + (function() { if(void 0 !== window.supportWebP) return window.supportWebP; try { var e = document.createElement("canvas"); if(e.getContext && e.getContext("2d")) { var t = 0 === e.toDataURL("image/webp").indexOf("data:image/webp"); return window.supportWebP = t, t } } catch(e) { return !1 } return !1 }() ? "/format/webp" : "") } return e } } }, e.exports = t.default }, "./javascripts/web/api/baseApi.js": function(e, t, n) { "use strict";

		function o(e) { return e && e.__esModule ? e : { default: e } } Object.defineProperty(t, "__esModule", { value: !0 }); var r = n("../../../../shared/node_modules/babel-runtime/core-js/object/assign.js"),
			s = o(r),
			i = n("../../../../shared/node_modules/babel-runtime/helpers/classCallCheck.js"),
			a = o(i),
			u = n("../../../../shared/node_modules/babel-runtime/helpers/createClass.js"),
			l = o(u),
			d = n("../../../../shared/node_modules/axios/index.js"),
			c = o(d),
			f = function() {
				function e() { var t = this;
					(0, a.default)(this, e), this.axios = c.default.create({ timeout: 1e5, headers: { Accept: "application/json" } }), this.axios.interceptors.request.use(function(e) { var n = e.method; return "post" !== n && "put" !== n && "delete" !== n || (0, s.default)(e.headers, t.getCSRFToken()), e }) } return(0, l.default)(e, [{ key: "getCSRFToken", value: function() { return document.querySelector("[name=csrf-token]") ? { "X-CSRF-Token": document.querySelector("[name=csrf-token]").getAttribute("content") } : {} } }]), e }();
		t.default = f, e.exports = t.default }, "./javascripts/web/api/followApi.js": function(e, t, n) { "use strict";

		function o(e) { return e && e.__esModule ? e : { default: e } } Object.defineProperty(t, "__esModule", { value: !0 }); var r = n("../../../../shared/node_modules/babel-runtime/core-js/object/get-prototype-of.js"),
			s = o(r),
			i = n("../../../../shared/node_modules/babel-runtime/helpers/classCallCheck.js"),
			a = o(i),
			u = n("../../../../shared/node_modules/babel-runtime/helpers/createClass.js"),
			l = o(u),
			d = n("../../../../shared/node_modules/babel-runtime/helpers/possibleConstructorReturn.js"),
			c = o(d),
			f = n("../../../../shared/node_modules/babel-runtime/helpers/inherits.js"),
			p = o(f),
			h = n("./javascripts/web/api/baseApi.js"),
			m = o(h),
			b = function(e) {
				function t() { return(0, a.default)(this, t), (0, c.default)(this, (t.__proto__ || (0, s.default)(t)).apply(this, arguments)) } return(0, p.default)(t, e), (0, l.default)(t, [{ key: "user", value: function(e) { return this.axios.post(Routes.toggle_like_user_path(e)) } }]), t }(m.default);
		t.default = b, e.exports = t.default }, "./javascripts/web/api/recommendApi.js": function(e, t, n) { "use strict";

		function o(e) { return e && e.__esModule ? e : { default: e } } Object.defineProperty(t, "__esModule", { value: !0 }); var r = n("../../../../shared/node_modules/babel-runtime/core-js/object/get-prototype-of.js"),
			s = o(r),
			i = n("../../../../shared/node_modules/babel-runtime/helpers/classCallCheck.js"),
			a = o(i),
			u = n("../../../../shared/node_modules/babel-runtime/helpers/createClass.js"),
			l = o(u),
			d = n("../../../../shared/node_modules/babel-runtime/helpers/possibleConstructorReturn.js"),
			c = o(d),
			f = n("../../../../shared/node_modules/babel-runtime/helpers/inherits.js"),
			p = o(f),
			h = n("./javascripts/web/api/baseApi.js"),
			m = o(h),
			b = function(e) {
				function t() { return(0, a.default)(this, t), (0, c.default)(this, (t.__proto__ || (0, s.default)(t)).apply(this, arguments)) } return(0, p.default)(t, e), (0, l.default)(t, [{ key: "getCollections", value: function(e) { var t = e.count,
							n = e.seen_ids,
							o = e.only_unfollowed; return this.axios.get(Routes.recommended_collections_path({ count: t, seen_ids: n, only_unfollowed: o }), { timeout: 0 }) } }, { key: "getUsers", value: function(e) { var t = e.seen_ids,
							n = e.count,
							o = e.only_unfollowed; return this.axios.get(Routes.recommended_users_path({ seen_ids: t, count: n, only_unfollowed: o })) } }, { key: "getRecommendUsersByCollections", value: function(e) { var t = e.collection_ids,
							n = e.page,
							o = e.count,
							r = e.only_unfollowed; return this.axios.get(Routes.collection_recommended_users_path({ collection_ids: t, page: n, count: o, only_unfollowed: r })) } }, { key: "batchSubscribeCollectionsAndUsers", value: function(e) { var t = e.subscribe_collection_ids,
							n = e.subscribe_user_ids; return this.axios.post(Routes.create_in_batch_subscriptions_path(), { subscribe_collection_ids: t, subscribe_user_ids: n }, { timeout: 0 }) } }]), t }(m.default);
		t.default = b, e.exports = t.default }, "./javascripts/web/components/common/LoadButton.vue": function(e, t, n) { var o = n("../../../../shared/node_modules/vue-loader/lib/component-normalizer.js")(n("../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/common/LoadButton.vue"), n('../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-2896c326","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/common/LoadButton.vue'), null, null, null);
		e.exports = o.exports }, "./javascripts/web/components/home/RecommendedAuthorList.vue": function(e, t, n) {
		function o(e) { n('../../../../shared/node_modules/vue-style-loader/index.js!../../../../shared/node_modules/css-loader/index.js!../../../../shared/node_modules/vue-loader/lib/style-compiler/index.js?{"vue":true,"id":"data-v-eefe4e0c","scoped":false,"hasInlineConfig":true}!../../../../shared/node_modules/sass-loader/lib/loader.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=styles&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue') } var r = n("../../../../shared/node_modules/vue-loader/lib/component-normalizer.js")(n("../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue"), n('../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-eefe4e0c","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/home/RecommendedAuthorList.vue'), o, null, null);
		e.exports = r.exports }, "./javascripts/web/components/home/UserFollowButton.vue": function(e, t, n) { var o = n("../../../../shared/node_modules/vue-loader/lib/component-normalizer.js")(n("../../../../shared/node_modules/babel-loader/lib/index.js!../../../../shared/node_modules/vue-loader/lib/selector.js?type=script&index=0!./javascripts/web/components/home/UserFollowButton.vue"), n('../../../../shared/node_modules/vue-loader/lib/template-compiler/index.js?{"id":"data-v-73e90ba8","hasScoped":false}!../../../../shared/node_modules/vue-loader/lib/selector.js?type=template&index=0!./javascripts/web/components/home/UserFollowButton.vue'), null, null, null);
		e.exports = o.exports }, "./javascripts/web/components/home/style.scss": function(e, t) {}, "./javascripts/web/components/home/zh-CN.json": function(e, t) { e.exports = { title: "æŽ¨èä½œè€…", find_all: "æŸ¥çœ‹å…¨éƒ¨", refresh: "æ¢ä¸€æ‰¹", meta_info: "å†™äº†{{wordage_count}}å­— Â· {{likes_count}}å–œæ¬¢" } }, "./javascripts/web/components/home/zh-TW.json": function(e, t) { e.exports = { title: "æŽ¨è–¦ä½œè€…", find_all: "æŸ¥çœ‹å…¨éƒ¨", refresh: "æ›ä¸€æ‰¹", meta_info: "å¯«äº†{{wordage_count}}å­— Â· {{likes_count}}å–œæ­¡" } }, "./javascripts/web/jquery_extensions/jquery.infiniteScroll.js": function(e, t, n) { "use strict"; var o, r, s, i = n("../../../../shared/node_modules/babel-runtime/helpers/typeof.js");! function(e) { e && e.__esModule }(i);! function(i) { r = [n("../../../../shared/node_modules/jquery/dist/jquery.js")], o = i, void 0 !== (s = "function" == typeof o ? o.apply(t, r) : o) && (e.exports = s) }(function(e) { e.fn.infiniteScroll = function(t) { var n = this,
					o = t.url || n.attr("infinite-scroll-url"),
					r = n.data("eof") || !1,
					s = (n.data("page") || 1) + 1,
					i = n.data("infinite-loading") || !1,
					a = (t.times || 999) + 1,
					u = t.placeholder || n.data("placeholder") || "note"; if(a >= s && !r && !i) { var l = t.params || {};
					l.page = s, e.ajax({ url: o, type: "GET", dataType: "html", data: l, beforeSend: function(e) { n.data("infinite-loading", !0), e.setRequestHeader("X-INFINITESCROLL", "true"), i || null === t.before || "function" != typeof t.before || t.before.call(n[0], n[0], u) } }).done(function(e) { e.trim().length > 0 ? (n.data("page", s), n.data("infinite-loading", !1), n.append(e)) : n.data("eof", !0), null !== t.success && "function" == typeof t.success && t.success.call(n[0], n[0], e) }) } } }) }, "./javascripts/web/pages/home/index/entry.js": function(e, t, n) { "use strict"; var o = n("../../../../shared/node_modules/babel-runtime/core-js/object/assign.js"),
			r = function(e) { return e && e.__esModule ? e : { default: e } }(o);
		n("./stylesheets/web/page/index.scss"), n("./stylesheets/web/module/note_list.scss"), n("./javascripts/web/jquery_extensions/jquery.infiniteScroll.js"), M.components = (0, r.default)(M.components, { RecommendedAuthorList: n("./javascripts/web/components/home/RecommendedAuthorList.vue") }); var s = n("./javascripts/common/m/echo.js")(window);
		$(document).ready(function() {
			function e() { $.find("span.time").forEach(function(e) { var t = $(e);
					t.html(M.format.timeFromNow(t.data("sharedAt"))) }) }

			function t(e) { $("#list-container").parent().append("<load-button></load-button>"), M.componentLoader.load($("load-button")[0], Vue.extend(n("./javascripts/web/components/common/LoadButton.vue")), { data: e }) }

			function o(e) { var t = e || {}; return t.seen_snote_ids = $("#list-container").find("li").map(function() { return this.id.split("-").pop() }).get(), t }

			function r() { var e = $("#list-container>ul"),
					n = e.data("page") || 1;
				n >= i + 1 && t({ page: n, url: Routes.root_path() }) } s.init({ offset: 0, throttle: 50, unload: !1 }), $(".slide").carousel({ interval: 5e3 }), $("#index-aside-download-qrbox").on("click", function() { JsSensor.trackEvent(SAEVENTS.HOME_DOWNLOAD_QrBOX_CLICK) }); var i = 2;
			$(".banner").on("click", function() { JsSensor.trackEvent(SAEVENTS.PC_HOME_BANNER_CLICK, { title: this.getAttribute("data-banner-name") }) }), e(),
				function() { $(window).scroll(function() { var t = [$(window), $(document)],
							n = t[0],
							a = t[1],
							u = a.height() / n.height() * (n.height() / 3);
						n.scrollTop() > a.height() - n.height() - u && $("#list-container>ul").infiniteScroll({ times: i, params: o(), before: function() { M.util.appendPlaceholder("#list-container", "note", ["index"]) }, success: function() { e(), r(), M.util.removePlaceholder(), s.render() } }) }) }(),
				function() { $("body").on("click", "a.load-more", function(t) { t.preventDefault(); var n = [$(t.currentTarget), $("#list-container>ul")],
							r = n[0],
							i = n[1],
							a = r.data("page") + 1;
						$.ajax({ url: "/trending_notes", type: "POST", dataType: "html", data: o({ page: a }), beforeSend: function(e) { e.setRequestHeader("X-PJAX", "true"), M.util.appendPlaceholder("#list-container", "note"), $(".load-more").hide() } }).done(function(t, n, o) { r.data("page", a), i.append(t), e(), M.util.removePlaceholder(), s.render(), "false" === o.getResponseHeader("Has-More") ? $(".load-more").remove() : $(".load-more").show() }) }) }() }), $("#js-download-img").one("load", function() { $("#js-link-btn").show() }).each(function() { this.complete && $(this).load() }) }, "./stylesheets/web/module/note_list.scss": function(e, t) {}, "./stylesheets/web/page/index.scss": function(e, t) {} }, ["./javascripts/web/pages/home/index/entry.js"]);
//# sourceMappingURL=entry-b1c318265e1354f8b9a2.js.map