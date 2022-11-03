package com.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pos.model.FoodBean;
import com.pos.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	@GetMapping("/getFood")
	public List<FoodBean> sayHello()
	{
		return foodService.getFood();
	}
	@PostMapping("/foodadd" )
	public FoodBean addFood(@RequestBody FoodBean foodBean)
	{
		return foodService.addFood(foodBean);
	}

}
