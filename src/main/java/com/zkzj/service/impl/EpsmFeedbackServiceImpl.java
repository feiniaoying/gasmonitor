package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmFeedbackDao;
import com.zkzj.entity.EpsmFeedback;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmFeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmFeedbackServiceImpl implements EpsmFeedbackService{
    @Resource(name = "epsmFeedbackDao")
    private EpsmFeedbackDao epsmFeedbackDao;
    @Override
    public long getEpsmFeedbackRowCount(Assist assist){
        return epsmFeedbackDao.getEpsmFeedbackRowCount(assist);
    }
    @Override
    public List<EpsmFeedback> selectEpsmFeedback(Assist assist){
        return epsmFeedbackDao.selectEpsmFeedback(assist);
    }
    @Override
    public EpsmFeedback selectEpsmFeedbackById(String id){
        return epsmFeedbackDao.selectEpsmFeedbackById(id);
    }
    @Override
    public int insertEpsmFeedback(EpsmFeedback value){
        return epsmFeedbackDao.insertEpsmFeedback(value);
    }
    @Override
    public int insertNonEmptyEpsmFeedback(EpsmFeedback value){
        return epsmFeedbackDao.insertNonEmptyEpsmFeedback(value);
    }
    @Override
    public int deleteEpsmFeedbackById(String id){
        return epsmFeedbackDao.deleteEpsmFeedbackById(id);
    }
    @Override
    public int deleteEpsmFeedback(Assist assist){
        return epsmFeedbackDao.deleteEpsmFeedback(assist);
    }
    @Override
    public int updateEpsmFeedbackById(EpsmFeedback enti){
        return epsmFeedbackDao.updateEpsmFeedbackById(enti);
    }
    @Override
    public int updateEpsmFeedback(EpsmFeedback value, Assist assist){
        return epsmFeedbackDao.updateEpsmFeedback(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmFeedbackById(EpsmFeedback enti){
        return epsmFeedbackDao.updateNonEmptyEpsmFeedbackById(enti);
    }
    @Override
    public int updateNonEmptyEpsmFeedback(EpsmFeedback value, Assist assist){
        return epsmFeedbackDao.updateNonEmptyEpsmFeedback(value,assist);
    }

    public EpsmFeedbackDao getEpsmFeedbackDao() {
        return this.epsmFeedbackDao;
    }

    public void setEpsmFeedbackDao(EpsmFeedbackDao epsmFeedbackDao) {
        this.epsmFeedbackDao = epsmFeedbackDao;
    }

}