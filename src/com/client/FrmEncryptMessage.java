package com.client;

public class FrmEncryptMessage {

	private String messageobj;

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


}
