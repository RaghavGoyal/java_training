package optional;

import java.util.Optional;

public class Employee {
	
	private String name;
	private Optional<Address> address;
	private String salary;
	
	public Employee(String name, Optional<Address> address, String salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	

}
