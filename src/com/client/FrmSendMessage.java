package com.client;

public class FrmSendMessage {

	private String decryptedMessage;	
	private byte[] message;

	public void SendMessage(byte[] messagebyte){

		this.message = messagebyte;
		System.out.println("Encrypted Message: "+message);

		FrmDecryptMessage decMsg = new FrmDecryptMessage();
		decMsg.Decrypt(message);
	}

}
