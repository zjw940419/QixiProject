package com.njust.mapper;

import com.njust.dataobject.TrainLaser;
import com.njust.dataobject.TrainLaserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainLaserMapper {
    int countByExample(TrainLaserExample example);

    int deleteByExample(TrainLaserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainLaser record);

    int insertSelective(TrainLaser record);

    List<TrainLaser> selectByExample(TrainLaserExample example);

    TrainLaser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainLaser record, @Param("example") TrainLaserExample example);

    int updateByExample(@Param("record") TrainLaser record, @Param("example") TrainLaserExample example);

    int updateByPrimaryKeySelective(TrainLaser record);

    int updateByPrimaryKey(TrainLaser record);
}