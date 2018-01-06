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
    private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * 将字符串转为String类型
     * @param time
     * @return
     */
    public static String Date2String(Date time){
         return format.format(time);
    }

    public static Date String2Date(String date) throws ParseException {
        return format.parse(date);
    }
}
