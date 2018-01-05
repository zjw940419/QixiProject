package com.njust.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.njust.utils.serialize.Date2LongSerializer;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Data
public class TrainDataVO{
    /**隐藏字段 列车记录编号*/
    private Long trainId;

    /**列车车牌号*/
    private String trainNum;

    /**列车主控端*/
    private String controlNum;

    /**行驶方向*/
    private Integer trainDirection;

    /**列车状态*/
    private Integer trainState;

    /**列车行驶时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date trainDate;

    /**列车温度最大值编号+数据 返回前端一个字符串类型*/
    private String tempMax;

    /**列车温度平均值*/
    private Double tempAverage;

    /**左最小气隙值编号+数据 返回前端一个字符串类型*/
    private String lgapMin;

    /**右最小气隙值编号+数据 返回前端一个字符串类型*/
    private String rgapMin;

    /**右平均气隙值*/
    private Double rgapAverage;

    /**左平均气隙值*/
    private Double lgapAverage;

    /**右最小槽楔值编号+数据*/
    private String rslotMin;

    /**左最小槽楔值编号+数据*/
    private String lslotMin;

    /**右平均槽楔值*/
    private Double rslotAverage;

    /**左平均槽楔值*/
    private Double lslotAverage;
}
