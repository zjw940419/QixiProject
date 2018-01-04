package com.njust.repository;

import com.njust.dataobject.SystemCali;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemCaliRepositoryTest {

    @Autowired
    private SystemCaliRepository repository;

    @Test
    public void save(){
        SystemCali systemCali=new SystemCali();
        systemCali.setLsensor1(1.12);
        systemCali.setLsensor2(2.23);
        systemCali.setLsensor3(3.45);
        systemCali.setRsensor1(2.34);
        systemCali.setRsensor2(5.67);
        systemCali.setRsensor3(5.67);
        systemCali.setRrailplane(12.3);
        systemCali.setLrailplane(23.4);
        systemCali.setUdFlag(0);
        systemCali.setCreateTime(new Date());
        SystemCali cali = repository.save(systemCali);
        System.out.println(cali);
    }
}