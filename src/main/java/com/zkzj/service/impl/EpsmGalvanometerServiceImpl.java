package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmGalvanometerDao;
import com.zkzj.entity.EpsmGalvanometer;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmGalvanometerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmGalvanometerServiceImpl implements EpsmGalvanometerService{
    @Resource(name = "epsmGalvanometerDao")
    private EpsmGalvanometerDao epsmGalvanometerDao;
    @Override
    public long getEpsmGalvanometerRowCount(Assist assist){
        return epsmGalvanometerDao.getEpsmGalvanometerRowCount(assist);
    }
    @Override
    public List<EpsmGalvanometer> selectEpsmGalvanometer(Assist assist){
        return epsmGalvanometerDao.selectEpsmGalvanometer(assist);
    }
    @Override
    public EpsmGalvanometer selectEpsmGalvanometerById(String id){
        return epsmGalvanometerDao.selectEpsmGalvanometerById(id);
    }
    @Override
    public int insertEpsmGalvanometer(EpsmGalvanometer value){
        return epsmGalvanometerDao.insertEpsmGalvanometer(value);
    }
    @Override
    public int insertNonEmptyEpsmGalvanometer(EpsmGalvanometer value){
        return epsmGalvanometerDao.insertNonEmptyEpsmGalvanometer(value);
    }
    @Override
    public int deleteEpsmGalvanometerById(String id){
        return epsmGalvanometerDao.deleteEpsmGalvanometerById(id);
    }
    @Override
    public int deleteEpsmGalvanometer(Assist assist){
        return epsmGalvanometerDao.deleteEpsmGalvanometer(assist);
    }
    @Override
    public int updateEpsmGalvanometerById(EpsmGalvanometer enti){
        return epsmGalvanometerDao.updateEpsmGalvanometerById(enti);
    }
    @Override
    public int updateEpsmGalvanometer(EpsmGalvanometer value, Assist assist){
        return epsmGalvanometerDao.updateEpsmGalvanometer(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmGalvanometerById(EpsmGalvanometer enti){
        return epsmGalvanometerDao.updateNonEmptyEpsmGalvanometerById(enti);
    }
    @Override
    public int updateNonEmptyEpsmGalvanometer(EpsmGalvanometer value, Assist assist){
        return epsmGalvanometerDao.updateNonEmptyEpsmGalvanometer(value,assist);
    }

    public EpsmGalvanometerDao getEpsmGalvanometerDao() {
        return this.epsmGalvanometerDao;
    }

    public void setEpsmGalvanometerDao(EpsmGalvanometerDao epsmGalvanometerDao) {
        this.epsmGalvanometerDao = epsmGalvanometerDao;
    }

}