package com.vo;

import java.util.ArrayList;
import java.util.List;

public class SortExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public SortExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
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
     * This method corresponds to the database table sort
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
     * This method corresponds to the database table sort
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort
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
     * This class corresponds to the database table sort
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

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(String value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(String value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(String value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(String value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(String value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(String value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLike(String value) {
            addCriterion("sort_id like", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotLike(String value) {
            addCriterion("sort_id not like", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<String> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<String> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(String value1, String value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(String value1, String value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNull() {
            addCriterion("sort_name is null");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNotNull() {
            addCriterion("sort_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortNameEqualTo(String value) {
            addCriterion("sort_name =", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotEqualTo(String value) {
            addCriterion("sort_name <>", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThan(String value) {
            addCriterion("sort_name >", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThanOrEqualTo(String value) {
            addCriterion("sort_name >=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThan(String value) {
            addCriterion("sort_name <", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThanOrEqualTo(String value) {
            addCriterion("sort_name <=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLike(String value) {
            addCriterion("sort_name like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotLike(String value) {
            addCriterion("sort_name not like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameIn(List<String> values) {
            addCriterion("sort_name in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotIn(List<String> values) {
            addCriterion("sort_name not in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameBetween(String value1, String value2) {
            addCriterion("sort_name between", value1, value2, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotBetween(String value1, String value2) {
            addCriterion("sort_name not between", value1, value2, "sortName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sort
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
     * This class corresponds to the database table sort
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