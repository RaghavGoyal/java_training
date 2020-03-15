package facade.test;
import java.util.List;

import facade.model.HotelSearchService;
import facade.model.Room;
import facade.model.RoomType;


public class HotelFacade {
	HotelSearchService service;
	
	public HotelFacade() {
		super();
		service=new HotelSearchService();
		for(int i=0;i<20;i++)
			if(i%2==0)
				service.addRoom(new Room(i+1,RoomType.SINGLE,true));
			else
				service.addRoom(new Room(i+1,RoomType.DOUBLE,true));
		// TODO Auto-generated constructor stub
	}

	public String reserve(RoomType rt){
		List<Room>r=service.search(rt);
		if(r.size()>0)
		{
			service.reserve(r.get(0).getRno());
			return "success";
		}
		else
			return "failure";
		
	}
	public void displayAvailableRooms(){
		System.out.println(service.search(RoomType.SINGLE));
		System.out.println(service.search(RoomType.DOUBLE));
		
	}
}
