package com.cafe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cust_id;
	
	@Column(name="username",nullable=false)
	private String username;
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="phone",nullable=false)
	private String phone;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long cust_id, String username, String password, String email, String phone) {
		super();
		this.cust_id = cust_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	

}
