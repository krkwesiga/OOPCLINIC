package com.client;

public class FrmSendMessage {

	private String decryptedMessage;	
	private byte[] message;

	public void SendMessage(byte[] messagebyte){

		this.message = messagebyte;
		System.out.println("Encrypted Message: "+message);

		FrmCryptMessage decMsg = new FrmCryptMessage();
		decMsg.Decrypt(message);
	}

}
