package top.xeonwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xeonwang.dao.DisctDao;
import top.xeonwang.model.Disct;
import top.xeonwang.model.DisctRetVO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BasicService {
    @Autowired
    private DisctDao dao;

    public Object getOne(){
        return dao.getOne();
    }

    public List<DisctRetVO> getOneDay(LocalDate date){
        List<DisctRetVO> ret= new ArrayList<>();
        List<Disct>temp = dao.getOneDay(date);
        for( Disct po : temp){
            ret.add(DisctRetVO.fromPO(po));
        }
        return ret;
    }

    public List<LocalDate> getDateRange(){
        return dao.getDateRange();
    }

    public List<DisctRetVO> getOneDisct(String disct){
        List<DisctRetVO> ret= new ArrayList<>();
        List<Disct>temp = dao.getOneDisct(disct);
        for( Disct po : temp){
            ret.add(DisctRetVO.fromPO(po));
        }
        return ret;
    }

    public List<DisctRetVO> getAllDisct(){
        List<DisctRetVO> ret = new ArrayList<>();
        List<Disct> temp= dao.getAllDisct();
        for( Disct po : temp){
            ret.add(DisctRetVO.fromPO(po));
        }
        return ret;
    }

}
