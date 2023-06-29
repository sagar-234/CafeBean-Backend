package com.cafe.service;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import com.cafe.dto.BookingDto;
import com.cafe.entity.Booking;
import com.cafe.entity.CafeTable;

public interface BookingService {
	public Booking BookTableForUser(BookingDto booking);

	public List<Booking> GetAllTheBookingOfUser(Long id);

	public List<Long> GetAvailableTables(Date BookingDate,LocalTime time);

}
