package collectionDemoType1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ArrayList<Employee> empArray=new ArrayList<>();
		
		empArray.add(new Employee(1,"Raghav",20));
		empArray.add(new Employee(2,"aghav",20));
		empArray.add(new Employee(3,"Aaaghav",20));
		empArray.add(new Employee(4,"Ahav",20));
		empArray.add(new Employee(5,"Madhav",20));
		
		Collections.sort(empArray,new NameComp(){
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Object obj:empArray) {
			System.out.println(obj);
		}
		
		Collections.sort(empArray,(Employee e1, Employee e2)-> e1.getName().compareTo(e2.getName()));
		
		for(Object obj:empArray) {
			System.out.println(obj);
		}
		
		

	}

}
