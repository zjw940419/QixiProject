package com.njust.dataobject;

import java.util.Date;

public class TrainTemp {
    private Long id;

    private Long trainOnlyid;

    private Double trainTemp;

    private Date trainDate;

    private Integer motorNum;

    public TrainTemp(Long id, Long trainOnlyid, Double trainTemp, Date trainDate, Integer motorNum) {
        this.id = id;
        this.trainOnlyid = trainOnlyid;
        this.trainTemp = trainTemp;
        this.trainDate = trainDate;
        this.motorNum = motorNum;
    }

    public TrainTemp() {
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