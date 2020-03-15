package DecoratorDemo;

public class PremiumDecorator extends BatchDecorator {

	Sale sale;
	
	PremiumDecorator(Sale sale) {
		super(sale);
		this.sale=sale;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getTotal() {
		return sale.getTotal()-(20.0/100.0*sale.getTotal());
	}

}
