package com.client;

public class FrmDecryptMessage {

	private byte[] message;
	String decryptedMessage = "";

	public void Decrypt(byte[] message) {
		
		try{
			
			this.message = message;
			decryptedMessage = new String(message);
			
			FrmViewMessage objViewDecryptedMsg = new FrmViewMessage();
			objViewDecryptedMsg.ViewDecryptedMessage(decryptedMessage);
			
		}catch(Exception e){
			
			System.out.println("ERROR!!! "+e.getMessage());
		}		
	}

}
