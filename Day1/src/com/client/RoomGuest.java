package com.client;

import com.factory.RestaurantFactory;
import com.restaurant.IndianRestaurant;
import com.restaurant.ItalianRestaurant;
import com.service.RoomService;

public class RoomGuest {
	public static void main(String args[]) {
		//using service only:
		
		RoomService rs = new RoomService(new IndianRestaurant());
		rs.roomService("Dosa");
		
		RoomService rs2 = new RoomService(new ItalianRestaurant());
		rs2.roomService("Pasta");
		
		//using factory method:
		
		RoomService rs3 = new RoomService(RestaurantFactory.createRestaurantObj("in"));
		rs.roomService("Dosa");
		
		RoomService rs4 = new RoomService(RestaurantFactory.createRestaurantObj("it"));
		rs2.roomService("Pasta");

		
	}

}
