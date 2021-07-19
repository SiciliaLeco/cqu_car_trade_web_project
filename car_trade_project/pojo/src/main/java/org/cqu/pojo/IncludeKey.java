package org.cqu.pojo;

import java.io.Serializable;

public class IncludeKey implements Serializable {
    private Integer cid;

    private Integer oid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}