package com.client;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmItems {
	

	private String item;
	private String price;
	private String qty;
	private int total;

	public FrmItems() {
		
		
	}

	public void Greeting(){
		
		Scanner scanObj = new Scanner(System.in);
		String item="", qty="", price="";
		boolean input = true;
		
		System.out.println("Please Enter item Bought\n");
		System.out.println("========================================");
		
		while(input!=false){
		
			System.out.println("Item");
			item = scanObj.nextLine();
			
			System.out.println("Price");
			price = scanObj.nextLine();

			System.out.println("qty");
			qty = scanObj.nextLine();
			
			System.out.println("Next Item??");
			System.out.println("0-N0");
			System.out.println("1-Yes");
			
			input = Integer.parseInt(scanObj.nextLine())==1;
			
		}
		
				
		ArrayList<ItemsShopped> items = new ArrayList<ItemsShopped>();
		items.add(new ItemsShopped(item,price,qty));		
		
		
	}

	public FrmItems(String item, String price, String qty, int total) {
		
		this.item = item;
		this.price = price;
		this.qty = qty;
		this.total = total;
		
		DisplayItem dispObj = new  DisplayItem();
		dispObj.printListReceipt(item,price,qty,total);
	}
	
	public static void main(String args[]){

		FrmItems objItems = new FrmItems();
		objItems.Greeting();
		
	}
	
}
