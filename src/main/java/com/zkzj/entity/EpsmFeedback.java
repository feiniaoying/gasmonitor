package com.zkzj.entity;
public class EpsmFeedback {
    private String feedbackid;
    private String content;
    private String actorid;
    private String address;
    private Double addresslatitude;
    private Double addresslongitude;
    private Object senselevle;
    private Object status;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmFeedback() {
        super();
    }
    public EpsmFeedback(String feedbackid,String content,String actorid,String address,Double addresslatitude,Double addresslongitude,Object senselevle,Object status,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.feedbackid = feedbackid;
        this.content = content;
        this.actorid = actorid;
        this.address = address;
        this.addresslatitude = addresslatitude;
        this.addresslongitude = addresslongitude;
        this.senselevle = senselevle;
        this.status = status;
        this.remark = remark;
        this.deleteflag = deleteflag;
        this.createtime = createtime;
        this.creatorid = creatorid;
        this.updatetime = updatetime;
        this.updaterid = updaterid;
    }
    public String getFeedbackid() {
        return this.feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getActorid() {
        return this.actorid;
    }

    public void setActorid(String actorid) {
        this.actorid = actorid;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAddresslatitude() {
        return this.addresslatitude;
    }

    public void setAddresslatitude(Double addresslatitude) {
        this.addresslatitude = addresslatitude;
    }

    public Double getAddresslongitude() {
        return this.addresslongitude;
    }

    public void setAddresslongitude(Double addresslongitude) {
        this.addresslongitude = addresslongitude;
    }

    public Object getSenselevle() {
        return this.senselevle;
    }

    public void setSenselevle(Object senselevle) {
        this.senselevle = senselevle;
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
