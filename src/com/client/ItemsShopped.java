package com.client;

import java.util.ArrayList;

public class ItemsShopped {
	

	private String qty;
	private String price;
	private String item;

	public ItemsShopped(String item, String price, String qty) {
		
		this.item = item;
		this.price = price;
		this.qty = qty;
		int total = (Integer.parseInt(qty)*Integer.parseInt(price));
		
		ArrayList<FrmItems> printObj = new ArrayList<FrmItems>();
		printObj.add(new FrmItems(item,price,qty,total));
		
	}

}
