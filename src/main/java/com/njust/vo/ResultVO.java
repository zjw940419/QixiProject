package com.njust.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -5686033574197482732L;

    //返回给前端的数据
    private T data;
}
