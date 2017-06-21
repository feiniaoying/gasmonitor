package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.EpsmGalvanometer;
import com.zkzj.common.Assist;
public interface EpsmGalvanometerService{
    long getEpsmGalvanometerRowCount(Assist assist);
    List<EpsmGalvanometer> selectEpsmGalvanometer(Assist assist);
    EpsmGalvanometer selectEpsmGalvanometerById(String id);
    int insertEpsmGalvanometer(EpsmGalvanometer value);
    int insertNonEmptyEpsmGalvanometer(EpsmGalvanometer value);
    int deleteEpsmGalvanometerById(String id);
    int deleteEpsmGalvanometer(Assist assist);
    int updateEpsmGalvanometerById(EpsmGalvanometer enti);
    int updateEpsmGalvanometer(EpsmGalvanometer value, Assist assist);
    int updateNonEmptyEpsmGalvanometerById(EpsmGalvanometer enti);
    int updateNonEmptyEpsmGalvanometer(EpsmGalvanometer value, Assist assist);
}