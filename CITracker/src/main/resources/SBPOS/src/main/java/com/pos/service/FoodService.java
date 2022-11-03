package com.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.model.FoodBean;
import com.pos.repo.FoodRepo;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepo foodRepo;
	
	public FoodBean addFood(FoodBean foodBean)
	{
		return foodRepo.save(foodBean);
	}
	
	public List<FoodBean >getFood()
	{
		return foodRepo.findAll();
	}

}
