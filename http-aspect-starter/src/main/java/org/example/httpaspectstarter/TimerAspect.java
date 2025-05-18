package org.example.httpaspectstarter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {

    @Around("@annotation(org.example.httpaspectstarter.Timer)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long duration = System.currentTimeMillis() - start;

        System.out.println("Execution time of " + joinPoint.getSignature() + " : " + duration + " ms");
        return proceed;
    }
}
