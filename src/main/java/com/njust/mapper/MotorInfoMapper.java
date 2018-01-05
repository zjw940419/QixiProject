package com.njust.mapper;

import com.njust.dataobject.MotorInfo;
import com.njust.dataobject.MotorInfoExample;

import java.util.Date;
import java.util.List;

import com.njust.dataobject.TrainData;
import org.apache.ibatis.annotations.Param;

public interface MotorInfoMapper {
    int countByExample(MotorInfoExample example);

    int deleteByExample(MotorInfoExample example);

    int deleteByPrimaryKey(Long motorId);

    int insert(MotorInfo record);

    int insertSelective(MotorInfo record);

    List<MotorInfo> selectByExample(MotorInfoExample example);

    MotorInfo selectByPrimaryKey(Long motorId);

    int updateByExampleSelective(@Param("record") MotorInfo record, @Param("example") MotorInfoExample example);

    int updateByExample(@Param("record") MotorInfo record, @Param("example") MotorInfoExample example);

    int updateByPrimaryKeySelective(MotorInfo record);

    int updateByPrimaryKey(MotorInfo record);

    /**升序把电机的数据保存下来*/
    List<MotorInfo> findByTrainIdOrderByMotorNum(Long trainId);

    MotorInfo findByTrainIdAndMotorNum(@Param("trainId") Long trainId,@Param("motorNum") Integer motorNum);

}