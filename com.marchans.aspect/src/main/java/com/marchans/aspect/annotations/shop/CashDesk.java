package com.marchans.aspect.annotations.shop;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service("cashier")
public class CashDesk implements Shop {

	Random random = new Random();
	private int mood;


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

}
