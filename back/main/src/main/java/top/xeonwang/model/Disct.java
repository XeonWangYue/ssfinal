package top.xeonwang.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * disct
 * @author 
 */
public class Disct implements Serializable {
    private Long key;

    private String cityName;

    private String cityEnglishName;

    private String cityZipCode;

    private Long cityConfirmedCount;

    private Long citySuspectedCount;

    private Long cityCuredCount;

    private Long cityDeadCount;

    private LocalDate updateTime;

    private Long cityCurrentconfirmedCount;

    private Long increasedconfirmedCount;

    private Byte label;

    private static final long serialVersionUID = 1L;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityEnglishName() {
        return cityEnglishName;
    }

    public void setCityEnglishName(String cityEnglishName) {
        this.cityEnglishName = cityEnglishName;
    }

    public String getCityZipCode() {
        return cityZipCode;
    }

    public void setCityZipCode(String cityZipCode) {
        this.cityZipCode = cityZipCode;
    }

    public Long getCityConfirmedCount() {
        return cityConfirmedCount;
    }

    public void setCityConfirmedCount(Long cityConfirmedCount) {
        this.cityConfirmedCount = cityConfirmedCount;
    }

    public Long getCitySuspectedCount() {
        return citySuspectedCount;
    }

    public void setCitySuspectedCount(Long citySuspectedCount) {
        this.citySuspectedCount = citySuspectedCount;
    }

    public Long getCityCuredCount() {
        return cityCuredCount;
    }

    public void setCityCuredCount(Long cityCuredCount) {
        this.cityCuredCount = cityCuredCount;
    }

    public Long getCityDeadCount() {
        return cityDeadCount;
    }

    public void setCityDeadCount(Long cityDeadCount) {
        this.cityDeadCount = cityDeadCount;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCityCurrentconfirmedCount() {
        return cityCurrentconfirmedCount;
    }

    public void setCityCurrentconfirmedCount(Long cityCurrentconfirmedCount) {
        this.cityCurrentconfirmedCount = cityCurrentconfirmedCount;
    }

    public Long getIncreasedconfirmedCount() {
        return increasedconfirmedCount;
    }

    public void setIncreasedconfirmedCount(Long increasedconfirmedCount) {
        this.increasedconfirmedCount = increasedconfirmedCount;
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
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getCityEnglishName() == null ? other.getCityEnglishName() == null : this.getCityEnglishName().equals(other.getCityEnglishName()))
            && (this.getCityZipCode() == null ? other.getCityZipCode() == null : this.getCityZipCode().equals(other.getCityZipCode()))
            && (this.getCityConfirmedCount() == null ? other.getCityConfirmedCount() == null : this.getCityConfirmedCount().equals(other.getCityConfirmedCount()))
            && (this.getCitySuspectedCount() == null ? other.getCitySuspectedCount() == null : this.getCitySuspectedCount().equals(other.getCitySuspectedCount()))
            && (this.getCityCuredCount() == null ? other.getCityCuredCount() == null : this.getCityCuredCount().equals(other.getCityCuredCount()))
            && (this.getCityDeadCount() == null ? other.getCityDeadCount() == null : this.getCityDeadCount().equals(other.getCityDeadCount()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCityCurrentconfirmedCount() == null ? other.getCityCurrentconfirmedCount() == null : this.getCityCurrentconfirmedCount().equals(other.getCityCurrentconfirmedCount()))
            && (this.getIncreasedconfirmedCount() == null ? other.getIncreasedconfirmedCount() == null : this.getIncreasedconfirmedCount().equals(other.getIncreasedconfirmedCount()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getCityEnglishName() == null) ? 0 : getCityEnglishName().hashCode());
        result = prime * result + ((getCityZipCode() == null) ? 0 : getCityZipCode().hashCode());
        result = prime * result + ((getCityConfirmedCount() == null) ? 0 : getCityConfirmedCount().hashCode());
        result = prime * result + ((getCitySuspectedCount() == null) ? 0 : getCitySuspectedCount().hashCode());
        result = prime * result + ((getCityCuredCount() == null) ? 0 : getCityCuredCount().hashCode());
        result = prime * result + ((getCityDeadCount() == null) ? 0 : getCityDeadCount().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCityCurrentconfirmedCount() == null) ? 0 : getCityCurrentconfirmedCount().hashCode());
        result = prime * result + ((getIncreasedconfirmedCount() == null) ? 0 : getIncreasedconfirmedCount().hashCode());
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
        sb.append(", cityName=").append(cityName);
        sb.append(", cityEnglishName=").append(cityEnglishName);
        sb.append(", cityZipCode=").append(cityZipCode);
        sb.append(", cityConfirmedCount=").append(cityConfirmedCount);
        sb.append(", citySuspectedCount=").append(citySuspectedCount);
        sb.append(", cityCuredCount=").append(cityCuredCount);
        sb.append(", cityDeadCount=").append(cityDeadCount);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", cityCurrentconfirmedCount=").append(cityCurrentconfirmedCount);
        sb.append(", increasedconfirmedCount=").append(increasedconfirmedCount);
        sb.append(", label=").append(label);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}