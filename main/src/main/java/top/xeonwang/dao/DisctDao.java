package top.xeonwang.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.xeonwang.model.Disct;
import top.xeonwang.model.DisctExample;

public interface DisctDao {
    long countByExample(DisctExample example);

    int deleteByExample(DisctExample example);

    int deleteByPrimaryKey(Long key);

    int insert(Disct record);

    int insertSelective(Disct record);

    List<Disct> selectByExample(DisctExample example);

    Disct selectByPrimaryKey(Long key);

    int updateByExampleSelective(@Param("record") Disct record, @Param("example") DisctExample example);

    int updateByExample(@Param("record") Disct record, @Param("example") DisctExample example);

    int updateByPrimaryKeySelective(Disct record);

    int updateByPrimaryKey(Disct record);
}