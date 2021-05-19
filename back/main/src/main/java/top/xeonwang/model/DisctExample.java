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

        public Criteria andCitynameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameIsNull() {
            addCriterion("cityEnglishName is null");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameIsNotNull() {
            addCriterion("cityEnglishName is not null");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameEqualTo(String value) {
            addCriterion("cityEnglishName =", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameNotEqualTo(String value) {
            addCriterion("cityEnglishName <>", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameGreaterThan(String value) {
            addCriterion("cityEnglishName >", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("cityEnglishName >=", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameLessThan(String value) {
            addCriterion("cityEnglishName <", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameLessThanOrEqualTo(String value) {
            addCriterion("cityEnglishName <=", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameLike(String value) {
            addCriterion("cityEnglishName like", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameNotLike(String value) {
            addCriterion("cityEnglishName not like", value, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameIn(List<String> values) {
            addCriterion("cityEnglishName in", values, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameNotIn(List<String> values) {
            addCriterion("cityEnglishName not in", values, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameBetween(String value1, String value2) {
            addCriterion("cityEnglishName between", value1, value2, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityenglishnameNotBetween(String value1, String value2) {
            addCriterion("cityEnglishName not between", value1, value2, "cityenglishname");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeIsNull() {
            addCriterion("city_zipCode is null");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeIsNotNull() {
            addCriterion("city_zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeEqualTo(String value) {
            addCriterion("city_zipCode =", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeNotEqualTo(String value) {
            addCriterion("city_zipCode <>", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeGreaterThan(String value) {
            addCriterion("city_zipCode >", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_zipCode >=", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeLessThan(String value) {
            addCriterion("city_zipCode <", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeLessThanOrEqualTo(String value) {
            addCriterion("city_zipCode <=", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeLike(String value) {
            addCriterion("city_zipCode like", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeNotLike(String value) {
            addCriterion("city_zipCode not like", value, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeIn(List<String> values) {
            addCriterion("city_zipCode in", values, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeNotIn(List<String> values) {
            addCriterion("city_zipCode not in", values, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeBetween(String value1, String value2) {
            addCriterion("city_zipCode between", value1, value2, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityZipcodeNotBetween(String value1, String value2) {
            addCriterion("city_zipCode not between", value1, value2, "cityZipcode");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountIsNull() {
            addCriterion("city_confirmedCount is null");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountIsNotNull() {
            addCriterion("city_confirmedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountEqualTo(Long value) {
            addCriterion("city_confirmedCount =", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountNotEqualTo(Long value) {
            addCriterion("city_confirmedCount <>", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountGreaterThan(Long value) {
            addCriterion("city_confirmedCount >", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_confirmedCount >=", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountLessThan(Long value) {
            addCriterion("city_confirmedCount <", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountLessThanOrEqualTo(Long value) {
            addCriterion("city_confirmedCount <=", value, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountIn(List<Long> values) {
            addCriterion("city_confirmedCount in", values, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountNotIn(List<Long> values) {
            addCriterion("city_confirmedCount not in", values, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountBetween(Long value1, Long value2) {
            addCriterion("city_confirmedCount between", value1, value2, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityConfirmedcountNotBetween(Long value1, Long value2) {
            addCriterion("city_confirmedCount not between", value1, value2, "cityConfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountIsNull() {
            addCriterion("city_suspectedCount is null");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountIsNotNull() {
            addCriterion("city_suspectedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountEqualTo(Long value) {
            addCriterion("city_suspectedCount =", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountNotEqualTo(Long value) {
            addCriterion("city_suspectedCount <>", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountGreaterThan(Long value) {
            addCriterion("city_suspectedCount >", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_suspectedCount >=", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountLessThan(Long value) {
            addCriterion("city_suspectedCount <", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountLessThanOrEqualTo(Long value) {
            addCriterion("city_suspectedCount <=", value, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountIn(List<Long> values) {
            addCriterion("city_suspectedCount in", values, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountNotIn(List<Long> values) {
            addCriterion("city_suspectedCount not in", values, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountBetween(Long value1, Long value2) {
            addCriterion("city_suspectedCount between", value1, value2, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCitySuspectedcountNotBetween(Long value1, Long value2) {
            addCriterion("city_suspectedCount not between", value1, value2, "citySuspectedcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountIsNull() {
            addCriterion("city_curedCount is null");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountIsNotNull() {
            addCriterion("city_curedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountEqualTo(Long value) {
            addCriterion("city_curedCount =", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountNotEqualTo(Long value) {
            addCriterion("city_curedCount <>", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountGreaterThan(Long value) {
            addCriterion("city_curedCount >", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_curedCount >=", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountLessThan(Long value) {
            addCriterion("city_curedCount <", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountLessThanOrEqualTo(Long value) {
            addCriterion("city_curedCount <=", value, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountIn(List<Long> values) {
            addCriterion("city_curedCount in", values, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountNotIn(List<Long> values) {
            addCriterion("city_curedCount not in", values, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountBetween(Long value1, Long value2) {
            addCriterion("city_curedCount between", value1, value2, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityCuredcountNotBetween(Long value1, Long value2) {
            addCriterion("city_curedCount not between", value1, value2, "cityCuredcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountIsNull() {
            addCriterion("city_deadCount is null");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountIsNotNull() {
            addCriterion("city_deadCount is not null");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountEqualTo(Long value) {
            addCriterion("city_deadCount =", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountNotEqualTo(Long value) {
            addCriterion("city_deadCount <>", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountGreaterThan(Long value) {
            addCriterion("city_deadCount >", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_deadCount >=", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountLessThan(Long value) {
            addCriterion("city_deadCount <", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountLessThanOrEqualTo(Long value) {
            addCriterion("city_deadCount <=", value, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountIn(List<Long> values) {
            addCriterion("city_deadCount in", values, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountNotIn(List<Long> values) {
            addCriterion("city_deadCount not in", values, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountBetween(Long value1, Long value2) {
            addCriterion("city_deadCount between", value1, value2, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andCityDeadcountNotBetween(Long value1, Long value2) {
            addCriterion("city_deadCount not between", value1, value2, "cityDeadcount");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(LocalDate value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(LocalDate value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(LocalDate value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(LocalDate value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(LocalDate value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<LocalDate> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<LocalDate> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(LocalDate value1, LocalDate value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountIsNull() {
            addCriterion("city_currentconfirmedCount is null");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountIsNotNull() {
            addCriterion("city_currentconfirmedCount is not null");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountEqualTo(Long value) {
            addCriterion("city_currentconfirmedCount =", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountNotEqualTo(Long value) {
            addCriterion("city_currentconfirmedCount <>", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountGreaterThan(Long value) {
            addCriterion("city_currentconfirmedCount >", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountGreaterThanOrEqualTo(Long value) {
            addCriterion("city_currentconfirmedCount >=", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountLessThan(Long value) {
            addCriterion("city_currentconfirmedCount <", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountLessThanOrEqualTo(Long value) {
            addCriterion("city_currentconfirmedCount <=", value, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountIn(List<Long> values) {
            addCriterion("city_currentconfirmedCount in", values, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountNotIn(List<Long> values) {
            addCriterion("city_currentconfirmedCount not in", values, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountBetween(Long value1, Long value2) {
            addCriterion("city_currentconfirmedCount between", value1, value2, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andCityCurrentconfirmedcountNotBetween(Long value1, Long value2) {
            addCriterion("city_currentconfirmedCount not between", value1, value2, "cityCurrentconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountIsNull() {
            addCriterion("increasedconfirmedCount is null");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountIsNotNull() {
            addCriterion("increasedconfirmedCount is not null");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountEqualTo(Long value) {
            addCriterion("increasedconfirmedCount =", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountNotEqualTo(Long value) {
            addCriterion("increasedconfirmedCount <>", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountGreaterThan(Long value) {
            addCriterion("increasedconfirmedCount >", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountGreaterThanOrEqualTo(Long value) {
            addCriterion("increasedconfirmedCount >=", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountLessThan(Long value) {
            addCriterion("increasedconfirmedCount <", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountLessThanOrEqualTo(Long value) {
            addCriterion("increasedconfirmedCount <=", value, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountIn(List<Long> values) {
            addCriterion("increasedconfirmedCount in", values, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountNotIn(List<Long> values) {
            addCriterion("increasedconfirmedCount not in", values, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountBetween(Long value1, Long value2) {
            addCriterion("increasedconfirmedCount between", value1, value2, "increasedconfirmedcount");
            return (Criteria) this;
        }

        public Criteria andIncreasedconfirmedcountNotBetween(Long value1, Long value2) {
            addCriterion("increasedconfirmedCount not between", value1, value2, "increasedconfirmedcount");
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