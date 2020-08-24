package com.xg.springboot.exception.exception;

import com.xg.springboot.exception.response.BaseError;

/**
 * @program: springboot-exception
 * @description:
 * @author: gengzhaokai
 * @create: 2020-08-24 14:52
 **/
public class BaseException extends RuntimeException {

    protected String errorCode;
    protected String errorMsg;


    public BaseException() {
        super();
    }

    public BaseException(BaseError baseError){
        super(baseError.getErrorMsg());
        this.errorCode = baseError.getErrorCode();
        this.errorMsg = baseError.getErrorMsg();
    }

    public BaseException(BaseError baseError, Throwable cause){
        super(baseError.getErrorMsg(), cause);
        this.errorCode = baseError.getErrorCode();
        this.errorMsg = baseError.getErrorMsg();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
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
}
