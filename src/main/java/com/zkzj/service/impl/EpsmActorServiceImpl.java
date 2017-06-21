package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmActorDao;
import com.zkzj.entity.EpsmActor;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmActorServiceImpl implements EpsmActorService{
    @Resource(name = "epsmActorDao")
    private EpsmActorDao epsmActorDao;
    @Override
    public long getEpsmActorRowCount(Assist assist){
        return epsmActorDao.getEpsmActorRowCount(assist);
    }
    @Override
    public List<EpsmActor> selectEpsmActor(Assist assist){
        return epsmActorDao.selectEpsmActor(assist);
    }
    @Override
    public EpsmActor selectEpsmActorById(String id){
        return epsmActorDao.selectEpsmActorById(id);
    }
    @Override
    public int insertEpsmActor(EpsmActor value){
        return epsmActorDao.insertEpsmActor(value);
    }
    @Override
    public int insertNonEmptyEpsmActor(EpsmActor value){
        return epsmActorDao.insertNonEmptyEpsmActor(value);
    }
    @Override
    public int deleteEpsmActorById(String id){
        return epsmActorDao.deleteEpsmActorById(id);
    }
    @Override
    public int deleteEpsmActor(Assist assist){
        return epsmActorDao.deleteEpsmActor(assist);
    }
    @Override
    public int updateEpsmActorById(EpsmActor enti){
        return epsmActorDao.updateEpsmActorById(enti);
    }
    @Override
    public int updateEpsmActor(EpsmActor value, Assist assist){
        return epsmActorDao.updateEpsmActor(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmActorById(EpsmActor enti){
        return epsmActorDao.updateNonEmptyEpsmActorById(enti);
    }
    @Override
    public int updateNonEmptyEpsmActor(EpsmActor value, Assist assist){
        return epsmActorDao.updateNonEmptyEpsmActor(value,assist);
    }

    public EpsmActorDao getEpsmActorDao() {
        return this.epsmActorDao;
    }

    public void setEpsmActorDao(EpsmActorDao epsmActorDao) {
        this.epsmActorDao = epsmActorDao;
    }

}