package com.njust.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将前端传过来的改为标准的Date时间类型
 * Created by zhujiawei on 2018/1/3.
 */
public class DateUtil {
    //时间类型转换的格式
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //Long类型数据转为Date的数据
    public static Date Long2Date(String time){
        return new Date(Long.parseLong(time));
    }
    //将string类型的数据转为Date类型的数据
    public static Date String2Date(String time) throws ParseException {
        return format.parse(time);
    }

    public static void main(String[] args) {
        Date date = DateUtil.Long2Date("1503014400000");
        System.out.println(date);
    }
}
