package com.org.jsp.AdminPanelUsingJSP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.jsp.AdminPanelUsingJSP.entity.Orders;
import com.org.jsp.AdminPanelUsingJSP.repoo.OrderRepo;


@Service
public class OrderServiceImpl implements OrderServ {

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public Optional<Orders> getOrdersForUser(int userId) {
		 // Implement the logic to retrieve orders for a specific user from your data source (e.g., database)
        return orderRepo.findById(userId);
	}

}
