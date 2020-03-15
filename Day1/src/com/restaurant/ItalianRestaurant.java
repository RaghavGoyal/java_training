package com.restaurant;

public class ItalianRestaurant implements Restaurant {
	
	@Override
	public void cook(String item) {
		// TODO Auto-generated method stub
		System.out.println("Italian dish: "+ item +" is being cooked.");
		
	}

}
