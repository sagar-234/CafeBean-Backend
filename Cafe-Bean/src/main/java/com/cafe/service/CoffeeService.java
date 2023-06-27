package com.cafe.service;

import java.util.List;

import com.cafe.entity.Coffee;

public interface CoffeeService {


	Coffee createcoffee(Coffee coffee);

	Coffee updateCoffee(Coffee coffee);

	List<Coffee> getallCoffee();

	Coffee getCoffeByID(Long coffeeID);

}
