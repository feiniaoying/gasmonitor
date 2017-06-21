package com.zkzj.dao.master;
import com.zkzj.entity.EpsmEnose;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmEnoseDao{
    long getEpsmEnoseRowCount(Assist assist);
    List<EpsmEnose> selectEpsmEnose(Assist assist);
    EpsmEnose selectEpsmEnoseById(String id);
    int insertEpsmEnose(EpsmEnose value);
    int insertNonEmptyEpsmEnose(EpsmEnose value);
    int deleteEpsmEnoseById(String id);
    int deleteEpsmEnose(Assist assist);
    int updateEpsmEnoseById(EpsmEnose enti);
    int updateEpsmEnose(@Param("enti") EpsmEnose value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmEnoseById(EpsmEnose enti);
    int updateNonEmptyEpsmEnose(@Param("enti") EpsmEnose value, @Param("assist") Assist assist);
}