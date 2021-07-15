package com.jk.login.pojo;


public class Seller {

  private long sid;
  private String sName;
  private String sTel;
  private String sAddress;
  private String sPassword;
  private double sGrade;


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getSTel() {
    return sTel;
  }

  public void setSTel(String sTel) {
    this.sTel = sTel;
  }


  public String getSAddress() {
    return sAddress;
  }

  public void setSAddress(String sAddress) {
    this.sAddress = sAddress;
  }


  public String getSPassword() {
    return sPassword;
  }

  public void setSPassword(String sPassword) {
    this.sPassword = sPassword;
  }


  public double getSGrade() {
    return sGrade;
  }

  public void setSGrade(double sGrade) {
    this.sGrade = sGrade;
  }

}
