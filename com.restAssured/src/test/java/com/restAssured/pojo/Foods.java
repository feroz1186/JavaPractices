package com.restAssured.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Foods {
	
	public static void main(String[] args) throws JsonProcessingException {
		FoodProduct fp = new FoodProduct();
		fp.setId("0001");
		fp.setName("cake");
		fp.setType("donut");
		fp.setPpu(0.55);
		Batters bat= new Batters();
		
		BattersList bl1 = new BattersList();
		bl1.setId("1001");
		bl1.setType("Regular");
		
		BattersList bl2 = new BattersList();
		bl2.setId("1002");
		bl2.setType("chocolate");
		
		BattersList bl3 = new BattersList();
		bl3.setId("1003");
		bl3.setType("Blueberry");
		
		BattersList bl4 = new BattersList();
		bl4.setId("1004");
		bl4.setType("Devils Food");
		
		List<BattersList> bl = new  ArrayList<>();
		bl.add(bl1);
		bl.add(bl2);
		bl.add(bl3);
		bl.add(bl4);
		
		bat.setBattersList(bl);
		fp.setBatters(bat);
		
		Topping topping1 = new Topping();
		topping1.setId("5001");
		topping1.setType("None");
		
		Topping topping2 = new Topping();
		topping2.setId("5002");
		topping2.setType("Glazed");
		
		Topping topping3 = new Topping();
		topping3.setId("5003");
		topping3.setType("Sugar");
		
		Topping topping4 = new Topping();
		topping4.setId("5004");
		topping4.setType("powdered sugar");
		
		Topping topping5 = new Topping();
		topping5.setId("5005");
		topping5.setType("chocote with sprinkles");
		
		Topping topping6 = new Topping();
		topping6.setId("5006");
		topping6.setType("chocolate");
		
		List<Topping> toplist = new ArrayList<>();
		toplist.add(topping1);
		toplist.add(topping2);
		toplist.add(topping3);
		toplist.add(topping4);
		toplist.add(topping5);
		toplist.add(topping6);
		
		fp.setTopping(toplist);
		
		System.out.println("Result : "+fp.toString());
		
		ObjectMapper mapper = new ObjectMapper();
		String abc=mapper.writeValueAsString(fp);
		
		System.out.println("Result : "+abc);
		//==============================================
		
		
		
	}

}
