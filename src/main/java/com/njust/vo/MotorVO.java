package com.njust.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Data
public class MotorVO implements Serializable{

    private static final long serialVersionUID = 7330015165723836906L;

    /**左气隙最低高度*/
    private String lgapMin;

    /**右气隙最低高度*/
    private String rgapMin;

    /**左槽楔最小值*/
    private String lslotMin;

    /**右槽楔最小值*/
    private String rslotMin;

    /**电机平均温度*/
    private Double tempAverage;
}
