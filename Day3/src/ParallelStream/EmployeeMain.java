package ParallelStream;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> empArray=new ArrayList<>();
		
		empArray.add(new Employee(1,"Raghav",20));
		empArray.add(new Employee(2,"aghav",20));
		empArray.add(new Employee(3,"Aaaghav",20));
		empArray.add(new Employee(4,"Ahav",20));
		empArray.add(new Employee(5,"Madhav",20));
		
		long t1 = System.currentTimeMillis();
		System.out.println(empArray.stream().filter(emp->emp.getSalary()>15).count());
		long t2 = System.currentTimeMillis();
		System.out.println("series time taken: "+ (t2-t1));
		
		long t3 = System.currentTimeMillis();
		System.out.println(empArray.parallelStream().filter(emp->emp.getSalary()>15).count());
		long t4 = System.currentTimeMillis();
		System.out.println("Parallel time taken: "+ (t4-t3));
		
		empArray.forEach(e -> System.out.println(e.getSalary()));
		System.out.println("doubled salary:");
		empArray.forEach(e -> System.out.println(e.getSalary() * 2));
	}

}
