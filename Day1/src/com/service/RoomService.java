package com.service;

import com.restaurant.Restaurant;

public class RoomService{
	
	private Restaurant restaurant;
	
	public RoomService(Restaurant restaurant){
		super();
		this.restaurant=restaurant;
	}
	
	public void roomService(String order) {
	  restaurant.cook(order);
	}

}
