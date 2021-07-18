package org.cqu.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("CName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNull() {
            addCriterion("CPrice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("CPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(Float value) {
            addCriterion("CPrice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(Float value) {
            addCriterion("CPrice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(Float value) {
            addCriterion("CPrice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("CPrice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(Float value) {
            addCriterion("CPrice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(Float value) {
            addCriterion("CPrice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<Float> values) {
            addCriterion("CPrice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<Float> values) {
            addCriterion("CPrice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(Float value1, Float value2) {
            addCriterion("CPrice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(Float value1, Float value2) {
            addCriterion("CPrice not between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCspeedIsNull() {
            addCriterion("CSpeed is null");
            return (Criteria) this;
        }

        public Criteria andCspeedIsNotNull() {
            addCriterion("CSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andCspeedEqualTo(Integer value) {
            addCriterion("CSpeed =", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedNotEqualTo(Integer value) {
            addCriterion("CSpeed <>", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedGreaterThan(Integer value) {
            addCriterion("CSpeed >", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSpeed >=", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedLessThan(Integer value) {
            addCriterion("CSpeed <", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedLessThanOrEqualTo(Integer value) {
            addCriterion("CSpeed <=", value, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedIn(List<Integer> values) {
            addCriterion("CSpeed in", values, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedNotIn(List<Integer> values) {
            addCriterion("CSpeed not in", values, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedBetween(Integer value1, Integer value2) {
            addCriterion("CSpeed between", value1, value2, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCspeedNotBetween(Integer value1, Integer value2) {
            addCriterion("CSpeed not between", value1, value2, "cspeed");
            return (Criteria) this;
        }

        public Criteria andCfuelIsNull() {
            addCriterion("CFuel is null");
            return (Criteria) this;
        }

        public Criteria andCfuelIsNotNull() {
            addCriterion("CFuel is not null");
            return (Criteria) this;
        }

        public Criteria andCfuelEqualTo(String value) {
            addCriterion("CFuel =", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotEqualTo(String value) {
            addCriterion("CFuel <>", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelGreaterThan(String value) {
            addCriterion("CFuel >", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelGreaterThanOrEqualTo(String value) {
            addCriterion("CFuel >=", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLessThan(String value) {
            addCriterion("CFuel <", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLessThanOrEqualTo(String value) {
            addCriterion("CFuel <=", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelLike(String value) {
            addCriterion("CFuel like", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotLike(String value) {
            addCriterion("CFuel not like", value, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelIn(List<String> values) {
            addCriterion("CFuel in", values, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotIn(List<String> values) {
            addCriterion("CFuel not in", values, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelBetween(String value1, String value2) {
            addCriterion("CFuel between", value1, value2, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCfuelNotBetween(String value1, String value2) {
            addCriterion("CFuel not between", value1, value2, "cfuel");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("CType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("CType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("CType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("CType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("CType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("CType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("CType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("CType like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("CType not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("CType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("CType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("CType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("CType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCgearIsNull() {
            addCriterion("CGear is null");
            return (Criteria) this;
        }

        public Criteria andCgearIsNotNull() {
            addCriterion("CGear is not null");
            return (Criteria) this;
        }

        public Criteria andCgearEqualTo(String value) {
            addCriterion("CGear =", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearNotEqualTo(String value) {
            addCriterion("CGear <>", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearGreaterThan(String value) {
            addCriterion("CGear >", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearGreaterThanOrEqualTo(String value) {
            addCriterion("CGear >=", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearLessThan(String value) {
            addCriterion("CGear <", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearLessThanOrEqualTo(String value) {
            addCriterion("CGear <=", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearLike(String value) {
            addCriterion("CGear like", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearNotLike(String value) {
            addCriterion("CGear not like", value, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearIn(List<String> values) {
            addCriterion("CGear in", values, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearNotIn(List<String> values) {
            addCriterion("CGear not in", values, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearBetween(String value1, String value2) {
            addCriterion("CGear between", value1, value2, "cgear");
            return (Criteria) this;
        }

        public Criteria andCgearNotBetween(String value1, String value2) {
            addCriterion("CGear not between", value1, value2, "cgear");
            return (Criteria) this;
        }

        public Criteria andCwarrantyIsNull() {
            addCriterion("Cwarranty is null");
            return (Criteria) this;
        }

        public Criteria andCwarrantyIsNotNull() {
            addCriterion("Cwarranty is not null");
            return (Criteria) this;
        }

        public Criteria andCwarrantyEqualTo(Integer value) {
            addCriterion("Cwarranty =", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyNotEqualTo(Integer value) {
            addCriterion("Cwarranty <>", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyGreaterThan(Integer value) {
            addCriterion("Cwarranty >", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cwarranty >=", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyLessThan(Integer value) {
            addCriterion("Cwarranty <", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyLessThanOrEqualTo(Integer value) {
            addCriterion("Cwarranty <=", value, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyIn(List<Integer> values) {
            addCriterion("Cwarranty in", values, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyNotIn(List<Integer> values) {
            addCriterion("Cwarranty not in", values, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyBetween(Integer value1, Integer value2) {
            addCriterion("Cwarranty between", value1, value2, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCwarrantyNotBetween(Integer value1, Integer value2) {
            addCriterion("Cwarranty not between", value1, value2, "cwarranty");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityIsNull() {
            addCriterion("Ctank_capacity is null");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityIsNotNull() {
            addCriterion("Ctank_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityEqualTo(Integer value) {
            addCriterion("Ctank_capacity =", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityNotEqualTo(Integer value) {
            addCriterion("Ctank_capacity <>", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityGreaterThan(Integer value) {
            addCriterion("Ctank_capacity >", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ctank_capacity >=", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityLessThan(Integer value) {
            addCriterion("Ctank_capacity <", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("Ctank_capacity <=", value, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityIn(List<Integer> values) {
            addCriterion("Ctank_capacity in", values, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityNotIn(List<Integer> values) {
            addCriterion("Ctank_capacity not in", values, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityBetween(Integer value1, Integer value2) {
            addCriterion("Ctank_capacity between", value1, value2, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCtankCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("Ctank_capacity not between", value1, value2, "ctankCapacity");
            return (Criteria) this;
        }

        public Criteria andCaccelerationIsNull() {
            addCriterion("CAcceleration is null");
            return (Criteria) this;
        }

        public Criteria andCaccelerationIsNotNull() {
            addCriterion("CAcceleration is not null");
            return (Criteria) this;
        }

        public Criteria andCaccelerationEqualTo(Float value) {
            addCriterion("CAcceleration =", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationNotEqualTo(Float value) {
            addCriterion("CAcceleration <>", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationGreaterThan(Float value) {
            addCriterion("CAcceleration >", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationGreaterThanOrEqualTo(Float value) {
            addCriterion("CAcceleration >=", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationLessThan(Float value) {
            addCriterion("CAcceleration <", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationLessThanOrEqualTo(Float value) {
            addCriterion("CAcceleration <=", value, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationIn(List<Float> values) {
            addCriterion("CAcceleration in", values, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationNotIn(List<Float> values) {
            addCriterion("CAcceleration not in", values, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationBetween(Float value1, Float value2) {
            addCriterion("CAcceleration between", value1, value2, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCaccelerationNotBetween(Float value1, Float value2) {
            addCriterion("CAcceleration not between", value1, value2, "cacceleration");
            return (Criteria) this;
        }

        public Criteria andCpic5IsNull() {
            addCriterion("CPic5 is null");
            return (Criteria) this;
        }

        public Criteria andCpic5IsNotNull() {
            addCriterion("CPic5 is not null");
            return (Criteria) this;
        }

        public Criteria andCpic5EqualTo(String value) {
            addCriterion("CPic5 =", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5NotEqualTo(String value) {
            addCriterion("CPic5 <>", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5GreaterThan(String value) {
            addCriterion("CPic5 >", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5GreaterThanOrEqualTo(String value) {
            addCriterion("CPic5 >=", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5LessThan(String value) {
            addCriterion("CPic5 <", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5LessThanOrEqualTo(String value) {
            addCriterion("CPic5 <=", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5Like(String value) {
            addCriterion("CPic5 like", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5NotLike(String value) {
            addCriterion("CPic5 not like", value, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5In(List<String> values) {
            addCriterion("CPic5 in", values, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5NotIn(List<String> values) {
            addCriterion("CPic5 not in", values, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5Between(String value1, String value2) {
            addCriterion("CPic5 between", value1, value2, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic5NotBetween(String value1, String value2) {
            addCriterion("CPic5 not between", value1, value2, "cpic5");
            return (Criteria) this;
        }

        public Criteria andCpic4IsNull() {
            addCriterion("CPic4 is null");
            return (Criteria) this;
        }

        public Criteria andCpic4IsNotNull() {
            addCriterion("CPic4 is not null");
            return (Criteria) this;
        }

        public Criteria andCpic4EqualTo(String value) {
            addCriterion("CPic4 =", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4NotEqualTo(String value) {
            addCriterion("CPic4 <>", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4GreaterThan(String value) {
            addCriterion("CPic4 >", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4GreaterThanOrEqualTo(String value) {
            addCriterion("CPic4 >=", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4LessThan(String value) {
            addCriterion("CPic4 <", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4LessThanOrEqualTo(String value) {
            addCriterion("CPic4 <=", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4Like(String value) {
            addCriterion("CPic4 like", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4NotLike(String value) {
            addCriterion("CPic4 not like", value, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4In(List<String> values) {
            addCriterion("CPic4 in", values, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4NotIn(List<String> values) {
            addCriterion("CPic4 not in", values, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4Between(String value1, String value2) {
            addCriterion("CPic4 between", value1, value2, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic4NotBetween(String value1, String value2) {
            addCriterion("CPic4 not between", value1, value2, "cpic4");
            return (Criteria) this;
        }

        public Criteria andCpic3IsNull() {
            addCriterion("CPic3 is null");
            return (Criteria) this;
        }

        public Criteria andCpic3IsNotNull() {
            addCriterion("CPic3 is not null");
            return (Criteria) this;
        }

        public Criteria andCpic3EqualTo(String value) {
            addCriterion("CPic3 =", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3NotEqualTo(String value) {
            addCriterion("CPic3 <>", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3GreaterThan(String value) {
            addCriterion("CPic3 >", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3GreaterThanOrEqualTo(String value) {
            addCriterion("CPic3 >=", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3LessThan(String value) {
            addCriterion("CPic3 <", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3LessThanOrEqualTo(String value) {
            addCriterion("CPic3 <=", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3Like(String value) {
            addCriterion("CPic3 like", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3NotLike(String value) {
            addCriterion("CPic3 not like", value, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3In(List<String> values) {
            addCriterion("CPic3 in", values, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3NotIn(List<String> values) {
            addCriterion("CPic3 not in", values, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3Between(String value1, String value2) {
            addCriterion("CPic3 between", value1, value2, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic3NotBetween(String value1, String value2) {
            addCriterion("CPic3 not between", value1, value2, "cpic3");
            return (Criteria) this;
        }

        public Criteria andCpic1IsNull() {
            addCriterion("CPic1 is null");
            return (Criteria) this;
        }

        public Criteria andCpic1IsNotNull() {
            addCriterion("CPic1 is not null");
            return (Criteria) this;
        }

        public Criteria andCpic1EqualTo(String value) {
            addCriterion("CPic1 =", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1NotEqualTo(String value) {
            addCriterion("CPic1 <>", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1GreaterThan(String value) {
            addCriterion("CPic1 >", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1GreaterThanOrEqualTo(String value) {
            addCriterion("CPic1 >=", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1LessThan(String value) {
            addCriterion("CPic1 <", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1LessThanOrEqualTo(String value) {
            addCriterion("CPic1 <=", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1Like(String value) {
            addCriterion("CPic1 like", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1NotLike(String value) {
            addCriterion("CPic1 not like", value, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1In(List<String> values) {
            addCriterion("CPic1 in", values, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1NotIn(List<String> values) {
            addCriterion("CPic1 not in", values, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1Between(String value1, String value2) {
            addCriterion("CPic1 between", value1, value2, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic1NotBetween(String value1, String value2) {
            addCriterion("CPic1 not between", value1, value2, "cpic1");
            return (Criteria) this;
        }

        public Criteria andCpic2IsNull() {
            addCriterion("CPic2 is null");
            return (Criteria) this;
        }

        public Criteria andCpic2IsNotNull() {
            addCriterion("CPic2 is not null");
            return (Criteria) this;
        }

        public Criteria andCpic2EqualTo(String value) {
            addCriterion("CPic2 =", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2NotEqualTo(String value) {
            addCriterion("CPic2 <>", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2GreaterThan(String value) {
            addCriterion("CPic2 >", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2GreaterThanOrEqualTo(String value) {
            addCriterion("CPic2 >=", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2LessThan(String value) {
            addCriterion("CPic2 <", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2LessThanOrEqualTo(String value) {
            addCriterion("CPic2 <=", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2Like(String value) {
            addCriterion("CPic2 like", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2NotLike(String value) {
            addCriterion("CPic2 not like", value, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2In(List<String> values) {
            addCriterion("CPic2 in", values, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2NotIn(List<String> values) {
            addCriterion("CPic2 not in", values, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2Between(String value1, String value2) {
            addCriterion("CPic2 between", value1, value2, "cpic2");
            return (Criteria) this;
        }

        public Criteria andCpic2NotBetween(String value1, String value2) {
            addCriterion("CPic2 not between", value1, value2, "cpic2");
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