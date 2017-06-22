package com.zkzj.entity;

/**
 * 请求返回的最外层对象
 * Created by chenwt on 2017/6/22.
 */
public class Result<T>{
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /**总共多少条**/
    private Long total;

    /** 具体的内容. */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
