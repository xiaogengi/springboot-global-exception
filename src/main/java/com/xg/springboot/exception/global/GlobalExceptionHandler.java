package com.xg.springboot.exception.global;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.xg.springboot.exception.enums.ErrorCode;
import com.xg.springboot.exception.exception.BaseException;
import com.xg.springboot.exception.response.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springboot-exception
 * @description:
 * @author: gengzhaokai
 * @create: 2020-08-24 15:01
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Response baseExceptionHandler(HttpServletRequest request, BaseException baseException){
        log.error("业务异常 = { "+ baseException +" }");
        return Response.build(baseException.getErrorCode(),baseException.getErrorMsg());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response baseExceptionHandler(HttpServletRequest request, Exception baseException){
        log.error("exception  = { "+ baseException +" }");
        return Response.build(baseException.getMessage());
    }


}
