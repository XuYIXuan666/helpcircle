package com.xm.helpcircle.domain.post.entity;

import java.io.Serializable;

/**
 * post_account
 * @author 
 */
public class PostAccountWithBLOBs extends PostAccount implements Serializable {
    /**
     * 帖子详情
     */
    private String postDetail;

    /**
     * 图片地址, 多个|分隔
     */
    private String postUrl;

    private static final long serialVersionUID = 1L;

    public String getPostDetail() {
        return postDetail;
    }

    public void setPostDetail(String postDetail) {
        this.postDetail = postDetail;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
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
        PostAccountWithBLOBs other = (PostAccountWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPostNo() == null ? other.getPostNo() == null : this.getPostNo().equals(other.getPostNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getPostClassification() == null ? other.getPostClassification() == null : this.getPostClassification().equals(other.getPostClassification()))
            && (this.getPostName() == null ? other.getPostName() == null : this.getPostName().equals(other.getPostName()))
            && (this.getPostStatus() == null ? other.getPostStatus() == null : this.getPostStatus().equals(other.getPostStatus()))
            && (this.getPostDelete() == null ? other.getPostDelete() == null : this.getPostDelete().equals(other.getPostDelete()))
            && (this.getPostLatitude() == null ? other.getPostLatitude() == null : this.getPostLatitude().equals(other.getPostLatitude()))
            && (this.getPostLongitude() == null ? other.getPostLongitude() == null : this.getPostLongitude().equals(other.getPostLongitude()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPostDetail() == null ? other.getPostDetail() == null : this.getPostDetail().equals(other.getPostDetail()))
            && (this.getPostUrl() == null ? other.getPostUrl() == null : this.getPostUrl().equals(other.getPostUrl()));
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
        result = prime * result + ((getPostStatus() == null) ? 0 : getPostStatus().hashCode());
        result = prime * result + ((getPostDelete() == null) ? 0 : getPostDelete().hashCode());
        result = prime * result + ((getPostLatitude() == null) ? 0 : getPostLatitude().hashCode());
        result = prime * result + ((getPostLongitude() == null) ? 0 : getPostLongitude().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPostDetail() == null) ? 0 : getPostDetail().hashCode());
        result = prime * result + ((getPostUrl() == null) ? 0 : getPostUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postDetail=").append(postDetail);
        sb.append(", postUrl=").append(postUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}