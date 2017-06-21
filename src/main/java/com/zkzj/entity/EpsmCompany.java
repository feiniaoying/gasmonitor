package com.zkzj.entity;
public class EpsmCompany {
    private String companyid;
    private String companyname;
    private String address;
    private Double addresslatitude;
    private Double addresslongitude;
    private String contact;
    private String contactphone;
    private String telephone;
    private String industrycode;
    private String industryname;
    private String remark;
    private Object deleteflag;
    private java.util.Date createtime;
    private String creatorid;
    private java.util.Date updatetime;
    private String updaterid;
    public EpsmCompany() {
        super();
    }
    public EpsmCompany(String companyid,String companyname,String address,Double addresslatitude,Double addresslongitude,String contact,String contactphone,String telephone,String industrycode,String industryname,String remark,Object deleteflag,java.util.Date createtime,String creatorid,java.util.Date updatetime,String updaterid) {
        super();
        this.companyid = companyid;
        this.companyname = companyname;
        this.address = address;
        this.addresslatitude = addresslatitude;
        this.addresslongitude = addresslongitude;
        this.contact = contact;
        this.contactphone = contactphone;
        this.telephone = telephone;
        this.industrycode = industrycode;
        this.industryname = industryname;
        this.remark = remark;
        this.deleteflag = deleteflag;
        this.createtime = createtime;
        this.creatorid = creatorid;
        this.updatetime = updatetime;
        this.updaterid = updaterid;
    }
    public String getCompanyid() {
        return this.companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactphone() {
        return this.contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIndustrycode() {
        return this.industrycode;
    }

    public void setIndustrycode(String industrycode) {
        this.industrycode = industrycode;
    }

    public String getIndustryname() {
        return this.industryname;
    }

    public void setIndustryname(String industryname) {
        this.industryname = industryname;
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
