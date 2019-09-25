package com.xm.helpcircle.domain.lost.entity;

import java.io.Serializable;

/**
 * lost_and_found
 * @author 
 */
public class LostAndFoundWithBLOBs extends LostAndFound implements Serializable {
    /**
     * 物品详情
     */
    private String lostArticleDetail;

    /**
     * 图片地址, 多个逗|分隔
     */
    private String lostArticleUrl;

    private static final long serialVersionUID = 1L;

    public String getLostArticleDetail() {
        return lostArticleDetail;
    }

    public void setLostArticleDetail(String lostArticleDetail) {
        this.lostArticleDetail = lostArticleDetail;
    }

    public String getLostArticleUrl() {
        return lostArticleUrl;
    }

    public void setLostArticleUrl(String lostArticleUrl) {
        this.lostArticleUrl = lostArticleUrl;
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
        LostAndFoundWithBLOBs other = (LostAndFoundWithBLOBs) that;
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
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLostArticleDetail() == null ? other.getLostArticleDetail() == null : this.getLostArticleDetail().equals(other.getLostArticleDetail()))
            && (this.getLostArticleUrl() == null ? other.getLostArticleUrl() == null : this.getLostArticleUrl().equals(other.getLostArticleUrl()));
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
        result = prime * result + ((getLostArticleDetail() == null) ? 0 : getLostArticleDetail().hashCode());
        result = prime * result + ((getLostArticleUrl() == null) ? 0 : getLostArticleUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lostArticleDetail=").append(lostArticleDetail);
        sb.append(", lostArticleUrl=").append(lostArticleUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}