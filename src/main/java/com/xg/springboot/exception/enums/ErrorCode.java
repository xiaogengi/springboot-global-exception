package com.xg.springboot.exception.enums;

import com.xg.springboot.exception.response.BaseError;

public enum ErrorCode implements BaseError {
    SUCCESS("200", "成功"),
    FAILED("5001","失败"),
    ERROR("500", "系统异常");

    private String errorCode;
    private String errorMsg;

    ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }
}
