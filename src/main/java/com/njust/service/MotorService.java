package com.njust.service;

import com.njust.vo.MotorDataVO;
import com.njust.vo.ResultVO;


/**
 * Created by zhujiawei on 2017/12/28.
 */
public interface MotorService {
    /**
     * 根据列车记录和电机编号 返回原始数据 用于显示折线图
     * @param trainId
     * @param motorNum
     * @return
     */
    ResultVO findByTrainIdAndMotorNum(Long trainId, Integer motorNum);

    /**
     * 根据车号返回对应数据
     * @param trainId
     * @return
     */
    ResultVO findByTrainId(Long trainId);
}
