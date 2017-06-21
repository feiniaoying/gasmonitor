package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmCompanyDao;
import com.zkzj.entity.EpsmCompany;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmCompanyServiceImpl implements EpsmCompanyService{
    @Resource(name = "epsmCompanyDao")
    private EpsmCompanyDao epsmCompanyDao;
    @Override
    public long getEpsmCompanyRowCount(Assist assist){
        return epsmCompanyDao.getEpsmCompanyRowCount(assist);
    }
    @Override
    public List<EpsmCompany> selectEpsmCompany(Assist assist){
        return epsmCompanyDao.selectEpsmCompany(assist);
    }
    @Override
    public EpsmCompany selectEpsmCompanyById(String id){
        return epsmCompanyDao.selectEpsmCompanyById(id);
    }
    @Override
    public int insertEpsmCompany(EpsmCompany value){
        return epsmCompanyDao.insertEpsmCompany(value);
    }
    @Override
    public int insertNonEmptyEpsmCompany(EpsmCompany value){
        return epsmCompanyDao.insertNonEmptyEpsmCompany(value);
    }
    @Override
    public int deleteEpsmCompanyById(String id){
        return epsmCompanyDao.deleteEpsmCompanyById(id);
    }
    @Override
    public int deleteEpsmCompany(Assist assist){
        return epsmCompanyDao.deleteEpsmCompany(assist);
    }
    @Override
    public int updateEpsmCompanyById(EpsmCompany enti){
        return epsmCompanyDao.updateEpsmCompanyById(enti);
    }
    @Override
    public int updateEpsmCompany(EpsmCompany value, Assist assist){
        return epsmCompanyDao.updateEpsmCompany(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmCompanyById(EpsmCompany enti){
        return epsmCompanyDao.updateNonEmptyEpsmCompanyById(enti);
    }
    @Override
    public int updateNonEmptyEpsmCompany(EpsmCompany value, Assist assist){
        return epsmCompanyDao.updateNonEmptyEpsmCompany(value,assist);
    }

    public EpsmCompanyDao getEpsmCompanyDao() {
        return this.epsmCompanyDao;
    }

    public void setEpsmCompanyDao(EpsmCompanyDao epsmCompanyDao) {
        this.epsmCompanyDao = epsmCompanyDao;
    }

}