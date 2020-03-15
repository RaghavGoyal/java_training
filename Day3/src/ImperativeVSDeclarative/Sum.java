package ImperativeVSDeclarative;

import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imperative approach.
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//declarative approach:
		int sum2 = IntStream.rangeClosed(0,100).map(Integer::new).sum();
		
		System.out.println(sum2);
		
		
		

	}

}
