package com.xm.helpcircle.web.controller.config;

/**
 * 定义规则
 * 6位 = 1/2位大分类 + 3/4位小分类 + 5/6位扩展位
 */
public enum WebReturnEnum {
    /*正常响应信息*/
    SUCCESS("000000", "请求处理成功"),

    /*异常响应信息*/

    /*登录模块*/
    SESSION_INVALID("900001", "会话无效"),
    PWD_INVALID("900002", "登录密码不匹配"),
    CHECKCODE_INVALID("900003", "验证码不匹配"),




    /*通用模块*/
    ARG_INVALID("990001", "参数无效"),
    UNKNOWN_ERROR("999999", "未知异常"),
    ;
    private String code;
    private String msg;

    WebReturnEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
