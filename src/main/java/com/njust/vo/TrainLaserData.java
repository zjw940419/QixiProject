package com.njust.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Data
public class TrainLaserData{

    private Long Id;

    private Double leftLaser;

    private Double rightLaser;
}
