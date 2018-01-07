package com.njust.dataobject;

import java.util.Date;

public class SystemCali {
    private Long id;

    private Double lsensor1;

    private Double lsensor2;

    private Double lsensor3;

    private Double rsensor1;

    private Double rsensor2;

    private Double rsensor3;

    private Double lrailplane;

    private Double rrailplane;

    private Integer udFlag;

    private Date createTime;

    public SystemCali(Long id, Double lsensor1, Double lsensor2, Double lsensor3, Double rsensor1, Double rsensor2, Double rsensor3, Double lrailplane, Double rrailplane, Integer udFlag, Date createTime) {
        this.id = id;
        this.lsensor1 = lsensor1;
        this.lsensor2 = lsensor2;
        this.lsensor3 = lsensor3;
        this.rsensor1 = rsensor1;
        this.rsensor2 = rsensor2;
        this.rsensor3 = rsensor3;
        this.lrailplane = lrailplane;
        this.rrailplane = rrailplane;
        this.udFlag = udFlag;
        this.createTime = createTime;
    }

    public SystemCali() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLsensor1() {
        return lsensor1;
    }

    public void setLsensor1(Double lsensor1) {
        this.lsensor1 = lsensor1;
    }

    public Double getLsensor2() {
        return lsensor2;
    }

    public void setLsensor2(Double lsensor2) {
        this.lsensor2 = lsensor2;
    }

    public Double getLsensor3() {
        return lsensor3;
    }

    public void setLsensor3(Double lsensor3) {
        this.lsensor3 = lsensor3;
    }

    public Double getRsensor1() {
        return rsensor1;
    }

    public void setRsensor1(Double rsensor1) {
        this.rsensor1 = rsensor1;
    }

    public Double getRsensor2() {
        return rsensor2;
    }

    public void setRsensor2(Double rsensor2) {
        this.rsensor2 = rsensor2;
    }

    public Double getRsensor3() {
        return rsensor3;
    }

    public void setRsensor3(Double rsensor3) {
        this.rsensor3 = rsensor3;
    }

    public Double getLrailplane() {
        return lrailplane;
    }

    public void setLrailplane(Double lrailplane) {
        this.lrailplane = lrailplane;
    }

    public Double getRrailplane() {
        return rrailplane;
    }

    public void setRrailplane(Double rrailplane) {
        this.rrailplane = rrailplane;
    }

    public Integer getUdFlag() {
        return udFlag;
    }

    public void setUdFlag(Integer udFlag) {
        this.udFlag = udFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}