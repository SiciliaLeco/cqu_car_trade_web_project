package com.jk.login.info;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResultInfo<T> {
    private String msg;
    private Boolean success = false;
    private T detail = null;
    private static final long EXPIRE_DATE=30*60*100000;
    private static final String TOKEN_SECRET = "tanghuoguo";

    @Override
    public String toString() {
        return "ResultInfo{" +
                "msg='" + msg + '\'' +
                ", success=" + success +
                "}";
    }

    //todo: implement token function
    public String generate_token(){

        return "";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
