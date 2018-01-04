package com.njust.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhujiawei on 2017/12/30.
 */
@Data
public class GearVO implements Serializable{

    private static final long serialVersionUID = 5309159136533653197L;

    private Integer gearNum;

    private Double lslotValue;

    private Double rslotValue;

    private Double lgapValue;

    private Double rgapValue;

    private Double lslotDepth;

    private Double rslotDepth;
}
