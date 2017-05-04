package com.example.common;

/**
 * Created by yijinsheng on 2017/5/4.
 */
public enum ResultCode {
    SUCCESS("0000", "成功");

    private final String code;

    private final String des;

    ResultCode(String code, String desc) {
        this.code = code;
        this.des = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDes() {
        return des;
    }

}
