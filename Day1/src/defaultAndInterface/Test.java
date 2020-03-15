package defaultAndInterface;

public class Test implements One {

//	@Override
//	public void sayHello() {
//		// TODO Auto-generated method stub
//		System.out.println("hello from child");
//	}
	
	public static void main(String args[]) {
		Test obj = new Test();
		obj.sayHello();
		One.sayBye();
	}
}
