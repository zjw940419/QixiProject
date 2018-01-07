package com.njust.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TodayQueryVO {

    //列车行驶时间
    private Date trainDate;

    //列车车号
    private String trainId;

    //列车的上下行
    private Integer trainDirection;

    //电机
    private List<TodayQueryMotorVO> todayQueryMotorVOList;
}
