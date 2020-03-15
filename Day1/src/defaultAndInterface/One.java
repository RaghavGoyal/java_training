package defaultAndInterface;

public interface One {
	
	default public void sayHello() {
		System.out.println("hello from interface one");
	}
	
	static public void sayBye() {
		System.out.println("Bye from interface one");
	}

}
