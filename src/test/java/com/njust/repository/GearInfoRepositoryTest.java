package com.njust.repository;

import com.njust.mapper.GearInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GearInfoRepositoryTest {
    @Autowired
    private GearInfoMapper gearInfoMapper;
    @Test
    public void findByMotorId() throws Exception {
        List<GearInfo> gearInfoList = gearInfoMapper.findByMotorId(new Long(1));
        System.out.println(gearInfoList.size());
    }
}