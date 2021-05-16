package top.xeonwang.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * disct
 * @author 
 */
public class Disct implements Serializable {
    private Long key;

    private String cityname;

    private String cityenglishname;

    private String cityZipcode;

    private Long cityConfirmedcount;

    private Long citySuspectedcount;

    private Long cityCuredcount;

    private Long cityDeadcount;

    private LocalDate updatetime;

    private Long cityCurrentconfirmedcount;

    private Long increasedconfirmedcount;

    private Byte label;

    private static final long serialVersionUID = 1L;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCityenglishname() {
        return cityenglishname;
    }

    public void setCityenglishname(String cityenglishname) {
        this.cityenglishname = cityenglishname;
    }

    public String getCityZipcode() {
        return cityZipcode;
    }

    public void setCityZipcode(String cityZipcode) {
        this.cityZipcode = cityZipcode;
    }

    public Long getCityConfirmedcount() {
        return cityConfirmedcount;
    }

    public void setCityConfirmedcount(Long cityConfirmedcount) {
        this.cityConfirmedcount = cityConfirmedcount;
    }

    public Long getCitySuspectedcount() {
        return citySuspectedcount;
    }

    public void setCitySuspectedcount(Long citySuspectedcount) {
        this.citySuspectedcount = citySuspectedcount;
    }

    public Long getCityCuredcount() {
        return cityCuredcount;
    }

    public void setCityCuredcount(Long cityCuredcount) {
        this.cityCuredcount = cityCuredcount;
    }

    public Long getCityDeadcount() {
        return cityDeadcount;
    }

    public void setCityDeadcount(Long cityDeadcount) {
        this.cityDeadcount = cityDeadcount;
    }

    public LocalDate getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDate updatetime) {
        this.updatetime = updatetime;
    }

    public Long getCityCurrentconfirmedcount() {
        return cityCurrentconfirmedcount;
    }

    public void setCityCurrentconfirmedcount(Long cityCurrentconfirmedcount) {
        this.cityCurrentconfirmedcount = cityCurrentconfirmedcount;
    }

    public Long getIncreasedconfirmedcount() {
        return increasedconfirmedcount;
    }

    public void setIncreasedconfirmedcount(Long increasedconfirmedcount) {
        this.increasedconfirmedcount = increasedconfirmedcount;
    }

    public Byte getLabel() {
        return label;
    }

    public void setLabel(Byte label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Disct other = (Disct) that;
        return (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getCityenglishname() == null ? other.getCityenglishname() == null : this.getCityenglishname().equals(other.getCityenglishname()))
            && (this.getCityZipcode() == null ? other.getCityZipcode() == null : this.getCityZipcode().equals(other.getCityZipcode()))
            && (this.getCityConfirmedcount() == null ? other.getCityConfirmedcount() == null : this.getCityConfirmedcount().equals(other.getCityConfirmedcount()))
            && (this.getCitySuspectedcount() == null ? other.getCitySuspectedcount() == null : this.getCitySuspectedcount().equals(other.getCitySuspectedcount()))
            && (this.getCityCuredcount() == null ? other.getCityCuredcount() == null : this.getCityCuredcount().equals(other.getCityCuredcount()))
            && (this.getCityDeadcount() == null ? other.getCityDeadcount() == null : this.getCityDeadcount().equals(other.getCityDeadcount()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCityCurrentconfirmedcount() == null ? other.getCityCurrentconfirmedcount() == null : this.getCityCurrentconfirmedcount().equals(other.getCityCurrentconfirmedcount()))
            && (this.getIncreasedconfirmedcount() == null ? other.getIncreasedconfirmedcount() == null : this.getIncreasedconfirmedcount().equals(other.getIncreasedconfirmedcount()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getCityenglishname() == null) ? 0 : getCityenglishname().hashCode());
        result = prime * result + ((getCityZipcode() == null) ? 0 : getCityZipcode().hashCode());
        result = prime * result + ((getCityConfirmedcount() == null) ? 0 : getCityConfirmedcount().hashCode());
        result = prime * result + ((getCitySuspectedcount() == null) ? 0 : getCitySuspectedcount().hashCode());
        result = prime * result + ((getCityCuredcount() == null) ? 0 : getCityCuredcount().hashCode());
        result = prime * result + ((getCityDeadcount() == null) ? 0 : getCityDeadcount().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCityCurrentconfirmedcount() == null) ? 0 : getCityCurrentconfirmedcount().hashCode());
        result = prime * result + ((getIncreasedconfirmedcount() == null) ? 0 : getIncreasedconfirmedcount().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", key=").append(key);
        sb.append(", cityname=").append(cityname);
        sb.append(", cityenglishname=").append(cityenglishname);
        sb.append(", cityZipcode=").append(cityZipcode);
        sb.append(", cityConfirmedcount=").append(cityConfirmedcount);
        sb.append(", citySuspectedcount=").append(citySuspectedcount);
        sb.append(", cityCuredcount=").append(cityCuredcount);
        sb.append(", cityDeadcount=").append(cityDeadcount);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", cityCurrentconfirmedcount=").append(cityCurrentconfirmedcount);
        sb.append(", increasedconfirmedcount=").append(increasedconfirmedcount);
        sb.append(", label=").append(label);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}