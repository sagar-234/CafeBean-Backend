 package com.cafe.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_id",nullable=false)
	private Long booking_id;
	
	@Column(name="Table_id",nullable=false)
	private Long Table_id;
	
	@Column(name="cust_id",nullable=false)
	private Long custid;
	
	@Column(name="Amount",nullable=false)
	private Long Amount;
	
	
	
	@Temporal(TemporalType.DATE)
	private Date bookingdate;
	
	@Temporal(TemporalType.DATE)
	private Date bookingtime;
	
	@Temporal(TemporalType.DATE)
	private Date duration;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Long booking_id, Long table_id, Long custid, Long amount, Date bookingdate, Date bookingtime,
			Date duration) {
		super();
		this.booking_id = booking_id;
		Table_id = table_id;
		this.custid = custid;
		Amount = amount;
		this.bookingdate = bookingdate;
		this.bookingtime = bookingtime;
		this.duration = duration;
	}

	public Long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}

	public Long getTable_id() {
		return Table_id;
	}

	public void setTable_id(Long table_id) {
		Table_id = table_id;
	}

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public Long getAmount() {
		return Amount;
	}

	public void setAmount(Long amount) {
		Amount = amount;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public Date getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(Date bookingtime) {
		this.bookingtime = bookingtime;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	
	

}
