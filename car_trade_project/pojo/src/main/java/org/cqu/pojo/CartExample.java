package org.cqu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartidIsNull() {
            addCriterion("CartID is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("CartID is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("CartID =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("CartID <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("CartID >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CartID >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("CartID <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("CartID <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("CartID in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("CartID not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("CartID between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("CartID not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartdateIsNull() {
            addCriterion("CartDate is null");
            return (Criteria) this;
        }

        public Criteria andCartdateIsNotNull() {
            addCriterion("CartDate is not null");
            return (Criteria) this;
        }

        public Criteria andCartdateEqualTo(Date value) {
            addCriterion("CartDate =", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateNotEqualTo(Date value) {
            addCriterion("CartDate <>", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateGreaterThan(Date value) {
            addCriterion("CartDate >", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CartDate >=", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateLessThan(Date value) {
            addCriterion("CartDate <", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateLessThanOrEqualTo(Date value) {
            addCriterion("CartDate <=", value, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateIn(List<Date> values) {
            addCriterion("CartDate in", values, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateNotIn(List<Date> values) {
            addCriterion("CartDate not in", values, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateBetween(Date value1, Date value2) {
            addCriterion("CartDate between", value1, value2, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartdateNotBetween(Date value1, Date value2) {
            addCriterion("CartDate not between", value1, value2, "cartdate");
            return (Criteria) this;
        }

        public Criteria andCartpriceIsNull() {
            addCriterion("CartPrice is null");
            return (Criteria) this;
        }

        public Criteria andCartpriceIsNotNull() {
            addCriterion("CartPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCartpriceEqualTo(Integer value) {
            addCriterion("CartPrice =", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceNotEqualTo(Integer value) {
            addCriterion("CartPrice <>", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceGreaterThan(Integer value) {
            addCriterion("CartPrice >", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("CartPrice >=", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceLessThan(Integer value) {
            addCriterion("CartPrice <", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceLessThanOrEqualTo(Integer value) {
            addCriterion("CartPrice <=", value, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceIn(List<Integer> values) {
            addCriterion("CartPrice in", values, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceNotIn(List<Integer> values) {
            addCriterion("CartPrice not in", values, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceBetween(Integer value1, Integer value2) {
            addCriterion("CartPrice between", value1, value2, "cartprice");
            return (Criteria) this;
        }

        public Criteria andCartpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("CartPrice not between", value1, value2, "cartprice");
            return (Criteria) this;
        }

        public Criteria andBtelIsNull() {
            addCriterion("BTel is null");
            return (Criteria) this;
        }

        public Criteria andBtelIsNotNull() {
            addCriterion("BTel is not null");
            return (Criteria) this;
        }

        public Criteria andBtelEqualTo(String value) {
            addCriterion("BTel =", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotEqualTo(String value) {
            addCriterion("BTel <>", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelGreaterThan(String value) {
            addCriterion("BTel >", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelGreaterThanOrEqualTo(String value) {
            addCriterion("BTel >=", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLessThan(String value) {
            addCriterion("BTel <", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLessThanOrEqualTo(String value) {
            addCriterion("BTel <=", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLike(String value) {
            addCriterion("BTel like", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotLike(String value) {
            addCriterion("BTel not like", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelIn(List<String> values) {
            addCriterion("BTel in", values, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotIn(List<String> values) {
            addCriterion("BTel not in", values, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelBetween(String value1, String value2) {
            addCriterion("BTel between", value1, value2, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotBetween(String value1, String value2) {
            addCriterion("BTel not between", value1, value2, "btel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
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