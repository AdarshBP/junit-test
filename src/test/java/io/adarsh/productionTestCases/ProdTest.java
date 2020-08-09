package io.adarsh.productionTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import io.adarsh.helpers;


public class ProdTest {
	
	@Test
	@Tag("PROD")
	@Tag("calculation")
	void addProduction() {
		helpers help = new helpers();
		assertEquals(2, help.add(1, 1));
	}
	
	@Test
	@Tag("PROD")
	@Tag("calculation")
	void multiProduction () {
		helpers help = new helpers();
		assertEquals(-1, help.multi(1, -1));
	}
	


}
