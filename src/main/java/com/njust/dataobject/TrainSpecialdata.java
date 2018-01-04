package com.njust.dataobject;

import java.util.Date;

public class TrainSpecialdata {
    private Long trainId;

    private Integer motorNum;

    private Double tlgapMin;

    private Double trgapMin;

    private Double slgapMin;

    private Double srgapMin;

    private Date trainDate;

    public TrainSpecialdata(Long trainId, Integer motorNum, Double tlgapMin, Double trgapMin, Double slgapMin, Double srgapMin, Date trainDate) {
        this.trainId = trainId;
        this.motorNum = motorNum;
        this.tlgapMin = tlgapMin;
        this.trgapMin = trgapMin;
        this.slgapMin = slgapMin;
        this.srgapMin = srgapMin;
        this.trainDate = trainDate;
    }

    public TrainSpecialdata() {
        super();
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Integer getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(Integer motorNum) {
        this.motorNum = motorNum;
    }

    public Double getTlgapMin() {
        return tlgapMin;
    }

    public void setTlgapMin(Double tlgapMin) {
        this.tlgapMin = tlgapMin;
    }

    public Double getTrgapMin() {
        return trgapMin;
    }

    public void setTrgapMin(Double trgapMin) {
        this.trgapMin = trgapMin;
    }

    public Double getSlgapMin() {
        return slgapMin;
    }

    public void setSlgapMin(Double slgapMin) {
        this.slgapMin = slgapMin;
    }

    public Double getSrgapMin() {
        return srgapMin;
    }

    public void setSrgapMin(Double srgapMin) {
        this.srgapMin = srgapMin;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }
}