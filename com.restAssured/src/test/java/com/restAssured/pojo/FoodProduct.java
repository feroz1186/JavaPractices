package com.restAssured.pojo;

import java.util.List;

import lombok.Data;

@Data
public class FoodProduct {
	
	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batters;
	private List<Topping> topping;
	

}
