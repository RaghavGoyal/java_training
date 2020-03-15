package com.sn;

public class EmployeeMain {
	
	public static void main(String args[]) {

//		Employee emp = new Employee();
//		Employee emp2 = new Employee("raghav","CSE","30,000");
//		
//		emp.setEmpName("Raghav");
//		emp.setEmpDept("CS");
//		emp.setEmpincome("20000");
//		
//		System.out.println(emp.getEmpName());
//		System.out.println(emp.getEmpDept());
//		System.out.println(emp.getEmpincome());
//		
//		System.out.println(emp2);
//		
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		
//		emp=emp2;
//		
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		emp2=null;
//		System.out.println(emp2.hashCode());
		
		Manager m1=new Manager("ABC","dept1","100k", "40");
		Fresher f1=new Fresher("Raghav","CSE","30k", "GLB","JAVA");
		
		System.out.println(m1);
		System.out.println(f1);
		
	}

}
