package com.njust.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.njust.utils.serialize.Date2LongSerializer;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 电机详细报表的VO对象
 * Created by zhujiawei on 2017/12/29.
 */
@Data
public class MotorDataVO implements Serializable{

    private static final long serialVersionUID = 4057832510767098814L;

    /**隐藏字段 列车记录编号*/
    private Long trainOnlyid;

    /**列车车牌号*/
    private String trainId;

    /**列车主控端*/
    private String controlNum;

    /**行驶方向*/
    private Integer trainDirection;

    /**列车状态*/
    private Integer trainState;

    /**列车行驶时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private String trainDate;

    /**电机具体的数据*/
    private List<MotorVO> motorVOList;
}
