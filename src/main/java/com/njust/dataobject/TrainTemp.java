package com.njust.dataobject;

import java.util.Date;

public class TrainTemp {
    private Long id;

    private Long trainId;

    private Double trainTemp;

    private Date trainDate;

    private Integer motorNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Double getTrainTemp() {
        return trainTemp;
    }

    public void setTrainTemp(Double trainTemp) {
        this.trainTemp = trainTemp;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }

    public Integer getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(Integer motorNum) {
        this.motorNum = motorNum;
    }
}