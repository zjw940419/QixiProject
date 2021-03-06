package com.njust.dataobject;

import java.util.Date;

public class MotorInfo {
    private Long motorId;

    private Long trainOnlyid;

    private Integer motorNum;

    private Double motorSpeed;

    private Double tempMax;

    private Double tempMin;

    private Double tempAverage;

    private Integer lgapMax;

    private Integer lgapMin;

    private Double lgapAverage;

    private Integer rgapMax;

    private Integer rgapMin;

    private Double rgapAverage;

    private Integer lslotMin;

    private Integer lslotMax;

    private Double lslotAverage;

    private Integer rslotMin;

    private Integer rslotMax;

    private Double rslotAverage;

    private Date motorDate;

    public MotorInfo(Long motorId, Long trainOnlyid, Integer motorNum, Double motorSpeed, Double tempMax, Double tempMin, Double tempAverage, Integer lgapMax, Integer lgapMin, Double lgapAverage, Integer rgapMax, Integer rgapMin, Double rgapAverage, Integer lslotMin, Integer lslotMax, Double lslotAverage, Integer rslotMin, Integer rslotMax, Double rslotAverage, Date motorDate) {
        this.motorId = motorId;
        this.trainOnlyid = trainOnlyid;
        this.motorNum = motorNum;
        this.motorSpeed = motorSpeed;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempAverage = tempAverage;
        this.lgapMax = lgapMax;
        this.lgapMin = lgapMin;
        this.lgapAverage = lgapAverage;
        this.rgapMax = rgapMax;
        this.rgapMin = rgapMin;
        this.rgapAverage = rgapAverage;
        this.lslotMin = lslotMin;
        this.lslotMax = lslotMax;
        this.lslotAverage = lslotAverage;
        this.rslotMin = rslotMin;
        this.rslotMax = rslotMax;
        this.rslotAverage = rslotAverage;
        this.motorDate = motorDate;
    }

    public MotorInfo() {
        super();
    }

    public Long getMotorId() {
        return motorId;
    }

    public void setMotorId(Long motorId) {
        this.motorId = motorId;
    }

    public Long getTrainOnlyid() {
        return trainOnlyid;
    }

    public void setTrainOnlyid(Long trainOnlyid) {
        this.trainOnlyid = trainOnlyid;
    }

    public Integer getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(Integer motorNum) {
        this.motorNum = motorNum;
    }

    public Double getMotorSpeed() {
        return motorSpeed;
    }

    public void setMotorSpeed(Double motorSpeed) {
        this.motorSpeed = motorSpeed;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempAverage() {
        return tempAverage;
    }

    public void setTempAverage(Double tempAverage) {
        this.tempAverage = tempAverage;
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

    public Double getLgapAverage() {
        return lgapAverage;
    }

    public void setLgapAverage(Double lgapAverage) {
        this.lgapAverage = lgapAverage;
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

    public Integer getLslotMin() {
        return lslotMin;
    }

    public void setLslotMin(Integer lslotMin) {
        this.lslotMin = lslotMin;
    }

    public Integer getLslotMax() {
        return lslotMax;
    }

    public void setLslotMax(Integer lslotMax) {
        this.lslotMax = lslotMax;
    }

    public Double getLslotAverage() {
        return lslotAverage;
    }

    public void setLslotAverage(Double lslotAverage) {
        this.lslotAverage = lslotAverage;
    }

    public Integer getRslotMin() {
        return rslotMin;
    }

    public void setRslotMin(Integer rslotMin) {
        this.rslotMin = rslotMin;
    }

    public Integer getRslotMax() {
        return rslotMax;
    }

    public void setRslotMax(Integer rslotMax) {
        this.rslotMax = rslotMax;
    }

    public Double getRslotAverage() {
        return rslotAverage;
    }

    public void setRslotAverage(Double rslotAverage) {
        this.rslotAverage = rslotAverage;
    }

    public Date getMotorDate() {
        return motorDate;
    }

    public void setMotorDate(Date motorDate) {
        this.motorDate = motorDate;
    }
}