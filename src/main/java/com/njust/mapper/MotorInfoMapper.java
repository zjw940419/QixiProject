package com.njust.mapper;


import com.njust.dataobject.MotorInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MotorInfoMapper {
    int deleteByPrimaryKey(Long motorId);

    int insert(MotorInfo record);

    int insertSelective(MotorInfo record);

    MotorInfo selectByPrimaryKey(Long motorId);

    int updateByPrimaryKeySelective(MotorInfo record);

    int updateByPrimaryKey(MotorInfo record);

    /**升序把电机的数据保存下来*/
    List<MotorInfo> findByTrainIdOrderByMotorNum(Long trainId);

    MotorInfo findByTrainIdAndMotorNum(@Param("trainId") Long trainId,@Param("motorNum") Integer motorNum);
}