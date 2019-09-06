package com.tm.helpcircle.web.controller.config;

import java.io.Serializable;

public final class WebReturn implements Serializable {

    boolean success;
    String returnCode;
    static final String returnCodeK = "returnCode";
    String returnMsg;
    static final String returnMsgK = "returnMsg";
    Object returnData;

    WebReturn(boolean success, String returnCode, String returnMsg, Object returnData){
        this.success = success;
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
        this.returnData = returnData;
    }

    public static WebReturn of(boolean isSuccess, String returnCode, String returnMsg, Object returnData){
        return new WebReturn(isSuccess, returnCode, returnMsg, returnData);
    }

    public static WebReturn success(String returnCode, String returnMsg, Object returnData){
        return of(true, returnCode, returnMsg, returnData);
    }

    public static WebReturn success(String returnCode, String returnMsg){
        return of(true, returnCode, returnMsg, "");
    }

    public static WebReturn success(WebReturnEnum webReturnEnum, Object returnData){
        return of(true, webReturnEnum.getCode(), webReturnEnum.getMsg(), returnData);
    }

    public static WebReturn success(WebReturnEnum webReturnEnum){
        return of(true, webReturnEnum.getCode(), webReturnEnum.getMsg(), "");
    }

    public static WebReturn success(Object returnData){
        return of(true, WebReturnEnum.SUCCESS.getCode(), WebReturnEnum.SUCCESS.getMsg(), returnData);
    }

    public static WebReturn success(){
        return of(true, WebReturnEnum.SUCCESS.getCode(), WebReturnEnum.SUCCESS.getMsg(), "");
    }

    public static WebReturn failure(String returnCode, String returnMsg, Object returnData){
        return of(false, returnCode, returnMsg, returnData);
    }

    public static WebReturn failure(String returnCode, String returnMsg){
        return of(false, returnCode, returnMsg, "");
    }

    public static WebReturn failure(WebReturnEnum webReturnEnum, Object returnData){
        return of(false, webReturnEnum.getCode(), webReturnEnum.getMsg(), returnData);
    }

    public static WebReturn failure(WebReturnEnum webReturnEnum){
        return of(false, webReturnEnum.getCode(), webReturnEnum.getMsg(), "");
    }

    public static WebReturn failure(Object returnData){
        return of(false, WebReturnEnum.UNKNOWN_ERROR.getCode(), WebReturnEnum.UNKNOWN_ERROR.getMsg(), returnData);
    }

    public static WebReturn failure(){
        return of(false, WebReturnEnum.UNKNOWN_ERROR.getCode(), WebReturnEnum.UNKNOWN_ERROR.getMsg(), null);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Object getReturnData() {
        return returnData;
    }

    public void setReturnData(Object returnData) {
        this.returnData = returnData;
    }

    @Override
    public String toString() {
        return "WebReturn{" +
                "isSuccess=" + success +
                ", returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", returnData=" + returnData +
                '}';
    }
}
