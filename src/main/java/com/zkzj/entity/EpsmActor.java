package com.zkzj.entity;

public class EpsmActor {
    private String actorid;
    private String actorcode;
    private String actorname;
    private String phone;
    private Object status;
    private String username;
    private String password;
    private Object actortype;
    private Object actorrole;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmActor() {
        super();
    }
    public EpsmActor(String actorid,String actorcode,String actorname,String phone,Object status,String username,String password,Object actortype,Object actorrole,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.actorid = actorid;
        this.actorcode = actorcode;
        this.actorname = actorname;
        this.phone = phone;
        this.status = status;
        this.username = username;
        this.password = password;
        this.actortype = actortype;
        this.actorrole = actorrole;
        this.remark = remark;
        this.deleteflag = deleteflag;
        this.createtime = createtime;
        this.creatorid = creatorid;
        this.updatetime = updatetime;
        this.updaterid = updaterid;
    }
    public String getActorid() {
        return this.actorid;
    }

    public void setActorid(String actorid) {
        this.actorid = actorid;
    }

    public String getActorcode() {
        return this.actorcode;
    }

    public void setActorcode(String actorcode) {
        this.actorcode = actorcode;
    }

    public String getActorname() {
        return this.actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getStatus() {
        return this.status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getActortype() {
        return this.actortype;
    }

    public void setActortype(Object actortype) {
        this.actortype = actortype;
    }

    public Object getActorrole() {
        return this.actorrole;
    }

    public void setActorrole(Object actorrole) {
        this.actorrole = actorrole;
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

    @Override
    public String toString() {
        return "EpsmActor{" +
                "actorid='" + actorid + '\'' +
                ", actorcode='" + actorcode + '\'' +
                ", actorname='" + actorname + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", actortype=" + actortype +
                ", actorrole=" + actorrole +
                ", remark='" + remark + '\'' +
                ", deleteflag=" + deleteflag +
                ", createtime=" + createtime +
                ", creatorid='" + creatorid + '\'' +
                ", updatetime=" + updatetime +
                ", updaterid='" + updaterid + '\'' +
                '}';
    }
}
