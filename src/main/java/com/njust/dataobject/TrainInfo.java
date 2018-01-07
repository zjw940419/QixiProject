package com.njust.dataobject;

import java.util.Date;

public class TrainInfo {
    private Long trainOnlyid;

    private String trainStation;

    private String trainId;

    private String controlNum;

    private Integer trainDirection;

    private Integer trainState;

    private Date trainDate;

    private Date insertTime;

    public TrainInfo(Long trainOnlyid, String trainStation, String trainId, String controlNum, Integer trainDirection, Integer trainState, Date trainDate, Date insertTime) {
        this.trainOnlyid = trainOnlyid;
        this.trainStation = trainStation;
        this.trainId = trainId;
        this.controlNum = controlNum;
        this.trainDirection = trainDirection;
        this.trainState = trainState;
        this.trainDate = trainDate;
        this.insertTime = insertTime;
    }

    public TrainInfo() {
        super();
    }

    public Long getTrainOnlyid() {
        return trainOnlyid;
    }

    public void setTrainOnlyid(Long trainOnlyid) {
        this.trainOnlyid = trainOnlyid;
    }

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation == null ? null : trainStation.trim();
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId == null ? null : trainId.trim();
    }

    public String getControlNum() {
        return controlNum;
    }

    public void setControlNum(String controlNum) {
        this.controlNum = controlNum == null ? null : controlNum.trim();
    }

    public Integer getTrainDirection() {
        return trainDirection;
    }

    public void setTrainDirection(Integer trainDirection) {
        this.trainDirection = trainDirection;
    }

    public Integer getTrainState() {
        return trainState;
    }

    public void setTrainState(Integer trainState) {
        this.trainState = trainState;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}