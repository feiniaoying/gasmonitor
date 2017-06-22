package com.zkzj.handle;

import com.zkzj.common.ResponseUtil;
import com.zkzj.common.enums.ResultEnum;
import com.zkzj.common.exception.CustomException;
import com.zkzj.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenwt on 2017/6/22.
 */

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof CustomException) {
            CustomException customException = (CustomException) e;
            return ResponseUtil.error(customException.getCode(), customException.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResponseUtil.error(ResultEnum.UNKONW_ERROR.getCode(), ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}
