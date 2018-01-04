package com.njust.dataobject;

import java.util.Date;

public class TrainData {
    private Long trainId;

    private Integer tempMax;

    private Double tempAverage;

    private Double gapminVal;

    private Integer gapMin;

    private Integer lgapMax;

    private Integer lgapMin;

    private Integer rgapMax;

    private Integer rgapMin;

    private Double rgapAverage;

    private Double lgapAverage;

    private Integer rslotMax;

    private Integer rslotMin;

    private Integer lslotMax;

    private Integer lslotMin;

    private Double rslotAverage;

    private Double lslotAverage;

    private Date trainDate;

    public TrainData(Long trainId, Integer tempMax, Double tempAverage, Double gapminVal, Integer gapMin, Integer lgapMax, Integer lgapMin, Integer rgapMax, Integer rgapMin, Double rgapAverage, Double lgapAverage, Integer rslotMax, Integer rslotMin, Integer lslotMax, Integer lslotMin, Double rslotAverage, Double lslotAverage, Date trainDate) {
        this.trainId = trainId;
        this.tempMax = tempMax;
        this.tempAverage = tempAverage;
        this.gapminVal = gapminVal;
        this.gapMin = gapMin;
        this.lgapMax = lgapMax;
        this.lgapMin = lgapMin;
        this.rgapMax = rgapMax;
        this.rgapMin = rgapMin;
        this.rgapAverage = rgapAverage;
        this.lgapAverage = lgapAverage;
        this.rslotMax = rslotMax;
        this.rslotMin = rslotMin;
        this.lslotMax = lslotMax;
        this.lslotMin = lslotMin;
        this.rslotAverage = rslotAverage;
        this.lslotAverage = lslotAverage;
        this.trainDate = trainDate;
    }

    public TrainData() {
        super();
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Integer getTempMax() {
        return tempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempAverage() {
        return tempAverage;
    }

    public void setTempAverage(Double tempAverage) {
        this.tempAverage = tempAverage;
    }

    public Double getGapminVal() {
        return gapminVal;
    }

    public void setGapminVal(Double gapminVal) {
        this.gapminVal = gapminVal;
    }

    public Integer getGapMin() {
        return gapMin;
    }

    public void setGapMin(Integer gapMin) {
        this.gapMin = gapMin;
    }

    public Integer getLgapMax() {
        return lgapMax;
    }

    public void setLgapMax(Integer lgapMax) {
        this.lgapMax = lgapMax;
    }

    public Integer getLgapMin() {
        return lgapMin;
    }

    public void setLgapMin(Integer lgapMin) {
        this.lgapMin = lgapMin;
    }

    public Integer getRgapMax() {
        return rgapMax;
    }

    public void setRgapMax(Integer rgapMax) {
        this.rgapMax = rgapMax;
    }

    public Integer getRgapMin() {
        return rgapMin;
    }

    public void setRgapMin(Integer rgapMin) {
        this.rgapMin = rgapMin;
    }

    public Double getRgapAverage() {
        return rgapAverage;
    }

    public void setRgapAverage(Double rgapAverage) {
        this.rgapAverage = rgapAverage;
    }

    public Double getLgapAverage() {
        return lgapAverage;
    }

    public void setLgapAverage(Double lgapAverage) {
        this.lgapAverage = lgapAverage;
    }

    public Integer getRslotMax() {
        return rslotMax;
    }

    public void setRslotMax(Integer rslotMax) {
        this.rslotMax = rslotMax;
    }

    public Integer getRslotMin() {
        return rslotMin;
    }

    public void setRslotMin(Integer rslotMin) {
        this.rslotMin = rslotMin;
    }

    public Integer getLslotMax() {
        return lslotMax;
    }

    public void setLslotMax(Integer lslotMax) {
        this.lslotMax = lslotMax;
    }

    public Integer getLslotMin() {
        return lslotMin;
    }

    public void setLslotMin(Integer lslotMin) {
        this.lslotMin = lslotMin;
    }

    public Double getRslotAverage() {
        return rslotAverage;
    }

    public void setRslotAverage(Double rslotAverage) {
        this.rslotAverage = rslotAverage;
    }

    public Double getLslotAverage() {
        return lslotAverage;
    }

    public void setLslotAverage(Double lslotAverage) {
        this.lslotAverage = lslotAverage;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }
}