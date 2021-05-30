package top.xeonwang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisctSimpleRetVO {
    private LocalDate updateTime;
    private String disctName;
    private Long confirmCount;
    private Long curedCount;
    private Long deadCount;
    private Long currentCount;
    private Long increase;
    private Byte label;

    public static DisctSimpleRetVO fromPO(Disct po){
        DisctSimpleRetVO vo = new DisctSimpleRetVO();
        vo.updateTime = po.getUpdateTime();
        vo.disctName = po.getCityName();
        vo.confirmCount = po.getCityConfirmedCount();
        vo.curedCount = po.getCityCuredCount();
        vo.deadCount = po.getCityDeadCount();
        vo.currentCount = po.getCityCurrentconfirmedCount();
        vo.increase = po.getIncreasedconfirmedCount();
        vo.label = po.getLabel();
        return vo;
    }
}
