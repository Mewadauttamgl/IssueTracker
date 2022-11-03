package com.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.model.FoodBean;
@Repository
public interface FoodRepo extends JpaRepository<FoodBean, Integer>
{

}
