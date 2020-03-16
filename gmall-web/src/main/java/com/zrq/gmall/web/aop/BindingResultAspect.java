package com.zrq.gmall.web.aop;


import com.zrq.gmall.api.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Aspect
@Component
@Slf4j
public class BindingResultAspect {
    @Pointcut("execution(* *..ProductController.getList(..))")
    public void pointCut(){}


    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();

        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult bindingResult = (BindingResult)arg;
                if (bindingResult.hasErrors()) {
                    return new CommonResult().validateFailed(bindingResult);
                }
            }
        }
        return point.proceed();
    }
}
