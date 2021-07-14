package com.jk.login.pojo;

public class User {
//    private Integer userId;
//    private String userName;
//    private String userPassword;
//    private String userEmail;
//    private String userGrade;
    private Integer BID;
    private String BName;
    private Integer BGender;
    private String BAddress;
    private Integer BVIP;
    private String BTel;
    private String bpassword;
    private String BICon;

    public String getBTel(){
        return BTel;
    }
    public void setBTel(String tel){
        this.BTel = tel;
    }
    public Integer getBID() {return BID;}
    public void setBID(Integer id) {this.BID = id;}
    public String getBName() {return BName;}
    public void setBName(String name) {this.BName = name;}

    public Integer getBGender() {return BGender;}
    public void setBGender(Integer gender) {this.BGender = gender;}
    public String getBAddress() {return BAddress;}
    public void setBAddress(String address){this.BAddress = address;}
    public Integer getBVIP() {return BVIP;}
    public void setBVIP(Integer VIP) {this.BVIP = VIP;}

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword;
    }

    public String getBICon() {return BICon;}
    public void setBICon(String ICon) {this.BICon = ICon;}

    @Override
    public String toString(){
        return "buyer{"+
                "buyer_id="+BID+
                ", buyer_name="+BName+
                ", buyer_tel="+BTel+
                "}";
    }
}
