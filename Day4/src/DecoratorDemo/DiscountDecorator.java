package DecoratorDemo;

public class DiscountDecorator extends SaleDecorator {

	Sale sale;
	
	DiscountDecorator(Sale sale){
		super();
		this.sale=sale;
	}
//	public DiscountDecorator(int noOfProducts, double saleAmount) {
//		super(noOfProducts, saleAmount);
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public double getTotal() {
		return sale.getTotal()-(5.0/100.0*sale.getTotal());
	}
	
	

}
