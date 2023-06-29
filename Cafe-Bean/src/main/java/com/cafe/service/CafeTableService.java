package com.cafe.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.cafe.entity.Booking;
import com.cafe.entity.CafeTable;

public interface CafeTableService {

	

	CafeTable cafeTableByID(Long cafeTableID);

	CafeTable createcafeTable(CafeTable cafeTable);


	List<CafeTable> getallCafeTable();

	CafeTable updateCafeTable(CafeTable cafeTable);
	
	public List<CafeTable>availableTables(List<Long>arr);

	
	

}
