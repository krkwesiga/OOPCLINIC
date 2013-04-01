package com.client;

import java.util.Scanner;

public class FrmMessage {

	public static void main(String args[]){

		try{
			
			Scanner objScan = new  Scanner(System.in);
			FrmCryptMessage msgEncryptObj = new FrmCryptMessage();
			
			System.out.println("Enter Message");
			System.out.println("============================");
			String messageobj = objScan.nextLine();
			System.out.println("1-Send Message");
			System.out.println("0-Delete Message");

			String caseChoice = objScan.nextLine();
			
			switch(Integer.parseInt(caseChoice)){		
			case 1:

				msgEncryptObj.EncryptMessage(messageobj);

				break;

			case 0:
				
				break;

			default:

			}
			
		}catch(Exception e){
			
			System.out.println("ERROR!!! "+e.getMessage());
			
		}
	}
}
