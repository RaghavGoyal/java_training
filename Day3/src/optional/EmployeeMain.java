package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Address a1=new Address("abc","xyz","pqr","mno");
		Employee e1=new Employee("raghav",Optional.of(a1),"30,000");
		
		Employee e2=new Employee("ram",Optional.empty(),"30,000");
		
		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		
		empList.stream().forEach((p)-> System.out.printf("%s from %s %n ", p.getName(),p.getAddress().orElse(Address.EMPTY_ADDRESS)));
	}

}
