package com.wbm.hospital.forum.commom;

import lombok.Data;

/**
 * @Author：Ming
 * @Date: 2022/11/9 20:15
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static Result success(Integer code, String msg){
        return new Result(code,msg);
    }
    public static Result success(Integer code, String msg, Object data){
        return new Result(code,msg,data);
    }
    public static Result error(Integer code, String msg){
        return new Result(code,msg);
    }
    public static Result error(Integer code, String msg, Object data){
        return new Result(code,msg,data);
    }
}
