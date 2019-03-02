package com.marchans.aspect.shop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Client {

	private int discount; 
	 public void giveDiscount(int discount) {
		 //System.out.println("Here is my discount: "+discount+"% card");
		 this.discount = discount; 
	 }
	 
	 public int getDiscount(){
		 return discount;
		 }
	
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
