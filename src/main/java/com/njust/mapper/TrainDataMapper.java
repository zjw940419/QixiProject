package com.njust.mapper;

import com.njust.dataobject.TrainData;
import com.njust.dataobject.TrainDataExample;
import java.util.List;
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
}