package JUnitAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//implementation from/after junit5

class ShoppingCartTest2 {

	ShoppingCart cart= new ShoppingCart();
	Product book1,book2;
	
	 @BeforeEach
     void setup() {
       System.out.println("setUp invokeed");
       book1 = new Product("Pragmatic Unit Testing", 29.95);
       book2 = new Product("HeadFirst Java", 56.89);
       cart.addItem(book1);
       cart.addItem(book2);
     }
	 
	 @Test
	 public void testEmpty() {
         System.out.println("TestCase:testEmpty() invoked");
		 cart.empty();
         assertEquals(0, cart.getItemCount());
	 }

	 @Test
	 public void testAddItem() {
         System.out.println("TestCase:testAddItem() invoked");
         Product book3 = new Product("Pragmatic Project Automation", 29.95);
         cart.addItem(book3);

         assertEquals(3, cart.getItemCount());

         double expectedBalance = book1.getPrice() + book2.getPrice()+ book3.getPrice();
         assertEquals(expectedBalance, cart.getBalance(), 0.0);
	 }


	 @Test
	 public void testRemoveItem() throws ProductNotFoundException {
		 System.out.println("TestCase:testremoveitem() invoked");
		 cart.removeItem(book1);
 
		 assertEquals(1, cart.getItemCount());
	 }

	 @Test
	 public void testRemoveItemNotInCart() {
          System.out.println("TestCase:testRemoveItemNotInCart() invoked");
          try {
        	  Product book3 = new Product("Pragmatic Version Control", 29.95);
        	  cart.removeItem(book3);
        	  fail("Should raise a ProductNotFoundException");
          } 
          catch(ProductNotFoundException expected) {
        	  System.out.println("exception");
          }
	}
	
	 @AfterEach
     void end(){
    	 System.out.println("tearDown invokeed");
     }

}
