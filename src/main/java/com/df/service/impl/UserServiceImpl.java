package com.df.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.dao.UserMapper;
import com.df.entity.PersonDossier;
import com.df.service.UserService;
import com.github.pagehelper.PageHelper;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<PersonDossier> queryList(int cpage,int plenth) {
		PageHelper.startPage(cpage, plenth);
		return userMapper.queryList();
	}
}
