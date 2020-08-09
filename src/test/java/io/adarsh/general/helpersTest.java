package io.adarsh.general;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import io.adarsh.helpers;





public class helpersTest {

	private helpers help;

	@BeforeAll
	static void initFirst() {
		System.out.println("Test Suite Started");
	}

	@AfterAll
	static void tearDown() {
		System.out.println("Test Suite Ended ");
	}

	@BeforeEach
	void initEach() {
		help = new helpers();
	}

	@Test
	@Tag("calculation")
	void addTest() {
		assertEquals(3, help.add(1, 2), "Addition test case got failed ");
	}

	@Test
	@Tag("calculation")
	void subtractionTest() {
		assertEquals(1, help.sub(2, 1));
	}

	@Test
	@Tag("calculation")
	void DivideTest() {
		assertThrows(ArithmeticException.class, () -> help.div(1, 0), "Divide By Zero is not possible");
	}

	@Test
	@Tag("String")
	void Divide() {
		assertEquals("adarsh", "adarsh");
	}

	@Nested
	@Tag("calculation")
	@DisplayName("Nested group of add method")
	class AddTest {
		@Test
		void AddingTwoPositives() {
			assertEquals(2, help.add(1, 1), "Add method should return the sum of two numbers");
		}

		@Test
		void AddingTwoNegatives() {
			assertEquals(-2, help.add(-1, -1), "Add method should return the sum of two numbers");
		}

		@Test
		void AddingAPositiveAndANegative() {
			assertEquals(0, help.add(-1, 1), "Add method should return the sum of two numbers");
		}
	}

	@Test
	@DisplayName("Disabled Test case")
	@Tag("calculation")
	@Disabled
	void Disbaled() {
		System.out.println("This block will be not execute it is disabled");
	}

	@Test
	@DisplayName("Assume Test case")
	@Tag("calculation")
	void Assume() {
		assumeTrue(false);
		System.out.println("This block will be not execute");
	}
	
	
	
	

}
