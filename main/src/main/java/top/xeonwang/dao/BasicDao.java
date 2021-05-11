package top.xeonwang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.xeonwang.mapper.BasicMapper;

@Repository
public class BasicDao {
    @Autowired
    private BasicMapper mapper;
}
