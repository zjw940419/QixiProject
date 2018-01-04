package com.njust.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainParamRepositoryTest {
    @Autowired
    private TrainParamRepository repository;

    @Test
    public void save(){
        TrainParam trainParam=new TrainParam();
        trainParam.setGapAlarm(88.8);
        trainParam.setGapWarn(88.8);
        trainParam.setTempAlarm(88.8);
        trainParam.setTempWarn(88.8);
        TrainParam save = repository.save(trainParam);
        System.out.println(save);
    }

}