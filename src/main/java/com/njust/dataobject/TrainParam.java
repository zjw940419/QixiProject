package com.njust.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Data
@Entity
public class TrainParam {
    @Id
    @GeneratedValue
    private Integer Id;

    private Double gapWarn;

    private Double gapAlarm;

    private Double tempWarn;

    private Double tempAlarm;
}
