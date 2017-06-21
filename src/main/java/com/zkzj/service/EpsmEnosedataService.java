package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmEnosedata;
import com.zkzj.common.Assist;
public interface EpsmEnosedataService{
    long getEpsmEnosedataRowCount(Assist assist);
    List<EpsmEnosedata> selectEpsmEnosedata(Assist assist);
    EpsmEnosedata selectEpsmEnosedataById(String id);
    int insertEpsmEnosedata(EpsmEnosedata value);
    int insertNonEmptyEpsmEnosedata(EpsmEnosedata value);
    int deleteEpsmEnosedataById(String id);
    int deleteEpsmEnosedata(Assist assist);
    int updateEpsmEnosedataById(EpsmEnosedata enti);
    int updateEpsmEnosedata(EpsmEnosedata value, Assist assist);
    int updateNonEmptyEpsmEnosedataById(EpsmEnosedata enti);
    int updateNonEmptyEpsmEnosedata(EpsmEnosedata value, Assist assist);
}