package com.xg.springboot.exception.response;

import com.xg.springboot.exception.enums.ErrorCode;

/**
 * @program: springboot-exception
 * @description:
 * @author: gengzhaokai
 * @create: 2020-08-24 14:56
 **/
public class Response {

    private String errorCode;
    private String errorMsg;
    private Object data;

    public Response(String errorCode, String errorMsg, Object data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public Response(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Response(BaseError baseError, Object data) {
        this.errorCode = baseError.getErrorCode();
        this.errorMsg = baseError.getErrorMsg();
        this.data = data;
    }

    public static Response buildSuccess(Object data){
        return new Response(ErrorCode.SUCCESS.getErrorCode(), ErrorCode.SUCCESS.getErrorMsg(), data);
    }

   public static Response build(BaseError baseError,Object data){
        return new Response(baseError.getErrorCode(), baseError.getErrorMsg(), data);
   }

   public static Response build(String errorCode, String errorMsg){
        return new Response(errorCode, errorMsg);
   }

   public static Response build(ErrorCode errorCode){
        return new Response(errorCode, null);
   }

    public Response() {
    }

    public static Response build(String errorMsg){
        Response response = new Response();
        response.setErrorMsg(errorMsg);
        return response;
   }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
