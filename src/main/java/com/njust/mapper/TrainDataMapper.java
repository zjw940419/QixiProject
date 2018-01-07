package com.njust.mapper;

import java.util.Date;
import java.util.List;

import com.njust.dataobject.TrainData;
import com.njust.dataobject.TrainDataExample;
import org.apache.ibatis.annotations.Param;

public interface TrainDataMapper {
    int countByExample(TrainDataExample example);

    int deleteByExample(TrainDataExample example);

    int deleteByPrimaryKey(Long trainId);

    int insert(TrainData record);

    int insertSelective(TrainData record);

    List<TrainData> selectByExample(TrainDataExample example);

    TrainData selectByPrimaryKey(Long trainId);

    int updateByExampleSelective(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByExample(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByPrimaryKeySelective(TrainData record);

    int updateByPrimaryKey(TrainData record);

    //筛选一定范围的列车综合数据
    List<TrainData> findByTrainDateBetween(@Param("pre") Date pre, @Param("after") Date after);

}