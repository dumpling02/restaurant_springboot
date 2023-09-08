package com.example.controller;

// 访问页面返回的消息日志
public class Result {
    private Object data;
    private Integer code;
    private String msg;
    private Integer totalCount;
    private Integer totalMoney;

    public Integer getPeopleMoney() {
        return peopleMoney;
    }

    public void setPeopleMoney(Integer peopleMoney) {
        this.peopleMoney = peopleMoney;
    }

    private Integer peopleMoney;

    public Result() {
    }

    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(Object data, Integer code, String msg, int totalCount) {
        this.data = data;
        this.code = code;
        this.msg = msg;
        this.totalCount = totalCount;
    }

    public Result(Object data, Integer code, String msg, int totalCount, int totalMoney) {
        this.data = data;
        this.code = code;
        this.msg = msg;
        this.totalCount = totalCount;
        this.totalMoney = totalMoney;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }
}
