package com.df.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.df.entity.PersonDossier;
import com.df.service.impl.UserServiceImpl;

@Controller
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/userlist")
	@ResponseBody
	public List<PersonDossier> queryList(int cpage,int plenth){
		return userService.queryList(cpage,plenth);
	}
	
	@RequestMapping("/")
	public String index(){
		return "/user/index";  
	}
}
