package com.njust.repository;

import com.njust.mapper.MotorInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MotorInfoRepositoryTest {
    @Autowired
    private MotorInfoMapper motorInfoMapper;

    @Test
    public void findByTrainIdAndMotorNum() throws Exception {
        List<MotorInfo> motorInfoList = motorInfoMapper.findByTrainIdOrderByMotorNum(new Long(1));
        System.out.println(motorInfoList.size());
    }

}