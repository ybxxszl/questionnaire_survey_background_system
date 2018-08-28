package com.vo;

import java.util.ArrayList;
import java.util.List;

public class TextAnswerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public TextAnswerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
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
     * This method corresponds to the database table text_answer
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
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
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
     * This class corresponds to the database table text_answer
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

        public Criteria andTextAnswerIdIsNull() {
            addCriterion("text_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdIsNotNull() {
            addCriterion("text_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdEqualTo(String value) {
            addCriterion("text_answer_id =", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdNotEqualTo(String value) {
            addCriterion("text_answer_id <>", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdGreaterThan(String value) {
            addCriterion("text_answer_id >", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdGreaterThanOrEqualTo(String value) {
            addCriterion("text_answer_id >=", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdLessThan(String value) {
            addCriterion("text_answer_id <", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdLessThanOrEqualTo(String value) {
            addCriterion("text_answer_id <=", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdLike(String value) {
            addCriterion("text_answer_id like", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdNotLike(String value) {
            addCriterion("text_answer_id not like", value, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdIn(List<String> values) {
            addCriterion("text_answer_id in", values, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdNotIn(List<String> values) {
            addCriterion("text_answer_id not in", values, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdBetween(String value1, String value2) {
            addCriterion("text_answer_id between", value1, value2, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerIdNotBetween(String value1, String value2) {
            addCriterion("text_answer_id not between", value1, value2, "textAnswerId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdIsNull() {
            addCriterion("design_text_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdIsNotNull() {
            addCriterion("design_text_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdEqualTo(String value) {
            addCriterion("design_text_id =", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdNotEqualTo(String value) {
            addCriterion("design_text_id <>", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdGreaterThan(String value) {
            addCriterion("design_text_id >", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdGreaterThanOrEqualTo(String value) {
            addCriterion("design_text_id >=", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdLessThan(String value) {
            addCriterion("design_text_id <", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdLessThanOrEqualTo(String value) {
            addCriterion("design_text_id <=", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdLike(String value) {
            addCriterion("design_text_id like", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdNotLike(String value) {
            addCriterion("design_text_id not like", value, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdIn(List<String> values) {
            addCriterion("design_text_id in", values, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdNotIn(List<String> values) {
            addCriterion("design_text_id not in", values, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdBetween(String value1, String value2) {
            addCriterion("design_text_id between", value1, value2, "designTextId");
            return (Criteria) this;
        }

        public Criteria andDesignTextIdNotBetween(String value1, String value2) {
            addCriterion("design_text_id not between", value1, value2, "designTextId");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentIsNull() {
            addCriterion("text_answer_content is null");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentIsNotNull() {
            addCriterion("text_answer_content is not null");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentEqualTo(String value) {
            addCriterion("text_answer_content =", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentNotEqualTo(String value) {
            addCriterion("text_answer_content <>", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentGreaterThan(String value) {
            addCriterion("text_answer_content >", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentGreaterThanOrEqualTo(String value) {
            addCriterion("text_answer_content >=", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentLessThan(String value) {
            addCriterion("text_answer_content <", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentLessThanOrEqualTo(String value) {
            addCriterion("text_answer_content <=", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentLike(String value) {
            addCriterion("text_answer_content like", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentNotLike(String value) {
            addCriterion("text_answer_content not like", value, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentIn(List<String> values) {
            addCriterion("text_answer_content in", values, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentNotIn(List<String> values) {
            addCriterion("text_answer_content not in", values, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentBetween(String value1, String value2) {
            addCriterion("text_answer_content between", value1, value2, "textAnswerContent");
            return (Criteria) this;
        }

        public Criteria andTextAnswerContentNotBetween(String value1, String value2) {
            addCriterion("text_answer_content not between", value1, value2, "textAnswerContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table text_answer
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
     * This class corresponds to the database table text_answer
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