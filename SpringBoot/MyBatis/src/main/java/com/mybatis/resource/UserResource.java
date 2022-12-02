package com.mybatis.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.mappers.UsersMapper;
import com.mybatis.model.Users;
@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@GetMapping("/allusers")
	public List<Users> getAll(){
		return usersMapper.findAll();
	}

}
