package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmEnosedataDao;
import com.zkzj.entity.EpsmEnosedata;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmEnosedataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmEnosedataServiceImpl implements EpsmEnosedataService{
    @Resource(name = "epsmEnosedataDao")
    private EpsmEnosedataDao epsmEnosedataDao;
    @Override
    public long getEpsmEnosedataRowCount(Assist assist){
        return epsmEnosedataDao.getEpsmEnosedataRowCount(assist);
    }
    @Override
    public List<EpsmEnosedata> selectEpsmEnosedata(Assist assist){
        return epsmEnosedataDao.selectEpsmEnosedata(assist);
    }
    @Override
    public EpsmEnosedata selectEpsmEnosedataById(String id){
        return epsmEnosedataDao.selectEpsmEnosedataById(id);
    }
    @Override
    public int insertEpsmEnosedata(EpsmEnosedata value){
        return epsmEnosedataDao.insertEpsmEnosedata(value);
    }
    @Override
    public int insertNonEmptyEpsmEnosedata(EpsmEnosedata value){
        return epsmEnosedataDao.insertNonEmptyEpsmEnosedata(value);
    }
    @Override
    public int deleteEpsmEnosedataById(String id){
        return epsmEnosedataDao.deleteEpsmEnosedataById(id);
    }
    @Override
    public int deleteEpsmEnosedata(Assist assist){
        return epsmEnosedataDao.deleteEpsmEnosedata(assist);
    }
    @Override
    public int updateEpsmEnosedataById(EpsmEnosedata enti){
        return epsmEnosedataDao.updateEpsmEnosedataById(enti);
    }
    @Override
    public int updateEpsmEnosedata(EpsmEnosedata value, Assist assist){
        return epsmEnosedataDao.updateEpsmEnosedata(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmEnosedataById(EpsmEnosedata enti){
        return epsmEnosedataDao.updateNonEmptyEpsmEnosedataById(enti);
    }
    @Override
    public int updateNonEmptyEpsmEnosedata(EpsmEnosedata value, Assist assist){
        return epsmEnosedataDao.updateNonEmptyEpsmEnosedata(value,assist);
    }

    public EpsmEnosedataDao getEpsmEnosedataDao() {
        return this.epsmEnosedataDao;
    }

    public void setEpsmEnosedataDao(EpsmEnosedataDao epsmEnosedataDao) {
        this.epsmEnosedataDao = epsmEnosedataDao;
    }

}