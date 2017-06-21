package com.zkzj.entity;
public class EpsmEnosedata {
    private String dataid;
    private String enoseserialno;
    private String dysodiatype;
    private String dysodiavalue;
    private java.util.Date testtime;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmEnosedata() {
        super();
    }
    public EpsmEnosedata(String dataid,String enoseserialno,String dysodiatype,String dysodiavalue,java.util.Date testtime,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.dataid = dataid;
        this.enoseserialno = enoseserialno;
        this.dysodiatype = dysodiatype;
        this.dysodiavalue = dysodiavalue;
        this.testtime = testtime;
        this.remark = remark;
        this.deleteflag = deleteflag;
        this.createtime = createtime;
        this.creatorid = creatorid;
        this.updatetime = updatetime;
        this.updaterid = updaterid;
    }
    public String getDataid() {
        return this.dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getEnoseserialno() {
        return this.enoseserialno;
    }

    public void setEnoseserialno(String enoseserialno) {
        this.enoseserialno = enoseserialno;
    }

    public String getDysodiatype() {
        return this.dysodiatype;
    }

    public void setDysodiatype(String dysodiatype) {
        this.dysodiatype = dysodiatype;
    }

    public String getDysodiavalue() {
        return this.dysodiavalue;
    }

    public void setDysodiavalue(String dysodiavalue) {
        this.dysodiavalue = dysodiavalue;
    }

    public java.util.Date getTesttime() {
        return this.testtime;
    }

    public void setTesttime(java.util.Date testtime) {
        this.testtime = testtime;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getDeleteflag() {
        return this.deleteflag;
    }

    public void setDeleteflag(Object deleteflag) {
        this.deleteflag = deleteflag;
    }

    public java.util.Date getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(java.util.Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatorid() {
        return this.creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public java.util.Date getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(java.util.Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdaterid() {
        return this.updaterid;
    }

    public void setUpdaterid(String updaterid) {
        this.updaterid = updaterid;
    }

}
