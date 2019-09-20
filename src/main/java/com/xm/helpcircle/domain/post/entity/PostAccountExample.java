package com.xm.helpcircle.domain.post.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PostAccountExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPostNoIsNull() {
            addCriterion("post_no is null");
            return (Criteria) this;
        }

        public Criteria andPostNoIsNotNull() {
            addCriterion("post_no is not null");
            return (Criteria) this;
        }

        public Criteria andPostNoEqualTo(String value) {
            addCriterion("post_no =", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoNotEqualTo(String value) {
            addCriterion("post_no <>", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoGreaterThan(String value) {
            addCriterion("post_no >", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoGreaterThanOrEqualTo(String value) {
            addCriterion("post_no >=", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoLessThan(String value) {
            addCriterion("post_no <", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoLessThanOrEqualTo(String value) {
            addCriterion("post_no <=", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoLike(String value) {
            addCriterion("post_no like", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoNotLike(String value) {
            addCriterion("post_no not like", value, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoIn(List<String> values) {
            addCriterion("post_no in", values, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoNotIn(List<String> values) {
            addCriterion("post_no not in", values, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoBetween(String value1, String value2) {
            addCriterion("post_no between", value1, value2, "postNo");
            return (Criteria) this;
        }

        public Criteria andPostNoNotBetween(String value1, String value2) {
            addCriterion("post_no not between", value1, value2, "postNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoIsNull() {
            addCriterion("open_no is null");
            return (Criteria) this;
        }

        public Criteria andOpenNoIsNotNull() {
            addCriterion("open_no is not null");
            return (Criteria) this;
        }

        public Criteria andOpenNoEqualTo(String value) {
            addCriterion("open_no =", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoNotEqualTo(String value) {
            addCriterion("open_no <>", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoGreaterThan(String value) {
            addCriterion("open_no >", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoGreaterThanOrEqualTo(String value) {
            addCriterion("open_no >=", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoLessThan(String value) {
            addCriterion("open_no <", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoLessThanOrEqualTo(String value) {
            addCriterion("open_no <=", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoLike(String value) {
            addCriterion("open_no like", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoNotLike(String value) {
            addCriterion("open_no not like", value, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoIn(List<String> values) {
            addCriterion("open_no in", values, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoNotIn(List<String> values) {
            addCriterion("open_no not in", values, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoBetween(String value1, String value2) {
            addCriterion("open_no between", value1, value2, "openNo");
            return (Criteria) this;
        }

        public Criteria andOpenNoNotBetween(String value1, String value2) {
            addCriterion("open_no not between", value1, value2, "openNo");
            return (Criteria) this;
        }

        public Criteria andPostClassificationIsNull() {
            addCriterion("post_classification is null");
            return (Criteria) this;
        }

        public Criteria andPostClassificationIsNotNull() {
            addCriterion("post_classification is not null");
            return (Criteria) this;
        }

        public Criteria andPostClassificationEqualTo(String value) {
            addCriterion("post_classification =", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationNotEqualTo(String value) {
            addCriterion("post_classification <>", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationGreaterThan(String value) {
            addCriterion("post_classification >", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("post_classification >=", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationLessThan(String value) {
            addCriterion("post_classification <", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationLessThanOrEqualTo(String value) {
            addCriterion("post_classification <=", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationLike(String value) {
            addCriterion("post_classification like", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationNotLike(String value) {
            addCriterion("post_classification not like", value, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationIn(List<String> values) {
            addCriterion("post_classification in", values, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationNotIn(List<String> values) {
            addCriterion("post_classification not in", values, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationBetween(String value1, String value2) {
            addCriterion("post_classification between", value1, value2, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostClassificationNotBetween(String value1, String value2) {
            addCriterion("post_classification not between", value1, value2, "postClassification");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNull() {
            addCriterion("post_name is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("post_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("post_name =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("post_name <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("post_name >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_name >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("post_name <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("post_name <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("post_name like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("post_name not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("post_name in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("post_name not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("post_name between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("post_name not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostUrlIsNull() {
            addCriterion("post_url is null");
            return (Criteria) this;
        }

        public Criteria andPostUrlIsNotNull() {
            addCriterion("post_url is not null");
            return (Criteria) this;
        }

        public Criteria andPostUrlEqualTo(String value) {
            addCriterion("post_url =", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlNotEqualTo(String value) {
            addCriterion("post_url <>", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlGreaterThan(String value) {
            addCriterion("post_url >", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlGreaterThanOrEqualTo(String value) {
            addCriterion("post_url >=", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlLessThan(String value) {
            addCriterion("post_url <", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlLessThanOrEqualTo(String value) {
            addCriterion("post_url <=", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlLike(String value) {
            addCriterion("post_url like", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlNotLike(String value) {
            addCriterion("post_url not like", value, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlIn(List<String> values) {
            addCriterion("post_url in", values, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlNotIn(List<String> values) {
            addCriterion("post_url not in", values, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlBetween(String value1, String value2) {
            addCriterion("post_url between", value1, value2, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostUrlNotBetween(String value1, String value2) {
            addCriterion("post_url not between", value1, value2, "postUrl");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(String value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(String value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(String value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(String value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(String value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLike(String value) {
            addCriterion("post_status like", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotLike(String value) {
            addCriterion("post_status not like", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<String> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<String> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(String value1, String value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(String value1, String value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIsNull() {
            addCriterion("post_delete is null");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIsNotNull() {
            addCriterion("post_delete is not null");
            return (Criteria) this;
        }

        public Criteria andPostDeleteEqualTo(String value) {
            addCriterion("post_delete =", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotEqualTo(String value) {
            addCriterion("post_delete <>", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteGreaterThan(String value) {
            addCriterion("post_delete >", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("post_delete >=", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLessThan(String value) {
            addCriterion("post_delete <", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLessThanOrEqualTo(String value) {
            addCriterion("post_delete <=", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteLike(String value) {
            addCriterion("post_delete like", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotLike(String value) {
            addCriterion("post_delete not like", value, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteIn(List<String> values) {
            addCriterion("post_delete in", values, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotIn(List<String> values) {
            addCriterion("post_delete not in", values, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteBetween(String value1, String value2) {
            addCriterion("post_delete between", value1, value2, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostDeleteNotBetween(String value1, String value2) {
            addCriterion("post_delete not between", value1, value2, "postDelete");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeIsNull() {
            addCriterion("post_latitude is null");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeIsNotNull() {
            addCriterion("post_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeEqualTo(Long value) {
            addCriterion("post_latitude =", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeNotEqualTo(Long value) {
            addCriterion("post_latitude <>", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeGreaterThan(Long value) {
            addCriterion("post_latitude >", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("post_latitude >=", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeLessThan(Long value) {
            addCriterion("post_latitude <", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeLessThanOrEqualTo(Long value) {
            addCriterion("post_latitude <=", value, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeIn(List<Long> values) {
            addCriterion("post_latitude in", values, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeNotIn(List<Long> values) {
            addCriterion("post_latitude not in", values, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeBetween(Long value1, Long value2) {
            addCriterion("post_latitude between", value1, value2, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLatitudeNotBetween(Long value1, Long value2) {
            addCriterion("post_latitude not between", value1, value2, "postLatitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeIsNull() {
            addCriterion("post_longitude is null");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeIsNotNull() {
            addCriterion("post_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeEqualTo(Long value) {
            addCriterion("post_longitude =", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeNotEqualTo(Long value) {
            addCriterion("post_longitude <>", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeGreaterThan(Long value) {
            addCriterion("post_longitude >", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("post_longitude >=", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeLessThan(Long value) {
            addCriterion("post_longitude <", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeLessThanOrEqualTo(Long value) {
            addCriterion("post_longitude <=", value, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeIn(List<Long> values) {
            addCriterion("post_longitude in", values, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeNotIn(List<Long> values) {
            addCriterion("post_longitude not in", values, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeBetween(Long value1, Long value2) {
            addCriterion("post_longitude between", value1, value2, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andPostLongitudeNotBetween(Long value1, Long value2) {
            addCriterion("post_longitude not between", value1, value2, "postLongitude");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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