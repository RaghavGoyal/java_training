package optional;

public class Address {
	public static final Address EMPTY_ADDRESS=new Address("","","","");
	
	private String houseNo;
	private String colony;
	private String area;
	private String landmark;
	
	public Address(String houseNo, String colony, String area, String landmark) {
		super();
		this.houseNo = houseNo;
		this.colony = colony;
		this.area = area;
		this.landmark = landmark;
	}
	
	

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", colony=" + colony + ", area=" + area + ", landmark=" + landmark + "]";
	}



	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	
	
	
	

}
