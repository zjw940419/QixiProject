package com.njust.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Data
@Entity
public class SystemInfo {
    @Id
    @GeneratedValue
    private Integer Id;

    private Integer llaserState;

    private Integer rlaserState;

    private Integer tempState;

    private Integer brushState;

    private Integer edeviceState;

    private Integer plcState;

    private Integer dccState;

    private Integer udFlag;

    private Date trainDate;
}
