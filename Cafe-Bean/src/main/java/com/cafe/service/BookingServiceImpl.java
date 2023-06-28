package com.cafe.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.dao.BookingDao;
import com.cafe.dao.CoffeeItemDao;
import com.cafe.entity.Booking;
import com.cafe.exception.ResourceNotFoundException;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	CoffeeItemService coffeeitemservice;
	
	
	
	
	@Autowired
	BookingDao bookingdao;
	public Booking BookTableForUser(Long id,Long tableid) {
		
     Booking booked=new Booking();
     
     long price=coffeeitemservice.amountForUserBooking(id);
    	 
     
     booked.setAmount(price);
     booked.setCustid(id);
     booked.setTable_id(tableid);
     
     booked.setBookingdate(Calendar.getInstance().getTime());
     //booked.setBookingtime(null);
     //booked.setDuration(Calendar.getInstance().getTime());
     
     
     Booking b= bookingdao.save(booked);
     
     coffeeitemservice.getByUser(id).stream().forEach(c->coffeeitemservice.deleteCoffeItem(c.getCoffeeItemId()));
 	
 	return b;
     

     
	}
	
	public List<Booking> GetAllTheBookingOfUser(Long id) {
		
	    return bookingdao.findBycustid(id);
	     
		}
	
	
	public List<Booking> tablesBooked(Date date)
	{
		return bookingdao.findByBookingdate(date);
	}

	

}
