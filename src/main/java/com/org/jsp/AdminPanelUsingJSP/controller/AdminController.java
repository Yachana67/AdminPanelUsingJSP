package com.org.jsp.AdminPanelUsingJSP.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.org.jsp.AdminPanelUsingJSP.entity.Orders;
import com.org.jsp.AdminPanelUsingJSP.entity.Product;
import com.org.jsp.AdminPanelUsingJSP.entity.User;
import com.org.jsp.AdminPanelUsingJSP.repoo.OrderRepo;
import com.org.jsp.AdminPanelUsingJSP.repoo.ProductRepo;
import com.org.jsp.AdminPanelUsingJSP.repoo.UserRepo;

import com.org.jsp.AdminPanelUsingJSP.service.ProdService;
import com.org.jsp.AdminPanelUsingJSP.service.UserService;


@Controller
public class AdminController {

	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	UserService userServ;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ProdService prodServ;
	@Autowired
	OrderRepo orderRepo;
	
	
	
	@GetMapping("/log")
	public String welco()
	{
		return "indexx";
	}
	
	@PostMapping("/submit")
	public String welcome(@RequestParam String email,@RequestParam String pass,Model model)
	{
		if("admin".equals(email)&& "admin".equals(pass))
		{
			return "dash";
		}
		else {
			model.addAttribute("error", "Invalid credentials");
		return "indexx";
		}
	}
	@GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productRepo.findAll();
        model.addAttribute("products", products);
        return "products";
    }
	@GetMapping("/dashboard")
	public String dash()
	{
		return "dash";
	}
	
	
	@GetMapping("/users")
	public String Registereduser()
	{
		return "users";
	}
	@GetMapping("/add")
	public String add_prod()
	{
		return "add";
	}
	@RequestMapping(path="/handle-product",method=RequestMethod.POST)
	public String handleProd(@ModelAttribute Product product,Model model)
	{
		System.out.println(product);
		productRepo.save(product);
		
	 //return redirectView.setUrl(request.getContextPath()+"/products");
	 return "redirect:/products";
	
		
		
			}
	
	
	
	@GetMapping("/pcount")
	public String getProdCount(Model model)
	{
		 long prodcount=prodServ.prodCount();
		 long usercount=userServ.userCount();
		 model.addAttribute("prodcount",prodcount);
		 model.addAttribute("usercount",usercount);
		 return "dash";
		 
		 
	}
	
	 @GetMapping("/images/{productId}")
	    public void showImage(@PathVariable int productId, HttpServletResponse response) {
		 
	        try {
	        	Optional<Product> productOptional =prodServ.prodbyid(productId);
	        			if (productOptional.isPresent()) {
	        			    Product product = productOptional.get();
	        			    byte[] image = product.getImage();
	        			    response.setContentType("image/jpeg"); // Set the appropriate content type
	                        InputStream is = new ByteArrayInputStream(product.getImage());
	                        IOUtils.copy(is, response.getOutputStream());
	        			    // Now you can work with the 'image' byte array
	        			    // For example, you can send it to the client for image display
	        			} else {
	        			    // Handle the case where the product is not found
	        			    // You can return an error message or perform other actions
	        			}
	        } catch (IOException e) {
	            // Handle the exception (e.g., log it or return an error response)
	        }
	    }
	
	 @GetMapping("/delete/{productId}")
	    public String deleteProduct(@PathVariable int productId) {
	        // Call the service to delete the product by its ID
	        prodServ.deleteProd(productId);
	        // Redirect to the product list page or another appropriate page
	        return "redirect:/products"; // Redirect to the product list page
	    }
	 
@RequestMapping("/update/{id}")
	public String edit(@PathVariable int id,Model m)
	{
	 
	// Retrieve the product by ID and add it to the model
    Optional<Product> product = prodServ.prodbyid(id);
    if (product.isPresent()) {
        Product products = product.get();
        m.addAttribute("product", products);
        return "update";
    } else {
        // Handle the case where the product is not found (e.g., redirect or display an error)
        return "pnot"; 
        
    }// Create a "product-not-found.jsp" or choose an appropriate view
    }
    
    @PostMapping("/update/{id}/handleup")
    public RedirectView updatee( @ModelAttribute Product updatedProd)
    {
    
    	RedirectView redirectView=new RedirectView();
    	redirectView.setUrl("/products");
       prodServ.updatedProd(updatedProd);
    	return redirectView;
    }
	
    @GetMapping("/registeredUsers")
    public String listUsers(Model model) {
        List<User> user = userRepo.findAll();
        model.addAttribute("users", user);
        return "users";
    }
 
 @GetMapping("/deleteUser/{id}")
 public String delete(@PathVariable int id)
 {
	 userServ.deleteUser(id);
	 return "redirect:/registeredUsers";
 }
 @RequestMapping("/updateUser/{id}")
	public String edituser(@PathVariable int id,Model m)
	{
	 
	// Retrieve the product by ID and add it to the model
    Optional<User> user = userServ.userbyid(id);
    if (user.isPresent()) {
        User users = user.get();
        m.addAttribute("user", users);
        
        return "update-user";
    } else {
        // Handle the case where the product is not found (e.g., redirect or display an error)
        return "pnot"; 
        
    }// Create a "product-not-found.jsp" or choose an appropriate view
    }

    @PostMapping("/updateuSER/{id}/updateduser")
    public RedirectView updatee( @ModelAttribute User user)
    {
    
    	RedirectView redirectView=new RedirectView();
    	redirectView.setUrl("/registeredUsers");
       userServ.updatedUser(user);
    	return redirectView;
    }
	
	
    @GetMapping("/orders")
    public String listOrders(Model model) {
        List<Orders> orders = orderRepo.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }
//    @GetMapping("/viewUserOrders/{userId}")
//	 public String viewUserOrdersS(@PathVariable int userId, Model model) {
//	     // Implement logic to fetch and display user orders here
//	     // You can use the userId parameter to retrieve orders for the specific user
//	     Optional<Orders> userOrders = orderServ.getOrdersForUser(userId);
//	     
//	     // Add userOrders to the model so that you can display them in your JSP
//	     model.addAttribute("userOrders", userOrders);
//	     
//	     return "orders"; // Assuming your orders.jsp is named "orders.jsp"
//	 }
	
}
 