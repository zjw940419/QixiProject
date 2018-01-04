package com.njust.repository;

import com.njust.mapper.TrainInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainInforRepositoryTest {


    @Autowired
    private TrainInfoMapper trainInfoMapper;
    @Test
    public void findTrainInfoByLastTrainId() throws Exception {
        TrainInfo result = trainInfoMapper.findTrainInfoByLastTrainId();
        System.out.println(result.getTrainNumber());
    }
    @Test
    public void findTrainInfoByDatetime() throws ParseException {
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date pre=format.parse("2017-8-18");
        long time=pre.getTime()+86400000;
        Date after=new Date(time);
        List<TrainInfo> trainInfoList = trainInfoMapper.findTrainInfoByDatetime(pre, after);
        System.out.println(trainInfoList.size());
    }
    @Test
    public void findTrainInfoByTrainId()throws ParseException {
        TrainInfo trainInfoByTrainId = trainInfoMapper.findTrainInfoByTrainId(new Long(2));
        System.out.println(trainInfoByTrainId);
    }


}