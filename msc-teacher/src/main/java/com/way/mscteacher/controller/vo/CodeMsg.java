package com.way.mscteacher.controller.vo;

import lombok.Data;


public enum CodeMsg {
    SUCCESS(1,"success"),
    FAIL(0,"fail");

    private int code;

    private String msg;

    CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
