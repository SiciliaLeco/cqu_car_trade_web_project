package org.cqu.pojo;


import java.io.Serializable;

public class Include extends IncludeKey implements Serializable {
    private Integer mcount;

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
    }
}