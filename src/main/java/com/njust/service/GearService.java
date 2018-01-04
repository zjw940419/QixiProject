package com.njust.service;

import com.njust.vo.ResultVO;

/**
 * Created by zhujiawei on 2017/12/30.
 */
public interface GearService {

    //根据电机关联编号查询出所有的齿数据
    ResultVO findByTrainIdAndMotorId(Long trainId, Integer motorNum);
}
