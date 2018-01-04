package com.njust.mapper;


import com.njust.dataobject.TrainLaser;
import com.njust.vo.TrainLaserData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainLaserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainLaser record);

    int insertSelective(TrainLaser record);

    TrainLaser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainLaser record);

    int updateByPrimaryKey(TrainLaser record);

    List<TrainLaserData> findByTrainIdAndMotorNum(@Param("trainId") Long trainId, @Param("motorNum") Integer motorNum);
}