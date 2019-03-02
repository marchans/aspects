package com.marchans.aspect.shop;

public class VipCashDesk implements Shop {

	private int discount;

	public void getNewClient() {
		System.out.println("Hello. Have a goood day.");
	}

	public void askTheDiscount(int discount) {
		System.out.println("Do you have the discount?");
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

}
