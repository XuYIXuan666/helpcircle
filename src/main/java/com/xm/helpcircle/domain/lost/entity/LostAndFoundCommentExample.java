package com.xm.helpcircle.domain.lost.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LostAndFoundCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LostAndFoundCommentExample() {
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

        public Criteria andLostArticleNoIsNull() {
            addCriterion("lost_article_no is null");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoIsNotNull() {
            addCriterion("lost_article_no is not null");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoEqualTo(String value) {
            addCriterion("lost_article_no =", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoNotEqualTo(String value) {
            addCriterion("lost_article_no <>", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoGreaterThan(String value) {
            addCriterion("lost_article_no >", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoGreaterThanOrEqualTo(String value) {
            addCriterion("lost_article_no >=", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoLessThan(String value) {
            addCriterion("lost_article_no <", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoLessThanOrEqualTo(String value) {
            addCriterion("lost_article_no <=", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoLike(String value) {
            addCriterion("lost_article_no like", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoNotLike(String value) {
            addCriterion("lost_article_no not like", value, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoIn(List<String> values) {
            addCriterion("lost_article_no in", values, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoNotIn(List<String> values) {
            addCriterion("lost_article_no not in", values, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoBetween(String value1, String value2) {
            addCriterion("lost_article_no between", value1, value2, "lostArticleNo");
            return (Criteria) this;
        }

        public Criteria andLostArticleNoNotBetween(String value1, String value2) {
            addCriterion("lost_article_no not between", value1, value2, "lostArticleNo");
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

        public Criteria andLostArticleCommentContentIsNull() {
            addCriterion("lost_article_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentIsNotNull() {
            addCriterion("lost_article_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentEqualTo(String value) {
            addCriterion("lost_article_comment_content =", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentNotEqualTo(String value) {
            addCriterion("lost_article_comment_content <>", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentGreaterThan(String value) {
            addCriterion("lost_article_comment_content >", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("lost_article_comment_content >=", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentLessThan(String value) {
            addCriterion("lost_article_comment_content <", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentLessThanOrEqualTo(String value) {
            addCriterion("lost_article_comment_content <=", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentLike(String value) {
            addCriterion("lost_article_comment_content like", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentNotLike(String value) {
            addCriterion("lost_article_comment_content not like", value, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentIn(List<String> values) {
            addCriterion("lost_article_comment_content in", values, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentNotIn(List<String> values) {
            addCriterion("lost_article_comment_content not in", values, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentBetween(String value1, String value2) {
            addCriterion("lost_article_comment_content between", value1, value2, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentContentNotBetween(String value1, String value2) {
            addCriterion("lost_article_comment_content not between", value1, value2, "lostArticleCommentContent");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteIsNull() {
            addCriterion("lost_article_comment_delete is null");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteIsNotNull() {
            addCriterion("lost_article_comment_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteEqualTo(String value) {
            addCriterion("lost_article_comment_delete =", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteNotEqualTo(String value) {
            addCriterion("lost_article_comment_delete <>", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteGreaterThan(String value) {
            addCriterion("lost_article_comment_delete >", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("lost_article_comment_delete >=", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteLessThan(String value) {
            addCriterion("lost_article_comment_delete <", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteLessThanOrEqualTo(String value) {
            addCriterion("lost_article_comment_delete <=", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteLike(String value) {
            addCriterion("lost_article_comment_delete like", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteNotLike(String value) {
            addCriterion("lost_article_comment_delete not like", value, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteIn(List<String> values) {
            addCriterion("lost_article_comment_delete in", values, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteNotIn(List<String> values) {
            addCriterion("lost_article_comment_delete not in", values, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteBetween(String value1, String value2) {
            addCriterion("lost_article_comment_delete between", value1, value2, "lostArticleCommentDelete");
            return (Criteria) this;
        }

        public Criteria andLostArticleCommentDeleteNotBetween(String value1, String value2) {
            addCriterion("lost_article_comment_delete not between", value1, value2, "lostArticleCommentDelete");
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