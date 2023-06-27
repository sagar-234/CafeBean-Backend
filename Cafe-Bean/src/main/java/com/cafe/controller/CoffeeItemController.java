package com.cafe.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.entity.Coffee;
import com.cafe.entity.CoffeeItem;
import com.cafe.service.CoffeeItemService;

@RequestMapping("CoffeeItem-rest")
@RestController
public class CoffeeItemController {
	
	@Autowired
	CoffeeItemService coffeeitemservice;
	
	private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@GetMapping("/fetch/{id}")
	public List<CoffeeItem>getByUser(@PathVariable Long id)
	{
		logger.info("Getting list of CoffeItem based on user");
		return coffeeitemservice.getByUser(id);
	}
	
	@GetMapping("/getPrice/{id}")
	public Long getByUserPrice(@PathVariable Long id)
	{
		logger.info("Getting price by Id");
		return coffeeitemservice.amountForUserBooking(id);
	}
	
	@PostMapping("/addCoffee/{id}")
	public void addCoffee(@PathVariable Long id,@RequestBody Coffee coffee)
	{
		 logger.info("Adding a coffee Item");
		 coffeeitemservice.addCoffee(id, coffee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCoffeeItem(@PathVariable long id)
	{
		logger.info("Deleting coffeeItem");
		coffeeitemservice.deleteCoffeItem(id);
	}
}
