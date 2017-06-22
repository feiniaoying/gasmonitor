package com.zkzj.common.exception;

import com.zkzj.common.enums.ResultEnum;

/**
 * 自定义异常
 * Created by chenwt on 2017/6/22.
 */
public class CustomException extends RuntimeException{
    private Integer code;

    public CustomException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
