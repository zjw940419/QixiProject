package com.njust.repository;

import com.njust.mapper.TrainDataMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by zhujiawei on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainDataRepositoryTest {

    @Autowired
    private TrainDataMapper trainDataMapper;

    @Test
    public void findById(){
        TrainData one = trainDataMapper.selectByPrimaryKey(new Long(1));
        System.out.println(one);
    }

    @Test
    public void findByTrainDataBetween() throws  Exception{
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date pre=format.parse("2017-7-1");
        Date after=format.parse("2017-12-31");
        List<TrainData> trainDataList = trainDataMapper.findByTrainDateBetween(pre, after);
        System.out.println(trainDataList.size());
    }

}