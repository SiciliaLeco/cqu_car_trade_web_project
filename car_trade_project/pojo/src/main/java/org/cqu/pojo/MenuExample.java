package org.cqu.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("OID is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("OID is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("OID =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("OID <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("OID >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OID >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("OID <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("OID <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("OID in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("OID not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("OID between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("OID not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andStelIsNull() {
            addCriterion("STel is null");
            return (Criteria) this;
        }

        public Criteria andStelIsNotNull() {
            addCriterion("STel is not null");
            return (Criteria) this;
        }

        public Criteria andStelEqualTo(String value) {
            addCriterion("STel =", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotEqualTo(String value) {
            addCriterion("STel <>", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThan(String value) {
            addCriterion("STel >", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThanOrEqualTo(String value) {
            addCriterion("STel >=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThan(String value) {
            addCriterion("STel <", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThanOrEqualTo(String value) {
            addCriterion("STel <=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLike(String value) {
            addCriterion("STel like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotLike(String value) {
            addCriterion("STel not like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelIn(List<String> values) {
            addCriterion("STel in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotIn(List<String> values) {
            addCriterion("STel not in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelBetween(String value1, String value2) {
            addCriterion("STel between", value1, value2, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotBetween(String value1, String value2) {
            addCriterion("STel not between", value1, value2, "stel");
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

        public Criteria andOdateIsNull() {
            addCriterion("ODate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("ODate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(Date value) {
            addCriterion("ODate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(Date value) {
            addCriterion("ODate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(Date value) {
            addCriterion("ODate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ODate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(Date value) {
            addCriterion("ODate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(Date value) {
            addCriterion("ODate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<Date> values) {
            addCriterion("ODate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<Date> values) {
            addCriterion("ODate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(Date value1, Date value2) {
            addCriterion("ODate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(Date value1, Date value2) {
            addCriterion("ODate not between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNull() {
            addCriterion("Oprice is null");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNotNull() {
            addCriterion("Oprice is not null");
            return (Criteria) this;
        }

        public Criteria andOpriceEqualTo(Integer value) {
            addCriterion("Oprice =", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotEqualTo(Integer value) {
            addCriterion("Oprice <>", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThan(Integer value) {
            addCriterion("Oprice >", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Oprice >=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThan(Integer value) {
            addCriterion("Oprice <", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThanOrEqualTo(Integer value) {
            addCriterion("Oprice <=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceIn(List<Integer> values) {
            addCriterion("Oprice in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotIn(List<Integer> values) {
            addCriterion("Oprice not in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceBetween(Integer value1, Integer value2) {
            addCriterion("Oprice between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("Oprice not between", value1, value2, "oprice");
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