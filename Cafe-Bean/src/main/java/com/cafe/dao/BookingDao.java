package com.cafe.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cafe.entity.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long>{

	List<Booking> findBycustid(Long id);

	
	List<Booking> findByBookingdate(Date date);

	
	
}