package com.zkzj.dao.master;
import com.zkzj.entity.EpsmActor;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmActorDao{
    long getEpsmActorRowCount(Assist assist);
    List<EpsmActor> selectEpsmActor(Assist assist);
    EpsmActor selectEpsmActorById(String id);
    int insertEpsmActor(EpsmActor value);
    int insertNonEmptyEpsmActor(EpsmActor value);
    int deleteEpsmActorById(String id);
    int deleteEpsmActor(Assist assist);
    int updateEpsmActorById(EpsmActor enti);
    int updateEpsmActor(@Param("enti") EpsmActor value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmActorById(EpsmActor enti);
    int updateNonEmptyEpsmActor(@Param("enti") EpsmActor value, @Param("assist") Assist assist);
}