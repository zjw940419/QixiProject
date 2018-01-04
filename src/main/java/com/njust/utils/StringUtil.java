package com.njust.utils;

/**
 * Created by zhujiawei on 2017/12/29.
 */
public class StringUtil {

    //拼接起来 号
    public static String changeStr(Double data,Integer num){
        return String.format("%.2f(%d号)",data,num);
    }

    //拼接起来 齿
    public static String changeChi(Double data,Integer num){
        return String.format("%.2f(%d齿)",data,num);
    }

    //拼接起来 槽
    public static String changeCao(Double data,Integer num){
        return String.format("%.2f(%d槽)",data,num);
    }

    public static void main(String[] args) {
        System.out.println(StringUtil.changeStr(23.6,3));
    }
}
