package com.njust.dataobject;

import java.util.Date;

public class TrainFault {
    private Long id;

    private Long trainId;

    private Integer faultType;

    private Date trainDate;

    public TrainFault(Long id, Long trainId, Integer faultType, Date trainDate) {
        this.id = id;
        this.trainId = trainId;
        this.faultType = faultType;
        this.trainDate = trainDate;
    }

    public TrainFault() {
        super();
    }

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

    public Integer getFaultType() {
        return faultType;
    }

    public void setFaultType(Integer faultType) {
        this.faultType = faultType;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }
}