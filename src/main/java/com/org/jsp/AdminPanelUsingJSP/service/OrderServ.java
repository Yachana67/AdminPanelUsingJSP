package com.org.jsp.AdminPanelUsingJSP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.jsp.AdminPanelUsingJSP.entity.Orders;



@Service
public interface OrderServ {
	 Optional<Orders> getOrdersForUser(int userId);
}
