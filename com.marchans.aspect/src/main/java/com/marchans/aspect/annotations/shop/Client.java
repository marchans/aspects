package com.marchans.aspect.annotations.shop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Client {

//	@Pointcut("execution(public void com.marchans.aspect.annotations.shop.CashDesk.getNewClient())")
//	public void shopping(){}

	@Pointcut("execution(* com.marchans.aspect.annotations.shop.CashDesk*.*(..))")
	public void perform(){}
	
	
	@Before("perform()")
	public void Hello() {
		System.out.println("HELLO.");
	}
	
	@Around("perform()")
	public void shopGoods(ProceedingJoinPoint joinpoint){
		try{
		System.out.println("I have taken goods, that I need.");
		

		joinpoint.proceed();

		
		System.out.println("Here is the money.");
		
		}catch(Throwable t){
		System.out.println(t.getMessage());
		System.out.println("OOOPS!Run-run-run.");
		}
		}
}
