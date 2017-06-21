package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmEnoseDao;
import com.zkzj.entity.EpsmEnose;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmEnoseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmEnoseServiceImpl implements EpsmEnoseService{
    @Resource(name="epsmEnoseDao")
    private EpsmEnoseDao epsmEnoseDao;
    @Override
    public long getEpsmEnoseRowCount(Assist assist){
        return epsmEnoseDao.getEpsmEnoseRowCount(assist);
    }
    @Override
    public List<EpsmEnose> selectEpsmEnose(Assist assist){
        return epsmEnoseDao.selectEpsmEnose(assist);
    }
    @Override
    public EpsmEnose selectEpsmEnoseById(String id){
        return epsmEnoseDao.selectEpsmEnoseById(id);
    }
    @Override
    public int insertEpsmEnose(EpsmEnose value){
        return epsmEnoseDao.insertEpsmEnose(value);
    }
    @Override
    public int insertNonEmptyEpsmEnose(EpsmEnose value){
        return epsmEnoseDao.insertNonEmptyEpsmEnose(value);
    }
    @Override
    public int deleteEpsmEnoseById(String id){
        return epsmEnoseDao.deleteEpsmEnoseById(id);
    }
    @Override
    public int deleteEpsmEnose(Assist assist){
        return epsmEnoseDao.deleteEpsmEnose(assist);
    }
    @Override
    public int updateEpsmEnoseById(EpsmEnose enti){
        return epsmEnoseDao.updateEpsmEnoseById(enti);
    }
    @Override
    public int updateEpsmEnose(EpsmEnose value, Assist assist){
        return epsmEnoseDao.updateEpsmEnose(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmEnoseById(EpsmEnose enti){
        return epsmEnoseDao.updateNonEmptyEpsmEnoseById(enti);
    }
    @Override
    public int updateNonEmptyEpsmEnose(EpsmEnose value, Assist assist){
        return epsmEnoseDao.updateNonEmptyEpsmEnose(value,assist);
    }

    public EpsmEnoseDao getEpsmEnoseDao() {
        return this.epsmEnoseDao;
    }

    public void setEpsmEnoseDao(EpsmEnoseDao epsmEnoseDao) {
        this.epsmEnoseDao = epsmEnoseDao;
    }

}