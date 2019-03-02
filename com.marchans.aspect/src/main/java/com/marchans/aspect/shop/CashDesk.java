package com.marchans.aspect.shop;

import java.util.Random;

public class CashDesk implements Shop {

	Random random = new Random();
	private int mood;
	private int discount;

	CashDesk() {
		this.mood = random.nextInt(2);
	};

	public void getNewClient() {
		if (mood == 0) {
			throw new NullPointerException("WARNING! Cashier has no mood.");
		} else {
			System.out.println("Here is your receipt.");
		}

	}

	public void askTheDiscount(int discount) {
		System.out.println("It is not the VIP CashDesk.");
	}

	public int getDiscount() {

		return 0;
	}

}
