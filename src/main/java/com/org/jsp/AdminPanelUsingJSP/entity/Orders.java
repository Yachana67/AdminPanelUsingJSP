package com.org.jsp.AdminPanelUsingJSP.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 @ManyToOne
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;
	 @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	 @JoinColumn(name = "address_id")
	 private Address address;
	
	
	 

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Lob
	    private String prod_data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public String getProd_data() {
		return prod_data;
	}

	public void setProd_data(String prod_data) {
		this.prod_data = prod_data;
	}
	
	
	
	
}
