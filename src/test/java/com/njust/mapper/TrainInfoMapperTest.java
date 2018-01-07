package com.njust.mapper;

import com.njust.dataobject.TrainInfo;
import com.njust.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TrainInfoMapperTest {
    @Autowired
    private TrainInfoMapper trainInfoMapper;

    @Test
    public void findByTrainDateAndDirection() throws ParseException {
        Date pre = DateUtil.String2Date("20170818131313");
        Date after = DateUtil.String2Date("20170819202020");
        List<TrainInfo> byTrainDateAndDirection = trainInfoMapper.findByTrainDateAndDirection(pre, after, "8990",0);
        System.out.println(byTrainDateAndDirection.size());
    }
}