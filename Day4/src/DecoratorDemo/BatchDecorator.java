package DecoratorDemo;

public class BatchDecorator extends SaleDecorator {
	
	Sale sale;
	
	BatchDecorator(Sale sale){
		super();
		this.sale=sale;
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		if(sale.getNoOfProducts()>10)
			return sale.getTotal()-10;
		return sale.getTotal();
	}
	
	public int getNoOfProducts() {
		return sale.getNoOfProducts();
	}
	

}
