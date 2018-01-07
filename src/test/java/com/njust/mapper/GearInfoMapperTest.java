package com.njust.mapper;

import com.njust.dataobject.GearInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhujiawei on 2018/1/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GearInfoMapperTest {

    @Autowired
    private GearInfoMapper gearInfoMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        GearInfo gearInfo = gearInfoMapper.selectByPrimaryKey(new Long(1));
        System.out.println(gearInfo);
    }

    @Test
    public void test(){
        List<GearInfo> gearInfoList = gearInfoMapper.findByMotorIdAndInGearNum(new Long(1), 1, 2);
        System.out.println(gearInfoList.size());
    }

}