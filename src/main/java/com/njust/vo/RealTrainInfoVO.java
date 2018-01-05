package com.njust.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class RealTrainInfoVO implements Serializable{

    private static final long serialVersionUID = -8941432721565567176L;

    //列车记录编号ID
    private Long trainId;

    //列车车号
    private String trainNumber;

    //列车的行驶方向
    private Integer trainDirection;

    //列车状态
    private Integer trainState;
}
