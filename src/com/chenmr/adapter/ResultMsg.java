package com.chenmr.adapter;

public class ResultMsg {

    public ResultMsg(int code, String msg, User data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private int code;

    private String msg;

    private User data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
