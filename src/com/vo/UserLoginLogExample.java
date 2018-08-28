package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public UserLoginLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
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

        public Criteria andUserLoginLogIdIsNull() {
            addCriterion("user_login_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdIsNotNull() {
            addCriterion("user_login_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdEqualTo(String value) {
            addCriterion("user_login_log_id =", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdNotEqualTo(String value) {
            addCriterion("user_login_log_id <>", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdGreaterThan(String value) {
            addCriterion("user_login_log_id >", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_log_id >=", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdLessThan(String value) {
            addCriterion("user_login_log_id <", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdLessThanOrEqualTo(String value) {
            addCriterion("user_login_log_id <=", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdLike(String value) {
            addCriterion("user_login_log_id like", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdNotLike(String value) {
            addCriterion("user_login_log_id not like", value, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdIn(List<String> values) {
            addCriterion("user_login_log_id in", values, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdNotIn(List<String> values) {
            addCriterion("user_login_log_id not in", values, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdBetween(String value1, String value2) {
            addCriterion("user_login_log_id between", value1, value2, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginLogIdNotBetween(String value1, String value2) {
            addCriterion("user_login_log_id not between", value1, value2, "userLoginLogId");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("user_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("user_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(Date value) {
            addCriterion("user_login_time =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(Date value) {
            addCriterion("user_login_time <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(Date value) {
            addCriterion("user_login_time >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_time >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(Date value) {
            addCriterion("user_login_time <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_login_time <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<Date> values) {
            addCriterion("user_login_time in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<Date> values) {
            addCriterion("user_login_time not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_login_time between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_login_time not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountIsNull() {
            addCriterion("user_login_account is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountIsNotNull() {
            addCriterion("user_login_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountEqualTo(String value) {
            addCriterion("user_login_account =", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountNotEqualTo(String value) {
            addCriterion("user_login_account <>", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountGreaterThan(String value) {
            addCriterion("user_login_account >", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_account >=", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountLessThan(String value) {
            addCriterion("user_login_account <", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountLessThanOrEqualTo(String value) {
            addCriterion("user_login_account <=", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountLike(String value) {
            addCriterion("user_login_account like", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountNotLike(String value) {
            addCriterion("user_login_account not like", value, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountIn(List<String> values) {
            addCriterion("user_login_account in", values, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountNotIn(List<String> values) {
            addCriterion("user_login_account not in", values, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountBetween(String value1, String value2) {
            addCriterion("user_login_account between", value1, value2, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginAccountNotBetween(String value1, String value2) {
            addCriterion("user_login_account not between", value1, value2, "userLoginAccount");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdIsNull() {
            addCriterion("user_login_result_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdIsNotNull() {
            addCriterion("user_login_result_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdEqualTo(String value) {
            addCriterion("user_login_result_id =", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdNotEqualTo(String value) {
            addCriterion("user_login_result_id <>", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdGreaterThan(String value) {
            addCriterion("user_login_result_id >", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_result_id >=", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdLessThan(String value) {
            addCriterion("user_login_result_id <", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdLessThanOrEqualTo(String value) {
            addCriterion("user_login_result_id <=", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdLike(String value) {
            addCriterion("user_login_result_id like", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdNotLike(String value) {
            addCriterion("user_login_result_id not like", value, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdIn(List<String> values) {
            addCriterion("user_login_result_id in", values, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdNotIn(List<String> values) {
            addCriterion("user_login_result_id not in", values, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdBetween(String value1, String value2) {
            addCriterion("user_login_result_id between", value1, value2, "userLoginResultId");
            return (Criteria) this;
        }

        public Criteria andUserLoginResultIdNotBetween(String value1, String value2) {
            addCriterion("user_login_result_id not between", value1, value2, "userLoginResultId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_log
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 12 09:03:13 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
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