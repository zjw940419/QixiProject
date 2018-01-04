package com.njust.mapper;


import com.njust.dataobject.TrainSpecialdata;

public interface TrainSpecialdataMapper {
    int deleteByPrimaryKey(Long trainId);

    int insert(TrainSpecialdata record);

    int insertSelective(TrainSpecialdata record);

    TrainSpecialdata selectByPrimaryKey(Long trainId);

    int updateByPrimaryKeySelective(TrainSpecialdata record);

    int updateByPrimaryKey(TrainSpecialdata record);
}