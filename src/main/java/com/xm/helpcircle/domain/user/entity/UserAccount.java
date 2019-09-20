package com.xm.helpcircle.domain.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user_account
 * @author 
 */
public class UserAccount implements Serializable {
    /**
     * id主键
     */
    private Long id;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * openId
     */
    private String openNo;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 绑定手机号
     */
    private String bindPhone;

    /**
     * 微信号
     */
    private String wechatNo;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 状态；01：正常，02：异常
     */
    private String status;

    /**
     * 纬度
     */
    private Long userLatitude;

    /**
     * 经度
     */
    private Long userLongitude;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * 用户头像
     */
    private String userUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public String getWechatNo() {
        return wechatNo;
    }

    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(Long userLatitude) {
        this.userLatitude = userLatitude;
    }

    public Long getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(Long userLongitude) {
        this.userLongitude = userLongitude;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
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
        UserAccount other = (UserAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getOpenNo() == null ? other.getOpenNo() == null : this.getOpenNo().equals(other.getOpenNo()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getBindPhone() == null ? other.getBindPhone() == null : this.getBindPhone().equals(other.getBindPhone()))
            && (this.getWechatNo() == null ? other.getWechatNo() == null : this.getWechatNo().equals(other.getWechatNo()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserLatitude() == null ? other.getUserLatitude() == null : this.getUserLatitude().equals(other.getUserLatitude()))
            && (this.getUserLongitude() == null ? other.getUserLongitude() == null : this.getUserLongitude().equals(other.getUserLongitude()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserUrl() == null ? other.getUserUrl() == null : this.getUserUrl().equals(other.getUserUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getOpenNo() == null) ? 0 : getOpenNo().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getBindPhone() == null) ? 0 : getBindPhone().hashCode());
        result = prime * result + ((getWechatNo() == null) ? 0 : getWechatNo().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserLatitude() == null) ? 0 : getUserLatitude().hashCode());
        result = prime * result + ((getUserLongitude() == null) ? 0 : getUserLongitude().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserUrl() == null) ? 0 : getUserUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userNo=").append(userNo);
        sb.append(", openNo=").append(openNo);
        sb.append(", nickName=").append(nickName);
        sb.append(", bindPhone=").append(bindPhone);
        sb.append(", wechatNo=").append(wechatNo);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", userLatitude=").append(userLatitude);
        sb.append(", userLongitude=").append(userLongitude);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userUrl=").append(userUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}