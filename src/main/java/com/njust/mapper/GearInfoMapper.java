package com.njust.mapper;


import com.njust.dataobject.GearInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GearInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GearInfo record);

    int insertSelective(GearInfo record);

    GearInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GearInfo record);

    int updateByPrimaryKey(GearInfo record);

    //根据电机唯一编号和齿编号 查询电机的最小气隙数据
    GearInfo findByMotorIdAndGearNum(@Param("motorId") Long motorId, @Param("gearNum") Integer gearNum);

    //根据电机编号查询齿数据
    List<GearInfo> findByMotorId(Long motorId);
}