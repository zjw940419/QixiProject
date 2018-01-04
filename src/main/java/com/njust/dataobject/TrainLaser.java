package com.njust.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Data
@Entity
@DynamicUpdate
public class TrainLaser {
    /** 自增长的主键*/
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer trainId;

    private Double leftLaser;

    private Double rightLaser;

    private Date trainDate;

    private Integer motorNum;
}
