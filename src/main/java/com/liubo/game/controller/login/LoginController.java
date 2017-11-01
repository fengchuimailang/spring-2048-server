package com.liubo.game.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liubo.game.das.IUserDas;

public class LoginController {
	//private final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private IUserDas userDas;
	
	@RequestMapping("/")
	public String
	
}
