package com.client;

import java.util.ArrayList;


public class Product {

	private final String item;
	private final int qty;
	private final double price;

	public Product(String item, int qty, double price) {
		
		this.item = item;
		this.qty = qty;
		this.price = price;
	
		ArrayList<Cart> cart = new ArrayList<Cart>();
		cart.add(new Cart(item, qty, price));
	}

}
