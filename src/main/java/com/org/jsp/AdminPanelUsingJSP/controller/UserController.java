package com.org.jsp.AdminPanelUsingJSP.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


import com.org.jsp.AdminPanelUsingJSP.entity.Product;
import com.org.jsp.AdminPanelUsingJSP.entity.User;
import com.org.jsp.AdminPanelUsingJSP.repoo.OrderRepo;
import com.org.jsp.AdminPanelUsingJSP.repoo.UserRepo;
import com.org.jsp.AdminPanelUsingJSP.service.UserService;

@RestController
public class UserController {

	@Autowired
	 UserService userServ;
	
	@Autowired
	UserRepo userRepo;
	
	
	
//	===BY INPUT REQ===
	 @PostMapping("/saveu")
	 public String saveemp(@RequestBody User user)
	 {
		 return userServ.saveUser(user);
	 }
	 
	 
	 
	
		
}
