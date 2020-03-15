package StreamAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
	
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		
		productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
    
       System.out.println( productsList.stream()
    		   							.filter((p)->p.getPrice()>40000f)
    		   							.collect(Collectors.toList()));
       System.out.println();
       
       System.out.println(productsList.stream().filter((p)->p.getPrice()>30000f).count());
       
       System.out.println();
       
//      System.out.println(productA.price);  
//      // min() method to get min Product price  
//       Product productB = productsList.stream()  
//                                      .max((product1, product2)-> product1.price < product2.price ? 1: -1)
//                                      .get();  
//       System.out.println(productB.price);      
//    }  
//    }  
	}

}
