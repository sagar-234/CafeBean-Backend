package com.cafe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="coffee")

public class Coffee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="coffee_id",nullable=false)
	private Long coffee_id;
	
	@Column(name="coffee_type",nullable=false)
	private String coffee_type;
	
	@Column(name="coffee_price",nullable=false)
	private Long price;

	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coffee(Long coffee_id, String coffee_type, Long price) {
		super();
		this.coffee_id = coffee_id;
		this.coffee_type = coffee_type;
		this.price = price;
	}

	public Long getCoffee_id() {
		return coffee_id;
	}

	public void setCoffee_id(Long coffee_id) {
		this.coffee_id = coffee_id;
	}

	public String getCoffee_type() {
		return coffee_type;
	}

	public void setCoffee_type(String coffee_type) {
		this.coffee_type = coffee_type;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	

	
	

}
