package top.xeonwang.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.xeonwang.mapper.DisctMapper;
import top.xeonwang.model.Disct;
import top.xeonwang.model.DisctExample;

import java.time.LocalDate;
import java.util.*;

@Slf4j
@Repository
public class DisctDao {
    @Autowired
    private DisctMapper disctMapper;

    public Disct getOne(){
        return disctMapper.selectByPrimaryKey((long)5332);
    }

    public List<Disct> getOneDay(LocalDate date){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdateTimeEqualTo(date);
        List<Disct> ret;
        try {
            ret = disctMapper.selectByExample(example);
            log.info("getOneDay: "+ ret.size());
        }
        catch (Exception e){
            ret=null;
        }
        return ret;
    }

    public List<Disct> getOneDisct(String disc){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andCityNameEqualTo(disc);
        List<Disct> ret;
        try {
            ret = disctMapper.selectByExample(example);
            log.info("getOneDisct "+disc+": "+ret.size());
        } catch(Exception e){
            ret = null;
        }
        ret.sort(new Comparator<Disct>() {
            @Override
            public int compare(Disct o1, Disct o2) {
                if(o1.getUpdateTime().isAfter(o2.getUpdateTime())){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        log.info(ret.get(0).getUpdateTime().toString()+" "+ret.get(1).getUpdateTime().toString());

        return ret;
    }

    public List<LocalDate> getDateRange(){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdateTimeLessThanOrEqualTo(LocalDate.now());
        example.setDistinct(true);

        List<Disct> temp;
        Set<LocalDate> dataSet= new HashSet<>();
        try {
            temp = disctMapper.selectByExample(example);
            log.info("getDateRange: "+temp.size());
        } catch(Exception e){
            temp = null;
        }
        if(temp==null){
            return null;
        }
        else{
            for(Disct disc : temp){
                dataSet.add(disc.getUpdateTime());
            }
        }
        ArrayList<LocalDate> ret = new ArrayList<LocalDate>(dataSet);
        ret.sort(new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                if(o1.isAfter(o2)){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        return ret;
    }

    public List<Disct> getAllDisct(){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdateTimeLessThanOrEqualTo(LocalDate.now());
        List<Disct> ret;
        try {
            ret = disctMapper.selectByExample(example);
            log.info("getAllDisct: "+ ret.size());
        } catch(Exception e){
            ret = null;
        }
        return ret;
    }
}
