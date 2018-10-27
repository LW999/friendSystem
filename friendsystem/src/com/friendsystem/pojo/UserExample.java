package com.friendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedIsNull() {
            addCriterion("user_is_banned is null");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedIsNotNull() {
            addCriterion("user_is_banned is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedEqualTo(String value) {
            addCriterion("user_is_banned =", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedNotEqualTo(String value) {
            addCriterion("user_is_banned <>", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedGreaterThan(String value) {
            addCriterion("user_is_banned >", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_banned >=", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedLessThan(String value) {
            addCriterion("user_is_banned <", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedLessThanOrEqualTo(String value) {
            addCriterion("user_is_banned <=", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedLike(String value) {
            addCriterion("user_is_banned like", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedNotLike(String value) {
            addCriterion("user_is_banned not like", value, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedIn(List<String> values) {
            addCriterion("user_is_banned in", values, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedNotIn(List<String> values) {
            addCriterion("user_is_banned not in", values, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedBetween(String value1, String value2) {
            addCriterion("user_is_banned between", value1, value2, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserIsBannedNotBetween(String value1, String value2) {
            addCriterion("user_is_banned not between", value1, value2, "userIsBanned");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNull() {
            addCriterion("user_portrait is null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNotNull() {
            addCriterion("user_portrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitEqualTo(String value) {
            addCriterion("user_portrait =", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotEqualTo(String value) {
            addCriterion("user_portrait <>", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThan(String value) {
            addCriterion("user_portrait >", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("user_portrait >=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThan(String value) {
            addCriterion("user_portrait <", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThanOrEqualTo(String value) {
            addCriterion("user_portrait <=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLike(String value) {
            addCriterion("user_portrait like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotLike(String value) {
            addCriterion("user_portrait not like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIn(List<String> values) {
            addCriterion("user_portrait in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotIn(List<String> values) {
            addCriterion("user_portrait not in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitBetween(String value1, String value2) {
            addCriterion("user_portrait between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotBetween(String value1, String value2) {
            addCriterion("user_portrait not between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisIsNull() {
            addCriterion("user_synopsis is null");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisIsNotNull() {
            addCriterion("user_synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisEqualTo(String value) {
            addCriterion("user_synopsis =", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisNotEqualTo(String value) {
            addCriterion("user_synopsis <>", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisGreaterThan(String value) {
            addCriterion("user_synopsis >", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("user_synopsis >=", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisLessThan(String value) {
            addCriterion("user_synopsis <", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisLessThanOrEqualTo(String value) {
            addCriterion("user_synopsis <=", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisLike(String value) {
            addCriterion("user_synopsis like", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisNotLike(String value) {
            addCriterion("user_synopsis not like", value, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisIn(List<String> values) {
            addCriterion("user_synopsis in", values, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisNotIn(List<String> values) {
            addCriterion("user_synopsis not in", values, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisBetween(String value1, String value2) {
            addCriterion("user_synopsis between", value1, value2, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserSynopsisNotBetween(String value1, String value2) {
            addCriterion("user_synopsis not between", value1, value2, "userSynopsis");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNull() {
            addCriterion("user_createtime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNotNull() {
            addCriterion("user_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeEqualTo(String value) {
            addCriterion("user_createtime =", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotEqualTo(String value) {
            addCriterion("user_createtime <>", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThan(String value) {
            addCriterion("user_createtime >", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_createtime >=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThan(String value) {
            addCriterion("user_createtime <", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("user_createtime <=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLike(String value) {
            addCriterion("user_createtime like", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotLike(String value) {
            addCriterion("user_createtime not like", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIn(List<String> values) {
            addCriterion("user_createtime in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotIn(List<String> values) {
            addCriterion("user_createtime not in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeBetween(String value1, String value2) {
            addCriterion("user_createtime between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotBetween(String value1, String value2) {
            addCriterion("user_createtime not between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeIsNull() {
            addCriterion("user_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeIsNotNull() {
            addCriterion("user_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeEqualTo(String value) {
            addCriterion("user_modifytime =", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeNotEqualTo(String value) {
            addCriterion("user_modifytime <>", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeGreaterThan(String value) {
            addCriterion("user_modifytime >", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_modifytime >=", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeLessThan(String value) {
            addCriterion("user_modifytime <", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeLessThanOrEqualTo(String value) {
            addCriterion("user_modifytime <=", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeLike(String value) {
            addCriterion("user_modifytime like", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeNotLike(String value) {
            addCriterion("user_modifytime not like", value, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeIn(List<String> values) {
            addCriterion("user_modifytime in", values, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeNotIn(List<String> values) {
            addCriterion("user_modifytime not in", values, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeBetween(String value1, String value2) {
            addCriterion("user_modifytime between", value1, value2, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserModifytimeNotBetween(String value1, String value2) {
            addCriterion("user_modifytime not between", value1, value2, "userModifytime");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationIsNull() {
            addCriterion("user_is_activation is null");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationIsNotNull() {
            addCriterion("user_is_activation is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationEqualTo(String value) {
            addCriterion("user_is_activation =", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationNotEqualTo(String value) {
            addCriterion("user_is_activation <>", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationGreaterThan(String value) {
            addCriterion("user_is_activation >", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationGreaterThanOrEqualTo(String value) {
            addCriterion("user_is_activation >=", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationLessThan(String value) {
            addCriterion("user_is_activation <", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationLessThanOrEqualTo(String value) {
            addCriterion("user_is_activation <=", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationLike(String value) {
            addCriterion("user_is_activation like", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationNotLike(String value) {
            addCriterion("user_is_activation not like", value, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationIn(List<String> values) {
            addCriterion("user_is_activation in", values, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationNotIn(List<String> values) {
            addCriterion("user_is_activation not in", values, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationBetween(String value1, String value2) {
            addCriterion("user_is_activation between", value1, value2, "userIsActivation");
            return (Criteria) this;
        }

        public Criteria andUserIsActivationNotBetween(String value1, String value2) {
            addCriterion("user_is_activation not between", value1, value2, "userIsActivation");
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