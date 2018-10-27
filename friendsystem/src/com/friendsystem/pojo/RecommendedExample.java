package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecommendedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendedExample() {
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

        public Criteria andRecommendedIdIsNull() {
            addCriterion("recommended_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdIsNotNull() {
            addCriterion("recommended_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdEqualTo(String value) {
            addCriterion("recommended_id =", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdNotEqualTo(String value) {
            addCriterion("recommended_id <>", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdGreaterThan(String value) {
            addCriterion("recommended_id >", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_id >=", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdLessThan(String value) {
            addCriterion("recommended_id <", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdLessThanOrEqualTo(String value) {
            addCriterion("recommended_id <=", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdLike(String value) {
            addCriterion("recommended_id like", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdNotLike(String value) {
            addCriterion("recommended_id not like", value, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdIn(List<String> values) {
            addCriterion("recommended_id in", values, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdNotIn(List<String> values) {
            addCriterion("recommended_id not in", values, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdBetween(String value1, String value2) {
            addCriterion("recommended_id between", value1, value2, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIdNotBetween(String value1, String value2) {
            addCriterion("recommended_id not between", value1, value2, "recommendedId");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleIsNull() {
            addCriterion("recommended_by_article is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleIsNotNull() {
            addCriterion("recommended_by_article is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleEqualTo(String value) {
            addCriterion("recommended_by_article =", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleNotEqualTo(String value) {
            addCriterion("recommended_by_article <>", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleGreaterThan(String value) {
            addCriterion("recommended_by_article >", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_by_article >=", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleLessThan(String value) {
            addCriterion("recommended_by_article <", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleLessThanOrEqualTo(String value) {
            addCriterion("recommended_by_article <=", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleLike(String value) {
            addCriterion("recommended_by_article like", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleNotLike(String value) {
            addCriterion("recommended_by_article not like", value, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleIn(List<String> values) {
            addCriterion("recommended_by_article in", values, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleNotIn(List<String> values) {
            addCriterion("recommended_by_article not in", values, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleBetween(String value1, String value2) {
            addCriterion("recommended_by_article between", value1, value2, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedByArticleNotBetween(String value1, String value2) {
            addCriterion("recommended_by_article not between", value1, value2, "recommendedByArticle");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgIsNull() {
            addCriterion("recommended_img is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgIsNotNull() {
            addCriterion("recommended_img is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgEqualTo(String value) {
            addCriterion("recommended_img =", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgNotEqualTo(String value) {
            addCriterion("recommended_img <>", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgGreaterThan(String value) {
            addCriterion("recommended_img >", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_img >=", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgLessThan(String value) {
            addCriterion("recommended_img <", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgLessThanOrEqualTo(String value) {
            addCriterion("recommended_img <=", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgLike(String value) {
            addCriterion("recommended_img like", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgNotLike(String value) {
            addCriterion("recommended_img not like", value, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgIn(List<String> values) {
            addCriterion("recommended_img in", values, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgNotIn(List<String> values) {
            addCriterion("recommended_img not in", values, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgBetween(String value1, String value2) {
            addCriterion("recommended_img between", value1, value2, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedImgNotBetween(String value1, String value2) {
            addCriterion("recommended_img not between", value1, value2, "recommendedImg");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeIsNull() {
            addCriterion("recommended_createtime is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeIsNotNull() {
            addCriterion("recommended_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeEqualTo(String value) {
            addCriterion("recommended_createtime =", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeNotEqualTo(String value) {
            addCriterion("recommended_createtime <>", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeGreaterThan(String value) {
            addCriterion("recommended_createtime >", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_createtime >=", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeLessThan(String value) {
            addCriterion("recommended_createtime <", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("recommended_createtime <=", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeLike(String value) {
            addCriterion("recommended_createtime like", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeNotLike(String value) {
            addCriterion("recommended_createtime not like", value, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeIn(List<String> values) {
            addCriterion("recommended_createtime in", values, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeNotIn(List<String> values) {
            addCriterion("recommended_createtime not in", values, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeBetween(String value1, String value2) {
            addCriterion("recommended_createtime between", value1, value2, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedCreatetimeNotBetween(String value1, String value2) {
            addCriterion("recommended_createtime not between", value1, value2, "recommendedCreatetime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeIsNull() {
            addCriterion("recommended_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeIsNotNull() {
            addCriterion("recommended_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeEqualTo(String value) {
            addCriterion("recommended_modifytime =", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeNotEqualTo(String value) {
            addCriterion("recommended_modifytime <>", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeGreaterThan(String value) {
            addCriterion("recommended_modifytime >", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_modifytime >=", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeLessThan(String value) {
            addCriterion("recommended_modifytime <", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeLessThanOrEqualTo(String value) {
            addCriterion("recommended_modifytime <=", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeLike(String value) {
            addCriterion("recommended_modifytime like", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeNotLike(String value) {
            addCriterion("recommended_modifytime not like", value, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeIn(List<String> values) {
            addCriterion("recommended_modifytime in", values, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeNotIn(List<String> values) {
            addCriterion("recommended_modifytime not in", values, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeBetween(String value1, String value2) {
            addCriterion("recommended_modifytime between", value1, value2, "recommendedModifytime");
            return (Criteria) this;
        }

        public Criteria andRecommendedModifytimeNotBetween(String value1, String value2) {
            addCriterion("recommended_modifytime not between", value1, value2, "recommendedModifytime");
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