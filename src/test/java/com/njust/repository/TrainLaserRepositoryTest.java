package com.njust.repository;

import com.njust.vo.TrainLaserData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainLaserRepositoryTest {

    @Autowired
    private TrainLaserRepository trainLaserRepository;

    //@Test
    //public void findall(){
    //    TrainLaser result = trainLaserRepository.findOne(1);
    //    Assert.assertNotNull(result);
    //}

    @Test
    public void findbymotorID(){
        List<TrainLaserData> byMotorNum = trainLaserRepository.findByTrainIdAndMotorNum(new Long(1),1);
        Assert.assertNotEquals(0,byMotorNum.size());
    }
}