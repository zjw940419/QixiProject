package com.njust.repository;

import com.njust.dataobject.SystemInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemInfoRepositoryTest {

    @Autowired
    private SystemInfoRepository repository;
    @Test
    public void findByTrainDateBetweenAndUdFlag() throws Exception {
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date pre=format.parse("2017-7-1");
        Date after=format.parse("2017-12-30");
        List<SystemInfo> result = repository.findByUdFlagAndTrainDateBetween(1,pre, after);
        System.out.println(result.size());
    }

}