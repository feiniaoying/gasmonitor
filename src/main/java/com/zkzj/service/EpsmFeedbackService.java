package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmFeedback;
import com.zkzj.common.Assist;
public interface EpsmFeedbackService{
    long getEpsmFeedbackRowCount(Assist assist);
    List<EpsmFeedback> selectEpsmFeedback(Assist assist);
    EpsmFeedback selectEpsmFeedbackById(String id);
    int insertEpsmFeedback(EpsmFeedback value);
    int insertNonEmptyEpsmFeedback(EpsmFeedback value);
    int deleteEpsmFeedbackById(String id);
    int deleteEpsmFeedback(Assist assist);
    int updateEpsmFeedbackById(EpsmFeedback enti);
    int updateEpsmFeedback(EpsmFeedback value, Assist assist);
    int updateNonEmptyEpsmFeedbackById(EpsmFeedback enti);
    int updateNonEmptyEpsmFeedback(EpsmFeedback value, Assist assist);
}