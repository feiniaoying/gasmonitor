package com.zkzj.entity;
public class EpsmEnose {
    private String enoseid;
    private String enosecode;
    private String enosename;
    private String enoseserialno;
    private String actorid;
    private String companyid;
    private Object status;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmEnose() {
        super();
    }
    public EpsmEnose(String enoseid,String enosecode,String enosename,String enoseserialno,String actorid,String companyid,Object status,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.enoseid = enoseid;
        this.enosecode = enosecode;
        this.enosename = enosename;
        this.enoseserialno = enoseserialno;
        this.actorid = actorid;
        this.companyid = companyid;
        this.status = status;
        this.remark = remark;
        this.deleteflag = deleteflag;
        this.createtime = createtime;
        this.creatorid = creatorid;
        this.updatetime = updatetime;
        this.updaterid = updaterid;
    }
    public String getEnoseid() {
        return this.enoseid;
    }

    public void setEnoseid(String enoseid) {
        this.enoseid = enoseid;
    }

    public String getEnosecode() {
        return this.enosecode;
    }

    public void setEnosecode(String enosecode) {
        this.enosecode = enosecode;
    }

    public String getEnosename() {
        return this.enosename;
    }

    public void setEnosename(String enosename) {
        this.enosename = enosename;
    }

    public String getEnoseserialno() {
        return this.enoseserialno;
    }

    public void setEnoseserialno(String enoseserialno) {
        this.enoseserialno = enoseserialno;
    }

    public String getActorid() {
        return this.actorid;
    }

    public void setActorid(String actorid) {
        this.actorid = actorid;
    }

    public String getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public Object getStatus() {
        return this.status;
    }

    public void setStatus(Object status) {
        this.status = status;
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
