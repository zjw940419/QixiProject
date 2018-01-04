package com.njust.repository;

import com.njust.dataobject.TrainTemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhujiawei on 2017/12/28.
 */
public interface TrainTempRepository extends JpaRepository<TrainTemp,Integer> {

    //根据电机号查询温度值
    List<TrainTemp> findByMotorNum(Integer motorNum);
}
