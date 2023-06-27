package com.cafe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cafeTable")
public class CafeTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long tableId;
	
	@Column(name = "capacity",nullable=false)
	private Integer seatingCapacity;

	public CafeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CafeTable(Long tableId, Integer seatingCapacity) {
		super();
		this.tableId = tableId;
		this.seatingCapacity = seatingCapacity;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	 
	
	
	

}
