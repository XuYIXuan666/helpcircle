package com.tm.helpcircle.domain.lost.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * lost_and_found_comment
 * @author 
 */
public class LostAndFoundComment implements Serializable {
    /**
     * id主键
     */
    private Long id;

    /**
     * 物品编号
     */
    private String lostArticleNo;

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
    private String lostArticleCommentContent;

    /**
     * 评论删除;1-未删除,2-已删除
     */
    private String lostArticleCommentDelete;

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

    public String getLostArticleNo() {
        return lostArticleNo;
    }

    public void setLostArticleNo(String lostArticleNo) {
        this.lostArticleNo = lostArticleNo;
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

    public String getLostArticleCommentContent() {
        return lostArticleCommentContent;
    }

    public void setLostArticleCommentContent(String lostArticleCommentContent) {
        this.lostArticleCommentContent = lostArticleCommentContent;
    }

    public String getLostArticleCommentDelete() {
        return lostArticleCommentDelete;
    }

    public void setLostArticleCommentDelete(String lostArticleCommentDelete) {
        this.lostArticleCommentDelete = lostArticleCommentDelete;
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
        LostAndFoundComment other = (LostAndFoundComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLostArticleNo() == null ? other.getLostArticleNo() == null : this.getLostArticleNo().equals(other.getLostArticleNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getLostArticleCommentContent() == null ? other.getLostArticleCommentContent() == null : this.getLostArticleCommentContent().equals(other.getLostArticleCommentContent()))
            && (this.getLostArticleCommentDelete() == null ? other.getLostArticleCommentDelete() == null : this.getLostArticleCommentDelete().equals(other.getLostArticleCommentDelete()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLostArticleNo() == null) ? 0 : getLostArticleNo().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getOpenNo() == null) ? 0 : getOpenNo().hashCode());
        result = prime * result + ((getLostArticleCommentContent() == null) ? 0 : getLostArticleCommentContent().hashCode());
        result = prime * result + ((getLostArticleCommentDelete() == null) ? 0 : getLostArticleCommentDelete().hashCode());
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
        sb.append(", lostArticleNo=").append(lostArticleNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", openNo=").append(openNo);
        sb.append(", lostArticleCommentContent=").append(lostArticleCommentContent);
        sb.append(", lostArticleCommentDelete=").append(lostArticleCommentDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}