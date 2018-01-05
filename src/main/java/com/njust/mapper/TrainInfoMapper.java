package com.njust.mapper;

import com.njust.dataobject.TrainInfo;
import com.njust.dataobject.TrainInfoExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainInfoMapper {
    int countByExample(TrainInfoExample example);

    int deleteByExample(TrainInfoExample example);

    int deleteByPrimaryKey(Long trainId);

    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    List<TrainInfo> selectByExample(TrainInfoExample example);

    TrainInfo selectByPrimaryKey(Long trainId);

    int updateByExampleSelective(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example);

    int updateByExample(@Param("record") TrainInfo record, @Param("example") TrainInfoExample example);

    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);

    /** 查询列车信息表最后一条记录*/
    TrainInfo findTrainInfoByLastTrainId();

    /**根据时间范围查询出符合条件的列车编号*/
    List<TrainInfo> findTrainInfoByDatetime(@Param("preDatetime") Date preDatetime
            , @Param("afterDatetime")Date afterDatetime);
}