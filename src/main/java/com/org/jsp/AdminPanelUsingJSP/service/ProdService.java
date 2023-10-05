package com.org.jsp.AdminPanelUsingJSP.service;


import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.jsp.AdminPanelUsingJSP.entity.Product;
import com.org.jsp.AdminPanelUsingJSP.entity.User;
import com.org.jsp.AdminPanelUsingJSP.repoo.ProductRepo;

@Service
public class ProdService {

	@Autowired
	ProductRepo prodRepo;
	
	
	public Optional<Product> prodbyid(int id)
	{
		return prodRepo.findById(id);
	}
	
	public void deleteProd(int id)
	{
		prodRepo.deleteById(id);
	}
	public void updatedProd(Product product)
	{
		prodRepo.save(product);
	}
	
	public long prodCount()
	{
		return prodRepo.count();
				
	}
	
	
	
}
