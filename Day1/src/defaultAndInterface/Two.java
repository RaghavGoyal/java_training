package defaultAndInterface;

public interface Two {
	
	default public void sayHello() {
		System.out.println("hello from interface two");
	}
	
	static public void sayBye() {
		System.out.println("Bye from interface two");
	}

}
