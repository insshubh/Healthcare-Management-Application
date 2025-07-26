package com.pm.patient_service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class testingAspect {
    
    @Before("execution(* com.pm.patient_service.controller.PatientController.getAllPatients(..))")
    public void logBeforeGetAllPatients(JoinPoint joinPoint) {
        System.out.println("Before executing getAllPatients method: " + joinPoint.getSignature().getName());
    }
}