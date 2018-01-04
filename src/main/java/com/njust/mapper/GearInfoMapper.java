package com.njust.mapper;

import com.njust.dataobject.GearInfo;
import com.njust.dataobject.GearInfoExample;
import java.util.List;
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
}