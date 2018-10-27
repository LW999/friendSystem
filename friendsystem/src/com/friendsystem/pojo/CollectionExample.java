package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(String value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(String value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(String value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(String value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(String value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLike(String value) {
            addCriterion("collection_id like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotLike(String value) {
            addCriterion("collection_id not like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<String> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<String> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(String value1, String value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(String value1, String value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleIsNull() {
            addCriterion("collection_people is null");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleIsNotNull() {
            addCriterion("collection_people is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleEqualTo(String value) {
            addCriterion("collection_people =", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleNotEqualTo(String value) {
            addCriterion("collection_people <>", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleGreaterThan(String value) {
            addCriterion("collection_people >", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("collection_people >=", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleLessThan(String value) {
            addCriterion("collection_people <", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleLessThanOrEqualTo(String value) {
            addCriterion("collection_people <=", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleLike(String value) {
            addCriterion("collection_people like", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleNotLike(String value) {
            addCriterion("collection_people not like", value, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleIn(List<String> values) {
            addCriterion("collection_people in", values, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleNotIn(List<String> values) {
            addCriterion("collection_people not in", values, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleBetween(String value1, String value2) {
            addCriterion("collection_people between", value1, value2, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionPeopleNotBetween(String value1, String value2) {
            addCriterion("collection_people not between", value1, value2, "collectionPeople");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIsNull() {
            addCriterion("collection_article is null");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIsNotNull() {
            addCriterion("collection_article is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleEqualTo(String value) {
            addCriterion("collection_article =", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleNotEqualTo(String value) {
            addCriterion("collection_article <>", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleGreaterThan(String value) {
            addCriterion("collection_article >", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleGreaterThanOrEqualTo(String value) {
            addCriterion("collection_article >=", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleLessThan(String value) {
            addCriterion("collection_article <", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleLessThanOrEqualTo(String value) {
            addCriterion("collection_article <=", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleLike(String value) {
            addCriterion("collection_article like", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleNotLike(String value) {
            addCriterion("collection_article not like", value, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleIn(List<String> values) {
            addCriterion("collection_article in", values, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleNotIn(List<String> values) {
            addCriterion("collection_article not in", values, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleBetween(String value1, String value2) {
            addCriterion("collection_article between", value1, value2, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionArticleNotBetween(String value1, String value2) {
            addCriterion("collection_article not between", value1, value2, "collectionArticle");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeIsNull() {
            addCriterion("collection_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeIsNotNull() {
            addCriterion("collection_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeEqualTo(String value) {
            addCriterion("collection_createtime =", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeNotEqualTo(String value) {
            addCriterion("collection_createtime <>", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeGreaterThan(String value) {
            addCriterion("collection_createtime >", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("collection_createtime >=", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeLessThan(String value) {
            addCriterion("collection_createtime <", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("collection_createtime <=", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeLike(String value) {
            addCriterion("collection_createtime like", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeNotLike(String value) {
            addCriterion("collection_createtime not like", value, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeIn(List<String> values) {
            addCriterion("collection_createtime in", values, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeNotIn(List<String> values) {
            addCriterion("collection_createtime not in", values, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeBetween(String value1, String value2) {
            addCriterion("collection_createtime between", value1, value2, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatetimeNotBetween(String value1, String value2) {
            addCriterion("collection_createtime not between", value1, value2, "collectionCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeIsNull() {
            addCriterion("collection_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeIsNotNull() {
            addCriterion("collection_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeEqualTo(String value) {
            addCriterion("collection_modifytime =", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeNotEqualTo(String value) {
            addCriterion("collection_modifytime <>", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeGreaterThan(String value) {
            addCriterion("collection_modifytime >", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("collection_modifytime >=", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeLessThan(String value) {
            addCriterion("collection_modifytime <", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeLessThanOrEqualTo(String value) {
            addCriterion("collection_modifytime <=", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeLike(String value) {
            addCriterion("collection_modifytime like", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeNotLike(String value) {
            addCriterion("collection_modifytime not like", value, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeIn(List<String> values) {
            addCriterion("collection_modifytime in", values, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeNotIn(List<String> values) {
            addCriterion("collection_modifytime not in", values, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeBetween(String value1, String value2) {
            addCriterion("collection_modifytime between", value1, value2, "collectionModifytime");
            return (Criteria) this;
        }

        public Criteria andCollectionModifytimeNotBetween(String value1, String value2) {
            addCriterion("collection_modifytime not between", value1, value2, "collectionModifytime");
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