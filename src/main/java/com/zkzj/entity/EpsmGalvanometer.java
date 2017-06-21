package com.zkzj.entity;
public class EpsmGalvanometer {
    private String galvanometerid;
    private String galvanometercode;
    private String galvanometername;
    private String galvanometerserialno;
    private String actorid;
    private String companyid;
    private Object status;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmGalvanometer() {
        super();
    }
    public EpsmGalvanometer(String galvanometerid,String galvanometercode,String galvanometername,String galvanometerserialno,String actorid,String companyid,Object status,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.galvanometerid = galvanometerid;
        this.galvanometercode = galvanometercode;
        this.galvanometername = galvanometername;
        this.galvanometerserialno = galvanometerserialno;
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
    public String getGalvanometerid() {
        return this.galvanometerid;
    }

    public void setGalvanometerid(String galvanometerid) {
        this.galvanometerid = galvanometerid;
    }

    public String getGalvanometercode() {
        return this.galvanometercode;
    }

    public void setGalvanometercode(String galvanometercode) {
        this.galvanometercode = galvanometercode;
    }

    public String getGalvanometername() {
        return this.galvanometername;
    }

    public void setGalvanometername(String galvanometername) {
        this.galvanometername = galvanometername;
    }

    public String getGalvanometerserialno() {
        return this.galvanometerserialno;
    }

    public void setGalvanometerserialno(String galvanometerserialno) {
        this.galvanometerserialno = galvanometerserialno;
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
