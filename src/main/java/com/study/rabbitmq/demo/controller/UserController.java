package com.study.rabbitmq.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.rabbitmq.demo.model.UserModel;

@RequestMapping("/user")
@RestController
public class UserController {

	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<UserModel>> getUserList(){
		
		ArrayList<UserModel> userList=new ArrayList<UserModel>();
		
		UserModel user1=new UserModel("ankit","indore");
		userList.add(user1);
		return new ResponseEntity<>(userList,HttpStatus.OK);
		
		
	} 
	
}
