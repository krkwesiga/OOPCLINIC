package com.client;

import java.util.ArrayList;
import java.util.Iterator;

public class Display {

	private final ArrayList<Product> products;

	public Display(ArrayList<Product> products) {
		this.products = products;		
	}

	public void printReceipt() {
		
		System.out.println("\nOUTPUT");
		System.out.println("============================");
		System.out.println("Item\tQty\tPrice");	
		
		Iterator<Product> itp =  products.iterator();
		
		while(itp.hasNext()){
			
			System.out.println(itp.next());

		}
	}

}
