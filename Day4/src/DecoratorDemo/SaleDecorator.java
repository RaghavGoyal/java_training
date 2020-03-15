package DecoratorDemo;

public abstract class SaleDecorator extends Sale {

//	public SaleDecorator(int noOfProducts, double saleAmount) {
//		super(noOfProducts, saleAmount);
//		// TODO Auto-generated constructor stub
//	}

	public abstract double getTotal();
}
