package com.cafe.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.entity.Booking;
import com.cafe.service.BookingService;

@RequestMapping("Booking-rest")
@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingservice;
	
	private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@PostMapping("/addBooking/{id}/{tableid}")
	public Booking addBooking(@PathVariable long id,@PathVariable long tableid)
	{
		logger.info("Creating a new Booking");
		return bookingservice.BookTableForUser(id,tableid);
	}
	@GetMapping("/fetch/{id}")
	public List<Booking> getAllBookingsOfUser(@PathVariable long id)
	{
		logger.info("Retrieving List of Bookings of a User");
		return bookingservice.GetAllTheBookingOfUser(id);
	}
	
	@GetMapping("/getBookedTables")
	public List<Booking> getBookings(@RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") Date date){
		logger.info("Retrieving all Bookings");
		return bookingservice.tablesBooked(date);
	}
}