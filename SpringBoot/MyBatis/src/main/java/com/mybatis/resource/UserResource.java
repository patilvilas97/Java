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
	
	
	@GetMapping("/adduser")
	public List<Users> addUser(){
		Users users = new Users();
//		users.setId(3);
		users.setAmount(33270);
		users.setDescription("A gold ring of 4.6 gm");
		users.setCreated_at("03122022");
		
		usersMapper.insert(users);
		
		return usersMapper.findAll(); 
	}
	
	@GetMapping("/update_user")
	public List<Users> updateuser(){
		int id = 4;
		String value = "Pushparaj Gold Ring 5.0gm";
		usersMapper.updateUserById(id, value);
		return usersMapper.findAll();
	}
	
	@GetMapping("/delete_user")
	public List<Users> deleteUser(){
		int id = 5;
		usersMapper.deleteUser(id);
		return usersMapper.findAll();
	}
	

}
