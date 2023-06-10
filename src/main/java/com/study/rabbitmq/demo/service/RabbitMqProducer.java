package com.study.rabbitmq.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.study.rabbitmq.demo.controller.model.Message;

@Service
public class RabbitMqProducer {

	@Value("${rabbitmq.exchange.name}")
	private String exchangeName;

	@Value("${rabbitmq.routing-key.name}")
	private String routingKeyName;
	
	private RabbitTemplate rabbitTemplate;

	public RabbitMqProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	
	public void sendMessage(Message message)
	{
		rabbitTemplate.convertAndSend(exchangeName,routingKeyName,message);
	}
	

}
