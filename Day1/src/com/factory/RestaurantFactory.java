package com.factory;

import java.io.FileInputStream;
import java.util.Properties;
import com.restaurant.IndianRestaurant;
import com.restaurant.ItalianRestaurant;
import com.restaurant.Restaurant;

public class RestaurantFactory {
	
	private static Properties p = new Properties();
	
	
	static {
		try {
			p.load(new FileInputStream("restaurantFactory.properties"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Restaurant createRestaurantObj(String type) {
		
		try {
			Class c = Class.forName(p.getProperty(type));
			return (Restaurant)c.newInstance();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
