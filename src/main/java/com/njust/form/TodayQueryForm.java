package com.njust.form;

import lombok.Data;

import java.util.List;

/**
 * 当日列车查询的查询对象
 */
@Data
public class TodayQueryForm {

    //查询时间
    private String trainDate;

    //气隙数值
    private Double gapValue;

    //具体的两个齿
    private Integer firstGap;

    private Integer secondGap;
    //分页的信息
    private Integer pageNum;

    private Integer pageSize;
}
