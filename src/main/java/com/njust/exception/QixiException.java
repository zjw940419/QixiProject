package com.njust.exception;

import com.njust.enums.ResultEnum;
import lombok.Getter;

/**
 * 气隙错误异常
 * Created by zhujiawei on 2017/12/29.
 */
@Getter
public class QixiException extends RuntimeException{

    private Integer code;

    public QixiException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }

    public QixiException(Integer code,String message){
        super(message);
        this.code=code;
    }

}
