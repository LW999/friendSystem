package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttentionPeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionPeopleExample() {
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

        public Criteria andAttentionPeopleIdIsNull() {
            addCriterion("attention_people_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdIsNotNull() {
            addCriterion("attention_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdEqualTo(String value) {
            addCriterion("attention_people_id =", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdNotEqualTo(String value) {
            addCriterion("attention_people_id <>", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdGreaterThan(String value) {
            addCriterion("attention_people_id >", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdGreaterThanOrEqualTo(String value) {
            addCriterion("attention_people_id >=", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdLessThan(String value) {
            addCriterion("attention_people_id <", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdLessThanOrEqualTo(String value) {
            addCriterion("attention_people_id <=", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdLike(String value) {
            addCriterion("attention_people_id like", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdNotLike(String value) {
            addCriterion("attention_people_id not like", value, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdIn(List<String> values) {
            addCriterion("attention_people_id in", values, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdNotIn(List<String> values) {
            addCriterion("attention_people_id not in", values, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdBetween(String value1, String value2) {
            addCriterion("attention_people_id between", value1, value2, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleIdNotBetween(String value1, String value2) {
            addCriterion("attention_people_id not between", value1, value2, "attentionPeopleId");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneIsNull() {
            addCriterion("attention_people_user_one is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneIsNotNull() {
            addCriterion("attention_people_user_one is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneEqualTo(String value) {
            addCriterion("attention_people_user_one =", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneNotEqualTo(String value) {
            addCriterion("attention_people_user_one <>", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneGreaterThan(String value) {
            addCriterion("attention_people_user_one >", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneGreaterThanOrEqualTo(String value) {
            addCriterion("attention_people_user_one >=", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneLessThan(String value) {
            addCriterion("attention_people_user_one <", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneLessThanOrEqualTo(String value) {
            addCriterion("attention_people_user_one <=", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneLike(String value) {
            addCriterion("attention_people_user_one like", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneNotLike(String value) {
            addCriterion("attention_people_user_one not like", value, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneIn(List<String> values) {
            addCriterion("attention_people_user_one in", values, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneNotIn(List<String> values) {
            addCriterion("attention_people_user_one not in", values, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneBetween(String value1, String value2) {
            addCriterion("attention_people_user_one between", value1, value2, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserOneNotBetween(String value1, String value2) {
            addCriterion("attention_people_user_one not between", value1, value2, "attentionPeopleUserOne");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoIsNull() {
            addCriterion("attention_people_user_two is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoIsNotNull() {
            addCriterion("attention_people_user_two is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoEqualTo(String value) {
            addCriterion("attention_people_user_two =", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoNotEqualTo(String value) {
            addCriterion("attention_people_user_two <>", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoGreaterThan(String value) {
            addCriterion("attention_people_user_two >", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoGreaterThanOrEqualTo(String value) {
            addCriterion("attention_people_user_two >=", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoLessThan(String value) {
            addCriterion("attention_people_user_two <", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoLessThanOrEqualTo(String value) {
            addCriterion("attention_people_user_two <=", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoLike(String value) {
            addCriterion("attention_people_user_two like", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoNotLike(String value) {
            addCriterion("attention_people_user_two not like", value, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoIn(List<String> values) {
            addCriterion("attention_people_user_two in", values, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoNotIn(List<String> values) {
            addCriterion("attention_people_user_two not in", values, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoBetween(String value1, String value2) {
            addCriterion("attention_people_user_two between", value1, value2, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleUserTwoNotBetween(String value1, String value2) {
            addCriterion("attention_people_user_two not between", value1, value2, "attentionPeopleUserTwo");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeIsNull() {
            addCriterion("attention_people_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeIsNotNull() {
            addCriterion("attention_people_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeEqualTo(String value) {
            addCriterion("attention_people_createtime =", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeNotEqualTo(String value) {
            addCriterion("attention_people_createtime <>", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeGreaterThan(String value) {
            addCriterion("attention_people_createtime >", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("attention_people_createtime >=", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeLessThan(String value) {
            addCriterion("attention_people_createtime <", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("attention_people_createtime <=", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeLike(String value) {
            addCriterion("attention_people_createtime like", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeNotLike(String value) {
            addCriterion("attention_people_createtime not like", value, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeIn(List<String> values) {
            addCriterion("attention_people_createtime in", values, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeNotIn(List<String> values) {
            addCriterion("attention_people_createtime not in", values, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeBetween(String value1, String value2) {
            addCriterion("attention_people_createtime between", value1, value2, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleCreatetimeNotBetween(String value1, String value2) {
            addCriterion("attention_people_createtime not between", value1, value2, "attentionPeopleCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeIsNull() {
            addCriterion("attention_people_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeIsNotNull() {
            addCriterion("attention_people_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeEqualTo(String value) {
            addCriterion("attention_people_modifytime =", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeNotEqualTo(String value) {
            addCriterion("attention_people_modifytime <>", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeGreaterThan(String value) {
            addCriterion("attention_people_modifytime >", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("attention_people_modifytime >=", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeLessThan(String value) {
            addCriterion("attention_people_modifytime <", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeLessThanOrEqualTo(String value) {
            addCriterion("attention_people_modifytime <=", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeLike(String value) {
            addCriterion("attention_people_modifytime like", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeNotLike(String value) {
            addCriterion("attention_people_modifytime not like", value, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeIn(List<String> values) {
            addCriterion("attention_people_modifytime in", values, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeNotIn(List<String> values) {
            addCriterion("attention_people_modifytime not in", values, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeBetween(String value1, String value2) {
            addCriterion("attention_people_modifytime between", value1, value2, "attentionPeopleModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionPeopleModifytimeNotBetween(String value1, String value2) {
            addCriterion("attention_people_modifytime not between", value1, value2, "attentionPeopleModifytime");
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