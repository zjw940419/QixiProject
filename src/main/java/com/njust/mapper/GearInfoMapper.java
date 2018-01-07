package com.njust.mapper;

import java.util.List;

import com.njust.dataobject.GearInfo;
import com.njust.dataobject.GearInfoExample;
import org.apache.ibatis.annotations.Param;

public interface GearInfoMapper {
    int countByExample(GearInfoExample example);

    int deleteByExample(GearInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GearInfo record);

    int insertSelective(GearInfo record);

    List<GearInfo> selectByExample(GearInfoExample example);

    GearInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GearInfo record, @Param("example") GearInfoExample example);

    int updateByExample(@Param("record") GearInfo record, @Param("example") GearInfoExample example);

    int updateByPrimaryKeySelective(GearInfo record);

    int updateByPrimaryKey(GearInfo record);

    //根据电机唯一编号和齿编号 查询电机的最小气隙数据
    GearInfo findByMotorIdAndGearNum(@Param("motorId") Long motorId, @Param("gearNum") Integer gearNum);

    //根据电机编号查询齿数据
    List<GearInfo> findByMotorId(Long motorId);

    List<GearInfo> findByMotorIdAndInGearNum(@Param("motorId") Long motorId, @Param("firstGearNum") Integer firstGearNum,
                                             @Param("secondGearNum")Integer secondGearNum);

}