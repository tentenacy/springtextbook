package org.example.ex6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Security Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Security Aspect: Method executed and returned " + returnedValue);

        return returnedValue;
    }
}
