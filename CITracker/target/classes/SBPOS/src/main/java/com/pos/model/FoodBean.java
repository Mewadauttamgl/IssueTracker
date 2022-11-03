package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pos_tbl_food")
public class FoodBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer foodId;
	private String name;
	private String type;
	private String foodsize;
	private int quantity;
	private float price;
}
