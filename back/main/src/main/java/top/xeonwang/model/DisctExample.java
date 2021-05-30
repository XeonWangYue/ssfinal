package top.xeonwang.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DisctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisctExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(Long value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(Long value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(Long value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(Long value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(Long value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<Long> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<Long> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(Long value1, Long value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(Long value1, Long value2) {
            addCriterion("`key` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameIsNull() {
            addCriterion("city_english_name is null");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameIsNotNull() {
            addCriterion("city_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameEqualTo(String value) {
            addCriterion("city_english_name =", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameNotEqualTo(String value) {
            addCriterion("city_english_name <>", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameGreaterThan(String value) {
            addCriterion("city_english_name >", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_english_name >=", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameLessThan(String value) {
            addCriterion("city_english_name <", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("city_english_name <=", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameLike(String value) {
            addCriterion("city_english_name like", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameNotLike(String value) {
            addCriterion("city_english_name not like", value, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameIn(List<String> values) {
            addCriterion("city_english_name in", values, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameNotIn(List<String> values) {
            addCriterion("city_english_name not in", values, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameBetween(String value1, String value2) {
            addCriterion("city_english_name between", value1, value2, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityEnglishNameNotBetween(String value1, String value2) {
            addCriterion("city_english_name not between", value1, value2, "cityEnglishName");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeIsNull() {
            addCriterion("city_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeIsNotNull() {
            addCriterion("city_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeEqualTo(String value) {
            addCriterion("city_zip_code =", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeNotEqualTo(String value) {
            addCriterion("city_zip_code <>", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeGreaterThan(String value) {
            addCriterion("city_zip_code >", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_zip_code >=", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeLessThan(String value) {
            addCriterion("city_zip_code <", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeLessThanOrEqualTo(String value) {
            addCriterion("city_zip_code <=", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeLike(String value) {
            addCriterion("city_zip_code like", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeNotLike(String value) {
            addCriterion("city_zip_code not like", value, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeIn(List<String> values) {
            addCriterion("city_zip_code in", values, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeNotIn(List<String> values) {
            addCriterion("city_zip_code not in", values, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeBetween(String value1, String value2) {
            addCriterion("city_zip_code between", value1, value2, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityZipCodeNotBetween(String value1, String value2) {
            addCriterion("city_zip_code not between", value1, value2, "cityZipCode");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountIsNull() {
            addCriterion("city_confirmed_count is null");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountIsNotNull() {
            addCriterion("city_confirmed_count is not null");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountEqualTo(Long value) {
            addCriterion("city_confirmed_count =", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountNotEqualTo(Long value) {
            addCriterion("city_confirmed_count <>", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountGreaterThan(Long value) {
            addCriterion("city_confirmed_count >", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_confirmed_count >=", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountLessThan(Long value) {
            addCriterion("city_confirmed_count <", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountLessThanOrEqualTo(Long value) {
            addCriterion("city_confirmed_count <=", value, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountIn(List<Long> values) {
            addCriterion("city_confirmed_count in", values, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountNotIn(List<Long> values) {
            addCriterion("city_confirmed_count not in", values, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountBetween(Long value1, Long value2) {
            addCriterion("city_confirmed_count between", value1, value2, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedCountNotBetween(Long value1, Long value2) {
            addCriterion("city_confirmed_count not between", value1, value2, "cityConfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountIsNull() {
            addCriterion("city_suspected_count is null");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountIsNotNull() {
            addCriterion("city_suspected_count is not null");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountEqualTo(Long value) {
            addCriterion("city_suspected_count =", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountNotEqualTo(Long value) {
            addCriterion("city_suspected_count <>", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountGreaterThan(Long value) {
            addCriterion("city_suspected_count >", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_suspected_count >=", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountLessThan(Long value) {
            addCriterion("city_suspected_count <", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountLessThanOrEqualTo(Long value) {
            addCriterion("city_suspected_count <=", value, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountIn(List<Long> values) {
            addCriterion("city_suspected_count in", values, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountNotIn(List<Long> values) {
            addCriterion("city_suspected_count not in", values, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountBetween(Long value1, Long value2) {
            addCriterion("city_suspected_count between", value1, value2, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedCountNotBetween(Long value1, Long value2) {
            addCriterion("city_suspected_count not between", value1, value2, "citySuspectedCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountIsNull() {
            addCriterion("city_cured_count is null");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountIsNotNull() {
            addCriterion("city_cured_count is not null");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountEqualTo(Long value) {
            addCriterion("city_cured_count =", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountNotEqualTo(Long value) {
            addCriterion("city_cured_count <>", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountGreaterThan(Long value) {
            addCriterion("city_cured_count >", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_cured_count >=", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountLessThan(Long value) {
            addCriterion("city_cured_count <", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountLessThanOrEqualTo(Long value) {
            addCriterion("city_cured_count <=", value, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountIn(List<Long> values) {
            addCriterion("city_cured_count in", values, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountNotIn(List<Long> values) {
            addCriterion("city_cured_count not in", values, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountBetween(Long value1, Long value2) {
            addCriterion("city_cured_count between", value1, value2, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityCuredCountNotBetween(Long value1, Long value2) {
            addCriterion("city_cured_count not between", value1, value2, "cityCuredCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountIsNull() {
            addCriterion("city_dead_count is null");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountIsNotNull() {
            addCriterion("city_dead_count is not null");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountEqualTo(Long value) {
            addCriterion("city_dead_count =", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountNotEqualTo(Long value) {
            addCriterion("city_dead_count <>", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountGreaterThan(Long value) {
            addCriterion("city_dead_count >", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_dead_count >=", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountLessThan(Long value) {
            addCriterion("city_dead_count <", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountLessThanOrEqualTo(Long value) {
            addCriterion("city_dead_count <=", value, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountIn(List<Long> values) {
            addCriterion("city_dead_count in", values, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountNotIn(List<Long> values) {
            addCriterion("city_dead_count not in", values, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountBetween(Long value1, Long value2) {
            addCriterion("city_dead_count between", value1, value2, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andCityDeadCountNotBetween(Long value1, Long value2) {
            addCriterion("city_dead_count not between", value1, value2, "cityDeadCount");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDate value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDate value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDate value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDate value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDate value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDate> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDate> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDate value1, LocalDate value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountIsNull() {
            addCriterion("city_currentconfirmed_count is null");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountIsNotNull() {
            addCriterion("city_currentconfirmed_count is not null");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountEqualTo(Long value) {
            addCriterion("city_currentconfirmed_count =", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountNotEqualTo(Long value) {
            addCriterion("city_currentconfirmed_count <>", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountGreaterThan(Long value) {
            addCriterion("city_currentconfirmed_count >", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_currentconfirmed_count >=", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountLessThan(Long value) {
            addCriterion("city_currentconfirmed_count <", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountLessThanOrEqualTo(Long value) {
            addCriterion("city_currentconfirmed_count <=", value, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountIn(List<Long> values) {
            addCriterion("city_currentconfirmed_count in", values, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountNotIn(List<Long> values) {
            addCriterion("city_currentconfirmed_count not in", values, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountBetween(Long value1, Long value2) {
            addCriterion("city_currentconfirmed_count between", value1, value2, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedCountNotBetween(Long value1, Long value2) {
            addCriterion("city_currentconfirmed_count not between", value1, value2, "cityCurrentconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountIsNull() {
            addCriterion("increasedconfirmed_count is null");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountIsNotNull() {
            addCriterion("increasedconfirmed_count is not null");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountEqualTo(Long value) {
            addCriterion("increasedconfirmed_count =", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountNotEqualTo(Long value) {
            addCriterion("increasedconfirmed_count <>", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountGreaterThan(Long value) {
            addCriterion("increasedconfirmed_count >", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("increasedconfirmed_count >=", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountLessThan(Long value) {
            addCriterion("increasedconfirmed_count <", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountLessThanOrEqualTo(Long value) {
            addCriterion("increasedconfirmed_count <=", value, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountIn(List<Long> values) {
            addCriterion("increasedconfirmed_count in", values, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountNotIn(List<Long> values) {
            addCriterion("increasedconfirmed_count not in", values, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountBetween(Long value1, Long value2) {
            addCriterion("increasedconfirmed_count between", value1, value2, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedCountNotBetween(Long value1, Long value2) {
            addCriterion("increasedconfirmed_count not between", value1, value2, "increasedconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("`label` is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("`label` is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(Byte value) {
            addCriterion("`label` =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(Byte value) {
            addCriterion("`label` <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(Byte value) {
            addCriterion("`label` >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(Byte value) {
            addCriterion("`label` >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(Byte value) {
            addCriterion("`label` <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(Byte value) {
            addCriterion("`label` <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<Byte> values) {
            addCriterion("`label` in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<Byte> values) {
            addCriterion("`label` not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(Byte value1, Byte value2) {
            addCriterion("`label` between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(Byte value1, Byte value2) {
            addCriterion("`label` not between", value1, value2, "label");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}