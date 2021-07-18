package org.cqu.pojo;


import java.util.ArrayList;
import java.util.List;

public class BuyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("BID not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("BName is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("BName is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("BName =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("BName <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("BName >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("BName >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("BName <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("BName <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("BName like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("BName not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("BName in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("BName not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("BName between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("BName not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBgenderIsNull() {
            addCriterion("BGender is null");
            return (Criteria) this;
        }

        public Criteria andBgenderIsNotNull() {
            addCriterion("BGender is not null");
            return (Criteria) this;
        }

        public Criteria andBgenderEqualTo(Integer value) {
            addCriterion("BGender =", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderNotEqualTo(Integer value) {
            addCriterion("BGender <>", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderGreaterThan(Integer value) {
            addCriterion("BGender >", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("BGender >=", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderLessThan(Integer value) {
            addCriterion("BGender <", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderLessThanOrEqualTo(Integer value) {
            addCriterion("BGender <=", value, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderIn(List<Integer> values) {
            addCriterion("BGender in", values, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderNotIn(List<Integer> values) {
            addCriterion("BGender not in", values, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderBetween(Integer value1, Integer value2) {
            addCriterion("BGender between", value1, value2, "bgender");
            return (Criteria) this;
        }

        public Criteria andBgenderNotBetween(Integer value1, Integer value2) {
            addCriterion("BGender not between", value1, value2, "bgender");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNull() {
            addCriterion("BAddress is null");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNotNull() {
            addCriterion("BAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBaddressEqualTo(String value) {
            addCriterion("BAddress =", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotEqualTo(String value) {
            addCriterion("BAddress <>", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThan(String value) {
            addCriterion("BAddress >", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThanOrEqualTo(String value) {
            addCriterion("BAddress >=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThan(String value) {
            addCriterion("BAddress <", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThanOrEqualTo(String value) {
            addCriterion("BAddress <=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLike(String value) {
            addCriterion("BAddress like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotLike(String value) {
            addCriterion("BAddress not like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressIn(List<String> values) {
            addCriterion("BAddress in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotIn(List<String> values) {
            addCriterion("BAddress not in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressBetween(String value1, String value2) {
            addCriterion("BAddress between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotBetween(String value1, String value2) {
            addCriterion("BAddress not between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBvipIsNull() {
            addCriterion("BVIP is null");
            return (Criteria) this;
        }

        public Criteria andBvipIsNotNull() {
            addCriterion("BVIP is not null");
            return (Criteria) this;
        }

        public Criteria andBvipEqualTo(Integer value) {
            addCriterion("BVIP =", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipNotEqualTo(Integer value) {
            addCriterion("BVIP <>", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipGreaterThan(Integer value) {
            addCriterion("BVIP >", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("BVIP >=", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipLessThan(Integer value) {
            addCriterion("BVIP <", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipLessThanOrEqualTo(Integer value) {
            addCriterion("BVIP <=", value, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipIn(List<Integer> values) {
            addCriterion("BVIP in", values, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipNotIn(List<Integer> values) {
            addCriterion("BVIP not in", values, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipBetween(Integer value1, Integer value2) {
            addCriterion("BVIP between", value1, value2, "bvip");
            return (Criteria) this;
        }

        public Criteria andBvipNotBetween(Integer value1, Integer value2) {
            addCriterion("BVIP not between", value1, value2, "bvip");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNull() {
            addCriterion("BPassword is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNotNull() {
            addCriterion("BPassword is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordEqualTo(String value) {
            addCriterion("BPassword =", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotEqualTo(String value) {
            addCriterion("BPassword <>", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThan(String value) {
            addCriterion("BPassword >", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("BPassword >=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThan(String value) {
            addCriterion("BPassword <", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThanOrEqualTo(String value) {
            addCriterion("BPassword <=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLike(String value) {
            addCriterion("BPassword like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotLike(String value) {
            addCriterion("BPassword not like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordIn(List<String> values) {
            addCriterion("BPassword in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotIn(List<String> values) {
            addCriterion("BPassword not in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordBetween(String value1, String value2) {
            addCriterion("BPassword between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotBetween(String value1, String value2) {
            addCriterion("BPassword not between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBiconIsNull() {
            addCriterion("BIcon is null");
            return (Criteria) this;
        }

        public Criteria andBiconIsNotNull() {
            addCriterion("BIcon is not null");
            return (Criteria) this;
        }

        public Criteria andBiconEqualTo(String value) {
            addCriterion("BIcon =", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconNotEqualTo(String value) {
            addCriterion("BIcon <>", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconGreaterThan(String value) {
            addCriterion("BIcon >", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconGreaterThanOrEqualTo(String value) {
            addCriterion("BIcon >=", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconLessThan(String value) {
            addCriterion("BIcon <", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconLessThanOrEqualTo(String value) {
            addCriterion("BIcon <=", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconLike(String value) {
            addCriterion("BIcon like", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconNotLike(String value) {
            addCriterion("BIcon not like", value, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconIn(List<String> values) {
            addCriterion("BIcon in", values, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconNotIn(List<String> values) {
            addCriterion("BIcon not in", values, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconBetween(String value1, String value2) {
            addCriterion("BIcon between", value1, value2, "bicon");
            return (Criteria) this;
        }

        public Criteria andBiconNotBetween(String value1, String value2) {
            addCriterion("BIcon not between", value1, value2, "bicon");
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