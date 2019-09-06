package com.tm.helpcircle.domain.post.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * post_account
 * @author 
 */
public class PostAccount implements Serializable {
    /**
     * id主键
     */
    private Long id;

    /**
     * 物品编号
     */
    private String postNo;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * openId
     */
    private String openNo;

    /**
     * 帖子分类;1-问题,2-二手,3-兼职
     */
    private String postClassification;

    /**
     * 帖子名称
     */
    private String postName;

    /**
     * 图片地址, 多个逗号分隔
     */
    private String postUrl;

    /**
     * 帖子状态;1-展示,2-过期
     */
    private String postStatus;

    /**
     * 物品删除;1-未删除,2-已删除
     */
    private String postDelete;

    /**
     * 纬度
     */
    private Long postLatitude;

    /**
     * 经度
     */
    private Long postLongitude;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 帖子详情
     */
    private String postDetail;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getOpenNo() {
        return openNo;
    }

    public void setOpenNo(String openNo) {
        this.openNo = openNo;
    }

    public String getPostClassification() {
        return postClassification;
    }

    public void setPostClassification(String postClassification) {
        this.postClassification = postClassification;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getPostDelete() {
        return postDelete;
    }

    public void setPostDelete(String postDelete) {
        this.postDelete = postDelete;
    }

    public Long getPostLatitude() {
        return postLatitude;
    }

    public void setPostLatitude(Long postLatitude) {
        this.postLatitude = postLatitude;
    }

    public Long getPostLongitude() {
        return postLongitude;
    }

    public void setPostLongitude(Long postLongitude) {
        this.postLongitude = postLongitude;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPostDetail() {
        return postDetail;
    }

    public void setPostDetail(String postDetail) {
        this.postDetail = postDetail;
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
        PostAccount other = (PostAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPostNo() == null ? other.getPostNo() == null : this.getPostNo().equals(other.getPostNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getPostClassification() == null ? other.getPostClassification() == null : this.getPostClassification().equals(other.getPostClassification()))
            && (this.getPostName() == null ? other.getPostName() == null : this.getPostName().equals(other.getPostName()))
            && (this.getPostUrl() == null ? other.getPostUrl() == null : this.getPostUrl().equals(other.getPostUrl()))
            && (this.getPostStatus() == null ? other.getPostStatus() == null : this.getPostStatus().equals(other.getPostStatus()))
            && (this.getPostDelete() == null ? other.getPostDelete() == null : this.getPostDelete().equals(other.getPostDelete()))
            && (this.getPostLatitude() == null ? other.getPostLatitude() == null : this.getPostLatitude().equals(other.getPostLatitude()))
            && (this.getPostLongitude() == null ? other.getPostLongitude() == null : this.getPostLongitude().equals(other.getPostLongitude()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPostDetail() == null ? other.getPostDetail() == null : this.getPostDetail().equals(other.getPostDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPostNo() == null) ? 0 : getPostNo().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getOpenNo() == null) ? 0 : getOpenNo().hashCode());
        result = prime * result + ((getPostClassification() == null) ? 0 : getPostClassification().hashCode());
        result = prime * result + ((getPostName() == null) ? 0 : getPostName().hashCode());
        result = prime * result + ((getPostUrl() == null) ? 0 : getPostUrl().hashCode());
        result = prime * result + ((getPostStatus() == null) ? 0 : getPostStatus().hashCode());
        result = prime * result + ((getPostDelete() == null) ? 0 : getPostDelete().hashCode());
        result = prime * result + ((getPostLatitude() == null) ? 0 : getPostLatitude().hashCode());
        result = prime * result + ((getPostLongitude() == null) ? 0 : getPostLongitude().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPostDetail() == null) ? 0 : getPostDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", postNo=").append(postNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", openNo=").append(openNo);
        sb.append(", postClassification=").append(postClassification);
        sb.append(", postName=").append(postName);
        sb.append(", postUrl=").append(postUrl);
        sb.append(", postStatus=").append(postStatus);
        sb.append(", postDelete=").append(postDelete);
        sb.append(", postLatitude=").append(postLatitude);
        sb.append(", postLongitude=").append(postLongitude);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", postDetail=").append(postDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}