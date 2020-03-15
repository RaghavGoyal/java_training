package com.sn;

public class Employee {

	private String empName;
	private String empDept;
	private String empincome;
	
	Employee(){
		System.out.println("into default constructor");
	}
	
	public Employee(String empName, String empDept, String empincome) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empincome = empincome;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDept=" + empDept + ", empincome=" + empincome + "]";
	}



	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpincome() {
		return empincome;
	}
	public void setEmpincome(String empincome) {
		this.empincome = empincome;
	}
	
}
