package collectionDemoType1;

import java.util.Collections;
import java.util.Comparator;

public class NameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
