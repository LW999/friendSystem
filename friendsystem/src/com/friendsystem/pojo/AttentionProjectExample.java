package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttentionProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionProjectExample() {
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

        public Criteria andAttentionProjectIdIsNull() {
            addCriterion("attention_project_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdIsNotNull() {
            addCriterion("attention_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdEqualTo(String value) {
            addCriterion("attention_project_id =", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdNotEqualTo(String value) {
            addCriterion("attention_project_id <>", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdGreaterThan(String value) {
            addCriterion("attention_project_id >", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("attention_project_id >=", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdLessThan(String value) {
            addCriterion("attention_project_id <", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdLessThanOrEqualTo(String value) {
            addCriterion("attention_project_id <=", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdLike(String value) {
            addCriterion("attention_project_id like", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdNotLike(String value) {
            addCriterion("attention_project_id not like", value, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdIn(List<String> values) {
            addCriterion("attention_project_id in", values, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdNotIn(List<String> values) {
            addCriterion("attention_project_id not in", values, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdBetween(String value1, String value2) {
            addCriterion("attention_project_id between", value1, value2, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectIdNotBetween(String value1, String value2) {
            addCriterion("attention_project_id not between", value1, value2, "attentionProjectId");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserIsNull() {
            addCriterion("attention_project_user is null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserIsNotNull() {
            addCriterion("attention_project_user is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserEqualTo(String value) {
            addCriterion("attention_project_user =", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserNotEqualTo(String value) {
            addCriterion("attention_project_user <>", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserGreaterThan(String value) {
            addCriterion("attention_project_user >", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserGreaterThanOrEqualTo(String value) {
            addCriterion("attention_project_user >=", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserLessThan(String value) {
            addCriterion("attention_project_user <", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserLessThanOrEqualTo(String value) {
            addCriterion("attention_project_user <=", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserLike(String value) {
            addCriterion("attention_project_user like", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserNotLike(String value) {
            addCriterion("attention_project_user not like", value, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserIn(List<String> values) {
            addCriterion("attention_project_user in", values, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserNotIn(List<String> values) {
            addCriterion("attention_project_user not in", values, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserBetween(String value1, String value2) {
            addCriterion("attention_project_user between", value1, value2, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectUserNotBetween(String value1, String value2) {
            addCriterion("attention_project_user not between", value1, value2, "attentionProjectUser");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeIsNull() {
            addCriterion("attention_project_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeIsNotNull() {
            addCriterion("attention_project_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeEqualTo(String value) {
            addCriterion("attention_project_createtime =", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeNotEqualTo(String value) {
            addCriterion("attention_project_createtime <>", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeGreaterThan(String value) {
            addCriterion("attention_project_createtime >", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("attention_project_createtime >=", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeLessThan(String value) {
            addCriterion("attention_project_createtime <", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("attention_project_createtime <=", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeLike(String value) {
            addCriterion("attention_project_createtime like", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeNotLike(String value) {
            addCriterion("attention_project_createtime not like", value, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeIn(List<String> values) {
            addCriterion("attention_project_createtime in", values, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeNotIn(List<String> values) {
            addCriterion("attention_project_createtime not in", values, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeBetween(String value1, String value2) {
            addCriterion("attention_project_createtime between", value1, value2, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectCreatetimeNotBetween(String value1, String value2) {
            addCriterion("attention_project_createtime not between", value1, value2, "attentionProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeIsNull() {
            addCriterion("attention_project_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeIsNotNull() {
            addCriterion("attention_project_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeEqualTo(String value) {
            addCriterion("attention_project_modifytime =", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeNotEqualTo(String value) {
            addCriterion("attention_project_modifytime <>", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeGreaterThan(String value) {
            addCriterion("attention_project_modifytime >", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("attention_project_modifytime >=", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeLessThan(String value) {
            addCriterion("attention_project_modifytime <", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeLessThanOrEqualTo(String value) {
            addCriterion("attention_project_modifytime <=", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeLike(String value) {
            addCriterion("attention_project_modifytime like", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeNotLike(String value) {
            addCriterion("attention_project_modifytime not like", value, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeIn(List<String> values) {
            addCriterion("attention_project_modifytime in", values, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeNotIn(List<String> values) {
            addCriterion("attention_project_modifytime not in", values, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeBetween(String value1, String value2) {
            addCriterion("attention_project_modifytime between", value1, value2, "attentionProjectModifytime");
            return (Criteria) this;
        }

        public Criteria andAttentionProjectModifytimeNotBetween(String value1, String value2) {
            addCriterion("attention_project_modifytime not between", value1, value2, "attentionProjectModifytime");
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