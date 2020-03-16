package com.zrq.gmall.web.handler;

import com.zrq.gmall.api.to.CommonResult;
import com.zrq.gmall.web.exception.GmallException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GmallException.class)
    @ResponseBody
    public Object handler(GmallException exception) {
        log.debug("错误信息:{}",exception.getMessage());
        return new CommonResult().failed();
    }
}
