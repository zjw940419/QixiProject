package com.njust.service;

import com.njust.dataobject.GearInfo;
import com.njust.vo.GearVO;
import com.njust.vo.ResultVO;

import java.util.List;

/**
 * Created by zhujiawei on 2017/12/30.
 */
public interface GearService {

    //根据电机关联编号查询出所有的齿数据
    ResultVO findByTrainIdAndMotorId(Long trainId, Integer motorNum);
}
