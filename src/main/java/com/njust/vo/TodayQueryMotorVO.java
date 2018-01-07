package com.njust.vo;

import lombok.Data;

/**
 * 今日列车查询的小VO
 */
@Data
public class TodayQueryMotorVO {
    //电机号
    private Integer motorNum;
    //齿号
    private Integer gearNum;
    //左气隙数值
    private Double lgapValue;
    //右气隙数值
    private Double rgapValue;
}
