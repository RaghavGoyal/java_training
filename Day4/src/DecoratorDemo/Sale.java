package DecoratorDemo;

public class Sale {
	private int noOfProducts;
	private double saleAmount;
	
	Sale(){
		
	}
	
	Sale(int noOfProducts, double saleAmount){
		super();
		this.noOfProducts = noOfProducts;
		this.saleAmount = saleAmount;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}
	
	public double getTotal() {
		return saleAmount;
	}
	

}
