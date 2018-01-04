package com.njust.enums;

import lombok.Getter;

/**
 * 结果提示的内容
 * Created by zhujiawei on 2017/12/29.
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数不正确");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
