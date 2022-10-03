package test_ng;

import io.netty.handler.codec.base64.Base64;

public class Session_43_EncodePassword {
	
	public static void main(String[] args) {
		
		//Encode password
		String password = "admin123";
		
		Base64.encode(password.getBytes());
		 
	}

}
