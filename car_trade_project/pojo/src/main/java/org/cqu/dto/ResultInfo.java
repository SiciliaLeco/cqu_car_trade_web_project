package org.cqu.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class ResultInfo<T> implements Serializable {
    private String msg;
    private Boolean success = false;
    private T detail = null;
    private List<T> result_list = null;
    private String token = "null";
    private static final long EXPIRE_DATE=30*60*100000; // 3000分钟以后过期
    private static final String TOKEN_SECRET = "tanghuoguo";
    private String id;
    private Boolean is_buyer = true;

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

    public static String verifyToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            String userId = jwt.getClaim("userId").asString();
            return userId;
        } catch (Exception e){
            return null;
        }
    }
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

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

    public Boolean getIs_buyer() {
        return success;
    }

    public void setIs_buyer(Boolean success) {
        this.is_buyer = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }

    public void setResult_list(List<T> list) {this.result_list = list;}

    public List<T> getResult_list() {return result_list;}
}
