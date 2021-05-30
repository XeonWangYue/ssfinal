package top.xeonwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xeonwang.dao.DisctDao;
import top.xeonwang.model.Disct;
import top.xeonwang.model.DisctSimpleRetVO;

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

    public List<DisctSimpleRetVO> getOneDay(LocalDate date){
        List<DisctSimpleRetVO> ret= new ArrayList<>();
        List<Disct>temp = dao.getOneDay(date);
        for( Disct po : temp){
            ret.add(DisctSimpleRetVO.fromPO(po));
        }
        return ret;
    }

    public List<LocalDate> getDateRange(){
        return dao.getDateRange();
    }

    public List<DisctSimpleRetVO> getOneDisct(String disct){
        List<DisctSimpleRetVO> ret= new ArrayList<>();
        List<Disct>temp = dao.getOneDisct(disct);
        for( Disct po : temp){
            ret.add(DisctSimpleRetVO.fromPO(po));
        }
        return ret;
    }

    public List<DisctSimpleRetVO> getAllDisct(){
        List<DisctSimpleRetVO> ret = new ArrayList<>();
        List<Disct> temp= dao.getAllDisct();
        for( Disct po : temp){
            ret.add(DisctSimpleRetVO.fromPO(po));
        }
        return ret;
    }

}
