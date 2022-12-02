package com.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mybatis.model.Users;

@Mapper
public interface UsersMapper {

	@Select("select * from tbl_expenses")
	List<Users> findAll();

}
