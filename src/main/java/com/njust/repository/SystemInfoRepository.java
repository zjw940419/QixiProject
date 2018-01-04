package com.njust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by zhujiawei on 2017/12/29.
 */
public interface SystemInfoRepository extends JpaRepository<SystemInfo,Integer> {
    //根据列车行驶的时间段 和 上下行 查询数据
    List<SystemInfo> findByUdFlagAndTrainDateBetween(Integer udFlag,Date pre, Date after);
}
