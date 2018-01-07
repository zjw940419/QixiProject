package com.njust.mapper;

import com.njust.dataobject.MotorInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MotorInfoMapperTest {

    @Autowired
    private MotorInfoMapper motorInfoMapper;
    @Test
    public void findByTrainIdAndMotorNum() {
        MotorInfo byTrainIdAndMotorNum = motorInfoMapper.findByTrainIdAndMotorNum(new Long(2), 1);
        System.out.println(byTrainIdAndMotorNum);
    }
}