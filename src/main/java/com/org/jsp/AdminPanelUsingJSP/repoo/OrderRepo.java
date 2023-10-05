package com.org.jsp.AdminPanelUsingJSP.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.jsp.AdminPanelUsingJSP.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
