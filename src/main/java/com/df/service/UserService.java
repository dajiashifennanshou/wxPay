package com.df.service;

import com.df.entity.PersonDossier;
import com.github.pagehelper.PageInfo;

public interface UserService {
	PageInfo<PersonDossier> queryList(int cpage, int plenth);

}
