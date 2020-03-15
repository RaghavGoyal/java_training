package ImperativeVSDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
	public static void main(String[] args) {
		List<String> names= new ArrayList<>(Arrays.asList("Raghav","Rohan","Aman","Amit","abcd"));
		
		names.stream()
			.filter((s)->s.startsWith("A")||s.startsWith("a"))
			.forEach(System.out::println);
		
		System.out.println();
		
		names.stream()
			.filter((s)->s.startsWith("A"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		System.out.println();
		
		names.stream()
			.sorted()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println(names.stream()
				.sorted()
				.map(String::toUpperCase)
				.collect(Collectors.toList()));
		
		System.out.println();
	}

}
