package com.njust.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainDataExample() {
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

        public Criteria andTempMaxIsNull() {
            addCriterion("temp_max is null");
            return (Criteria) this;
        }

        public Criteria andTempMaxIsNotNull() {
            addCriterion("temp_max is not null");
            return (Criteria) this;
        }

        public Criteria andTempMaxEqualTo(Integer value) {
            addCriterion("temp_max =", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxNotEqualTo(Integer value) {
            addCriterion("temp_max <>", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxGreaterThan(Integer value) {
            addCriterion("temp_max >", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_max >=", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxLessThan(Integer value) {
            addCriterion("temp_max <", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxLessThanOrEqualTo(Integer value) {
            addCriterion("temp_max <=", value, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxIn(List<Integer> values) {
            addCriterion("temp_max in", values, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxNotIn(List<Integer> values) {
            addCriterion("temp_max not in", values, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxBetween(Integer value1, Integer value2) {
            addCriterion("temp_max between", value1, value2, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_max not between", value1, value2, "tempMax");
            return (Criteria) this;
        }

        public Criteria andTempAverageIsNull() {
            addCriterion("temp_average is null");
            return (Criteria) this;
        }

        public Criteria andTempAverageIsNotNull() {
            addCriterion("temp_average is not null");
            return (Criteria) this;
        }

        public Criteria andTempAverageEqualTo(Double value) {
            addCriterion("temp_average =", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageNotEqualTo(Double value) {
            addCriterion("temp_average <>", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageGreaterThan(Double value) {
            addCriterion("temp_average >", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("temp_average >=", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageLessThan(Double value) {
            addCriterion("temp_average <", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageLessThanOrEqualTo(Double value) {
            addCriterion("temp_average <=", value, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageIn(List<Double> values) {
            addCriterion("temp_average in", values, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageNotIn(List<Double> values) {
            addCriterion("temp_average not in", values, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageBetween(Double value1, Double value2) {
            addCriterion("temp_average between", value1, value2, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andTempAverageNotBetween(Double value1, Double value2) {
            addCriterion("temp_average not between", value1, value2, "tempAverage");
            return (Criteria) this;
        }

        public Criteria andGapminValIsNull() {
            addCriterion("gapmin_val is null");
            return (Criteria) this;
        }

        public Criteria andGapminValIsNotNull() {
            addCriterion("gapmin_val is not null");
            return (Criteria) this;
        }

        public Criteria andGapminValEqualTo(Double value) {
            addCriterion("gapmin_val =", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValNotEqualTo(Double value) {
            addCriterion("gapmin_val <>", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValGreaterThan(Double value) {
            addCriterion("gapmin_val >", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValGreaterThanOrEqualTo(Double value) {
            addCriterion("gapmin_val >=", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValLessThan(Double value) {
            addCriterion("gapmin_val <", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValLessThanOrEqualTo(Double value) {
            addCriterion("gapmin_val <=", value, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValIn(List<Double> values) {
            addCriterion("gapmin_val in", values, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValNotIn(List<Double> values) {
            addCriterion("gapmin_val not in", values, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValBetween(Double value1, Double value2) {
            addCriterion("gapmin_val between", value1, value2, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapminValNotBetween(Double value1, Double value2) {
            addCriterion("gapmin_val not between", value1, value2, "gapminVal");
            return (Criteria) this;
        }

        public Criteria andGapMinIsNull() {
            addCriterion("gap_min is null");
            return (Criteria) this;
        }

        public Criteria andGapMinIsNotNull() {
            addCriterion("gap_min is not null");
            return (Criteria) this;
        }

        public Criteria andGapMinEqualTo(Integer value) {
            addCriterion("gap_min =", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinNotEqualTo(Integer value) {
            addCriterion("gap_min <>", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinGreaterThan(Integer value) {
            addCriterion("gap_min >", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("gap_min >=", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinLessThan(Integer value) {
            addCriterion("gap_min <", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinLessThanOrEqualTo(Integer value) {
            addCriterion("gap_min <=", value, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinIn(List<Integer> values) {
            addCriterion("gap_min in", values, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinNotIn(List<Integer> values) {
            addCriterion("gap_min not in", values, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinBetween(Integer value1, Integer value2) {
            addCriterion("gap_min between", value1, value2, "gapMin");
            return (Criteria) this;
        }

        public Criteria andGapMinNotBetween(Integer value1, Integer value2) {
            addCriterion("gap_min not between", value1, value2, "gapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMaxIsNull() {
            addCriterion("lgap_max is null");
            return (Criteria) this;
        }

        public Criteria andLgapMaxIsNotNull() {
            addCriterion("lgap_max is not null");
            return (Criteria) this;
        }

        public Criteria andLgapMaxEqualTo(Integer value) {
            addCriterion("lgap_max =", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxNotEqualTo(Integer value) {
            addCriterion("lgap_max <>", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxGreaterThan(Integer value) {
            addCriterion("lgap_max >", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("lgap_max >=", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxLessThan(Integer value) {
            addCriterion("lgap_max <", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxLessThanOrEqualTo(Integer value) {
            addCriterion("lgap_max <=", value, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxIn(List<Integer> values) {
            addCriterion("lgap_max in", values, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxNotIn(List<Integer> values) {
            addCriterion("lgap_max not in", values, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxBetween(Integer value1, Integer value2) {
            addCriterion("lgap_max between", value1, value2, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("lgap_max not between", value1, value2, "lgapMax");
            return (Criteria) this;
        }

        public Criteria andLgapMinIsNull() {
            addCriterion("lgap_min is null");
            return (Criteria) this;
        }

        public Criteria andLgapMinIsNotNull() {
            addCriterion("lgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andLgapMinEqualTo(Integer value) {
            addCriterion("lgap_min =", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinNotEqualTo(Integer value) {
            addCriterion("lgap_min <>", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinGreaterThan(Integer value) {
            addCriterion("lgap_min >", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("lgap_min >=", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinLessThan(Integer value) {
            addCriterion("lgap_min <", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinLessThanOrEqualTo(Integer value) {
            addCriterion("lgap_min <=", value, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinIn(List<Integer> values) {
            addCriterion("lgap_min in", values, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinNotIn(List<Integer> values) {
            addCriterion("lgap_min not in", values, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinBetween(Integer value1, Integer value2) {
            addCriterion("lgap_min between", value1, value2, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andLgapMinNotBetween(Integer value1, Integer value2) {
            addCriterion("lgap_min not between", value1, value2, "lgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMaxIsNull() {
            addCriterion("rgap_max is null");
            return (Criteria) this;
        }

        public Criteria andRgapMaxIsNotNull() {
            addCriterion("rgap_max is not null");
            return (Criteria) this;
        }

        public Criteria andRgapMaxEqualTo(Integer value) {
            addCriterion("rgap_max =", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxNotEqualTo(Integer value) {
            addCriterion("rgap_max <>", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxGreaterThan(Integer value) {
            addCriterion("rgap_max >", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("rgap_max >=", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxLessThan(Integer value) {
            addCriterion("rgap_max <", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxLessThanOrEqualTo(Integer value) {
            addCriterion("rgap_max <=", value, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxIn(List<Integer> values) {
            addCriterion("rgap_max in", values, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxNotIn(List<Integer> values) {
            addCriterion("rgap_max not in", values, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxBetween(Integer value1, Integer value2) {
            addCriterion("rgap_max between", value1, value2, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("rgap_max not between", value1, value2, "rgapMax");
            return (Criteria) this;
        }

        public Criteria andRgapMinIsNull() {
            addCriterion("rgap_min is null");
            return (Criteria) this;
        }

        public Criteria andRgapMinIsNotNull() {
            addCriterion("rgap_min is not null");
            return (Criteria) this;
        }

        public Criteria andRgapMinEqualTo(Integer value) {
            addCriterion("rgap_min =", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinNotEqualTo(Integer value) {
            addCriterion("rgap_min <>", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinGreaterThan(Integer value) {
            addCriterion("rgap_min >", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("rgap_min >=", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinLessThan(Integer value) {
            addCriterion("rgap_min <", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinLessThanOrEqualTo(Integer value) {
            addCriterion("rgap_min <=", value, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinIn(List<Integer> values) {
            addCriterion("rgap_min in", values, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinNotIn(List<Integer> values) {
            addCriterion("rgap_min not in", values, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinBetween(Integer value1, Integer value2) {
            addCriterion("rgap_min between", value1, value2, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapMinNotBetween(Integer value1, Integer value2) {
            addCriterion("rgap_min not between", value1, value2, "rgapMin");
            return (Criteria) this;
        }

        public Criteria andRgapAverageIsNull() {
            addCriterion("rgap_average is null");
            return (Criteria) this;
        }

        public Criteria andRgapAverageIsNotNull() {
            addCriterion("rgap_average is not null");
            return (Criteria) this;
        }

        public Criteria andRgapAverageEqualTo(Double value) {
            addCriterion("rgap_average =", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageNotEqualTo(Double value) {
            addCriterion("rgap_average <>", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageGreaterThan(Double value) {
            addCriterion("rgap_average >", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("rgap_average >=", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageLessThan(Double value) {
            addCriterion("rgap_average <", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageLessThanOrEqualTo(Double value) {
            addCriterion("rgap_average <=", value, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageIn(List<Double> values) {
            addCriterion("rgap_average in", values, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageNotIn(List<Double> values) {
            addCriterion("rgap_average not in", values, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageBetween(Double value1, Double value2) {
            addCriterion("rgap_average between", value1, value2, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andRgapAverageNotBetween(Double value1, Double value2) {
            addCriterion("rgap_average not between", value1, value2, "rgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageIsNull() {
            addCriterion("lgap_average is null");
            return (Criteria) this;
        }

        public Criteria andLgapAverageIsNotNull() {
            addCriterion("lgap_average is not null");
            return (Criteria) this;
        }

        public Criteria andLgapAverageEqualTo(Double value) {
            addCriterion("lgap_average =", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageNotEqualTo(Double value) {
            addCriterion("lgap_average <>", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageGreaterThan(Double value) {
            addCriterion("lgap_average >", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("lgap_average >=", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageLessThan(Double value) {
            addCriterion("lgap_average <", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageLessThanOrEqualTo(Double value) {
            addCriterion("lgap_average <=", value, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageIn(List<Double> values) {
            addCriterion("lgap_average in", values, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageNotIn(List<Double> values) {
            addCriterion("lgap_average not in", values, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageBetween(Double value1, Double value2) {
            addCriterion("lgap_average between", value1, value2, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andLgapAverageNotBetween(Double value1, Double value2) {
            addCriterion("lgap_average not between", value1, value2, "lgapAverage");
            return (Criteria) this;
        }

        public Criteria andRslotMaxIsNull() {
            addCriterion("rslot_max is null");
            return (Criteria) this;
        }

        public Criteria andRslotMaxIsNotNull() {
            addCriterion("rslot_max is not null");
            return (Criteria) this;
        }

        public Criteria andRslotMaxEqualTo(Integer value) {
            addCriterion("rslot_max =", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxNotEqualTo(Integer value) {
            addCriterion("rslot_max <>", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxGreaterThan(Integer value) {
            addCriterion("rslot_max >", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("rslot_max >=", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxLessThan(Integer value) {
            addCriterion("rslot_max <", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxLessThanOrEqualTo(Integer value) {
            addCriterion("rslot_max <=", value, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxIn(List<Integer> values) {
            addCriterion("rslot_max in", values, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxNotIn(List<Integer> values) {
            addCriterion("rslot_max not in", values, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxBetween(Integer value1, Integer value2) {
            addCriterion("rslot_max between", value1, value2, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("rslot_max not between", value1, value2, "rslotMax");
            return (Criteria) this;
        }

        public Criteria andRslotMinIsNull() {
            addCriterion("rslot_min is null");
            return (Criteria) this;
        }

        public Criteria andRslotMinIsNotNull() {
            addCriterion("rslot_min is not null");
            return (Criteria) this;
        }

        public Criteria andRslotMinEqualTo(Integer value) {
            addCriterion("rslot_min =", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinNotEqualTo(Integer value) {
            addCriterion("rslot_min <>", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinGreaterThan(Integer value) {
            addCriterion("rslot_min >", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("rslot_min >=", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinLessThan(Integer value) {
            addCriterion("rslot_min <", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinLessThanOrEqualTo(Integer value) {
            addCriterion("rslot_min <=", value, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinIn(List<Integer> values) {
            addCriterion("rslot_min in", values, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinNotIn(List<Integer> values) {
            addCriterion("rslot_min not in", values, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinBetween(Integer value1, Integer value2) {
            addCriterion("rslot_min between", value1, value2, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotMinNotBetween(Integer value1, Integer value2) {
            addCriterion("rslot_min not between", value1, value2, "rslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMaxIsNull() {
            addCriterion("lslot_max is null");
            return (Criteria) this;
        }

        public Criteria andLslotMaxIsNotNull() {
            addCriterion("lslot_max is not null");
            return (Criteria) this;
        }

        public Criteria andLslotMaxEqualTo(Integer value) {
            addCriterion("lslot_max =", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxNotEqualTo(Integer value) {
            addCriterion("lslot_max <>", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxGreaterThan(Integer value) {
            addCriterion("lslot_max >", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("lslot_max >=", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxLessThan(Integer value) {
            addCriterion("lslot_max <", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxLessThanOrEqualTo(Integer value) {
            addCriterion("lslot_max <=", value, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxIn(List<Integer> values) {
            addCriterion("lslot_max in", values, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxNotIn(List<Integer> values) {
            addCriterion("lslot_max not in", values, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxBetween(Integer value1, Integer value2) {
            addCriterion("lslot_max between", value1, value2, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("lslot_max not between", value1, value2, "lslotMax");
            return (Criteria) this;
        }

        public Criteria andLslotMinIsNull() {
            addCriterion("lslot_min is null");
            return (Criteria) this;
        }

        public Criteria andLslotMinIsNotNull() {
            addCriterion("lslot_min is not null");
            return (Criteria) this;
        }

        public Criteria andLslotMinEqualTo(Integer value) {
            addCriterion("lslot_min =", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinNotEqualTo(Integer value) {
            addCriterion("lslot_min <>", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinGreaterThan(Integer value) {
            addCriterion("lslot_min >", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("lslot_min >=", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinLessThan(Integer value) {
            addCriterion("lslot_min <", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinLessThanOrEqualTo(Integer value) {
            addCriterion("lslot_min <=", value, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinIn(List<Integer> values) {
            addCriterion("lslot_min in", values, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinNotIn(List<Integer> values) {
            addCriterion("lslot_min not in", values, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinBetween(Integer value1, Integer value2) {
            addCriterion("lslot_min between", value1, value2, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andLslotMinNotBetween(Integer value1, Integer value2) {
            addCriterion("lslot_min not between", value1, value2, "lslotMin");
            return (Criteria) this;
        }

        public Criteria andRslotAverageIsNull() {
            addCriterion("rslot_average is null");
            return (Criteria) this;
        }

        public Criteria andRslotAverageIsNotNull() {
            addCriterion("rslot_average is not null");
            return (Criteria) this;
        }

        public Criteria andRslotAverageEqualTo(Double value) {
            addCriterion("rslot_average =", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageNotEqualTo(Double value) {
            addCriterion("rslot_average <>", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageGreaterThan(Double value) {
            addCriterion("rslot_average >", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("rslot_average >=", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageLessThan(Double value) {
            addCriterion("rslot_average <", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageLessThanOrEqualTo(Double value) {
            addCriterion("rslot_average <=", value, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageIn(List<Double> values) {
            addCriterion("rslot_average in", values, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageNotIn(List<Double> values) {
            addCriterion("rslot_average not in", values, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageBetween(Double value1, Double value2) {
            addCriterion("rslot_average between", value1, value2, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andRslotAverageNotBetween(Double value1, Double value2) {
            addCriterion("rslot_average not between", value1, value2, "rslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageIsNull() {
            addCriterion("lslot_average is null");
            return (Criteria) this;
        }

        public Criteria andLslotAverageIsNotNull() {
            addCriterion("lslot_average is not null");
            return (Criteria) this;
        }

        public Criteria andLslotAverageEqualTo(Double value) {
            addCriterion("lslot_average =", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageNotEqualTo(Double value) {
            addCriterion("lslot_average <>", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageGreaterThan(Double value) {
            addCriterion("lslot_average >", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageGreaterThanOrEqualTo(Double value) {
            addCriterion("lslot_average >=", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageLessThan(Double value) {
            addCriterion("lslot_average <", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageLessThanOrEqualTo(Double value) {
            addCriterion("lslot_average <=", value, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageIn(List<Double> values) {
            addCriterion("lslot_average in", values, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageNotIn(List<Double> values) {
            addCriterion("lslot_average not in", values, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageBetween(Double value1, Double value2) {
            addCriterion("lslot_average between", value1, value2, "lslotAverage");
            return (Criteria) this;
        }

        public Criteria andLslotAverageNotBetween(Double value1, Double value2) {
            addCriterion("lslot_average not between", value1, value2, "lslotAverage");
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