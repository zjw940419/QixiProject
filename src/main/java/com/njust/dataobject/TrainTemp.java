package com.njust.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Data
@Entity
public class TrainTemp {

    /**主键*/
    @Id
    @GeneratedValue
    private Long Id;

    /**列车记录编号*/
    private Long trainId;

    /**列车温度*/
    private Double trainTemp;

    /**列车时间*/
    private Date trainDate;

    /**列车电机编号*/
    private Integer motorNum;
}
