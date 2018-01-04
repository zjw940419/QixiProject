package com.njust.mapper;


import com.njust.dataobject.TrainData;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TrainDataMapper {
    int deleteByPrimaryKey(Long trainId);

    int insert(TrainData record);

    int insertSelective(TrainData record);

    TrainData selectByPrimaryKey(Long trainId);

    int updateByPrimaryKeySelective(TrainData record);

    int updateByPrimaryKey(TrainData record);

    //筛选一定范围的列车综合数据
    List<TrainData> findByTrainDateBetween(@Param("pre") Date pre, @Param("after") Date after);
}