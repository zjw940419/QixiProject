package com.njust.mapper;

import com.njust.dataobject.TrainSpecialData;
import com.njust.dataobject.TrainSpecialDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainSpecialDataMapper {
    int countByExample(TrainSpecialDataExample example);

    int deleteByExample(TrainSpecialDataExample example);

    int deleteByPrimaryKey(Long trainId);

    int insert(TrainSpecialData record);

    int insertSelective(TrainSpecialData record);

    List<TrainSpecialData> selectByExample(TrainSpecialDataExample example);

    TrainSpecialData selectByPrimaryKey(Long trainId);

    int updateByExampleSelective(@Param("record") TrainSpecialData record, @Param("example") TrainSpecialDataExample example);

    int updateByExample(@Param("record") TrainSpecialData record, @Param("example") TrainSpecialDataExample example);

    int updateByPrimaryKeySelective(TrainSpecialData record);

    int updateByPrimaryKey(TrainSpecialData record);
}