package com.sn;

public class Manager extends Employee{

	private String teamSize;

	public Manager(String empName, String empDept, String empincome, String teamSize) {
		super(empName, empDept, empincome);
		this.teamSize=teamSize;
	}
	
	

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", Name=" + getEmpName() + ", Dept=" + getEmpDept()
				+ ", income=" + getEmpincome() + "]";
	}



	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
