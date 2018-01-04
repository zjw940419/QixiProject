package com.njust.mapper;


import com.njust.dataobject.TrainInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TrainInfoMapper {
    int deleteByPrimaryKey(Long trainId);

    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    TrainInfo selectByPrimaryKey(Long trainId);

    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);

    /** 查询列车信息表最后一条记录*/
    TrainInfo findTrainInfoByLastTrainId();

    /**根据时间范围查询出符合条件的列车编号*/
    List<TrainInfo> findTrainInfoByDatetime(@Param("preDatetime") Date preDatetime
            , @Param("afterDatetime")Date afterDatetime);
    /**根据列车的ID查询*/
    TrainInfo findTrainInfoByTrainId(Long trainId);
}