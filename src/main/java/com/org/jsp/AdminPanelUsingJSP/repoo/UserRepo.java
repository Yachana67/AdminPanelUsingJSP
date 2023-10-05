package com.org.jsp.AdminPanelUsingJSP.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.jsp.AdminPanelUsingJSP.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
