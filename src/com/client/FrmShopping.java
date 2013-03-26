package com.client;
import java.util.ArrayList;
import java.util.Scanner;

public class FrmShopping {

	static String item = "";
	static int qty = 0;
	static double price = 0;
	
	public static void main(String args[]){

		System.out.println("Welcome to our Shopping System");
		System.out.println("==================================");
		Scanner scan = new Scanner(System.in);
		
		boolean more_items = true;
		ArrayList<Product> products = new ArrayList<Product>();
		
		while(more_items!=false){
			
		System.out.println("Item");
		item = scan.nextLine(); 
		System.out.println("Qty");
		qty = Integer.parseInt(scan.nextLine());
		System.out.println("Price");
		price = Double.parseDouble(scan.nextLine());
		
		products.add(new Product(item, qty, price));
		
		System.out.println("Do you want to add another record?");
		System.out.println("1-Yes");
		System.out.println("0-No");
		
		more_items = Integer.parseInt(scan.nextLine())==1;
		
		}
		
		Display display = new Display(products);
		display.printReceipt();

	}

} 
