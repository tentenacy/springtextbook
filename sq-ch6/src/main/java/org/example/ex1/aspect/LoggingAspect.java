package org.example.ex1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("execution(* org.example.ex1.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        // 추가 구현
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }
}
