package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmAttachment;
import com.zkzj.common.Assist;
public interface EpsmAttachmentService{
    long getEpsmAttachmentRowCount(Assist assist);
    List<EpsmAttachment> selectEpsmAttachment(Assist assist);
    EpsmAttachment selectEpsmAttachmentById(String id);
    int insertEpsmAttachment(EpsmAttachment value);
    int insertNonEmptyEpsmAttachment(EpsmAttachment value);
    int deleteEpsmAttachmentById(String id);
    int deleteEpsmAttachment(Assist assist);
    int updateEpsmAttachmentById(EpsmAttachment enti);
    int updateEpsmAttachment(EpsmAttachment value, Assist assist);
    int updateNonEmptyEpsmAttachmentById(EpsmAttachment enti);
    int updateNonEmptyEpsmAttachment(EpsmAttachment value, Assist assist);
}