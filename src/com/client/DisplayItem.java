package com.client;
public class DisplayItem {
	

	public void printListReceipt(String item,String price,String qty,int total) {
		
		System.out.println("\nOUTPUT");
		System.out.println("============================");
		System.out.println("Item\tPrice\tQty\tTotal");
		System.out.println(""+item+"\t"+price+"\t"+qty+"\t"+total);

		
	}

}
