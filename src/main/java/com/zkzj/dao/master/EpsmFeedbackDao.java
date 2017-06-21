package com.zkzj.dao.master;
import com.zkzj.entity.EpsmFeedback;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmFeedbackDao{
    long getEpsmFeedbackRowCount(Assist assist);
    List<EpsmFeedback> selectEpsmFeedback(Assist assist);
    EpsmFeedback selectEpsmFeedbackById(String id);
    int insertEpsmFeedback(EpsmFeedback value);
    int insertNonEmptyEpsmFeedback(EpsmFeedback value);
    int deleteEpsmFeedbackById(String id);
    int deleteEpsmFeedback(Assist assist);
    int updateEpsmFeedbackById(EpsmFeedback enti);
    int updateEpsmFeedback(@Param("enti") EpsmFeedback value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmFeedbackById(EpsmFeedback enti);
    int updateNonEmptyEpsmFeedback(@Param("enti") EpsmFeedback value, @Param("assist") Assist assist);
}