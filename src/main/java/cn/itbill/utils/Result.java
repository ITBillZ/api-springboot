package cn.itbill.utils;

import com.alibaba.fastjson2.JSON;

import java.io.Serializable;

public class Result implements Serializable {
    private Integer status;
    private Object message;

    public Result(ResultCode code, Object message) {
        this.status = code.getStatus();
        this.message = message;
    }

    public Result(Object message) {
        this(ResultCode.SUCCESS, message);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public static String getFailMsg() {
        Result result = new Result(ResultCode.FAIL, null);
        return JSON.toJSONString(result);
    }

    public static String getSuccessMsg() {
        Result result = new Result(ResultCode.SUCCESS, null);
        return JSON.toJSONString(result);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
