package com.zkzj.common;

import com.zkzj.common.enums.ResultEnum;
import com.zkzj.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenwt on 2017/6/22.
 */
public class ResponseUtil {
    protected static Logger logger = LoggerFactory.getLogger(ResponseUtil.class);

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    /**
     * 适用于分页成功返回
     * @param object
     * @param total
     * @return
     */
    public static Result success(Object object,Long total) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setTotal(total);
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
