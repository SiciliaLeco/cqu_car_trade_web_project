package org.cqu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable {
    private Integer cartid;

    private Date cartdate;

    private Integer cartprice;

    private String btel;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Date getCartdate() {
        return cartdate;
    }

    public void setCartdate(Date cartdate) {
        this.cartdate = cartdate;
    }

    public Integer getCartprice() {
        return cartprice;
    }

    public void setCartprice(Integer cartprice) {
        this.cartprice = cartprice;
    }

    public String getBtel() {
        return btel;
    }

    public void setBtel(String btel) {
        this.btel = btel == null ? null : btel.trim();
    }
}