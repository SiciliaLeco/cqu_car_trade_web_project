package org.cqu.pojo;

import java.util.Date;

public class Menu {
    private Integer oid;

    private String stel;

    private String btel;

    private Date odate;

    private Integer oprice;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel == null ? null : stel.trim();
    }

    public String getBtel() {
        return btel;
    }

    public void setBtel(String btel) {
        this.btel = btel == null ? null : btel.trim();
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public Integer getOprice() {
        return oprice;
    }

    public void setOprice(Integer oprice) {
        this.oprice = oprice;
    }
}