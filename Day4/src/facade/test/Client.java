package facade.test;

import facade.test.HotelFacade;
import facade.model.RoomType;

public class Client {
	public static void main(String arg[]){
		HotelFacade facade=new HotelFacade();
		facade.displayAvailableRooms();
		
		System.out.println(facade.reserve(RoomType.DOUBLE));
		System.out.println(facade.reserve(RoomType.SINGLE));
		System.out.println(facade.reserve(RoomType.DOUBLE));
		System.out.println(facade.reserve(RoomType.SINGLE));
		System.out.println(facade.reserve(RoomType.DOUBLE));
		System.out.println(facade.reserve(RoomType.SINGLE));
		facade.displayAvailableRooms();
		
	}
}
