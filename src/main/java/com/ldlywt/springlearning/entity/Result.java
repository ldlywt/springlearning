/*
 * *
 *
 *     Created by OuYangX.
 *     Copyright (c) 2017, ouyangxian@gmail.com All Rights Reserved.
 *
 * /
 */

package com.ldlywt.springlearning.entity;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int SUCC = 0;
    public static final int FAILED = 1;

    private Integer statusCode = 0;
    private String msg;
    private T data;

    public Result() {

    }

    public Result(int statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public Result(int statusCode, String msg, T data) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    public static Result SuccResult() {
        return SuccResult(null);
    }
    public static <T>Result SuccResult(T t) {
        return SuccResult("成功",t);
    }
    public static <T>Result SuccResult(String msg,T t) {
        return new Result(SUCC, msg,t);
    }

    public static <T>Result FailedResult(String msg,T t) {
        return new Result(FAILED, msg,t);
    }
    public static Result<Object> FailedResult() {
        return new Result<Object>(FAILED, "失败");
    }
    public static Result<Object> FailedResult(String msg) {
        return new Result<Object>(FAILED, msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
