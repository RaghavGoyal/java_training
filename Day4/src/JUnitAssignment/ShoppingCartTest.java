package JUnitAssignment;

import junit.framework.*;

//older JUNit implementation:

public class ShoppingCartTest extends TestCase {

    private ShoppingCart cart;
    private Product book1;
    private Product book2;
 
    protected void setUp() {
        System.out.println("setUp invokeed");
        cart= new ShoppingCart();

        book1 = new Product("Pragmatic Unit Testing", 29.95);
        book2 = new Product("HeadFirst Java", 56.89);
        cart.addItem(book1);
        cart.addItem(book2);
    }

     
    protected void tearDown() {
    	System.out.println("tearDown invokeed");  
    }

     
    public void testEmpty() {
        System.out.println("TestCase:testEmpty() invoked");
        cart.empty();
        assertEquals(0, cart.getItemCount());
    }
 
    public void testAddItem() {
         System.out.println("TestCase:testAddItem() invoked");
         Product book3 = new Product("Pragmatic Project Automation", 29.95);
         cart.addItem(book3);

        assertEquals(3, cart.getItemCount());

        double expectedBalance = book1.getPrice() + book2.getPrice()+ book3.getPrice();
        assertEquals(expectedBalance, cart.getBalance(), 0.0);
     }

     
    public void testRemoveItem() throws ProductNotFoundException {
    	System.out.println("TestCase:testremoveitem() invoked");
        cart.removeItem(book1);
        assertEquals(1, cart.getItemCount());
    }

    
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
    
     public static void main(String[] args) {
    	 
        junit.textui.TestRunner.run(ShoppingCartTest.class);
        
    }
}
