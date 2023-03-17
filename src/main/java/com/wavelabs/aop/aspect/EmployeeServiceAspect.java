package com.wavelabs.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	/*
	 * annotaion
	 */
	@Pointcut("@annotation(com.wavelabs.aop.aspect.customAnno)")
	public void p1() {}
		
//	@Pointcut("execution(* com.wavelabs.aop.service.EmployeeService.*(..))")
//	public void p1() {}
	
	
		@Before("p1()")
		public void beforeAdvice() {
			System.out.println("Before method:Advice method started" );
		}
		

//	@Before(value = "execution(* com.wavelabs.aop.service.EmployeeService.*(..)) and args(name,empId)")
//	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
//		System.out.println("Before method:" + joinPoint.getSignature());
//
//		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
//	}
//
//	@After(value = "execution(* com.wavelabs.aop.service.EmployeeService.*(..)) and args(name,empId)")
//	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
//		System.out.println("After method:" + joinPoint.getSignature());
//
//		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
//	}
}
