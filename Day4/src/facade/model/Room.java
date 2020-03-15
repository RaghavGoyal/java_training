package facade.model;

public class Room {
	private int rno;
	private RoomType type;
	private boolean vacant;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
	public boolean isVacant() {
		return vacant;
	}
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	public Room(int rno, RoomType type, boolean vacant) {
		super();
		this.rno = rno;
		this.type = type;
		this.vacant = vacant;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rno+" "+type+" "+vacant;
	}
	
	
}
