package Lambda;

public class workerImpl {
	
	static public void execute(worker obj) {
		obj.doSomeWork();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		execute(new worker() {
			@Override
			public void doSomeWork() {
				System.out.println("worker doing work through anonymous class.");
			}
		});
		
		execute(()->System.out.println("worker working through  lambda expression"));
		
	}

}
