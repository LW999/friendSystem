package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
	/**
	 * 第几页
	 */
	protected int startRow;
	/**
	 * 显示行数
	 */
	protected int pageSize;;

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	protected String orderByClause;
	/**
	 * 自定义条件
	 */
	
	protected String conditions;

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ArticleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andArticleIdIsNull() {
			addCriterion("article_id is null");
			return (Criteria) this;
		}

		public Criteria andArticleIdIsNotNull() {
			addCriterion("article_id is not null");
			return (Criteria) this;
		}

		public Criteria andArticleIdEqualTo(String value) {
			addCriterion("article_id =", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdNotEqualTo(String value) {
			addCriterion("article_id <>", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdGreaterThan(String value) {
			addCriterion("article_id >", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
			addCriterion("article_id >=", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdLessThan(String value) {
			addCriterion("article_id <", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdLessThanOrEqualTo(String value) {
			addCriterion("article_id <=", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdLike(String value) {
			addCriterion("article_id like", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdNotLike(String value) {
			addCriterion("article_id not like", value, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdIn(List<String> values) {
			addCriterion("article_id in", values, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdNotIn(List<String> values) {
			addCriterion("article_id not in", values, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdBetween(String value1, String value2) {
			addCriterion("article_id between", value1, value2, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleIdNotBetween(String value1, String value2) {
			addCriterion("article_id not between", value1, value2, "articleId");
			return (Criteria) this;
		}

		public Criteria andArticleTitleIsNull() {
			addCriterion("article_title is null");
			return (Criteria) this;
		}

		public Criteria andArticleTitleIsNotNull() {
			addCriterion("article_title is not null");
			return (Criteria) this;
		}

		public Criteria andArticleTitleEqualTo(String value) {
			addCriterion("article_title =", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleNotEqualTo(String value) {
			addCriterion("article_title <>", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleGreaterThan(String value) {
			addCriterion("article_title >", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
			addCriterion("article_title >=", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleLessThan(String value) {
			addCriterion("article_title <", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleLessThanOrEqualTo(String value) {
			addCriterion("article_title <=", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleLike(String value) {
			addCriterion("article_title like", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleNotLike(String value) {
			addCriterion("article_title not like", value, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleIn(List<String> values) {
			addCriterion("article_title in", values, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleNotIn(List<String> values) {
			addCriterion("article_title not in", values, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleBetween(String value1, String value2) {
			addCriterion("article_title between", value1, value2, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleTitleNotBetween(String value1, String value2) {
			addCriterion("article_title not between", value1, value2, "articleTitle");
			return (Criteria) this;
		}

		public Criteria andArticleContentIsNull() {
			addCriterion("article_content is null");
			return (Criteria) this;
		}

		public Criteria andArticleContentIsNotNull() {
			addCriterion("article_content is not null");
			return (Criteria) this;
		}

		public Criteria andArticleContentEqualTo(String value) {
			addCriterion("article_content =", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentNotEqualTo(String value) {
			addCriterion("article_content <>", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentGreaterThan(String value) {
			addCriterion("article_content >", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
			addCriterion("article_content >=", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentLessThan(String value) {
			addCriterion("article_content <", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentLessThanOrEqualTo(String value) {
			addCriterion("article_content <=", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentLike(String value) {
			addCriterion("article_content like", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentNotLike(String value) {
			addCriterion("article_content not like", value, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentIn(List<String> values) {
			addCriterion("article_content in", values, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentNotIn(List<String> values) {
			addCriterion("article_content not in", values, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentBetween(String value1, String value2) {
			addCriterion("article_content between", value1, value2, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleContentNotBetween(String value1, String value2) {
			addCriterion("article_content not between", value1, value2, "articleContent");
			return (Criteria) this;
		}

		public Criteria andArticleByUserIsNull() {
			addCriterion("article_by_user is null");
			return (Criteria) this;
		}

		public Criteria andArticleByUserIsNotNull() {
			addCriterion("article_by_user is not null");
			return (Criteria) this;
		}

		public Criteria andArticleByUserEqualTo(String value) {
			addCriterion("article_by_user =", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserNotEqualTo(String value) {
			addCriterion("article_by_user <>", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserGreaterThan(String value) {
			addCriterion("article_by_user >", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserGreaterThanOrEqualTo(String value) {
			addCriterion("article_by_user >=", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserLessThan(String value) {
			addCriterion("article_by_user <", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserLessThanOrEqualTo(String value) {
			addCriterion("article_by_user <=", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserLike(String value) {
			addCriterion("article_by_user like", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserNotLike(String value) {
			addCriterion("article_by_user not like", value, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserIn(List<String> values) {
			addCriterion("article_by_user in", values, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserNotIn(List<String> values) {
			addCriterion("article_by_user not in", values, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserBetween(String value1, String value2) {
			addCriterion("article_by_user between", value1, value2, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleByUserNotBetween(String value1, String value2) {
			addCriterion("article_by_user not between", value1, value2, "articleByUser");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseIsNull() {
			addCriterion("article_is_release is null");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseIsNotNull() {
			addCriterion("article_is_release is not null");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseEqualTo(String value) {
			addCriterion("article_is_release =", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseNotEqualTo(String value) {
			addCriterion("article_is_release <>", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseGreaterThan(String value) {
			addCriterion("article_is_release >", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseGreaterThanOrEqualTo(String value) {
			addCriterion("article_is_release >=", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseLessThan(String value) {
			addCriterion("article_is_release <", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseLessThanOrEqualTo(String value) {
			addCriterion("article_is_release <=", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseLike(String value) {
			addCriterion("article_is_release like", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseNotLike(String value) {
			addCriterion("article_is_release not like", value, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseIn(List<String> values) {
			addCriterion("article_is_release in", values, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseNotIn(List<String> values) {
			addCriterion("article_is_release not in", values, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseBetween(String value1, String value2) {
			addCriterion("article_is_release between", value1, value2, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsReleaseNotBetween(String value1, String value2) {
			addCriterion("article_is_release not between", value1, value2, "articleIsRelease");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteIsNull() {
			addCriterion("article_is_delete is null");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteIsNotNull() {
			addCriterion("article_is_delete is not null");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteEqualTo(String value) {
			addCriterion("article_is_delete =", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteNotEqualTo(String value) {
			addCriterion("article_is_delete <>", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteGreaterThan(String value) {
			addCriterion("article_is_delete >", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteGreaterThanOrEqualTo(String value) {
			addCriterion("article_is_delete >=", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteLessThan(String value) {
			addCriterion("article_is_delete <", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteLessThanOrEqualTo(String value) {
			addCriterion("article_is_delete <=", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteLike(String value) {
			addCriterion("article_is_delete like", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteNotLike(String value) {
			addCriterion("article_is_delete not like", value, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteIn(List<String> values) {
			addCriterion("article_is_delete in", values, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteNotIn(List<String> values) {
			addCriterion("article_is_delete not in", values, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteBetween(String value1, String value2) {
			addCriterion("article_is_delete between", value1, value2, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleIsDeleteNotBetween(String value1, String value2) {
			addCriterion("article_is_delete not between", value1, value2, "articleIsDelete");
			return (Criteria) this;
		}

		public Criteria andArticleViewsIsNull() {
			addCriterion("article_views is null");
			return (Criteria) this;
		}

		public Criteria andArticleViewsIsNotNull() {
			addCriterion("article_views is not null");
			return (Criteria) this;
		}

		public Criteria andArticleViewsEqualTo(String value) {
			addCriterion("article_views =", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsNotEqualTo(String value) {
			addCriterion("article_views <>", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsGreaterThan(String value) {
			addCriterion("article_views >", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsGreaterThanOrEqualTo(String value) {
			addCriterion("article_views >=", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsLessThan(String value) {
			addCriterion("article_views <", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsLessThanOrEqualTo(String value) {
			addCriterion("article_views <=", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsLike(String value) {
			addCriterion("article_views like", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsNotLike(String value) {
			addCriterion("article_views not like", value, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsIn(List<String> values) {
			addCriterion("article_views in", values, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsNotIn(List<String> values) {
			addCriterion("article_views not in", values, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsBetween(String value1, String value2) {
			addCriterion("article_views between", value1, value2, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleViewsNotBetween(String value1, String value2) {
			addCriterion("article_views not between", value1, value2, "articleViews");
			return (Criteria) this;
		}

		public Criteria andArticleImgIsNull() {
			addCriterion("article_img is null");
			return (Criteria) this;
		}

		public Criteria andArticleImgIsNotNull() {
			addCriterion("article_img is not null");
			return (Criteria) this;
		}

		public Criteria andArticleImgEqualTo(String value) {
			addCriterion("article_img =", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotEqualTo(String value) {
			addCriterion("article_img <>", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgGreaterThan(String value) {
			addCriterion("article_img >", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgGreaterThanOrEqualTo(String value) {
			addCriterion("article_img >=", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLessThan(String value) {
			addCriterion("article_img <", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLessThanOrEqualTo(String value) {
			addCriterion("article_img <=", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgLike(String value) {
			addCriterion("article_img like", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotLike(String value) {
			addCriterion("article_img not like", value, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgIn(List<String> values) {
			addCriterion("article_img in", values, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotIn(List<String> values) {
			addCriterion("article_img not in", values, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgBetween(String value1, String value2) {
			addCriterion("article_img between", value1, value2, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleImgNotBetween(String value1, String value2) {
			addCriterion("article_img not between", value1, value2, "articleImg");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeIsNull() {
			addCriterion("article_createtime is null");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeIsNotNull() {
			addCriterion("article_createtime is not null");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeEqualTo(String value) {
			addCriterion("article_createtime =", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeNotEqualTo(String value) {
			addCriterion("article_createtime <>", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeGreaterThan(String value) {
			addCriterion("article_createtime >", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeGreaterThanOrEqualTo(String value) {
			addCriterion("article_createtime >=", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeLessThan(String value) {
			addCriterion("article_createtime <", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeLessThanOrEqualTo(String value) {
			addCriterion("article_createtime <=", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeLike(String value) {
			addCriterion("article_createtime like", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeNotLike(String value) {
			addCriterion("article_createtime not like", value, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeIn(List<String> values) {
			addCriterion("article_createtime in", values, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeNotIn(List<String> values) {
			addCriterion("article_createtime not in", values, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeBetween(String value1, String value2) {
			addCriterion("article_createtime between", value1, value2, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleCreatetimeNotBetween(String value1, String value2) {
			addCriterion("article_createtime not between", value1, value2, "articleCreatetime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeIsNull() {
			addCriterion("article_modifytime is null");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeIsNotNull() {
			addCriterion("article_modifytime is not null");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeEqualTo(String value) {
			addCriterion("article_modifytime =", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeNotEqualTo(String value) {
			addCriterion("article_modifytime <>", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeGreaterThan(String value) {
			addCriterion("article_modifytime >", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeGreaterThanOrEqualTo(String value) {
			addCriterion("article_modifytime >=", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeLessThan(String value) {
			addCriterion("article_modifytime <", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeLessThanOrEqualTo(String value) {
			addCriterion("article_modifytime <=", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeLike(String value) {
			addCriterion("article_modifytime like", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeNotLike(String value) {
			addCriterion("article_modifytime not like", value, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeIn(List<String> values) {
			addCriterion("article_modifytime in", values, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeNotIn(List<String> values) {
			addCriterion("article_modifytime not in", values, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeBetween(String value1, String value2) {
			addCriterion("article_modifytime between", value1, value2, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleModifytimeNotBetween(String value1, String value2) {
			addCriterion("article_modifytime not between", value1, value2, "articleModifytime");
			return (Criteria) this;
		}

		public Criteria andArticleProjectIsNull() {
			addCriterion("article_project is null");
			return (Criteria) this;
		}

		public Criteria andArticleProjectIsNotNull() {
			addCriterion("article_project is not null");
			return (Criteria) this;
		}

		public Criteria andArticleProjectEqualTo(String value) {
			addCriterion("article_project =", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectNotEqualTo(String value) {
			addCriterion("article_project <>", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectGreaterThan(String value) {
			addCriterion("article_project >", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectGreaterThanOrEqualTo(String value) {
			addCriterion("article_project >=", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectLessThan(String value) {
			addCriterion("article_project <", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectLessThanOrEqualTo(String value) {
			addCriterion("article_project <=", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectLike(String value) {
			addCriterion("article_project like", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectNotLike(String value) {
			addCriterion("article_project not like", value, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectIn(List<String> values) {
			addCriterion("article_project in", values, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectNotIn(List<String> values) {
			addCriterion("article_project not in", values, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectBetween(String value1, String value2) {
			addCriterion("article_project between", value1, value2, "articleProject");
			return (Criteria) this;
		}

		public Criteria andArticleProjectNotBetween(String value1, String value2) {
			addCriterion("article_project not between", value1, value2, "articleProject");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}