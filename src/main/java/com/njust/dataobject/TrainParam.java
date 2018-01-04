package com.njust.dataobject;

public class TrainParam {
    private Long id;

    private Double gapWarn;

    private Double gapAlarm;

    private Double tempWarn;

    private Double tempAlarm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getGapWarn() {
        return gapWarn;
    }

    public void setGapWarn(Double gapWarn) {
        this.gapWarn = gapWarn;
    }

    public Double getGapAlarm() {
        return gapAlarm;
    }

    public void setGapAlarm(Double gapAlarm) {
        this.gapAlarm = gapAlarm;
    }

    public Double getTempWarn() {
        return tempWarn;
    }

    public void setTempWarn(Double tempWarn) {
        this.tempWarn = tempWarn;
    }

    public Double getTempAlarm() {
        return tempAlarm;
    }

    public void setTempAlarm(Double tempAlarm) {
        this.tempAlarm = tempAlarm;
    }
}