package com.njust.dataobject;

import java.util.Date;

public class TrainLaser {
    private Long id;

    private Long trainId;

    private Double leftLaser;

    private Double rightLaser;

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

    public Double getLeftLaser() {
        return leftLaser;
    }

    public void setLeftLaser(Double leftLaser) {
        this.leftLaser = leftLaser;
    }

    public Double getRightLaser() {
        return rightLaser;
    }

    public void setRightLaser(Double rightLaser) {
        this.rightLaser = rightLaser;
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