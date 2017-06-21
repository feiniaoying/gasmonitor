package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.IndustryDao;
import com.zkzj.entity.Industry;
import com.zkzj.common.Assist;
import com.zkzj.service.IndustryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndustryServiceImpl implements IndustryService{
    @Resource(name = "industryDao")
    private IndustryDao industryDao;
    @Override
    public long getIndustryRowCount(Assist assist){
        return industryDao.getIndustryRowCount(assist);
    }
    @Override
    public List<Industry> selectIndustry(Assist assist){
        return industryDao.selectIndustry(assist);
    }
    @Override
    public Industry selectIndustryById(String id){
        return industryDao.selectIndustryById(id);
    }
    @Override
    public int insertIndustry(Industry value){
        return industryDao.insertIndustry(value);
    }
    @Override
    public int insertNonEmptyIndustry(Industry value){
        return industryDao.insertNonEmptyIndustry(value);
    }
    @Override
    public int deleteIndustryById(String id){
        return industryDao.deleteIndustryById(id);
    }
    @Override
    public int deleteIndustry(Assist assist){
        return industryDao.deleteIndustry(assist);
    }
    @Override
    public int updateIndustryById(Industry enti){
        return industryDao.updateIndustryById(enti);
    }
    @Override
    public int updateIndustry(Industry value, Assist assist){
        return industryDao.updateIndustry(value,assist);
    }
    @Override
    public int updateNonEmptyIndustryById(Industry enti){
        return industryDao.updateNonEmptyIndustryById(enti);
    }
    @Override
    public int updateNonEmptyIndustry(Industry value, Assist assist){
        return industryDao.updateNonEmptyIndustry(value,assist);
    }

    public IndustryDao getIndustryDao() {
        return this.industryDao;
    }

    public void setIndustryDao(IndustryDao industryDao) {
        this.industryDao = industryDao;
    }

}