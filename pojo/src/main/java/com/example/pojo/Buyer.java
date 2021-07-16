package com.example.pojo;

public class Buyer {
    private String btel;

    private Integer bid;

    private String bname;

    private Integer bgender;

    private String baddress;

    private Integer bvip;

    private String bpassword;

    private String bicon;

    public String getBtel() {
        return btel;
    }

    public void setBtel(String btel) {
        this.btel = btel == null ? null : btel.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Integer getBgender() {
        return bgender;
    }

    public void setBgender(Integer bgender) {
        this.bgender = bgender;
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public Integer getBvip() {
        return bvip;
    }

    public void setBvip(Integer bvip) {
        this.bvip = bvip;
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword == null ? null : bpassword.trim();
    }

    public String getBicon() {
        return bicon;
    }

    public void setBicon(String bicon) {
        this.bicon = bicon == null ? null : bicon.trim();
    }
}