package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainInfoExample() {
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

        public Criteria andTrainIdIsNull() {
            addCriterion("train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(Long value) {
            addCriterion("train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(Long value) {
            addCriterion("train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(Long value) {
            addCriterion("train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(Long value) {
            addCriterion("train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(Long value) {
            addCriterion("train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<Long> values) {
            addCriterion("train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<Long> values) {
            addCriterion("train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(Long value1, Long value2) {
            addCriterion("train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(Long value1, Long value2) {
            addCriterion("train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainStationIsNull() {
            addCriterion("train_station is null");
            return (Criteria) this;
        }

        public Criteria andTrainStationIsNotNull() {
            addCriterion("train_station is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStationEqualTo(String value) {
            addCriterion("train_station =", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotEqualTo(String value) {
            addCriterion("train_station <>", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationGreaterThan(String value) {
            addCriterion("train_station >", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationGreaterThanOrEqualTo(String value) {
            addCriterion("train_station >=", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLessThan(String value) {
            addCriterion("train_station <", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLessThanOrEqualTo(String value) {
            addCriterion("train_station <=", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationLike(String value) {
            addCriterion("train_station like", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotLike(String value) {
            addCriterion("train_station not like", value, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationIn(List<String> values) {
            addCriterion("train_station in", values, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotIn(List<String> values) {
            addCriterion("train_station not in", values, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationBetween(String value1, String value2) {
            addCriterion("train_station between", value1, value2, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainStationNotBetween(String value1, String value2) {
            addCriterion("train_station not between", value1, value2, "trainStation");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIsNull() {
            addCriterion("train_number is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIsNotNull() {
            addCriterion("train_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberEqualTo(String value) {
            addCriterion("train_number =", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotEqualTo(String value) {
            addCriterion("train_number <>", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThan(String value) {
            addCriterion("train_number >", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThanOrEqualTo(String value) {
            addCriterion("train_number >=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThan(String value) {
            addCriterion("train_number <", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThanOrEqualTo(String value) {
            addCriterion("train_number <=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLike(String value) {
            addCriterion("train_number like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotLike(String value) {
            addCriterion("train_number not like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIn(List<String> values) {
            addCriterion("train_number in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotIn(List<String> values) {
            addCriterion("train_number not in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberBetween(String value1, String value2) {
            addCriterion("train_number between", value1, value2, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotBetween(String value1, String value2) {
            addCriterion("train_number not between", value1, value2, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andControlNumIsNull() {
            addCriterion("control_num is null");
            return (Criteria) this;
        }

        public Criteria andControlNumIsNotNull() {
            addCriterion("control_num is not null");
            return (Criteria) this;
        }

        public Criteria andControlNumEqualTo(String value) {
            addCriterion("control_num =", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumNotEqualTo(String value) {
            addCriterion("control_num <>", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumGreaterThan(String value) {
            addCriterion("control_num >", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumGreaterThanOrEqualTo(String value) {
            addCriterion("control_num >=", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumLessThan(String value) {
            addCriterion("control_num <", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumLessThanOrEqualTo(String value) {
            addCriterion("control_num <=", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumLike(String value) {
            addCriterion("control_num like", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumNotLike(String value) {
            addCriterion("control_num not like", value, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumIn(List<String> values) {
            addCriterion("control_num in", values, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumNotIn(List<String> values) {
            addCriterion("control_num not in", values, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumBetween(String value1, String value2) {
            addCriterion("control_num between", value1, value2, "controlNum");
            return (Criteria) this;
        }

        public Criteria andControlNumNotBetween(String value1, String value2) {
            addCriterion("control_num not between", value1, value2, "controlNum");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionIsNull() {
            addCriterion("train_direction is null");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionIsNotNull() {
            addCriterion("train_direction is not null");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionEqualTo(Integer value) {
            addCriterion("train_direction =", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionNotEqualTo(Integer value) {
            addCriterion("train_direction <>", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionGreaterThan(Integer value) {
            addCriterion("train_direction >", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_direction >=", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionLessThan(Integer value) {
            addCriterion("train_direction <", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("train_direction <=", value, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionIn(List<Integer> values) {
            addCriterion("train_direction in", values, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionNotIn(List<Integer> values) {
            addCriterion("train_direction not in", values, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionBetween(Integer value1, Integer value2) {
            addCriterion("train_direction between", value1, value2, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("train_direction not between", value1, value2, "trainDirection");
            return (Criteria) this;
        }

        public Criteria andTrainStateIsNull() {
            addCriterion("train_state is null");
            return (Criteria) this;
        }

        public Criteria andTrainStateIsNotNull() {
            addCriterion("train_state is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStateEqualTo(Integer value) {
            addCriterion("train_state =", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotEqualTo(Integer value) {
            addCriterion("train_state <>", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateGreaterThan(Integer value) {
            addCriterion("train_state >", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_state >=", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateLessThan(Integer value) {
            addCriterion("train_state <", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateLessThanOrEqualTo(Integer value) {
            addCriterion("train_state <=", value, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateIn(List<Integer> values) {
            addCriterion("train_state in", values, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotIn(List<Integer> values) {
            addCriterion("train_state not in", values, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateBetween(Integer value1, Integer value2) {
            addCriterion("train_state between", value1, value2, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainStateNotBetween(Integer value1, Integer value2) {
            addCriterion("train_state not between", value1, value2, "trainState");
            return (Criteria) this;
        }

        public Criteria andTrainDateIsNull() {
            addCriterion("train_date is null");
            return (Criteria) this;
        }

        public Criteria andTrainDateIsNotNull() {
            addCriterion("train_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrainDateEqualTo(Date value) {
            addCriterion("train_date =", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotEqualTo(Date value) {
            addCriterion("train_date <>", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThan(Date value) {
            addCriterion("train_date >", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("train_date >=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThan(Date value) {
            addCriterion("train_date <", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateLessThanOrEqualTo(Date value) {
            addCriterion("train_date <=", value, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateIn(List<Date> values) {
            addCriterion("train_date in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotIn(List<Date> values) {
            addCriterion("train_date not in", values, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateBetween(Date value1, Date value2) {
            addCriterion("train_date between", value1, value2, "trainDate");
            return (Criteria) this;
        }

        public Criteria andTrainDateNotBetween(Date value1, Date value2) {
            addCriterion("train_date not between", value1, value2, "trainDate");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
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