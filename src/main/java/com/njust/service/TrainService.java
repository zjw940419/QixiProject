package com.njust.service;

import com.github.pagehelper.PageInfo;
import com.njust.dataobject.TrainData;
import com.njust.vo.ResultVO;
import com.njust.vo.TrainDataVO;

import java.util.Date;
import java.util.List;

/**
 * Created by zhujiawei on 2017/12/28.
 */
public interface TrainService {

    ResultVO findTrainInfoByTrainId(Long trainId);

    TrainDataVO findByTrainId(Long trainId);

    ResultVO findByTrainDate(Date pre, Date after,Integer page,Integer size);
}
