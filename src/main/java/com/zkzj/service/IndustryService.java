package com.zkzj.service;
import java.util.List;
import com.zkzj.entity.Industry;
import com.zkzj.common.Assist;
public interface IndustryService{
    long getIndustryRowCount(Assist assist);
    List<Industry> selectIndustry(Assist assist);
    Industry selectIndustryById(String id);
    int insertIndustry(Industry value);
    int insertNonEmptyIndustry(Industry value);
    int deleteIndustryById(String id);
    int deleteIndustry(Assist assist);
    int updateIndustryById(Industry enti);
    int updateIndustry(Industry value, Assist assist);
    int updateNonEmptyIndustryById(Industry enti);
    int updateNonEmptyIndustry(Industry value, Assist assist);
}