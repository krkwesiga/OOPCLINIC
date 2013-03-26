package com.client;

public class FrmViewMessage {

	private String decryptedMessage;

	public void ViewDecryptedMessage(String decryptedMessage) {

		this.decryptedMessage = decryptedMessage;

		try{

			System.out.println("Decrypted Message: "+decryptedMessage);

		}catch(Exception e){

			System.out.println("ERROR!!! "+e.getMessage());

		}


	}

}

