package com.njust.service;

import com.njust.form.TodayQueryForm;
import com.njust.vo.ResultVO;
import com.njust.vo.TrainDataVO;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/28.
 */
public interface TrainService {

    ResultVO findTrainInfoByTrainOnlyid(Long trainOnlyid);

    TrainDataVO findByTrainOnlyid(Long trainOnlyid);

    ResultVO findByTrainDate(Date pre,Date after,Integer page,Integer size);

    ResultVO todayLast10(Date pre,Date after);

    ResultVO TodayQuery(TodayQueryForm todayQueryForm) throws ParseException;
}
