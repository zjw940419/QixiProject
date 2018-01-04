package com.njust.repository;

import com.njust.mapper.TrainFaultMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainFaultRepositoryTest {
    @Autowired
    private TrainFaultMapper trainFaultMapper;
    @Test
    public void findByTrainId() throws Exception {
        int result = trainFaultMapper.findByTrainId(new Long(1));
        System.out.println(result);
    }

}