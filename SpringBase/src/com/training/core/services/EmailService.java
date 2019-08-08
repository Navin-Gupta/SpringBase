package com.training.core.services;

import com.training.core.facade.MessagingService;

public class EmailService implements MessagingService {

	@Override
	public String sentMessage(String msg, String to) {
		// TODO Auto-generated method stub
		return "Email sent to : " + to + " [ " + msg + " ]";
	}

}
