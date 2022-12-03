package com.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.mybatis.model.Users;

@Mapper
public interface UsersMapper {

	@Select("select * from tbl_expenses")
	List<Users> findAll();

	@Insert("insert into tbl_expenses(amount, created_at, description) Values(#{amount}, #{created_at}, #{description})")
	@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty = "id", before=false, resultType=Integer.class)
	void insert(Users users);

	@Update("update tbl_expenses Set description = #{value} where id=#{id}")
	void updateUserById(int id, String value);

	@Delete("delete from tbl_expenses where id=#{id}")
	void deleteUser(int id);

}
