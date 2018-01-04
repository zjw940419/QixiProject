package com.njust.mapper;


import com.njust.dataobject.TrainFault;

public interface TrainFaultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainFault record);

    int insertSelective(TrainFault record);

    TrainFault selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainFault record);

    int updateByPrimaryKey(TrainFault record);

    //通过列车记录查到列车故障状态
    int findByTrainId(Long trainId);
}