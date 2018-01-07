package com.njust.controller;


import com.njust.service.GearService;
import com.njust.service.MotorService;
import com.njust.service.TrainService;
import com.njust.utils.DateUtil;

import com.njust.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;


/**
 * Created by zhujiawei on 2017/12/28.
 */
@Controller
@RequestMapping("/Report")
public class Reportcontroller {

    @Autowired
    private MotorService motorService;

    @Autowired
    private TrainService trainService;

    @Autowired
    private GearService gearService;

    /**
     * 返回左右激光原始数据
     * @param trainOnlyid 列车记录编号
     * @param motorNum 电机编号（1-8）
     * @return
     */
    @RequestMapping("/{trainOnlyid}/{motorNum}/laser")
    @ResponseBody
    public ResultVO laserData(@PathVariable(name = "trainOnlyid")Long trainOnlyid,
                          @PathVariable(name = "motorNum") Integer motorNum){
        return motorService.findByTrainOnlyidAndMotorNum(trainOnlyid,motorNum);
    }

    /**
     * 返回 具体列车的所有信息
     * @param trainOnlyid
     * @return
     */
    @RequestMapping("/{trainOnlyid}/trainDetail")
    @ResponseBody
    public ResultVO trainDetail(@PathVariable(name = "trainOnlyid")Long trainOnlyid){
        return trainService.findTrainInfoByTrainOnlyid(trainOnlyid);
    }

    /**
     * 返回具体电机综合数据
     * @param trainOnlyid
     * @return
     */
    @RequestMapping("/{trainOnlyid}/motorDetail")
    @ResponseBody
    public ResultVO motorDetail(@PathVariable(name = "trainOnlyid")Long trainOnlyid){
        return motorService.findByTrainOnlyid(trainOnlyid);
    }

    /**
     * 前端 列车记录编号和电机号 返回具体的数据
     * @param trainOnlyid
     * @param motorNum
     * @return
     */
    @RequestMapping("/{trainOnlyid}/{motorNum}/gearDetail")
    @ResponseBody
    public ResultVO gearDetail(@PathVariable(name = "trainOnlyid")Long trainOnlyid,
                                   @PathVariable(name = "motorNum")Integer motorNum){
        return gearService.findByTrainOnlyidAndMotorId(trainOnlyid,motorNum);
    }

    /**
     *行车报表 查询出当日的列车运行的数据 前端传给毫秒字段的时间或者字符串
     * @param pre 开始时间0点 到24点的过车情况
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/todayReport")
    @ResponseBody
    public ResultVO findByTrainDate(@RequestParam("pre")String pre,@RequestParam(value = "page",defaultValue = "1")Integer page,
                                             @RequestParam(value = "size",defaultValue = "2")Integer size) throws ParseException {
        //将Long类型的时间转为Date类型的数据
        Date firsttime = DateUtil.String2Date(pre);
        long time=firsttime.getTime()+86400000;
        Date lasttime=new Date(time);
        return trainService.findByTrainDate(firsttime,lasttime,page,size);
    }
}
