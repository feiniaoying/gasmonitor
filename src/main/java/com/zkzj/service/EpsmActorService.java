package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmActor;
import com.zkzj.common.Assist;
public interface EpsmActorService{
    long getEpsmActorRowCount(Assist assist);
    List<EpsmActor> selectEpsmActor(Assist assist);
    EpsmActor selectEpsmActorById(String id);
    int insertEpsmActor(EpsmActor value);
    int insertNonEmptyEpsmActor(EpsmActor value);
    int deleteEpsmActorById(String id);
    int deleteEpsmActor(Assist assist);
    int updateEpsmActorById(EpsmActor enti);
    int updateEpsmActor(EpsmActor value, Assist assist);
    int updateNonEmptyEpsmActorById(EpsmActor enti);
    int updateNonEmptyEpsmActor(EpsmActor value, Assist assist);
}