package com.cafe.service;

import java.util.Date;
import java.util.List;

import com.cafe.entity.Booking;

public interface BookingService {
	public Booking BookTableForUser(Long id,Long tableid);

	public List<Booking> GetAllTheBookingOfUser(Long id);
	public List<Booking> tablesBooked(Date date);


}
