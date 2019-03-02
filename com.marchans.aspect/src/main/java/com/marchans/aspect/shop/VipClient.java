package com.marchans.aspect.shop;

public class VipClient {

	private int discount; 
	 public void giveDiscount(int discount) {
		 //System.out.println("Here is my discount: "+discount+"% card");
		 this.discount = discount; 
	 }
	 
	 public int getDiscount(){
		 return discount;
		 }
	

}
