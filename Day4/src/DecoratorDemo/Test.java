package DecoratorDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sale sale=new Sale(15,20000);
		
		sale=new DiscountDecorator(sale);
		sale=new BatchDecorator(sale);
		sale=new PremiumDecorator(sale);
		
		System.out.println(sale.getTotal());

	}

}
