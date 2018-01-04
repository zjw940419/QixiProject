package com.njust.dataobject;

import java.util.Date;

public class TrainSpecialData {
    private Long trainId;

    private Integer motorNum;

    private Double tlgapMin;

    private Double trgapMin;

    private Double slgapMin;

    private Double srgapMin;

    private Date trainDate;

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