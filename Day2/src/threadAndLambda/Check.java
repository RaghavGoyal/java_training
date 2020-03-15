package threadAndLambda;

public class Check extends Thread {
	
	public static void main(String[] args) {
		
	 new Thread(()->System.out.println("Task #1 is running")).start();
	 
}
}
