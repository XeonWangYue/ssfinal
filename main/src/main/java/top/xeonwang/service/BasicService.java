package top.xeonwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xeonwang.dao.BasicDao;

@Service
public class BasicService {
    @Autowired
    private BasicDao dao;

}
