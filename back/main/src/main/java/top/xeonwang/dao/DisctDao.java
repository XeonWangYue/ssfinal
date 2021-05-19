package top.xeonwang.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.xeonwang.mapper.DisctMapper;
import top.xeonwang.model.Disct;
import top.xeonwang.model.DisctExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Slf4j
@Repository
public class DisctDao {
    @Autowired
    private DisctMapper mapper;

    public Disct getOne(){
        return mapper.selectByPrimaryKey((long)5332);
    }

    public List<Disct> getOneDay(LocalDate date){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdatetimeEqualTo(date);
        List<Disct> ret;
        try {
            ret = mapper.selectByExample(example);
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
        criteria.andCitynameEqualTo(disc);
        List<Disct> ret;
        try {
            ret = mapper.selectByExample(example);
            log.info("getOneDisct "+disc+": "+ret.size());
        } catch(Exception e){
            ret = null;
        }
        ret.sort(new Comparator<Disct>() {
            @Override
            public int compare(Disct o1, Disct o2) {
                if(o1.getUpdatetime().isAfter(o2.getUpdatetime())){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        log.info(ret.get(0).getUpdatetime().toString()+" "+ret.get(1).getUpdatetime().toString());

        return ret;
    }

    public List<LocalDate> getDateRange(){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdatetimeLessThanOrEqualTo(LocalDate.now());
        example.setDistinct(true);

        List<Disct> temp;
        List<LocalDate> dateList=new ArrayList<>();
        try {
            temp = mapper.selectByExample(example);
            log.info("getDateRange: "+temp.size());
        } catch(Exception e){
            temp = null;
        }
        if(temp==null){
            return null;
        }
        else{
            for(Disct disc : temp){
                dateList.add(disc.getUpdatetime());
            }
        }

        dateList.sort(new Comparator<LocalDate>() {
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
        List<LocalDate> ret = new ArrayList<>();
        log.info(dateList.get(0).toString()+" "+dateList.get(1).toString());

        ret.add(dateList.get(0));
        ret.add(dateList.get(dateList.size()-1));

        log.info(ret.get(0).toString()+" "+ret.get(1).toString());

        return ret;
    }

    public List<Disct> getAllDisct(){
        DisctExample example = new DisctExample();
        DisctExample.Criteria criteria = example.createCriteria();
        criteria.andUpdatetimeLessThanOrEqualTo(LocalDate.now());
        List<Disct> ret;
        try {
            ret = mapper.selectByExample(example);
            log.info("getAllDisct: "+ ret.size());
        } catch(Exception e){
            ret = null;
        }
        return ret;
    }
}
