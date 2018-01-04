package com.njust.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainTempRepositoryTest {
    @Autowired
    private TrainTempRepository repository;
    @Test
    public void findByMotorNum() throws Exception {
        List<TrainTemp> byMotorNum = repository.findByMotorNum(1);
        System.out.println(byMotorNum.size());
    }

}