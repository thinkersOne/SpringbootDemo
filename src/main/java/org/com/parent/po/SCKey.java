package org.com.parent.po;

import java.io.Serializable;

public class SCKey implements Serializable {
    private Integer sid;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}