package Exception;

public class Division {
	
	public static void main(String args[]) {
		try {
			divide(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Check parameters!");
		}
		catch(ArithmeticException ae) {
			System.out.println("division by 0 is not allowed");
		}
		catch(Exception e) {
			System.out.println("better luck next time!");
		}
		
		//using throw
		try {
			throwNewEx();
		}
		catch(NumberFormatException nfe) {
			System.out.println("caught here !");
		}
		
	}
	
	static void divide(int a,int b) {
		System.out.println(a/b);
	}
	
	static void throwNewEx() {
		throw new NumberFormatException("Custom exception");
	}

}
