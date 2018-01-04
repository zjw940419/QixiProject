package com.njust.dataobject;

import java.util.Date;

public class GearInfo {
    private Long id;

    private Integer gearNum;

    private Double lslotValue;

    private Double rslotValue;

    private Double lgapValue;

    private Double rgapValue;

    private Double lslotDepth;

    private Double rslotDepth;

    private Long motorId;

    private Date gearDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGearNum() {
        return gearNum;
    }

    public void setGearNum(Integer gearNum) {
        this.gearNum = gearNum;
    }

    public Double getLslotValue() {
        return lslotValue;
    }

    public void setLslotValue(Double lslotValue) {
        this.lslotValue = lslotValue;
    }

    public Double getRslotValue() {
        return rslotValue;
    }

    public void setRslotValue(Double rslotValue) {
        this.rslotValue = rslotValue;
    }

    public Double getLgapValue() {
        return lgapValue;
    }

    public void setLgapValue(Double lgapValue) {
        this.lgapValue = lgapValue;
    }

    public Double getRgapValue() {
        return rgapValue;
    }

    public void setRgapValue(Double rgapValue) {
        this.rgapValue = rgapValue;
    }

    public Double getLslotDepth() {
        return lslotDepth;
    }

    public void setLslotDepth(Double lslotDepth) {
        this.lslotDepth = lslotDepth;
    }

    public Double getRslotDepth() {
        return rslotDepth;
    }

    public void setRslotDepth(Double rslotDepth) {
        this.rslotDepth = rslotDepth;
    }

    public Long getMotorId() {
        return motorId;
    }

    public void setMotorId(Long motorId) {
        this.motorId = motorId;
    }

    public Date getGearDate() {
        return gearDate;
    }

    public void setGearDate(Date gearDate) {
        this.gearDate = gearDate;
    }
}