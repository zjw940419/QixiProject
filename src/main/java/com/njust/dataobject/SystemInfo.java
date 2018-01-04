package com.njust.dataobject;

import java.util.Date;

public class SystemInfo {
    private Long id;

    private Integer llaserState;

    private Integer rlaserState;

    private Integer tempState;

    private Integer brushState;

    private Integer edeviceState;

    private Integer plcState;

    private Integer dccState;

    private Integer udFlag;

    private Date trainDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLlaserState() {
        return llaserState;
    }

    public void setLlaserState(Integer llaserState) {
        this.llaserState = llaserState;
    }

    public Integer getRlaserState() {
        return rlaserState;
    }

    public void setRlaserState(Integer rlaserState) {
        this.rlaserState = rlaserState;
    }

    public Integer getTempState() {
        return tempState;
    }

    public void setTempState(Integer tempState) {
        this.tempState = tempState;
    }

    public Integer getBrushState() {
        return brushState;
    }

    public void setBrushState(Integer brushState) {
        this.brushState = brushState;
    }

    public Integer getEdeviceState() {
        return edeviceState;
    }

    public void setEdeviceState(Integer edeviceState) {
        this.edeviceState = edeviceState;
    }

    public Integer getPlcState() {
        return plcState;
    }

    public void setPlcState(Integer plcState) {
        this.plcState = plcState;
    }

    public Integer getDccState() {
        return dccState;
    }

    public void setDccState(Integer dccState) {
        this.dccState = dccState;
    }

    public Integer getUdFlag() {
        return udFlag;
    }

    public void setUdFlag(Integer udFlag) {
        this.udFlag = udFlag;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }
}