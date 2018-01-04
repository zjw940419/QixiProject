package com.njust.dataobject;

import java.util.Date;

public class TrainInfo {
    private Long trainId;

    private String trainStation;

    private String trainNumber;

    private String controlNum;

    private Integer trainDirection;

    private Integer trainState;

    private Date trainDate;

    private Date insertTime;

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation == null ? null : trainStation.trim();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
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