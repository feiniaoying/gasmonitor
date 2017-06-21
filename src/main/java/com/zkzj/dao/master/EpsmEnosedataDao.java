package com.zkzj.dao.master;
import com.zkzj.entity.EpsmEnosedata;
import java.util.List;
import com.zkzj.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsmEnosedataDao{
    long getEpsmEnosedataRowCount(Assist assist);
    List<EpsmEnosedata> selectEpsmEnosedata(Assist assist);
    EpsmEnosedata selectEpsmEnosedataById(String id);
    int insertEpsmEnosedata(EpsmEnosedata value);
    int insertNonEmptyEpsmEnosedata(EpsmEnosedata value);
    int deleteEpsmEnosedataById(String id);
    int deleteEpsmEnosedata(Assist assist);
    int updateEpsmEnosedataById(EpsmEnosedata enti);
    int updateEpsmEnosedata(@Param("enti") EpsmEnosedata value, @Param("assist") Assist assist);
    int updateNonEmptyEpsmEnosedataById(EpsmEnosedata enti);
    int updateNonEmptyEpsmEnosedata(@Param("enti") EpsmEnosedata value, @Param("assist") Assist assist);
}