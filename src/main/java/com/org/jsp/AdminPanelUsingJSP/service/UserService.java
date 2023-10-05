package com.org.jsp.AdminPanelUsingJSP.service;

import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.jsp.AdminPanelUsingJSP.entity.Product;
import com.org.jsp.AdminPanelUsingJSP.entity.User;
import com.org.jsp.AdminPanelUsingJSP.repoo.UserRepo;

@Service
public class UserService {

	@Autowired
	 UserRepo userRepo;
	
	public String saveUser(User user)
    {
    	
	userRepo.save(user);
	System.out.println("Extracted User: " + user);
		return "USER saved successfully...";

    }
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
	public Optional<User> userbyid(int id)
	{
		return userRepo.findById(id);
	}
	public void updatedUser(User user)
	{
		userRepo.save(user);
	}
	
	public long userCount()
	{
		return userRepo.count();
	}
}
