package top.xeonwang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisctRetVO {
    private LocalDate updateTime;
    private String disctName;
    private Long confirmCount;
    private Long curedCount;
    private Long deadCount;
    private Long currentCount;
    private Long increase;
    private Byte label;

    public static DisctRetVO fromPO(Disct po){
        DisctRetVO vo = new DisctRetVO();
        vo.updateTime = po.getUpdatetime();
        vo.disctName = po.getCityname();
        vo.confirmCount = po.getCityConfirmedcount();
        vo.curedCount = po.getCityCuredcount();
        vo.deadCount = po.getCityDeadcount();
        vo.currentCount = po.getCityCurrentconfirmedcount();
        vo.increase = po.getIncreasedconfirmedcount();
        vo.label = po.getLabel();
        return vo;
    }
}
