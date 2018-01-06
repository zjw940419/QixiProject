package com.njust.vo;

import lombok.Data;

import java.util.List;

/**
 * 返回槽楔趋势查询的对象
 */
@Data
public class SlotTendencyVO {

    /**行车的日期*/
    private String TrainDate;

    /**列车的车牌号*/
    private String TrainNumber;

    /**列车的行驶方向*/
    private Integer TrainDirection;

    /**电机编号*/
    private Integer MotorNum;

    /**返回具体的槽楔的数据*/
    private List<SlotVO> slotVOList;

}
