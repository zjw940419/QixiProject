package com.njust.mapper;

import com.njust.dataobject.TrainFault;
import com.njust.dataobject.TrainFaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainFaultMapper {
    int countByExample(TrainFaultExample example);

    int deleteByExample(TrainFaultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainFault record);

    int insertSelective(TrainFault record);

    List<TrainFault> selectByExample(TrainFaultExample example);

    TrainFault selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainFault record, @Param("example") TrainFaultExample example);

    int updateByExample(@Param("record") TrainFault record, @Param("example") TrainFaultExample example);

    int updateByPrimaryKeySelective(TrainFault record);

    int updateByPrimaryKey(TrainFault record);
}