package com.njust.form;

import lombok.Data;

@Data
public class SlotForm {
    //起始时间
    private String startTime;
    //终止时间
    private String endTime;
    //列车编号
    private String trainId;
    //电机编号
    private Integer motorNum;
    //运行方向
    private Integer trainDirection;
    //具体的两个齿
    private Integer firstSlot;

    private Integer secondSlot;
    //第几页
    private Integer pageNum;
    //一页显示多少条记录
    private Integer pageSize;
}
