package com.addata.sqladdata;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loger {

    private static final Logger LOG = LoggerFactory.getLogger(Loger.class);

    /**
     * Around advice example that is invoked when any method of CalcService is executed
     * @param joinPoint ProceedingJoinPoint as this around advice must proceed to complete method execution
     * @return
     * @throws Throwable
     * * means any log
     */
    @Around("execution(* com.addata.sqladdata.AddataServiceImpl.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable { LOG.info("Before execution args:{} {}", joinPoint.getArgs(), joinPoint.getSignature());
        Object o = joinPoint.proceed();
        LOG.info("After execution");
        return o;
    }

}
