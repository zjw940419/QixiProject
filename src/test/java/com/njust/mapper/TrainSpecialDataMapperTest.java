package com.njust.mapper;

import com.njust.dataobject.TrainSpecialData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TrainSpecialDataMapperTest {

    @Autowired
    private TrainSpecialDataMapper trainSpecialDataMapper;
    @Test
    public void findMinInfoByDatetime() throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(new Date());
        Date pre = df.parse(format);
        long time = pre.getTime() + 86400000;
        Date after = new Date(time);
        List<TrainSpecialData> trainSpecialDataList = trainSpecialDataMapper.findMinInfoByDatetime(pre, after);
        System.out.println(trainSpecialDataList);
    }
}