package com.df.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.dao.UserMapper;
import com.df.entity.PersonDossier;
import com.df.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	
	@Override
	public PageInfo<PersonDossier> queryList(int cpage,int plenth) {
		PageHelper.startPage(cpage, plenth);
		List<PersonDossier> docs = userMapper.queryList();
        PageInfo<PersonDossier> pageInfo = new PageInfo<>(docs);
        return pageInfo;
	}
}
