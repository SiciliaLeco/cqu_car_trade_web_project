package org.cqu.pojo;

import java.io.Serializable;

public class Car implements Serializable {
    private Integer cid;

    private String cname;

    private Float cprice;

    private Integer cspeed;

    private String cfuel;

    private String ctype;

    private String cgear;

    private Integer cwarranty;

    private Integer ctankCapacity;

    private Float cacceleration;

    private String cpic5;

    private String cpic4;

    private String cpic3;

    private String cpic1;

    private String cpic2;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Float getCprice() {
        return cprice;
    }

    public void setCprice(Float cprice) {
        this.cprice = cprice;
    }

    public Integer getCspeed() {
        return cspeed;
    }

    public void setCspeed(Integer cspeed) {
        this.cspeed = cspeed;
    }

    public String getCfuel() {
        return cfuel;
    }

    public void setCfuel(String cfuel) {
        this.cfuel = cfuel == null ? null : cfuel.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getCgear() {
        return cgear;
    }

    public void setCgear(String cgear) {
        this.cgear = cgear == null ? null : cgear.trim();
    }

    public Integer getCwarranty() {
        return cwarranty;
    }

    public void setCwarranty(Integer cwarranty) {
        this.cwarranty = cwarranty;
    }

    public Integer getCtankCapacity() {
        return ctankCapacity;
    }

    public void setCtankCapacity(Integer ctankCapacity) {
        this.ctankCapacity = ctankCapacity;
    }

    public Float getCacceleration() {
        return cacceleration;
    }

    public void setCacceleration(Float cacceleration) {
        this.cacceleration = cacceleration;
    }

    public String getCpic5() {
        return cpic5;
    }

    public void setCpic5(String cpic5) {
        this.cpic5 = cpic5 == null ? null : cpic5.trim();
    }

    public String getCpic4() {
        return cpic4;
    }

    public void setCpic4(String cpic4) {
        this.cpic4 = cpic4 == null ? null : cpic4.trim();
    }

    public String getCpic3() {
        return cpic3;
    }

    public void setCpic3(String cpic3) {
        this.cpic3 = cpic3 == null ? null : cpic3.trim();
    }

    public String getCpic1() {
        return cpic1;
    }

    public void setCpic1(String cpic1) {
        this.cpic1 = cpic1 == null ? null : cpic1.trim();
    }

    public String getCpic2() {
        return cpic2;
    }

    public void setCpic2(String cpic2) {
        this.cpic2 = cpic2 == null ? null : cpic2.trim();
    }
}