package com.cafe.service;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.dao.BookingDao;
import com.cafe.dao.CoffeeItemDao;
import com.cafe.dto.BookingDto;
import com.cafe.entity.Booking;
import com.cafe.entity.CafeTable;
import com.cafe.exception.ResourceNotFoundException;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	CoffeeItemService coffeeitemservice;
	
	
	
	
	@Autowired
	BookingDao bookingdao;
	public Booking BookTableForUser(BookingDto booking) {
		
     Booking booked=new Booking();
     
     //long price=coffeeitemservice.amountForUserBooking(id);
    	 
     
     booked.setAmount(booking.getAmount());
     booked.setCustid(booking.getCustid());
     booked.setTable_id(booking.getTable_id());
     
     booked.setBookingdate(booking.getBookingdate());
     booked.setStartTimeField(booking.getStartTimeField());
     booked.setEndTimeField(booking.getEndTimeField());
     
     
     Booking b= bookingdao.save(booked);
     
     //coffeeitemservice.getByUser(id).stream().forEach(c->coffeeitemservice.deleteCoffeItem(c.getCoffeeItemId()));
 	
 	return b;
     

     
	}
	
	public List<Booking> GetAllTheBookingOfUser(Long id) {
		
	    return bookingdao.findBycustid(id);
	     
		}
	
	
	public List<Long> GetAvailableTables(Date BookingDate,LocalTime time)
	{
		
		List<Long>tableIds=bookingdao.findByBookingdateAndStartTimeField(BookingDate,time).stream().map(i->i.getTable_id()).collect(Collectors.toList());
		
		//System.out.print(tableIds);
		
		return tableIds;
		
	}

	
	
	

	

}
