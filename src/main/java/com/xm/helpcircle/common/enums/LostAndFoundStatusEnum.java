package com.xm.helpcircle.common.enums;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public enum LostAndFoundStatusEnum {


    UNCOLLECTED("1", "未领取"),
    RECEIVED("2", "已领取"),
    INVALID("3", "已失效"),
    ;
    private String type;
    private String describe;

    static Map<String, LostAndFoundStatusEnum> enumMap = new HashMap<>();
    static{
        for(LostAndFoundStatusEnum _enum : LostAndFoundStatusEnum.values())
            enumMap.put(_enum.type, _enum);
    }

    LostAndFoundStatusEnum(String type, String describe){
        this.type = type;
        this.describe = describe;
    }

    public static LostAndFoundStatusEnum getByStatus(String type){
        return enumMap.get(!StringUtils.isEmpty(type) ? type : "");
    }

    public String getType() {
        return type;
    }

    public String getDescribe() {
        return describe;
    }
}
