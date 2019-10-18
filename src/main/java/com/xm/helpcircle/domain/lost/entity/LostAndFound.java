package com.xm.helpcircle.domain.lost.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * lost_and_found
 * @author 
 */
public class LostAndFound implements Serializable {
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
     * 物品分类;1-捡到,2丢失
     */
    private String lostArticleClassification;

    /**
     * 物品名称
     */
    private String lostArticleName;

    /**
     * 图片地址
     * 非数据库字段
     */
    private List<String> lostArticleUrlList;

    public List<String> getLostArticleUrlList() {
        return lostArticleUrlList;
    }

    public void setLostArticleUrlList(List<String> lostArticleUrlList) {
        this.lostArticleUrlList = lostArticleUrlList;
    }

    /**
     * 物品状态;1-未领取,2-以领取,3-已失效
     */
    private String lostArticleStatus;

    /**
     * 物品删除;1-未删除,2-已删除
     */
    private String lostArticleDelete;

    /**
     * 纬度
     */
    private Long lostArticleLatitude;

    /**
     * 经度
     */
    private Long lostArticleLongitude;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 评论
     * 非数据库字段
     */
    private List<LostAndFoundComment> comments;

    public List<LostAndFoundComment> getComments() {
        return comments;
    }

    public void setComments(List<LostAndFoundComment> comments) {
        this.comments = comments;
    }

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

    public String getLostArticleClassification() {
        return lostArticleClassification;
    }

    public void setLostArticleClassification(String lostArticleClassification) {
        this.lostArticleClassification = lostArticleClassification;
    }

    public String getLostArticleName() {
        return lostArticleName;
    }

    public void setLostArticleName(String lostArticleName) {
        this.lostArticleName = lostArticleName;
    }

    public String getLostArticleStatus() {
        return lostArticleStatus;
    }

    public void setLostArticleStatus(String lostArticleStatus) {
        this.lostArticleStatus = lostArticleStatus;
    }

    public String getLostArticleDelete() {
        return lostArticleDelete;
    }

    public void setLostArticleDelete(String lostArticleDelete) {
        this.lostArticleDelete = lostArticleDelete;
    }

    public Long getLostArticleLatitude() {
        return lostArticleLatitude;
    }

    public void setLostArticleLatitude(Long lostArticleLatitude) {
        this.lostArticleLatitude = lostArticleLatitude;
    }

    public Long getLostArticleLongitude() {
        return lostArticleLongitude;
    }

    public void setLostArticleLongitude(Long lostArticleLongitude) {
        this.lostArticleLongitude = lostArticleLongitude;
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
        LostAndFound other = (LostAndFound) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLostArticleNo() == null ? other.getLostArticleNo() == null : this.getLostArticleNo().equals(other.getLostArticleNo()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getLostArticleClassification() == null ? other.getLostArticleClassification() == null : this.getLostArticleClassification().equals(other.getLostArticleClassification()))
            && (this.getLostArticleName() == null ? other.getLostArticleName() == null : this.getLostArticleName().equals(other.getLostArticleName()))
            && (this.getLostArticleStatus() == null ? other.getLostArticleStatus() == null : this.getLostArticleStatus().equals(other.getLostArticleStatus()))
            && (this.getLostArticleDelete() == null ? other.getLostArticleDelete() == null : this.getLostArticleDelete().equals(other.getLostArticleDelete()))
            && (this.getLostArticleLatitude() == null ? other.getLostArticleLatitude() == null : this.getLostArticleLatitude().equals(other.getLostArticleLatitude()))
            && (this.getLostArticleLongitude() == null ? other.getLostArticleLongitude() == null : this.getLostArticleLongitude().equals(other.getLostArticleLongitude()))
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
        result = prime * result + ((getLostArticleClassification() == null) ? 0 : getLostArticleClassification().hashCode());
        result = prime * result + ((getLostArticleName() == null) ? 0 : getLostArticleName().hashCode());
        result = prime * result + ((getLostArticleStatus() == null) ? 0 : getLostArticleStatus().hashCode());
        result = prime * result + ((getLostArticleDelete() == null) ? 0 : getLostArticleDelete().hashCode());
        result = prime * result + ((getLostArticleLatitude() == null) ? 0 : getLostArticleLatitude().hashCode());
        result = prime * result + ((getLostArticleLongitude() == null) ? 0 : getLostArticleLongitude().hashCode());
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
        sb.append(", lostArticleClassification=").append(lostArticleClassification);
        sb.append(", lostArticleName=").append(lostArticleName);
        sb.append(", lostArticleStatus=").append(lostArticleStatus);
        sb.append(", lostArticleDelete=").append(lostArticleDelete);
        sb.append(", lostArticleLatitude=").append(lostArticleLatitude);
        sb.append(", lostArticleLongitude=").append(lostArticleLongitude);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}