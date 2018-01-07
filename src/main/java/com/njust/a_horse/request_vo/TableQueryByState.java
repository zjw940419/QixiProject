package com.njust.a_horse.request_vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 根据状态查询的请求vo
 * Create by User: HorseChestnut
 * Date: 2018-01-05
 */
@Data
public class TableQueryByState implements Serializable {

    /**
     * 开始时间 标准格式： 20170105212345
     */
    private String startTime;
    /**
     *  结束时间
     */
    private String endTime;
    /**
     *  列车车牌号 列车的唯一标志
     */
    private String trainNumber;
    /**
     * 列车的状态 采用 int 表示
     */
    private Integer trainState;
    /**
     * 列车的站点  例如：下马坊
     */
    private String trainStation;

    /**
     * 列车的安装点 即：行驶方向  int 表示 上行 下行
     */
    private Integer trainDirection;

    /**
     * 页数
     */
    private Integer page;
    /**
     * 一页多少条
     */
    private Integer pageSize;
}
