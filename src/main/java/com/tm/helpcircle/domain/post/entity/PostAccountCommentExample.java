package com.tm.helpcircle.domain.post.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostAccountCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PostAccountCommentExample() {
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

        public Criteria andPostCommentContentIsNull() {
            addCriterion("post_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentIsNotNull() {
            addCriterion("post_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentEqualTo(String value) {
            addCriterion("post_comment_content =", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentNotEqualTo(String value) {
            addCriterion("post_comment_content <>", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentGreaterThan(String value) {
            addCriterion("post_comment_content >", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("post_comment_content >=", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentLessThan(String value) {
            addCriterion("post_comment_content <", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentLessThanOrEqualTo(String value) {
            addCriterion("post_comment_content <=", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentLike(String value) {
            addCriterion("post_comment_content like", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentNotLike(String value) {
            addCriterion("post_comment_content not like", value, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentIn(List<String> values) {
            addCriterion("post_comment_content in", values, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentNotIn(List<String> values) {
            addCriterion("post_comment_content not in", values, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentBetween(String value1, String value2) {
            addCriterion("post_comment_content between", value1, value2, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentContentNotBetween(String value1, String value2) {
            addCriterion("post_comment_content not between", value1, value2, "postCommentContent");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteIsNull() {
            addCriterion("post_comment_delete is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteIsNotNull() {
            addCriterion("post_comment_delete is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteEqualTo(String value) {
            addCriterion("post_comment_delete =", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteNotEqualTo(String value) {
            addCriterion("post_comment_delete <>", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteGreaterThan(String value) {
            addCriterion("post_comment_delete >", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("post_comment_delete >=", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteLessThan(String value) {
            addCriterion("post_comment_delete <", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteLessThanOrEqualTo(String value) {
            addCriterion("post_comment_delete <=", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteLike(String value) {
            addCriterion("post_comment_delete like", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteNotLike(String value) {
            addCriterion("post_comment_delete not like", value, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteIn(List<String> values) {
            addCriterion("post_comment_delete in", values, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteNotIn(List<String> values) {
            addCriterion("post_comment_delete not in", values, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteBetween(String value1, String value2) {
            addCriterion("post_comment_delete between", value1, value2, "postCommentDelete");
            return (Criteria) this;
        }

        public Criteria andPostCommentDeleteNotBetween(String value1, String value2) {
            addCriterion("post_comment_delete not between", value1, value2, "postCommentDelete");
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