package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class LikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikeExample() {
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

        public Criteria andLikeIdIsNull() {
            addCriterion("like_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNotNull() {
            addCriterion("like_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIdEqualTo(String value) {
            addCriterion("like_id =", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotEqualTo(String value) {
            addCriterion("like_id <>", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThan(String value) {
            addCriterion("like_id >", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThanOrEqualTo(String value) {
            addCriterion("like_id >=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThan(String value) {
            addCriterion("like_id <", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThanOrEqualTo(String value) {
            addCriterion("like_id <=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLike(String value) {
            addCriterion("like_id like", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotLike(String value) {
            addCriterion("like_id not like", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIn(List<String> values) {
            addCriterion("like_id in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotIn(List<String> values) {
            addCriterion("like_id not in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdBetween(String value1, String value2) {
            addCriterion("like_id between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotBetween(String value1, String value2) {
            addCriterion("like_id not between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIsNull() {
            addCriterion("like_article is null");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIsNotNull() {
            addCriterion("like_article is not null");
            return (Criteria) this;
        }

        public Criteria andLikeArticleEqualTo(String value) {
            addCriterion("like_article =", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleNotEqualTo(String value) {
            addCriterion("like_article <>", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleGreaterThan(String value) {
            addCriterion("like_article >", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleGreaterThanOrEqualTo(String value) {
            addCriterion("like_article >=", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleLessThan(String value) {
            addCriterion("like_article <", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleLessThanOrEqualTo(String value) {
            addCriterion("like_article <=", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleLike(String value) {
            addCriterion("like_article like", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleNotLike(String value) {
            addCriterion("like_article not like", value, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIn(List<String> values) {
            addCriterion("like_article in", values, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleNotIn(List<String> values) {
            addCriterion("like_article not in", values, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleBetween(String value1, String value2) {
            addCriterion("like_article between", value1, value2, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikeArticleNotBetween(String value1, String value2) {
            addCriterion("like_article not between", value1, value2, "likeArticle");
            return (Criteria) this;
        }

        public Criteria andLikePeopleIsNull() {
            addCriterion("like_people is null");
            return (Criteria) this;
        }

        public Criteria andLikePeopleIsNotNull() {
            addCriterion("like_people is not null");
            return (Criteria) this;
        }

        public Criteria andLikePeopleEqualTo(String value) {
            addCriterion("like_people =", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleNotEqualTo(String value) {
            addCriterion("like_people <>", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleGreaterThan(String value) {
            addCriterion("like_people >", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("like_people >=", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleLessThan(String value) {
            addCriterion("like_people <", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleLessThanOrEqualTo(String value) {
            addCriterion("like_people <=", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleLike(String value) {
            addCriterion("like_people like", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleNotLike(String value) {
            addCriterion("like_people not like", value, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleIn(List<String> values) {
            addCriterion("like_people in", values, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleNotIn(List<String> values) {
            addCriterion("like_people not in", values, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleBetween(String value1, String value2) {
            addCriterion("like_people between", value1, value2, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikePeopleNotBetween(String value1, String value2) {
            addCriterion("like_people not between", value1, value2, "likePeople");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeIsNull() {
            addCriterion("like_createtime is null");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeIsNotNull() {
            addCriterion("like_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeEqualTo(String value) {
            addCriterion("like_createtime =", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeNotEqualTo(String value) {
            addCriterion("like_createtime <>", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeGreaterThan(String value) {
            addCriterion("like_createtime >", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("like_createtime >=", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeLessThan(String value) {
            addCriterion("like_createtime <", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("like_createtime <=", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeLike(String value) {
            addCriterion("like_createtime like", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeNotLike(String value) {
            addCriterion("like_createtime not like", value, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeIn(List<String> values) {
            addCriterion("like_createtime in", values, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeNotIn(List<String> values) {
            addCriterion("like_createtime not in", values, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeBetween(String value1, String value2) {
            addCriterion("like_createtime between", value1, value2, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeCreatetimeNotBetween(String value1, String value2) {
            addCriterion("like_createtime not between", value1, value2, "likeCreatetime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeIsNull() {
            addCriterion("like_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeIsNotNull() {
            addCriterion("like_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeEqualTo(String value) {
            addCriterion("like_modifytime =", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeNotEqualTo(String value) {
            addCriterion("like_modifytime <>", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeGreaterThan(String value) {
            addCriterion("like_modifytime >", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("like_modifytime >=", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeLessThan(String value) {
            addCriterion("like_modifytime <", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeLessThanOrEqualTo(String value) {
            addCriterion("like_modifytime <=", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeLike(String value) {
            addCriterion("like_modifytime like", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeNotLike(String value) {
            addCriterion("like_modifytime not like", value, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeIn(List<String> values) {
            addCriterion("like_modifytime in", values, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeNotIn(List<String> values) {
            addCriterion("like_modifytime not in", values, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeBetween(String value1, String value2) {
            addCriterion("like_modifytime between", value1, value2, "likeModifytime");
            return (Criteria) this;
        }

        public Criteria andLikeModifytimeNotBetween(String value1, String value2) {
            addCriterion("like_modifytime not between", value1, value2, "likeModifytime");
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