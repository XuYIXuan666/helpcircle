package com.xm.helpcircle.common.enums;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public enum PostAccountStatusEnum {

    UNDELETED("1", "未领取"),
    DELETED("2", "已删除"),
    INVALID("3", "已失效"),
    ;
    private String type;
    private String describe;

    static Map<String, PostAccountStatusEnum> enumMap = new HashMap<>();
    static{
        for(PostAccountStatusEnum _enum : PostAccountStatusEnum.values())
            enumMap.put(_enum.type, _enum);
    }

    PostAccountStatusEnum(String type, String describe){
        this.type = type;
        this.describe = describe;
    }

    public static PostAccountStatusEnum getByStatus(String type){
        return enumMap.get(!StringUtils.isEmpty(type) ? type : "");
    }

    public String getType() {
        return type;
    }

    public String getDescribe() {
        return describe;
    }
}


