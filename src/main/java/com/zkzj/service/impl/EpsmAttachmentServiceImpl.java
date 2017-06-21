package com.zkzj.service.impl;
import java.util.List;
import com.zkzj.dao.master.EpsmAttachmentDao;
import com.zkzj.entity.EpsmAttachment;
import com.zkzj.common.Assist;
import com.zkzj.service.EpsmAttachmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EpsmAttachmentServiceImpl implements EpsmAttachmentService{
    @Resource(name = "epsmAttachmentDao")
    private EpsmAttachmentDao epsmAttachmentDao;
    @Override
    public long getEpsmAttachmentRowCount(Assist assist){
        return epsmAttachmentDao.getEpsmAttachmentRowCount(assist);
    }
    @Override
    public List<EpsmAttachment> selectEpsmAttachment(Assist assist){
        return epsmAttachmentDao.selectEpsmAttachment(assist);
    }
    @Override
    public EpsmAttachment selectEpsmAttachmentById(String id){
        return epsmAttachmentDao.selectEpsmAttachmentById(id);
    }
    @Override
    public int insertEpsmAttachment(EpsmAttachment value){
        return epsmAttachmentDao.insertEpsmAttachment(value);
    }
    @Override
    public int insertNonEmptyEpsmAttachment(EpsmAttachment value){
        return epsmAttachmentDao.insertNonEmptyEpsmAttachment(value);
    }
    @Override
    public int deleteEpsmAttachmentById(String id){
        return epsmAttachmentDao.deleteEpsmAttachmentById(id);
    }
    @Override
    public int deleteEpsmAttachment(Assist assist){
        return epsmAttachmentDao.deleteEpsmAttachment(assist);
    }
    @Override
    public int updateEpsmAttachmentById(EpsmAttachment enti){
        return epsmAttachmentDao.updateEpsmAttachmentById(enti);
    }
    @Override
    public int updateEpsmAttachment(EpsmAttachment value, Assist assist){
        return epsmAttachmentDao.updateEpsmAttachment(value,assist);
    }
    @Override
    public int updateNonEmptyEpsmAttachmentById(EpsmAttachment enti){
        return epsmAttachmentDao.updateNonEmptyEpsmAttachmentById(enti);
    }
    @Override
    public int updateNonEmptyEpsmAttachment(EpsmAttachment value, Assist assist){
        return epsmAttachmentDao.updateNonEmptyEpsmAttachment(value,assist);
    }

    public EpsmAttachmentDao getEpsmAttachmentDao() {
        return this.epsmAttachmentDao;
    }

    public void setEpsmAttachmentDao(EpsmAttachmentDao epsmAttachmentDao) {
        this.epsmAttachmentDao = epsmAttachmentDao;
    }

}