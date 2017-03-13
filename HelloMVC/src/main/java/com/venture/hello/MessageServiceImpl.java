package com.venture.hello;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	public String getMessage() {
		// TODO Auto-generated method stub
		 return "Hello World!";
	}

}
