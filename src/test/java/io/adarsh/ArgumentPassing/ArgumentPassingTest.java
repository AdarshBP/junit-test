package io.adarsh.ArgumentPassing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import io.adarsh.helpers;


public class ArgumentPassingTest {

	
	
	
	@Test
	void passdatat() {
		helpers help = new helpers();
		assertEquals(3, help.add(1, 2), "Addition test case got failed ");
	}
	
	
	
	
	@ParameterizedTest
	@Tag("passingParameter")
	@MethodSource("gettheData")
	 void  multiByPassingData(int result , int num1 ,int num2) {
		System.out.println(num1 +" + "+ num2 +" = "+result);
		helpers help = new helpers();
		assertEquals(result, help.add(num1, num2));
	}
	
	private static Stream<Arguments> gettheData()
	{
		return Stream.of(Arguments.of(3,1,2));
			
	}
}



