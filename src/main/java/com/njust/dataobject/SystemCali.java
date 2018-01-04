package com.njust.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Data
@Entity
@DynamicUpdate
public class SystemCali {

    @Id
    @GeneratedValue
    private Integer Id;

    private Double lsensor1;

    private Double lsensor2;

    private Double lsensor3;

    private Double rsensor1;

    private Double rsensor2;

    private Double rsensor3;

    private Double lrailplane;

    private Double rrailplane;

    private Integer udFlag;

    @CreatedDate
    private Date createTime;

}
