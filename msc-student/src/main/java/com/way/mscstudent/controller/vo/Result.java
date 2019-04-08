package com.way.mscstudent.controller.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {



    private static final long serialVersionUID = -1577833127388557227L;


    private String msg;
    private int code;
    private T data;

    public Result() {
        super();
    }

    public Result(int code,String msg,T data) {
        super();
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

}
