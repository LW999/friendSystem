package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class KeywordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeywordExample() {
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

        public Criteria andKeywordIdIsNull() {
            addCriterion("keyword_id is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIsNotNull() {
            addCriterion("keyword_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdEqualTo(String value) {
            addCriterion("keyword_id =", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotEqualTo(String value) {
            addCriterion("keyword_id <>", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThan(String value) {
            addCriterion("keyword_id >", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_id >=", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThan(String value) {
            addCriterion("keyword_id <", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThanOrEqualTo(String value) {
            addCriterion("keyword_id <=", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLike(String value) {
            addCriterion("keyword_id like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotLike(String value) {
            addCriterion("keyword_id not like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIn(List<String> values) {
            addCriterion("keyword_id in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotIn(List<String> values) {
            addCriterion("keyword_id not in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdBetween(String value1, String value2) {
            addCriterion("keyword_id between", value1, value2, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotBetween(String value1, String value2) {
            addCriterion("keyword_id not between", value1, value2, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordContentIsNull() {
            addCriterion("keyword_content is null");
            return (Criteria) this;
        }

        public Criteria andKeywordContentIsNotNull() {
            addCriterion("keyword_content is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordContentEqualTo(String value) {
            addCriterion("keyword_content =", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentNotEqualTo(String value) {
            addCriterion("keyword_content <>", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentGreaterThan(String value) {
            addCriterion("keyword_content >", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_content >=", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentLessThan(String value) {
            addCriterion("keyword_content <", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentLessThanOrEqualTo(String value) {
            addCriterion("keyword_content <=", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentLike(String value) {
            addCriterion("keyword_content like", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentNotLike(String value) {
            addCriterion("keyword_content not like", value, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentIn(List<String> values) {
            addCriterion("keyword_content in", values, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentNotIn(List<String> values) {
            addCriterion("keyword_content not in", values, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentBetween(String value1, String value2) {
            addCriterion("keyword_content between", value1, value2, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordContentNotBetween(String value1, String value2) {
            addCriterion("keyword_content not between", value1, value2, "keywordContent");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberIsNull() {
            addCriterion("keyword_number is null");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberIsNotNull() {
            addCriterion("keyword_number is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberEqualTo(Integer value) {
            addCriterion("keyword_number =", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberNotEqualTo(Integer value) {
            addCriterion("keyword_number <>", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberGreaterThan(Integer value) {
            addCriterion("keyword_number >", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("keyword_number >=", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberLessThan(Integer value) {
            addCriterion("keyword_number <", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberLessThanOrEqualTo(Integer value) {
            addCriterion("keyword_number <=", value, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberIn(List<Integer> values) {
            addCriterion("keyword_number in", values, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberNotIn(List<Integer> values) {
            addCriterion("keyword_number not in", values, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberBetween(Integer value1, Integer value2) {
            addCriterion("keyword_number between", value1, value2, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("keyword_number not between", value1, value2, "keywordNumber");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeIsNull() {
            addCriterion("keyword_createtime is null");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeIsNotNull() {
            addCriterion("keyword_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeEqualTo(String value) {
            addCriterion("keyword_createtime =", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeNotEqualTo(String value) {
            addCriterion("keyword_createtime <>", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeGreaterThan(String value) {
            addCriterion("keyword_createtime >", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_createtime >=", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeLessThan(String value) {
            addCriterion("keyword_createtime <", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("keyword_createtime <=", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeLike(String value) {
            addCriterion("keyword_createtime like", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeNotLike(String value) {
            addCriterion("keyword_createtime not like", value, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeIn(List<String> values) {
            addCriterion("keyword_createtime in", values, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeNotIn(List<String> values) {
            addCriterion("keyword_createtime not in", values, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeBetween(String value1, String value2) {
            addCriterion("keyword_createtime between", value1, value2, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordCreatetimeNotBetween(String value1, String value2) {
            addCriterion("keyword_createtime not between", value1, value2, "keywordCreatetime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeIsNull() {
            addCriterion("keyword_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeIsNotNull() {
            addCriterion("keyword_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeEqualTo(String value) {
            addCriterion("keyword_modifytime =", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeNotEqualTo(String value) {
            addCriterion("keyword_modifytime <>", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeGreaterThan(String value) {
            addCriterion("keyword_modifytime >", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_modifytime >=", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeLessThan(String value) {
            addCriterion("keyword_modifytime <", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeLessThanOrEqualTo(String value) {
            addCriterion("keyword_modifytime <=", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeLike(String value) {
            addCriterion("keyword_modifytime like", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeNotLike(String value) {
            addCriterion("keyword_modifytime not like", value, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeIn(List<String> values) {
            addCriterion("keyword_modifytime in", values, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeNotIn(List<String> values) {
            addCriterion("keyword_modifytime not in", values, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeBetween(String value1, String value2) {
            addCriterion("keyword_modifytime between", value1, value2, "keywordModifytime");
            return (Criteria) this;
        }

        public Criteria andKeywordModifytimeNotBetween(String value1, String value2) {
            addCriterion("keyword_modifytime not between", value1, value2, "keywordModifytime");
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