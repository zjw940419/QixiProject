package com.njust.dataobject;

import java.util.Date;

public class TrainLaser {
    private Long id;

    private Long trainOnlyid;

    private Double leftLaser;

    private Double rightLaser;

    private Date trainDate;

    private Integer motorNum;

    public TrainLaser(Long id, Long trainOnlyid, Double leftLaser, Double rightLaser, Date trainDate, Integer motorNum) {
        this.id = id;
        this.trainOnlyid = trainOnlyid;
        this.leftLaser = leftLaser;
        this.rightLaser = rightLaser;
        this.trainDate = trainDate;
        this.motorNum = motorNum;
    }

    public TrainLaser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainOnlyid() {
        return trainOnlyid;
    }

    public void setTrainOnlyid(Long trainOnlyid) {
        this.trainOnlyid = trainOnlyid;
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