package com.sn;

public class Fresher extends Employee {
	
	private String collg;
	private String technology;
	
	public Fresher(String empName, String empDept, String empincome, String collg, String technology) {
		super(empName, empDept, empincome);
		this.collg=collg;
		this.technology=technology;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Fresher [collg=" + collg + ", technology=" + technology + ", EmpName:" + getEmpName()
				+ ", Dept=" + getEmpDept() + ", income=" + getEmpincome() +  "]";
	}



	public String getCollg() {
		return collg;
	}
	public void setCollg(String collg) {
		this.collg = collg;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
	

}
