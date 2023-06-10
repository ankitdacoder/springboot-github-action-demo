package com.study.rabbitmq.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.study.rabbitmq.demo.controller.model.Message;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMqConsumer {

	
	@RabbitListener(queues = {"${rabbitmq.queue.name}"})
	public void consume(Message msg)
	{
		log.info("Received Message {} ",msg.toString());
	}
	
}
