package com.njust.mapper;

import com.njust.dataobject.SystemCali;
import com.njust.dataobject.SystemCaliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemCaliMapper {
    int countByExample(SystemCaliExample example);

    int deleteByExample(SystemCaliExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemCali record);

    int insertSelective(SystemCali record);

    List<SystemCali> selectByExample(SystemCaliExample example);

    SystemCali selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemCali record, @Param("example") SystemCaliExample example);

    int updateByExample(@Param("record") SystemCali record, @Param("example") SystemCaliExample example);

    int updateByPrimaryKeySelective(SystemCali record);

    int updateByPrimaryKey(SystemCali record);
}