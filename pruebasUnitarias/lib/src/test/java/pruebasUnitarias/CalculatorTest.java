package pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test
	void adition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	
	@Test
	void Resta() {
		assertEquals(8, calculator.subtractNumbers(18, 10));
	}
	@Test
	void multiplicacion() {
		assertEquals(8, calculator.multiplyNumbers(4, 2));
	}
	@Test
	void Division() {
		assertEquals(1, calculator.divideNumbers(5, 5));
	}

}
