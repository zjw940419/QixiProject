package com.njust.vo;

import lombok.Data;

@Data
public class SlotVO {
    /**齿编号*/
    private Integer GearNum;

    /**左槽楔值*/
    private Double lslotValue;

    /**右槽楔值*/
    private Double rslotValue;

    /**左槽深值*/
    private Double lslotDepth;

    /**右槽深值*/
    private Double rslotDepth;
}
