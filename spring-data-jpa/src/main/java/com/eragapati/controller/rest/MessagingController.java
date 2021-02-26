package com.eragapati.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {

	@Autowired
	JmsTemplate jmsTemplate;

	@GetMapping("snd")
	String send() {
		try {
			jmsTemplate.convertAndSend("LQ1", "Hello World!");
			return "OK";
		} catch (JmsException ex) {
			ex.printStackTrace();
			return "FAIL";
		}
	}

	@GetMapping("rcv")
	String recv() {
		try {
			return jmsTemplate.receiveAndConvert("LQ1").toString();
		} catch (JmsException ex) {
			ex.printStackTrace();
			return "FAIL";
		}
	}

}
