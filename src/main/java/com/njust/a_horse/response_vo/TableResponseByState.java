package com.njust.a_horse.response_vo;

import lombok.Data;

/**
 * Description:
 *      报表查询的返回json封装。
 * Create by User: HorseChestnut
 * Date: 2018-01-05
 */
@Data
public class TableResponseByState {
    /**
     * 列车号
     */
    private String trainNumber;
    /**
     * 主控端
     */
    private String controlNum;
    /**
     * 站点
     */
    private String trainStation;
    /**
     * 安装点 上行 下行
     */
    private String trainDirection;
    /**
     * 左齿最小数值
     */
    private Double leftGearMin;
    /**
     * 右齿最小数值
     */
    private Double rightGearMin;
    /**
     * 左齿最小所在电机
     */
    private Integer leftGearMinMotor;
    /**
     * 右齿最小所在电机
     */
    private Integer rightGearMinMotor;
    /**
     * 左齿平均
     */
    private Double leftGearAverage;
    /**
     * 右齿平均
     */
    private Double rightGearAverage;
    /**
     * 左槽深最小
     */
    private Double leftSlotMin;
    /**
     * 右槽深最小
     */
    private Double rightSlotMin;
    /**
     * 左槽最小所在电机
     */
    private Integer leftSlotMinMotor;
    /**
     * 右槽最小所在电机
     */
    private Integer rightSlotMinMotor;
    /**
     * 左槽平均
     */
    private Double leftSlotAverage;
    /**
     * 右槽平均
     */
    private Double rightSlotAverage;
    /**
     * 状态
     */
    private Integer trainState;
    /**
     * 行车时间
     */
    private String insertTime;

}
