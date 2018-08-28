package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOperateLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public UserOperateLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
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
     * This method corresponds to the database table user_operate_log
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
     * This method corresponds to the database table user_operate_log
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_log
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
     * This class corresponds to the database table user_operate_log
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

        public Criteria andUserOperateLogIdIsNull() {
            addCriterion("user_operate_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdIsNotNull() {
            addCriterion("user_operate_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdEqualTo(String value) {
            addCriterion("user_operate_log_id =", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdNotEqualTo(String value) {
            addCriterion("user_operate_log_id <>", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdGreaterThan(String value) {
            addCriterion("user_operate_log_id >", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_operate_log_id >=", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdLessThan(String value) {
            addCriterion("user_operate_log_id <", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdLessThanOrEqualTo(String value) {
            addCriterion("user_operate_log_id <=", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdLike(String value) {
            addCriterion("user_operate_log_id like", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdNotLike(String value) {
            addCriterion("user_operate_log_id not like", value, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdIn(List<String> values) {
            addCriterion("user_operate_log_id in", values, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdNotIn(List<String> values) {
            addCriterion("user_operate_log_id not in", values, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdBetween(String value1, String value2) {
            addCriterion("user_operate_log_id between", value1, value2, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateLogIdNotBetween(String value1, String value2) {
            addCriterion("user_operate_log_id not between", value1, value2, "userOperateLogId");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeIsNull() {
            addCriterion("user_operate_time is null");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeIsNotNull() {
            addCriterion("user_operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeEqualTo(Date value) {
            addCriterion("user_operate_time =", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeNotEqualTo(Date value) {
            addCriterion("user_operate_time <>", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeGreaterThan(Date value) {
            addCriterion("user_operate_time >", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_operate_time >=", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeLessThan(Date value) {
            addCriterion("user_operate_time <", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_operate_time <=", value, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeIn(List<Date> values) {
            addCriterion("user_operate_time in", values, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeNotIn(List<Date> values) {
            addCriterion("user_operate_time not in", values, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeBetween(Date value1, Date value2) {
            addCriterion("user_operate_time between", value1, value2, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_operate_time not between", value1, value2, "userOperateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountIsNull() {
            addCriterion("user_operate_account is null");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountIsNotNull() {
            addCriterion("user_operate_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountEqualTo(String value) {
            addCriterion("user_operate_account =", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountNotEqualTo(String value) {
            addCriterion("user_operate_account <>", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountGreaterThan(String value) {
            addCriterion("user_operate_account >", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_operate_account >=", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountLessThan(String value) {
            addCriterion("user_operate_account <", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountLessThanOrEqualTo(String value) {
            addCriterion("user_operate_account <=", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountLike(String value) {
            addCriterion("user_operate_account like", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountNotLike(String value) {
            addCriterion("user_operate_account not like", value, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountIn(List<String> values) {
            addCriterion("user_operate_account in", values, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountNotIn(List<String> values) {
            addCriterion("user_operate_account not in", values, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountBetween(String value1, String value2) {
            addCriterion("user_operate_account between", value1, value2, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateAccountNotBetween(String value1, String value2) {
            addCriterion("user_operate_account not between", value1, value2, "userOperateAccount");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdIsNull() {
            addCriterion("user_operate_project_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdIsNotNull() {
            addCriterion("user_operate_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdEqualTo(String value) {
            addCriterion("user_operate_project_id =", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdNotEqualTo(String value) {
            addCriterion("user_operate_project_id <>", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdGreaterThan(String value) {
            addCriterion("user_operate_project_id >", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_operate_project_id >=", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdLessThan(String value) {
            addCriterion("user_operate_project_id <", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdLessThanOrEqualTo(String value) {
            addCriterion("user_operate_project_id <=", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdLike(String value) {
            addCriterion("user_operate_project_id like", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdNotLike(String value) {
            addCriterion("user_operate_project_id not like", value, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdIn(List<String> values) {
            addCriterion("user_operate_project_id in", values, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdNotIn(List<String> values) {
            addCriterion("user_operate_project_id not in", values, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdBetween(String value1, String value2) {
            addCriterion("user_operate_project_id between", value1, value2, "userOperateProjectId");
            return (Criteria) this;
        }

        public Criteria andUserOperateProjectIdNotBetween(String value1, String value2) {
            addCriterion("user_operate_project_id not between", value1, value2, "userOperateProjectId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_operate_log
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
     * This class corresponds to the database table user_operate_log
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