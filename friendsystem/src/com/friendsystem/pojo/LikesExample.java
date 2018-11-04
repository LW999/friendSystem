package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class LikesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikesExample() {
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

        public Criteria andLikeidIsNull() {
            addCriterion("likeId is null");
            return (Criteria) this;
        }

        public Criteria andLikeidIsNotNull() {
            addCriterion("likeId is not null");
            return (Criteria) this;
        }

        public Criteria andLikeidEqualTo(String value) {
            addCriterion("likeId =", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotEqualTo(String value) {
            addCriterion("likeId <>", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThan(String value) {
            addCriterion("likeId >", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThanOrEqualTo(String value) {
            addCriterion("likeId >=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThan(String value) {
            addCriterion("likeId <", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThanOrEqualTo(String value) {
            addCriterion("likeId <=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLike(String value) {
            addCriterion("likeId like", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotLike(String value) {
            addCriterion("likeId not like", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidIn(List<String> values) {
            addCriterion("likeId in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotIn(List<String> values) {
            addCriterion("likeId not in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidBetween(String value1, String value2) {
            addCriterion("likeId between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotBetween(String value1, String value2) {
            addCriterion("likeId not between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikearticleIsNull() {
            addCriterion("likeArticle is null");
            return (Criteria) this;
        }

        public Criteria andLikearticleIsNotNull() {
            addCriterion("likeArticle is not null");
            return (Criteria) this;
        }

        public Criteria andLikearticleEqualTo(String value) {
            addCriterion("likeArticle =", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleNotEqualTo(String value) {
            addCriterion("likeArticle <>", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleGreaterThan(String value) {
            addCriterion("likeArticle >", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleGreaterThanOrEqualTo(String value) {
            addCriterion("likeArticle >=", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleLessThan(String value) {
            addCriterion("likeArticle <", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleLessThanOrEqualTo(String value) {
            addCriterion("likeArticle <=", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleLike(String value) {
            addCriterion("likeArticle like", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleNotLike(String value) {
            addCriterion("likeArticle not like", value, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleIn(List<String> values) {
            addCriterion("likeArticle in", values, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleNotIn(List<String> values) {
            addCriterion("likeArticle not in", values, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleBetween(String value1, String value2) {
            addCriterion("likeArticle between", value1, value2, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikearticleNotBetween(String value1, String value2) {
            addCriterion("likeArticle not between", value1, value2, "likearticle");
            return (Criteria) this;
        }

        public Criteria andLikepeopleIsNull() {
            addCriterion("likePeople is null");
            return (Criteria) this;
        }

        public Criteria andLikepeopleIsNotNull() {
            addCriterion("likePeople is not null");
            return (Criteria) this;
        }

        public Criteria andLikepeopleEqualTo(String value) {
            addCriterion("likePeople =", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleNotEqualTo(String value) {
            addCriterion("likePeople <>", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleGreaterThan(String value) {
            addCriterion("likePeople >", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("likePeople >=", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleLessThan(String value) {
            addCriterion("likePeople <", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleLessThanOrEqualTo(String value) {
            addCriterion("likePeople <=", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleLike(String value) {
            addCriterion("likePeople like", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleNotLike(String value) {
            addCriterion("likePeople not like", value, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleIn(List<String> values) {
            addCriterion("likePeople in", values, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleNotIn(List<String> values) {
            addCriterion("likePeople not in", values, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleBetween(String value1, String value2) {
            addCriterion("likePeople between", value1, value2, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikepeopleNotBetween(String value1, String value2) {
            addCriterion("likePeople not between", value1, value2, "likepeople");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeIsNull() {
            addCriterion("likeCreatetime is null");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeIsNotNull() {
            addCriterion("likeCreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeEqualTo(String value) {
            addCriterion("likeCreatetime =", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeNotEqualTo(String value) {
            addCriterion("likeCreatetime <>", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeGreaterThan(String value) {
            addCriterion("likeCreatetime >", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("likeCreatetime >=", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeLessThan(String value) {
            addCriterion("likeCreatetime <", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("likeCreatetime <=", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeLike(String value) {
            addCriterion("likeCreatetime like", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeNotLike(String value) {
            addCriterion("likeCreatetime not like", value, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeIn(List<String> values) {
            addCriterion("likeCreatetime in", values, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeNotIn(List<String> values) {
            addCriterion("likeCreatetime not in", values, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeBetween(String value1, String value2) {
            addCriterion("likeCreatetime between", value1, value2, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikecreatetimeNotBetween(String value1, String value2) {
            addCriterion("likeCreatetime not between", value1, value2, "likecreatetime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeIsNull() {
            addCriterion("likeModifytime is null");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeIsNotNull() {
            addCriterion("likeModifytime is not null");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeEqualTo(String value) {
            addCriterion("likeModifytime =", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeNotEqualTo(String value) {
            addCriterion("likeModifytime <>", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeGreaterThan(String value) {
            addCriterion("likeModifytime >", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("likeModifytime >=", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeLessThan(String value) {
            addCriterion("likeModifytime <", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeLessThanOrEqualTo(String value) {
            addCriterion("likeModifytime <=", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeLike(String value) {
            addCriterion("likeModifytime like", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeNotLike(String value) {
            addCriterion("likeModifytime not like", value, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeIn(List<String> values) {
            addCriterion("likeModifytime in", values, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeNotIn(List<String> values) {
            addCriterion("likeModifytime not in", values, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeBetween(String value1, String value2) {
            addCriterion("likeModifytime between", value1, value2, "likemodifytime");
            return (Criteria) this;
        }

        public Criteria andLikemodifytimeNotBetween(String value1, String value2) {
            addCriterion("likeModifytime not between", value1, value2, "likemodifytime");
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