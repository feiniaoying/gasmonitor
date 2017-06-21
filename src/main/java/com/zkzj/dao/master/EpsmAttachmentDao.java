package com.zkzj.dao.master;
import com.zkzj.entity.EpsmAttachment;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmAttachmentDao{
    long getEpsmAttachmentRowCount(Assist assist);
    List<EpsmAttachment> selectEpsmAttachment(Assist assist);
    EpsmAttachment selectEpsmAttachmentById(String id);
    int insertEpsmAttachment(EpsmAttachment value);
    int insertNonEmptyEpsmAttachment(EpsmAttachment value);
    int deleteEpsmAttachmentById(String id);
    int deleteEpsmAttachment(Assist assist);
    int updateEpsmAttachmentById(EpsmAttachment enti);
    int updateEpsmAttachment(@Param("enti") EpsmAttachment value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmAttachmentById(EpsmAttachment enti);
    int updateNonEmptyEpsmAttachment(@Param("enti") EpsmAttachment value, @Param("assist") Assist assist);
}