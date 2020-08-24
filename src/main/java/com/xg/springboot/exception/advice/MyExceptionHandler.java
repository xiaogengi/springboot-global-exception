package com.xg.springboot.exception.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: springboot-exception
 * @description:
 * @author: gengzhaokai
 * @create: 2020-08-24 14:45
 **/
//@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e){
        System.out.println("未知异常！原因是:" + e);
        return e.getMessage();
    }

}
