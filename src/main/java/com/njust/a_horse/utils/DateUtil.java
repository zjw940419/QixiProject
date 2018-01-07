package com.njust.a_horse.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: 时间转换类
 * Create by User: HorseChestnut
 * Date: 2018-01-06
 */
public class DateUtil {
    /**
     * 将字符串转成Date
     */
    public static Date getDate(String time){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将Date转成字符串
     */
    public static String getDate(Date date){
        String time = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            time = format.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return time;
    }
}
