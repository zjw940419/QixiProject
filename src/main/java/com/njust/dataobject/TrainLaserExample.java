package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainLaserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainLaserExample() {
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

        public Criteria andTrainOnlyidIsNull() {
            addCriterion("train_onlyid is null");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidIsNotNull() {
            addCriterion("train_onlyid is not null");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidEqualTo(Long value) {
            addCriterion("train_onlyid =", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotEqualTo(Long value) {
            addCriterion("train_onlyid <>", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidGreaterThan(Long value) {
            addCriterion("train_onlyid >", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidGreaterThanOrEqualTo(Long value) {
            addCriterion("train_onlyid >=", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidLessThan(Long value) {
            addCriterion("train_onlyid <", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidLessThanOrEqualTo(Long value) {
            addCriterion("train_onlyid <=", value, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidIn(List<Long> values) {
            addCriterion("train_onlyid in", values, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotIn(List<Long> values) {
            addCriterion("train_onlyid not in", values, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidBetween(Long value1, Long value2) {
            addCriterion("train_onlyid between", value1, value2, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andTrainOnlyidNotBetween(Long value1, Long value2) {
            addCriterion("train_onlyid not between", value1, value2, "trainOnlyid");
            return (Criteria) this;
        }

        public Criteria andLeftLaserIsNull() {
            addCriterion("left_laser is null");
            return (Criteria) this;
        }

        public Criteria andLeftLaserIsNotNull() {
            addCriterion("left_laser is not null");
            return (Criteria) this;
        }

        public Criteria andLeftLaserEqualTo(Double value) {
            addCriterion("left_laser =", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserNotEqualTo(Double value) {
            addCriterion("left_laser <>", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserGreaterThan(Double value) {
            addCriterion("left_laser >", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserGreaterThanOrEqualTo(Double value) {
            addCriterion("left_laser >=", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserLessThan(Double value) {
            addCriterion("left_laser <", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserLessThanOrEqualTo(Double value) {
            addCriterion("left_laser <=", value, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserIn(List<Double> values) {
            addCriterion("left_laser in", values, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserNotIn(List<Double> values) {
            addCriterion("left_laser not in", values, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserBetween(Double value1, Double value2) {
            addCriterion("left_laser between", value1, value2, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andLeftLaserNotBetween(Double value1, Double value2) {
            addCriterion("left_laser not between", value1, value2, "leftLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserIsNull() {
            addCriterion("right_laser is null");
            return (Criteria) this;
        }

        public Criteria andRightLaserIsNotNull() {
            addCriterion("right_laser is not null");
            return (Criteria) this;
        }

        public Criteria andRightLaserEqualTo(Double value) {
            addCriterion("right_laser =", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserNotEqualTo(Double value) {
            addCriterion("right_laser <>", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserGreaterThan(Double value) {
            addCriterion("right_laser >", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserGreaterThanOrEqualTo(Double value) {
            addCriterion("right_laser >=", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserLessThan(Double value) {
            addCriterion("right_laser <", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserLessThanOrEqualTo(Double value) {
            addCriterion("right_laser <=", value, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserIn(List<Double> values) {
            addCriterion("right_laser in", values, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserNotIn(List<Double> values) {
            addCriterion("right_laser not in", values, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserBetween(Double value1, Double value2) {
            addCriterion("right_laser between", value1, value2, "rightLaser");
            return (Criteria) this;
        }

        public Criteria andRightLaserNotBetween(Double value1, Double value2) {
            addCriterion("right_laser not between", value1, value2, "rightLaser");
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