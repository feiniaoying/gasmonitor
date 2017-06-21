package com.zkzj.dao.master;
import com.zkzj.entity.Industry;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryDao{
    long getIndustryRowCount(Assist assist);
    List<Industry> selectIndustry(Assist assist);
    Industry selectIndustryById(String id);
    int insertIndustry(Industry value);
    int insertNonEmptyIndustry(Industry value);
    int deleteIndustryById(String id);
    int deleteIndustry(Assist assist);
    int updateIndustryById(Industry enti);
    int updateIndustry(@Param("enti") Industry value, @Param("assist") Assist assist);
    int updateNonEmptyIndustryById(Industry enti);
    int updateNonEmptyIndustry(@Param("enti") Industry value, @Param("assist") Assist assist);
}