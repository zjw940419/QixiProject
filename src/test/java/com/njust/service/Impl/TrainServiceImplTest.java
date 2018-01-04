package com.njust.service.Impl;

import com.njust.service.TrainService;
import com.njust.utils.DateUtil;
import com.njust.vo.ResultVO;
import com.njust.vo.TrainDataVO;
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
 * Created by zhujiawei on 2017/12/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainServiceImplTest {

    @Autowired
    private TrainService trainService;


    @Test
    public void findTrainInfoByTrainId() throws Exception {
    }

    @Test
    public void findByTrainDate() throws Exception {
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date pre=format.parse("2017-8-18");
        long time=pre.getTime()+86400000;
        Date after=new Date(time);
        ResultVO resultVO = trainService.findByTrainDate(pre, after, 1, 26);
        System.out.println(resultVO);
    }

}