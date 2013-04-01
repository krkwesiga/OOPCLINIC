package com.client;

public class FrmCryptMessage {

	private String messageobj;	
	private byte[] message;
	String decryptedMessage = "";

	public void EncryptMessage(String messageobj) {

		try{

			this.messageobj = messageobj;
			byte[] messagebyte = messageobj.getBytes("US-ASCII");	

			FrmSendMessage objSend = new FrmSendMessage();
			objSend.SendMessage(messagebyte);

		}catch(Exception e){

			System.out.println("ERROR!!!" +e.getMessage());

		}
	}

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
