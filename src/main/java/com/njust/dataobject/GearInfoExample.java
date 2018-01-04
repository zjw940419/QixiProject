package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GearInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GearInfoExample() {
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

        public Criteria andGearNumIsNull() {
            addCriterion("gear_num is null");
            return (Criteria) this;
        }

        public Criteria andGearNumIsNotNull() {
            addCriterion("gear_num is not null");
            return (Criteria) this;
        }

        public Criteria andGearNumEqualTo(Integer value) {
            addCriterion("gear_num =", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumNotEqualTo(Integer value) {
            addCriterion("gear_num <>", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumGreaterThan(Integer value) {
            addCriterion("gear_num >", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gear_num >=", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumLessThan(Integer value) {
            addCriterion("gear_num <", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumLessThanOrEqualTo(Integer value) {
            addCriterion("gear_num <=", value, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumIn(List<Integer> values) {
            addCriterion("gear_num in", values, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumNotIn(List<Integer> values) {
            addCriterion("gear_num not in", values, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumBetween(Integer value1, Integer value2) {
            addCriterion("gear_num between", value1, value2, "gearNum");
            return (Criteria) this;
        }

        public Criteria andGearNumNotBetween(Integer value1, Integer value2) {
            addCriterion("gear_num not between", value1, value2, "gearNum");
            return (Criteria) this;
        }

        public Criteria andLslotValueIsNull() {
            addCriterion("lslot_value is null");
            return (Criteria) this;
        }

        public Criteria andLslotValueIsNotNull() {
            addCriterion("lslot_value is not null");
            return (Criteria) this;
        }

        public Criteria andLslotValueEqualTo(Double value) {
            addCriterion("lslot_value =", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueNotEqualTo(Double value) {
            addCriterion("lslot_value <>", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueGreaterThan(Double value) {
            addCriterion("lslot_value >", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueGreaterThanOrEqualTo(Double value) {
            addCriterion("lslot_value >=", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueLessThan(Double value) {
            addCriterion("lslot_value <", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueLessThanOrEqualTo(Double value) {
            addCriterion("lslot_value <=", value, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueIn(List<Double> values) {
            addCriterion("lslot_value in", values, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueNotIn(List<Double> values) {
            addCriterion("lslot_value not in", values, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueBetween(Double value1, Double value2) {
            addCriterion("lslot_value between", value1, value2, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andLslotValueNotBetween(Double value1, Double value2) {
            addCriterion("lslot_value not between", value1, value2, "lslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueIsNull() {
            addCriterion("rslot_value is null");
            return (Criteria) this;
        }

        public Criteria andRslotValueIsNotNull() {
            addCriterion("rslot_value is not null");
            return (Criteria) this;
        }

        public Criteria andRslotValueEqualTo(Double value) {
            addCriterion("rslot_value =", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueNotEqualTo(Double value) {
            addCriterion("rslot_value <>", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueGreaterThan(Double value) {
            addCriterion("rslot_value >", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueGreaterThanOrEqualTo(Double value) {
            addCriterion("rslot_value >=", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueLessThan(Double value) {
            addCriterion("rslot_value <", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueLessThanOrEqualTo(Double value) {
            addCriterion("rslot_value <=", value, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueIn(List<Double> values) {
            addCriterion("rslot_value in", values, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueNotIn(List<Double> values) {
            addCriterion("rslot_value not in", values, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueBetween(Double value1, Double value2) {
            addCriterion("rslot_value between", value1, value2, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andRslotValueNotBetween(Double value1, Double value2) {
            addCriterion("rslot_value not between", value1, value2, "rslotValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueIsNull() {
            addCriterion("lgap_value is null");
            return (Criteria) this;
        }

        public Criteria andLgapValueIsNotNull() {
            addCriterion("lgap_value is not null");
            return (Criteria) this;
        }

        public Criteria andLgapValueEqualTo(Double value) {
            addCriterion("lgap_value =", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueNotEqualTo(Double value) {
            addCriterion("lgap_value <>", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueGreaterThan(Double value) {
            addCriterion("lgap_value >", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueGreaterThanOrEqualTo(Double value) {
            addCriterion("lgap_value >=", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueLessThan(Double value) {
            addCriterion("lgap_value <", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueLessThanOrEqualTo(Double value) {
            addCriterion("lgap_value <=", value, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueIn(List<Double> values) {
            addCriterion("lgap_value in", values, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueNotIn(List<Double> values) {
            addCriterion("lgap_value not in", values, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueBetween(Double value1, Double value2) {
            addCriterion("lgap_value between", value1, value2, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andLgapValueNotBetween(Double value1, Double value2) {
            addCriterion("lgap_value not between", value1, value2, "lgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueIsNull() {
            addCriterion("rgap_value is null");
            return (Criteria) this;
        }

        public Criteria andRgapValueIsNotNull() {
            addCriterion("rgap_value is not null");
            return (Criteria) this;
        }

        public Criteria andRgapValueEqualTo(Double value) {
            addCriterion("rgap_value =", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueNotEqualTo(Double value) {
            addCriterion("rgap_value <>", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueGreaterThan(Double value) {
            addCriterion("rgap_value >", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueGreaterThanOrEqualTo(Double value) {
            addCriterion("rgap_value >=", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueLessThan(Double value) {
            addCriterion("rgap_value <", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueLessThanOrEqualTo(Double value) {
            addCriterion("rgap_value <=", value, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueIn(List<Double> values) {
            addCriterion("rgap_value in", values, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueNotIn(List<Double> values) {
            addCriterion("rgap_value not in", values, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueBetween(Double value1, Double value2) {
            addCriterion("rgap_value between", value1, value2, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andRgapValueNotBetween(Double value1, Double value2) {
            addCriterion("rgap_value not between", value1, value2, "rgapValue");
            return (Criteria) this;
        }

        public Criteria andLslotDepthIsNull() {
            addCriterion("lslot_depth is null");
            return (Criteria) this;
        }

        public Criteria andLslotDepthIsNotNull() {
            addCriterion("lslot_depth is not null");
            return (Criteria) this;
        }

        public Criteria andLslotDepthEqualTo(Double value) {
            addCriterion("lslot_depth =", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthNotEqualTo(Double value) {
            addCriterion("lslot_depth <>", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthGreaterThan(Double value) {
            addCriterion("lslot_depth >", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthGreaterThanOrEqualTo(Double value) {
            addCriterion("lslot_depth >=", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthLessThan(Double value) {
            addCriterion("lslot_depth <", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthLessThanOrEqualTo(Double value) {
            addCriterion("lslot_depth <=", value, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthIn(List<Double> values) {
            addCriterion("lslot_depth in", values, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthNotIn(List<Double> values) {
            addCriterion("lslot_depth not in", values, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthBetween(Double value1, Double value2) {
            addCriterion("lslot_depth between", value1, value2, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andLslotDepthNotBetween(Double value1, Double value2) {
            addCriterion("lslot_depth not between", value1, value2, "lslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthIsNull() {
            addCriterion("rslot_depth is null");
            return (Criteria) this;
        }

        public Criteria andRslotDepthIsNotNull() {
            addCriterion("rslot_depth is not null");
            return (Criteria) this;
        }

        public Criteria andRslotDepthEqualTo(Double value) {
            addCriterion("rslot_depth =", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthNotEqualTo(Double value) {
            addCriterion("rslot_depth <>", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthGreaterThan(Double value) {
            addCriterion("rslot_depth >", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthGreaterThanOrEqualTo(Double value) {
            addCriterion("rslot_depth >=", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthLessThan(Double value) {
            addCriterion("rslot_depth <", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthLessThanOrEqualTo(Double value) {
            addCriterion("rslot_depth <=", value, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthIn(List<Double> values) {
            addCriterion("rslot_depth in", values, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthNotIn(List<Double> values) {
            addCriterion("rslot_depth not in", values, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthBetween(Double value1, Double value2) {
            addCriterion("rslot_depth between", value1, value2, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andRslotDepthNotBetween(Double value1, Double value2) {
            addCriterion("rslot_depth not between", value1, value2, "rslotDepth");
            return (Criteria) this;
        }

        public Criteria andMotorIdIsNull() {
            addCriterion("motor_id is null");
            return (Criteria) this;
        }

        public Criteria andMotorIdIsNotNull() {
            addCriterion("motor_id is not null");
            return (Criteria) this;
        }

        public Criteria andMotorIdEqualTo(Long value) {
            addCriterion("motor_id =", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotEqualTo(Long value) {
            addCriterion("motor_id <>", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdGreaterThan(Long value) {
            addCriterion("motor_id >", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("motor_id >=", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdLessThan(Long value) {
            addCriterion("motor_id <", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdLessThanOrEqualTo(Long value) {
            addCriterion("motor_id <=", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdIn(List<Long> values) {
            addCriterion("motor_id in", values, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotIn(List<Long> values) {
            addCriterion("motor_id not in", values, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdBetween(Long value1, Long value2) {
            addCriterion("motor_id between", value1, value2, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotBetween(Long value1, Long value2) {
            addCriterion("motor_id not between", value1, value2, "motorId");
            return (Criteria) this;
        }

        public Criteria andGearDateIsNull() {
            addCriterion("gear_date is null");
            return (Criteria) this;
        }

        public Criteria andGearDateIsNotNull() {
            addCriterion("gear_date is not null");
            return (Criteria) this;
        }

        public Criteria andGearDateEqualTo(Date value) {
            addCriterion("gear_date =", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateNotEqualTo(Date value) {
            addCriterion("gear_date <>", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateGreaterThan(Date value) {
            addCriterion("gear_date >", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gear_date >=", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateLessThan(Date value) {
            addCriterion("gear_date <", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateLessThanOrEqualTo(Date value) {
            addCriterion("gear_date <=", value, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateIn(List<Date> values) {
            addCriterion("gear_date in", values, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateNotIn(List<Date> values) {
            addCriterion("gear_date not in", values, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateBetween(Date value1, Date value2) {
            addCriterion("gear_date between", value1, value2, "gearDate");
            return (Criteria) this;
        }

        public Criteria andGearDateNotBetween(Date value1, Date value2) {
            addCriterion("gear_date not between", value1, value2, "gearDate");
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