package com.njust.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Controller
@Slf4j
@RequestMapping("/")
public class RealDisplayController {
    //显示出列车过车状态 根据前端返回的时间类型的值 判断当前数据库中最后一条记录的插入时间是否 小于传来的时间


}
