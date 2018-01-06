package com.njust.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QixiMinVO implements Serializable{
    
    private static final long serialVersionUID = 8519295125584236535L;
    private Date trainDate;

    private String trainNumber;

    private String controlNum;

    private Integer motorNum;

    /**第三齿数据*/
    private Double tlgapMin;
    /**第78齿数据*/
    private Double slgapMin;
}
