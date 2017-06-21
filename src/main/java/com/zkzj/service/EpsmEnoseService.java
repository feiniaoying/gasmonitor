package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmEnose;
import com.zkzj.common.Assist;
public interface EpsmEnoseService{
    long getEpsmEnoseRowCount(Assist assist);
    List<EpsmEnose> selectEpsmEnose(Assist assist);
    EpsmEnose selectEpsmEnoseById(String id);
    int insertEpsmEnose(EpsmEnose value);
    int insertNonEmptyEpsmEnose(EpsmEnose value);
    int deleteEpsmEnoseById(String id);
    int deleteEpsmEnose(Assist assist);
    int updateEpsmEnoseById(EpsmEnose enti);
    int updateEpsmEnose(EpsmEnose value, Assist assist);
    int updateNonEmptyEpsmEnoseById(EpsmEnose enti);
    int updateNonEmptyEpsmEnose(EpsmEnose value, Assist assist);
}