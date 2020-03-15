package Predicate;

import java.util.ArrayList;
import java.util.List;
import ParallelStream.Employee;

public class EmployeePredicateMain {
	
	static List<Employee> employeeList = new ArrayList<>();
	
	static {
		
		employeeList.add(new Employee(1,"employee1",20,18,"M"));
		employeeList.add(new Employee(2,"employee2",20,22,"f"));
		employeeList.add(new Employee(3,"employee3",20,34,"M"));
		employeeList.add(new Employee(4,"employee4",20,32,"f"));
		employeeList.add(new Employee(5,"employee5",20,28,"M"));
		employeeList.add(new Employee(6,"employee6",20,18,"M"));
		employeeList.add(new Employee(7,"employee7",20,22,"f"));
		employeeList.add(new Employee(8,"employee8",20,25,"M"));
		employeeList.add(new Employee(9,"employee9",20,48,"f"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultMale()));
		System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultFemale()));
		System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAgeMoreThan(28).negate()));
		

	}

}
