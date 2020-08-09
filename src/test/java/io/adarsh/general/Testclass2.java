package io.adarsh.general;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import io.adarsh.helpers;

public class Testclass2 {
	//includes the test cases which is in same package	
	
	@Test
	@Tag("subtraction")
	
	void subtractionTest1() {
		helpers help = new helpers();
		assertEquals(0, help.sub(1, 1));
	}
	
	@Test
	@Tag("subtraction")
	void subtractionTest2() {
		helpers help = new helpers();
		assertEquals(-1, help.sub(1, 2));
	}
	
	
	@Test
	@Tag("subtraction")
	void subtractionTest3() {
		helpers help = new helpers();
		assertEquals(10, help.sub(20, 10));
	}
	
	@Test
	@Tag("subtraction")
	void subtractionTest4() {
		helpers help = new helpers();
		assertEquals(20, help.sub(40, 20));
	}
}
