package ImperativeVSDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,5,6,7,7,7,8,9,9,9));
		
		//imperative style:
		
		List<Integer> unique1=new ArrayList<>();
		for(Integer i:list) {
			if(!unique1.contains(i)) {
				unique1.add(i);
			}
		}
		System.out.println(unique1);
		
		
		//Declarative:
//		List<Integer> unique2=list.stream().distinct().collect(toList());
//		System.out.println(unique2);
	}
	

}
