package com.njust.service;

import com.njust.form.SlotForm;
import com.njust.vo.ResultVO;

import java.text.ParseException;

/**
 * Created by zhujiawei on 2017/12/30.
 */
public interface GearService {

    //根据电机关联编号查询出所有的齿数据
    ResultVO findByTrainOnlyidAndMotorId(Long trainOnlyid, Integer motorNum);

    ResultVO slotTrendencyQuery(SlotForm slotForm) throws ParseException;
}
