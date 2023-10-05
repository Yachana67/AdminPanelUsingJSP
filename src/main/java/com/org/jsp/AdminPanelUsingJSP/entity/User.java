package com.org.jsp.AdminPanelUsingJSP.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import antlr.collections.List;
import ch.qos.logback.core.status.Status;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String f_name;
	private String l_name;
	private String phone_no;
	private String password;
	@Column(name = "email", unique = true)
    private String email;
	
	@Enumerated(EnumType.ORDINAL)
	private com.org.jsp.AdminPanelUsingJSP.entity.Status status;
	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
    private java.util.List<Address> address;
	
	@OneToMany(targetEntity = Orders.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	 private java.util.List<Orders> orders;
	public com.org.jsp.AdminPanelUsingJSP.entity.Status getStatus() {
		return status;
	}
	public void setStatus(com.org.jsp.AdminPanelUsingJSP.entity.Status status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
