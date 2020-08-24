package com.xg.springboot.exception.controller;

import com.xg.springboot.exception.enums.ErrorCode;
import com.xg.springboot.exception.exception.BaseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-exception
 * @description:
 * @author: gengzhaokai
 * @create: 2020-08-24 15:09
 **/
@RestController
public class DemoController {

    @RequestMapping("query")
    public String query(Integer type) throws Exception {
        if(type == 1){
            throw new NullPointerException("NullPointerException");
        } if(type == 2){
            throw new NumberFormatException("NumberFormatException");
        } if(type == 3){
            throw new Exception("Exception");
        } if(type == 4){
            throw new BaseException(ErrorCode.ERROR);
        } if(type == 5){
            throw new BaseException(ErrorCode.SUCCESS);
        }
        return null;
    }

}
