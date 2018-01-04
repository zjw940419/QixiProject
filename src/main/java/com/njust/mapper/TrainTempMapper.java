package com.njust.mapper;

import com.njust.dataobject.TrainTemp;
import com.njust.dataobject.TrainTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainTempMapper {
    int countByExample(TrainTempExample example);

    int deleteByExample(TrainTempExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainTemp record);

    int insertSelective(TrainTemp record);

    List<TrainTemp> selectByExample(TrainTempExample example);

    TrainTemp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainTemp record, @Param("example") TrainTempExample example);

    int updateByExample(@Param("record") TrainTemp record, @Param("example") TrainTempExample example);

    int updateByPrimaryKeySelective(TrainTemp record);

    int updateByPrimaryKey(TrainTemp record);
}