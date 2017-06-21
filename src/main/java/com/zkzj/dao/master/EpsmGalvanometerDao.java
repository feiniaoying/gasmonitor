package com.zkzj.dao.master;
import com.zkzj.entity.EpsmGalvanometer;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmGalvanometerDao{
    long getEpsmGalvanometerRowCount(Assist assist);
    List<EpsmGalvanometer> selectEpsmGalvanometer(Assist assist);
    EpsmGalvanometer selectEpsmGalvanometerById(String id);
    int insertEpsmGalvanometer(EpsmGalvanometer value);
    int insertNonEmptyEpsmGalvanometer(EpsmGalvanometer value);
    int deleteEpsmGalvanometerById(String id);
    int deleteEpsmGalvanometer(Assist assist);
    int updateEpsmGalvanometerById(EpsmGalvanometer enti);
    int updateEpsmGalvanometer(@Param("enti") EpsmGalvanometer value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmGalvanometerById(EpsmGalvanometer enti);
    int updateNonEmptyEpsmGalvanometer(@Param("enti") EpsmGalvanometer value, @Param("assist") Assist assist);
}