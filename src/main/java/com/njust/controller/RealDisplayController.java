package com.njust.controller;

import com.njust.service.TrainService;
import com.njust.utils.DateUtil;
import com.njust.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Controller
@Slf4j
@RequestMapping("/")
public class RealDisplayController {

    @Autowired
    private TrainService trainService;
    //显示出列车过车状态 根据前端返回的时间类型的值 判断当前数据库中最后一条记录的插入时间是否 小于传来的时间

    @GetMapping("QixiMinToday")
    @ResponseBody
    public ResultVO QixiMinToday() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(new Date());
        Date pre = df.parse(format);
        long time = pre.getTime() + 86400000;
        Date after = new Date(time);
        ResultVO resultVO = trainService.TodayLast10(pre, after);
        return resultVO;
    }

}
