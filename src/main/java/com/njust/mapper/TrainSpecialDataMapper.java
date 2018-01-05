package com.njust.mapper;

import com.njust.dataobject.TrainSpecialData;
import com.njust.dataobject.TrainSpecialDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TrainSpecialDataMapper {
    int countByExample(TrainSpecialDataExample example);

    int deleteByExample(TrainSpecialDataExample example);

    int deleteByPrimaryKey(Long trainId);

    int insert(TrainSpecialData record);

    int insertSelective(TrainSpecialData record);

    List<TrainSpecialData> selectByExample(TrainSpecialDataExample example);

    TrainSpecialData selectByPrimaryKey(Long trainId);

    int updateByExampleSelective(@Param("record") TrainSpecialData record, @Param("example") TrainSpecialDataExample example);

    int updateByExample(@Param("record") TrainSpecialData record, @Param("example") TrainSpecialDataExample example);

    int updateByPrimaryKeySelective(TrainSpecialData record);

    int updateByPrimaryKey(TrainSpecialData record);

    /**
     * 筛选出最小的十条记录 以第三齿的左边为准
     * @param preDatetime
     * @param afterDatetime
     * @return
     */
    List<TrainSpecialData> findMinInfoByDatetime(@Param("preDatetime") Date preDatetime
            , @Param("afterDatetime")Date afterDatetime);
}