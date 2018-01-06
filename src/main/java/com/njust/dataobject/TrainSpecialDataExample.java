package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainSpecialDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainSpecialDataExample() {
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

        public Criteria andMotorNumIsNull() {
            addCriterion("motor_num is null");
            return (Criteria) this;
        }

        public Criteria andMotorNumIsNotNull() {
            addCriterion("motor_num is not null");
            return (Criteria) this;
        }

        public Criteria andMotorNumEqualTo(Integer value) {
            addCriterion("motor_num =", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotEqualTo(Integer value) {
            addCriterion("motor_num <>", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumGreaterThan(Integer value) {
            addCriterion("motor_num >", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("motor_num >=", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumLessThan(Integer value) {
            addCriterion("motor_num <", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumLessThanOrEqualTo(Integer value) {
            addCriterion("motor_num <=", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumIn(List<Integer> values) {
            addCriterion("motor_num in", values, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotIn(List<Integer> values) {
            addCriterion("motor_num not in", values, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumBetween(Integer value1, Integer value2) {
            addCriterion("motor_num between", value1, value2, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("motor_num not between", value1, value2, "motorNum");
            return (Criteria) this;
        }

        public Criteria andTlgapMinIsNull() {
            addCriterion("tlgap_min is null");
            return (Criteria) this;
        }

        public Criteria andTlgapMinIsNotNull() {
            addCriterion("tlgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andTlgapMinEqualTo(Double value) {
            addCriterion("tlgap_min =", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinNotEqualTo(Double value) {
            addCriterion("tlgap_min <>", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinGreaterThan(Double value) {
            addCriterion("tlgap_min >", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinGreaterThanOrEqualTo(Double value) {
            addCriterion("tlgap_min >=", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinLessThan(Double value) {
            addCriterion("tlgap_min <", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinLessThanOrEqualTo(Double value) {
            addCriterion("tlgap_min <=", value, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinIn(List<Double> values) {
            addCriterion("tlgap_min in", values, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinNotIn(List<Double> values) {
            addCriterion("tlgap_min not in", values, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinBetween(Double value1, Double value2) {
            addCriterion("tlgap_min between", value1, value2, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTlgapMinNotBetween(Double value1, Double value2) {
            addCriterion("tlgap_min not between", value1, value2, "tlgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinIsNull() {
            addCriterion("trgap_min is null");
            return (Criteria) this;
        }

        public Criteria andTrgapMinIsNotNull() {
            addCriterion("trgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andTrgapMinEqualTo(Double value) {
            addCriterion("trgap_min =", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinNotEqualTo(Double value) {
            addCriterion("trgap_min <>", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinGreaterThan(Double value) {
            addCriterion("trgap_min >", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinGreaterThanOrEqualTo(Double value) {
            addCriterion("trgap_min >=", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinLessThan(Double value) {
            addCriterion("trgap_min <", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinLessThanOrEqualTo(Double value) {
            addCriterion("trgap_min <=", value, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinIn(List<Double> values) {
            addCriterion("trgap_min in", values, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinNotIn(List<Double> values) {
            addCriterion("trgap_min not in", values, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinBetween(Double value1, Double value2) {
            addCriterion("trgap_min between", value1, value2, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andTrgapMinNotBetween(Double value1, Double value2) {
            addCriterion("trgap_min not between", value1, value2, "trgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinIsNull() {
            addCriterion("slgap_min is null");
            return (Criteria) this;
        }

        public Criteria andSlgapMinIsNotNull() {
            addCriterion("slgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andSlgapMinEqualTo(Double value) {
            addCriterion("slgap_min =", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinNotEqualTo(Double value) {
            addCriterion("slgap_min <>", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinGreaterThan(Double value) {
            addCriterion("slgap_min >", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinGreaterThanOrEqualTo(Double value) {
            addCriterion("slgap_min >=", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinLessThan(Double value) {
            addCriterion("slgap_min <", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinLessThanOrEqualTo(Double value) {
            addCriterion("slgap_min <=", value, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinIn(List<Double> values) {
            addCriterion("slgap_min in", values, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinNotIn(List<Double> values) {
            addCriterion("slgap_min not in", values, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinBetween(Double value1, Double value2) {
            addCriterion("slgap_min between", value1, value2, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSlgapMinNotBetween(Double value1, Double value2) {
            addCriterion("slgap_min not between", value1, value2, "slgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinIsNull() {
            addCriterion("srgap_min is null");
            return (Criteria) this;
        }

        public Criteria andSrgapMinIsNotNull() {
            addCriterion("srgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andSrgapMinEqualTo(Double value) {
            addCriterion("srgap_min =", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinNotEqualTo(Double value) {
            addCriterion("srgap_min <>", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinGreaterThan(Double value) {
            addCriterion("srgap_min >", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinGreaterThanOrEqualTo(Double value) {
            addCriterion("srgap_min >=", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinLessThan(Double value) {
            addCriterion("srgap_min <", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinLessThanOrEqualTo(Double value) {
            addCriterion("srgap_min <=", value, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinIn(List<Double> values) {
            addCriterion("srgap_min in", values, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinNotIn(List<Double> values) {
            addCriterion("srgap_min not in", values, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinBetween(Double value1, Double value2) {
            addCriterion("srgap_min between", value1, value2, "srgapMin");
            return (Criteria) this;
        }

        public Criteria andSrgapMinNotBetween(Double value1, Double value2) {
            addCriterion("srgap_min not between", value1, value2, "srgapMin");
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