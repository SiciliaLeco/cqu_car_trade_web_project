package org.cqu.dto;

import java.util.Map;
import java.util.HashMap;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class ResultInfo<T> {
    private String msg;
    private Boolean success = false;
    private T detail = null;
    private String token = "null";
    private static final long EXPIRE_DATE=30*60*100000; // 3000分钟以后过期
    private static final String TOKEN_SECRET = "tanghuoguo";

    @Override
    public String toString() {
        return "ResultInfo{" +
                "msg='" + msg + '\'' +
                ", success=" + success +
                "}";
    }

    //todo: implement token function
    public String generate_token(String user_tel){
        Date date = new Date(System.currentTimeMillis() + EXPIRE_DATE); // set expire date
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        Map<String, Object> header = new HashMap<>(2);
        header.put("Type", "Jwt");
        header.put("alg", "HS256");
        return  JWT.create()
                .withHeader(header)
                .withClaim("user_tel", user_tel)
                .withExpiresAt(date)
                .sign(algorithm);
    }

    public String getToken(){return token;}

    public void setToken(String token){this.token = token;}

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
