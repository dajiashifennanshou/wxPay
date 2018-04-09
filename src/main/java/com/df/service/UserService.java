package com.df.service;

import java.util.List;

import com.df.entity.PersonDossier;

public interface UserService {
	List<PersonDossier> queryList(int cpage, int plenth);

}
