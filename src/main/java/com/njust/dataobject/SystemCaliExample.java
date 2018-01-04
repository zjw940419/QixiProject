package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemCaliExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemCaliExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLsensor1IsNull() {
            addCriterion("lsensor1 is null");
            return (Criteria) this;
        }

        public Criteria andLsensor1IsNotNull() {
            addCriterion("lsensor1 is not null");
            return (Criteria) this;
        }

        public Criteria andLsensor1EqualTo(Double value) {
            addCriterion("lsensor1 =", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1NotEqualTo(Double value) {
            addCriterion("lsensor1 <>", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1GreaterThan(Double value) {
            addCriterion("lsensor1 >", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1GreaterThanOrEqualTo(Double value) {
            addCriterion("lsensor1 >=", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1LessThan(Double value) {
            addCriterion("lsensor1 <", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1LessThanOrEqualTo(Double value) {
            addCriterion("lsensor1 <=", value, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1In(List<Double> values) {
            addCriterion("lsensor1 in", values, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1NotIn(List<Double> values) {
            addCriterion("lsensor1 not in", values, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1Between(Double value1, Double value2) {
            addCriterion("lsensor1 between", value1, value2, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor1NotBetween(Double value1, Double value2) {
            addCriterion("lsensor1 not between", value1, value2, "lsensor1");
            return (Criteria) this;
        }

        public Criteria andLsensor2IsNull() {
            addCriterion("lsensor2 is null");
            return (Criteria) this;
        }

        public Criteria andLsensor2IsNotNull() {
            addCriterion("lsensor2 is not null");
            return (Criteria) this;
        }

        public Criteria andLsensor2EqualTo(Double value) {
            addCriterion("lsensor2 =", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2NotEqualTo(Double value) {
            addCriterion("lsensor2 <>", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2GreaterThan(Double value) {
            addCriterion("lsensor2 >", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2GreaterThanOrEqualTo(Double value) {
            addCriterion("lsensor2 >=", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2LessThan(Double value) {
            addCriterion("lsensor2 <", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2LessThanOrEqualTo(Double value) {
            addCriterion("lsensor2 <=", value, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2In(List<Double> values) {
            addCriterion("lsensor2 in", values, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2NotIn(List<Double> values) {
            addCriterion("lsensor2 not in", values, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2Between(Double value1, Double value2) {
            addCriterion("lsensor2 between", value1, value2, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor2NotBetween(Double value1, Double value2) {
            addCriterion("lsensor2 not between", value1, value2, "lsensor2");
            return (Criteria) this;
        }

        public Criteria andLsensor3IsNull() {
            addCriterion("lsensor3 is null");
            return (Criteria) this;
        }

        public Criteria andLsensor3IsNotNull() {
            addCriterion("lsensor3 is not null");
            return (Criteria) this;
        }

        public Criteria andLsensor3EqualTo(Double value) {
            addCriterion("lsensor3 =", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3NotEqualTo(Double value) {
            addCriterion("lsensor3 <>", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3GreaterThan(Double value) {
            addCriterion("lsensor3 >", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3GreaterThanOrEqualTo(Double value) {
            addCriterion("lsensor3 >=", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3LessThan(Double value) {
            addCriterion("lsensor3 <", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3LessThanOrEqualTo(Double value) {
            addCriterion("lsensor3 <=", value, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3In(List<Double> values) {
            addCriterion("lsensor3 in", values, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3NotIn(List<Double> values) {
            addCriterion("lsensor3 not in", values, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3Between(Double value1, Double value2) {
            addCriterion("lsensor3 between", value1, value2, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andLsensor3NotBetween(Double value1, Double value2) {
            addCriterion("lsensor3 not between", value1, value2, "lsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor1IsNull() {
            addCriterion("rsensor1 is null");
            return (Criteria) this;
        }

        public Criteria andRsensor1IsNotNull() {
            addCriterion("rsensor1 is not null");
            return (Criteria) this;
        }

        public Criteria andRsensor1EqualTo(Double value) {
            addCriterion("rsensor1 =", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1NotEqualTo(Double value) {
            addCriterion("rsensor1 <>", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1GreaterThan(Double value) {
            addCriterion("rsensor1 >", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1GreaterThanOrEqualTo(Double value) {
            addCriterion("rsensor1 >=", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1LessThan(Double value) {
            addCriterion("rsensor1 <", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1LessThanOrEqualTo(Double value) {
            addCriterion("rsensor1 <=", value, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1In(List<Double> values) {
            addCriterion("rsensor1 in", values, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1NotIn(List<Double> values) {
            addCriterion("rsensor1 not in", values, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1Between(Double value1, Double value2) {
            addCriterion("rsensor1 between", value1, value2, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor1NotBetween(Double value1, Double value2) {
            addCriterion("rsensor1 not between", value1, value2, "rsensor1");
            return (Criteria) this;
        }

        public Criteria andRsensor2IsNull() {
            addCriterion("rsensor2 is null");
            return (Criteria) this;
        }

        public Criteria andRsensor2IsNotNull() {
            addCriterion("rsensor2 is not null");
            return (Criteria) this;
        }

        public Criteria andRsensor2EqualTo(Double value) {
            addCriterion("rsensor2 =", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2NotEqualTo(Double value) {
            addCriterion("rsensor2 <>", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2GreaterThan(Double value) {
            addCriterion("rsensor2 >", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2GreaterThanOrEqualTo(Double value) {
            addCriterion("rsensor2 >=", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2LessThan(Double value) {
            addCriterion("rsensor2 <", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2LessThanOrEqualTo(Double value) {
            addCriterion("rsensor2 <=", value, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2In(List<Double> values) {
            addCriterion("rsensor2 in", values, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2NotIn(List<Double> values) {
            addCriterion("rsensor2 not in", values, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2Between(Double value1, Double value2) {
            addCriterion("rsensor2 between", value1, value2, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor2NotBetween(Double value1, Double value2) {
            addCriterion("rsensor2 not between", value1, value2, "rsensor2");
            return (Criteria) this;
        }

        public Criteria andRsensor3IsNull() {
            addCriterion("rsensor3 is null");
            return (Criteria) this;
        }

        public Criteria andRsensor3IsNotNull() {
            addCriterion("rsensor3 is not null");
            return (Criteria) this;
        }

        public Criteria andRsensor3EqualTo(Double value) {
            addCriterion("rsensor3 =", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3NotEqualTo(Double value) {
            addCriterion("rsensor3 <>", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3GreaterThan(Double value) {
            addCriterion("rsensor3 >", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3GreaterThanOrEqualTo(Double value) {
            addCriterion("rsensor3 >=", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3LessThan(Double value) {
            addCriterion("rsensor3 <", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3LessThanOrEqualTo(Double value) {
            addCriterion("rsensor3 <=", value, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3In(List<Double> values) {
            addCriterion("rsensor3 in", values, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3NotIn(List<Double> values) {
            addCriterion("rsensor3 not in", values, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3Between(Double value1, Double value2) {
            addCriterion("rsensor3 between", value1, value2, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andRsensor3NotBetween(Double value1, Double value2) {
            addCriterion("rsensor3 not between", value1, value2, "rsensor3");
            return (Criteria) this;
        }

        public Criteria andLrailplaneIsNull() {
            addCriterion("lrailplane is null");
            return (Criteria) this;
        }

        public Criteria andLrailplaneIsNotNull() {
            addCriterion("lrailplane is not null");
            return (Criteria) this;
        }

        public Criteria andLrailplaneEqualTo(Double value) {
            addCriterion("lrailplane =", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneNotEqualTo(Double value) {
            addCriterion("lrailplane <>", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneGreaterThan(Double value) {
            addCriterion("lrailplane >", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneGreaterThanOrEqualTo(Double value) {
            addCriterion("lrailplane >=", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneLessThan(Double value) {
            addCriterion("lrailplane <", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneLessThanOrEqualTo(Double value) {
            addCriterion("lrailplane <=", value, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneIn(List<Double> values) {
            addCriterion("lrailplane in", values, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneNotIn(List<Double> values) {
            addCriterion("lrailplane not in", values, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneBetween(Double value1, Double value2) {
            addCriterion("lrailplane between", value1, value2, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andLrailplaneNotBetween(Double value1, Double value2) {
            addCriterion("lrailplane not between", value1, value2, "lrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneIsNull() {
            addCriterion("rrailplane is null");
            return (Criteria) this;
        }

        public Criteria andRrailplaneIsNotNull() {
            addCriterion("rrailplane is not null");
            return (Criteria) this;
        }

        public Criteria andRrailplaneEqualTo(Double value) {
            addCriterion("rrailplane =", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneNotEqualTo(Double value) {
            addCriterion("rrailplane <>", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneGreaterThan(Double value) {
            addCriterion("rrailplane >", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneGreaterThanOrEqualTo(Double value) {
            addCriterion("rrailplane >=", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneLessThan(Double value) {
            addCriterion("rrailplane <", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneLessThanOrEqualTo(Double value) {
            addCriterion("rrailplane <=", value, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneIn(List<Double> values) {
            addCriterion("rrailplane in", values, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneNotIn(List<Double> values) {
            addCriterion("rrailplane not in", values, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneBetween(Double value1, Double value2) {
            addCriterion("rrailplane between", value1, value2, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andRrailplaneNotBetween(Double value1, Double value2) {
            addCriterion("rrailplane not between", value1, value2, "rrailplane");
            return (Criteria) this;
        }

        public Criteria andUdFlagIsNull() {
            addCriterion("ud_flag is null");
            return (Criteria) this;
        }

        public Criteria andUdFlagIsNotNull() {
            addCriterion("ud_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUdFlagEqualTo(Integer value) {
            addCriterion("ud_flag =", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotEqualTo(Integer value) {
            addCriterion("ud_flag <>", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagGreaterThan(Integer value) {
            addCriterion("ud_flag >", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ud_flag >=", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagLessThan(Integer value) {
            addCriterion("ud_flag <", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ud_flag <=", value, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagIn(List<Integer> values) {
            addCriterion("ud_flag in", values, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotIn(List<Integer> values) {
            addCriterion("ud_flag not in", values, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagBetween(Integer value1, Integer value2) {
            addCriterion("ud_flag between", value1, value2, "udFlag");
            return (Criteria) this;
        }

        public Criteria andUdFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ud_flag not between", value1, value2, "udFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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