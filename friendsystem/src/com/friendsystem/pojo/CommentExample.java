package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentFloorIsNull() {
            addCriterion("comment_floor is null");
            return (Criteria) this;
        }

        public Criteria andCommentFloorIsNotNull() {
            addCriterion("comment_floor is not null");
            return (Criteria) this;
        }

        public Criteria andCommentFloorEqualTo(Integer value) {
            addCriterion("comment_floor =", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorNotEqualTo(Integer value) {
            addCriterion("comment_floor <>", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorGreaterThan(Integer value) {
            addCriterion("comment_floor >", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_floor >=", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorLessThan(Integer value) {
            addCriterion("comment_floor <", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorLessThanOrEqualTo(Integer value) {
            addCriterion("comment_floor <=", value, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorIn(List<Integer> values) {
            addCriterion("comment_floor in", values, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorNotIn(List<Integer> values) {
            addCriterion("comment_floor not in", values, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorBetween(Integer value1, Integer value2) {
            addCriterion("comment_floor between", value1, value2, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_floor not between", value1, value2, "commentFloor");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdIsNull() {
            addCriterion("comment_note_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdIsNotNull() {
            addCriterion("comment_note_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdEqualTo(String value) {
            addCriterion("comment_note_id =", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdNotEqualTo(String value) {
            addCriterion("comment_note_id <>", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdGreaterThan(String value) {
            addCriterion("comment_note_id >", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_note_id >=", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdLessThan(String value) {
            addCriterion("comment_note_id <", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdLessThanOrEqualTo(String value) {
            addCriterion("comment_note_id <=", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdLike(String value) {
            addCriterion("comment_note_id like", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdNotLike(String value) {
            addCriterion("comment_note_id not like", value, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdIn(List<String> values) {
            addCriterion("comment_note_id in", values, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdNotIn(List<String> values) {
            addCriterion("comment_note_id not in", values, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdBetween(String value1, String value2) {
            addCriterion("comment_note_id between", value1, value2, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentNoteIdNotBetween(String value1, String value2) {
            addCriterion("comment_note_id not between", value1, value2, "commentNoteId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdIsNull() {
            addCriterion("comment_userone_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdIsNotNull() {
            addCriterion("comment_userone_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdEqualTo(String value) {
            addCriterion("comment_userone_id =", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdNotEqualTo(String value) {
            addCriterion("comment_userone_id <>", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdGreaterThan(String value) {
            addCriterion("comment_userone_id >", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_userone_id >=", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdLessThan(String value) {
            addCriterion("comment_userone_id <", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdLessThanOrEqualTo(String value) {
            addCriterion("comment_userone_id <=", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdLike(String value) {
            addCriterion("comment_userone_id like", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdNotLike(String value) {
            addCriterion("comment_userone_id not like", value, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdIn(List<String> values) {
            addCriterion("comment_userone_id in", values, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdNotIn(List<String> values) {
            addCriterion("comment_userone_id not in", values, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdBetween(String value1, String value2) {
            addCriterion("comment_userone_id between", value1, value2, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUseroneIdNotBetween(String value1, String value2) {
            addCriterion("comment_userone_id not between", value1, value2, "commentUseroneId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdIsNull() {
            addCriterion("comment_usertwo_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdIsNotNull() {
            addCriterion("comment_usertwo_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdEqualTo(String value) {
            addCriterion("comment_usertwo_id =", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdNotEqualTo(String value) {
            addCriterion("comment_usertwo_id <>", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdGreaterThan(String value) {
            addCriterion("comment_usertwo_id >", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_usertwo_id >=", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdLessThan(String value) {
            addCriterion("comment_usertwo_id <", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdLessThanOrEqualTo(String value) {
            addCriterion("comment_usertwo_id <=", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdLike(String value) {
            addCriterion("comment_usertwo_id like", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdNotLike(String value) {
            addCriterion("comment_usertwo_id not like", value, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdIn(List<String> values) {
            addCriterion("comment_usertwo_id in", values, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdNotIn(List<String> values) {
            addCriterion("comment_usertwo_id not in", values, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdBetween(String value1, String value2) {
            addCriterion("comment_usertwo_id between", value1, value2, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentUsertwoIdNotBetween(String value1, String value2) {
            addCriterion("comment_usertwo_id not between", value1, value2, "commentUsertwoId");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeIsNull() {
            addCriterion("comment_is_grade is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeIsNotNull() {
            addCriterion("comment_is_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeEqualTo(Integer value) {
            addCriterion("comment_is_grade =", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeNotEqualTo(Integer value) {
            addCriterion("comment_is_grade <>", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeGreaterThan(Integer value) {
            addCriterion("comment_is_grade >", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_is_grade >=", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeLessThan(Integer value) {
            addCriterion("comment_is_grade <", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_is_grade <=", value, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeIn(List<Integer> values) {
            addCriterion("comment_is_grade in", values, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeNotIn(List<Integer> values) {
            addCriterion("comment_is_grade not in", values, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeBetween(Integer value1, Integer value2) {
            addCriterion("comment_is_grade between", value1, value2, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentIsGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_is_grade not between", value1, value2, "commentIsGrade");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtIsNull() {
            addCriterion("comment_create_at is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtIsNotNull() {
            addCriterion("comment_create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtEqualTo(String value) {
            addCriterion("comment_create_at =", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtNotEqualTo(String value) {
            addCriterion("comment_create_at <>", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtGreaterThan(String value) {
            addCriterion("comment_create_at >", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtGreaterThanOrEqualTo(String value) {
            addCriterion("comment_create_at >=", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtLessThan(String value) {
            addCriterion("comment_create_at <", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtLessThanOrEqualTo(String value) {
            addCriterion("comment_create_at <=", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtLike(String value) {
            addCriterion("comment_create_at like", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtNotLike(String value) {
            addCriterion("comment_create_at not like", value, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtIn(List<String> values) {
            addCriterion("comment_create_at in", values, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtNotIn(List<String> values) {
            addCriterion("comment_create_at not in", values, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtBetween(String value1, String value2) {
            addCriterion("comment_create_at between", value1, value2, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentCreateAtNotBetween(String value1, String value2) {
            addCriterion("comment_create_at not between", value1, value2, "commentCreateAt");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIsNull() {
            addCriterion("comment_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIsNotNull() {
            addCriterion("comment_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdEqualTo(String value) {
            addCriterion("comment_parent_id =", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotEqualTo(String value) {
            addCriterion("comment_parent_id <>", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdGreaterThan(String value) {
            addCriterion("comment_parent_id >", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_parent_id >=", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLessThan(String value) {
            addCriterion("comment_parent_id <", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_parent_id <=", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdLike(String value) {
            addCriterion("comment_parent_id like", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotLike(String value) {
            addCriterion("comment_parent_id not like", value, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdIn(List<String> values) {
            addCriterion("comment_parent_id in", values, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotIn(List<String> values) {
            addCriterion("comment_parent_id not in", values, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdBetween(String value1, String value2) {
            addCriterion("comment_parent_id between", value1, value2, "commentParentId");
            return (Criteria) this;
        }

        public Criteria andCommentParentIdNotBetween(String value1, String value2) {
            addCriterion("comment_parent_id not between", value1, value2, "commentParentId");
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