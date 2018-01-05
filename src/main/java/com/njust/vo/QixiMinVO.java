package com.njust.vo;

import lombok.Data;

import java.util.Date;

@Data
public class QixiMinVO {

    private Date trainDate;

    private String trainNumber;

    private String controlNum;

    private Integer motorNum;

    /**第三齿数据*/
    private Double tlgapMin;

    /**第78齿数据*/
    private Double slgapMin;
}
