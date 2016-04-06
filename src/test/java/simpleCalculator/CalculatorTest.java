package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}

}
