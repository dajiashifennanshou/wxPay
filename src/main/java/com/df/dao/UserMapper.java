package com.df.dao;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.df.entity.PersonDossier;

public interface UserMapper {

	@Select("select pd_accountid,pd_name from Person_Dossier order by autoid")
	@Results({
            @Result(property = "accountid", column = "pd_accountid"),
			@Result(property = "name", column = "pd_name")})
	public List<PersonDossier> queryList();

}
