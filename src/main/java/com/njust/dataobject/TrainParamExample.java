package com.njust.dataobject;

import java.util.ArrayList;
import java.util.List;

public class TrainParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainParamExample() {
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

        public Criteria andGapWarnIsNull() {
            addCriterion("gap_warn is null");
            return (Criteria) this;
        }

        public Criteria andGapWarnIsNotNull() {
            addCriterion("gap_warn is not null");
            return (Criteria) this;
        }

        public Criteria andGapWarnEqualTo(Double value) {
            addCriterion("gap_warn =", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnNotEqualTo(Double value) {
            addCriterion("gap_warn <>", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnGreaterThan(Double value) {
            addCriterion("gap_warn >", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnGreaterThanOrEqualTo(Double value) {
            addCriterion("gap_warn >=", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnLessThan(Double value) {
            addCriterion("gap_warn <", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnLessThanOrEqualTo(Double value) {
            addCriterion("gap_warn <=", value, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnIn(List<Double> values) {
            addCriterion("gap_warn in", values, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnNotIn(List<Double> values) {
            addCriterion("gap_warn not in", values, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnBetween(Double value1, Double value2) {
            addCriterion("gap_warn between", value1, value2, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapWarnNotBetween(Double value1, Double value2) {
            addCriterion("gap_warn not between", value1, value2, "gapWarn");
            return (Criteria) this;
        }

        public Criteria andGapAlarmIsNull() {
            addCriterion("gap_alarm is null");
            return (Criteria) this;
        }

        public Criteria andGapAlarmIsNotNull() {
            addCriterion("gap_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andGapAlarmEqualTo(Double value) {
            addCriterion("gap_alarm =", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmNotEqualTo(Double value) {
            addCriterion("gap_alarm <>", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmGreaterThan(Double value) {
            addCriterion("gap_alarm >", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmGreaterThanOrEqualTo(Double value) {
            addCriterion("gap_alarm >=", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmLessThan(Double value) {
            addCriterion("gap_alarm <", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmLessThanOrEqualTo(Double value) {
            addCriterion("gap_alarm <=", value, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmIn(List<Double> values) {
            addCriterion("gap_alarm in", values, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmNotIn(List<Double> values) {
            addCriterion("gap_alarm not in", values, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmBetween(Double value1, Double value2) {
            addCriterion("gap_alarm between", value1, value2, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andGapAlarmNotBetween(Double value1, Double value2) {
            addCriterion("gap_alarm not between", value1, value2, "gapAlarm");
            return (Criteria) this;
        }

        public Criteria andTempWarnIsNull() {
            addCriterion("temp_warn is null");
            return (Criteria) this;
        }

        public Criteria andTempWarnIsNotNull() {
            addCriterion("temp_warn is not null");
            return (Criteria) this;
        }

        public Criteria andTempWarnEqualTo(Double value) {
            addCriterion("temp_warn =", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnNotEqualTo(Double value) {
            addCriterion("temp_warn <>", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnGreaterThan(Double value) {
            addCriterion("temp_warn >", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnGreaterThanOrEqualTo(Double value) {
            addCriterion("temp_warn >=", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnLessThan(Double value) {
            addCriterion("temp_warn <", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnLessThanOrEqualTo(Double value) {
            addCriterion("temp_warn <=", value, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnIn(List<Double> values) {
            addCriterion("temp_warn in", values, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnNotIn(List<Double> values) {
            addCriterion("temp_warn not in", values, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnBetween(Double value1, Double value2) {
            addCriterion("temp_warn between", value1, value2, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempWarnNotBetween(Double value1, Double value2) {
            addCriterion("temp_warn not between", value1, value2, "tempWarn");
            return (Criteria) this;
        }

        public Criteria andTempAlarmIsNull() {
            addCriterion("temp_alarm is null");
            return (Criteria) this;
        }

        public Criteria andTempAlarmIsNotNull() {
            addCriterion("temp_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andTempAlarmEqualTo(Double value) {
            addCriterion("temp_alarm =", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmNotEqualTo(Double value) {
            addCriterion("temp_alarm <>", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmGreaterThan(Double value) {
            addCriterion("temp_alarm >", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmGreaterThanOrEqualTo(Double value) {
            addCriterion("temp_alarm >=", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmLessThan(Double value) {
            addCriterion("temp_alarm <", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmLessThanOrEqualTo(Double value) {
            addCriterion("temp_alarm <=", value, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmIn(List<Double> values) {
            addCriterion("temp_alarm in", values, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmNotIn(List<Double> values) {
            addCriterion("temp_alarm not in", values, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmBetween(Double value1, Double value2) {
            addCriterion("temp_alarm between", value1, value2, "tempAlarm");
            return (Criteria) this;
        }

        public Criteria andTempAlarmNotBetween(Double value1, Double value2) {
            addCriterion("temp_alarm not between", value1, value2, "tempAlarm");
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