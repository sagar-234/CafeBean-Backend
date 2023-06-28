package com.cafe.controller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.entity.Booking;
import com.cafe.entity.CafeTable;
import com.cafe.service.CafeTableService;


@CrossOrigin("*")
@RequestMapping("cafeTable-rest")
@RestController
public class CafeTableController {
	@Autowired
	CafeTableService cafeTableservice;
	
	private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@GetMapping("/fetch")
	public ResponseEntity<List<CafeTable>> getCafeTable()
	{
		logger.info("Fetching List of CafeTables");
		return  new ResponseEntity<List<CafeTable>>(cafeTableservice.getallCafeTable(),HttpStatus.OK);
	}
	@GetMapping("/fetch/{id}")
	public ResponseEntity<CafeTable> getCafeTableByID(@PathVariable Long id)
	{
		logger.info("Fetching a particular Cafetable according to id");
		return  new ResponseEntity<CafeTable>(cafeTableservice.cafeTableByID(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateCafeTable")
	public void updateCafeTable(@RequestBody CafeTable cafeTable)
	{
		logger.info("Updating CafeTables");
		cafeTableservice.updateCafeTable(cafeTable);
	}
	@PostMapping("/createCafeTable")
	public void createCafeTable(@RequestBody CafeTable cafeTable)
	{
		logger.info("Creating cafeTables");
		cafeTableservice.createcafeTable(cafeTable);
	}
}
