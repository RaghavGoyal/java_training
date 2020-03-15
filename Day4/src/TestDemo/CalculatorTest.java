package TestDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setup() {
		System.out.println("Setup complete");
	}
	
	//@DisplayName(" ")
	//@RepeatedTest()
	//@Disabled(" ")
	//@Tag(" ")
	//@IncludeTags(" ")
	//@ExcludeTags(" ")
	
	
	@BeforeEach
	void individualBefore() {
		System.out.println("New Test About to begin");
	}
	
	
	@Test
	public void addTest() {
		Calculator calcObj=new Calculator();
		assertEquals(20, calcObj.add(10, 10));
	}
	
	@Test
	public void addTest2() {
		Calculator calcObj=new Calculator();
		assertEquals(0, calcObj.add(0, 0));
	}
	
	@Test
	public void addTest3() {
		Calculator calcObj=new Calculator();
		assertEquals(10, calcObj.add(10, 0));
	}
	
	@AfterEach
	void individualAfter() {
		System.out.println("test Completed");
	}
	
	@AfterAll
	static void cleanUp() {
		System.out.println("All Tests completed");
	}

}
