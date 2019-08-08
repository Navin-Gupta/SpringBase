package com.training.core.client;

import com.training.core.services.EmailService;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Traditional Approach : Tightly coupled
		EmailService service  = new EmailService();
		service.sentMessage("All izz well!!!", "someone@mail.com");
		

	}

}
