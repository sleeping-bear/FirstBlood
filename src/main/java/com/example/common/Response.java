package com.example.common;

/**
 * Created by yijinsheng on 2017/5/4.
 */
public class Response<T> {
    private String code;
    private String desc;
    private T result;

    public Response(ResultCode resultCode, T result) {
        this.code = resultCode.getCode();
        this.desc = resultCode.getDes();
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
