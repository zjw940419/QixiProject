package com.njust.mapper;

import java.util.List;

import com.njust.dataobject.TrainParam;
import com.njust.dataobject.TrainParamExample;
import org.apache.ibatis.annotations.Param;

public interface TrainParamMapper {
    int countByExample(TrainParamExample example);

    int deleteByExample(TrainParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainParam record);

    int insertSelective(TrainParam record);

    List<TrainParam> selectByExample(TrainParamExample example);

    TrainParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainParam record, @Param("example") TrainParamExample example);

    int updateByExample(@Param("record") TrainParam record, @Param("example") TrainParamExample example);

    int updateByPrimaryKeySelective(TrainParam record);

    int updateByPrimaryKey(TrainParam record);
}