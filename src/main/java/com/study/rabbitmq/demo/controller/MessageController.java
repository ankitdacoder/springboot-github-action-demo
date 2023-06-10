package com.study.rabbitmq.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.rabbitmq.demo.controller.model.Message;
import com.study.rabbitmq.demo.service.RabbitMqProducer;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

	private RabbitMqProducer mqProducer;

	public MessageController(RabbitMqProducer mqProducer) {
		this.mqProducer = mqProducer;
	}

	
	@PostMapping("/sendMessage")
	public String seneMessage(@RequestBody Message msg)
	{
		mqProducer.sendMessage(msg);
		return "send";
	}
	
	
}
