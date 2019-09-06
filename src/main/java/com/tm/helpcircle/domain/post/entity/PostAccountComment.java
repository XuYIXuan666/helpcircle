package com.tm.helpcircle.domain.post.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * post_account_comment
 * @author 
 */
public class PostAccountComment implements Serializable {
    /**
     * id主键
     */
    private Long id;

    /**
     * 帖子编号
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
     * 物品评论内容
     */
    private String postCommentContent;

    /**
     * 评论删除;1-未删除,2-已删除
     */
    private String postCommentDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

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

    public String getPostCommentContent() {
        return postCommentContent;
    }

    public void setPostCommentContent(String postCommentContent) {
        this.postCommentContent = postCommentContent;
    }

    public String getPostCommentDelete() {
        return postCommentDelete;
    }

    public void setPostCommentDelete(String postCommentDelete) {
        this.postCommentDelete = postCommentDelete;
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
        PostAccountComment other = (PostAccountComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPostNo() == null ? other.getPostNo() == null : this.getPostNo().equals(other.getPostNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getPostCommentContent() == null ? other.getPostCommentContent() == null : this.getPostCommentContent().equals(other.getPostCommentContent()))
            && (this.getPostCommentDelete() == null ? other.getPostCommentDelete() == null : this.getPostCommentDelete().equals(other.getPostCommentDelete()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPostNo() == null) ? 0 : getPostNo().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getOpenNo() == null) ? 0 : getOpenNo().hashCode());
        result = prime * result + ((getPostCommentContent() == null) ? 0 : getPostCommentContent().hashCode());
        result = prime * result + ((getPostCommentDelete() == null) ? 0 : getPostCommentDelete().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", postCommentContent=").append(postCommentContent);
        sb.append(", postCommentDelete=").append(postCommentDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}