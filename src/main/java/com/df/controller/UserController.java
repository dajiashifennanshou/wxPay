package com.df.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.df.entity.PersonDossier;
import com.df.service.impl.UserServiceImpl;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/userlist")
	@ResponseBody
	public PageInfo<PersonDossier> queryList(int cpage,int plenth){
		return userService.queryList(cpage,plenth);
	}
	
	@RequestMapping("/")
	public String index(){
		return "/user/index";  
	}
}
