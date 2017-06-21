package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmCompany;
import com.zkzj.common.Assist;
public interface EpsmCompanyService{
    long getEpsmCompanyRowCount(Assist assist);
    List<EpsmCompany> selectEpsmCompany(Assist assist);
    EpsmCompany selectEpsmCompanyById(String id);
    int insertEpsmCompany(EpsmCompany value);
    int insertNonEmptyEpsmCompany(EpsmCompany value);
    int deleteEpsmCompanyById(String id);
    int deleteEpsmCompany(Assist assist);
    int updateEpsmCompanyById(EpsmCompany enti);
    int updateEpsmCompany(EpsmCompany value, Assist assist);
    int updateNonEmptyEpsmCompanyById(EpsmCompany enti);
    int updateNonEmptyEpsmCompany(EpsmCompany value, Assist assist);
}