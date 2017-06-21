package com.zkzj.dao.master;
import com.zkzj.entity.EpsmCompany;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmCompanyDao{
    long getEpsmCompanyRowCount(Assist assist);
    List<EpsmCompany> selectEpsmCompany(Assist assist);
    EpsmCompany selectEpsmCompanyById(String id);
    int insertEpsmCompany(EpsmCompany value);
    int insertNonEmptyEpsmCompany(EpsmCompany value);
    int deleteEpsmCompanyById(String id);
    int deleteEpsmCompany(Assist assist);
    int updateEpsmCompanyById(EpsmCompany enti);
    int updateEpsmCompany(@Param("enti") EpsmCompany value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmCompanyById(EpsmCompany enti);
    int updateNonEmptyEpsmCompany(@Param("enti") EpsmCompany value, @Param("assist") Assist assist);
}