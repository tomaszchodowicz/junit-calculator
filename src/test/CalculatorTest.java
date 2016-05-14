package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();		
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void sumTest1() throws Exception {
		System.out.println("Metoda testowa");
		double a = 25.45;
		double b = 13.23;
		double result = classUnderTest.sum(a, b);
		assertEquals(38.68, result, 0.00000001);
	}
	
	@Test
	public void testSumowanieTrzech() throws Exception {
		double a = 25.45;
		double b = 13.23;
		double c = 2.12;
		double result = classUnderTest.sum(a, classUnderTest.sum(b, c));
		assertEquals(40.8, result, 0.00000001);
	}
	
	@Test
	public void subtractTest() throws Exception {
		double a = 25.45;
		double b = 13.23;		
		double result = classUnderTest.subtract(a, b);
		assertEquals(12.22, result, 0.00000001);
	}
	
	@Test
	public void multiplyTest() throws Exception {
		double a = 25.45;
		double b = 13.23;		
		double result = classUnderTest.multiply(a, b);
		assertEquals(336.7035, result, 0.00000001);
	}
	
	@Test
	public void divideTest() throws Exception {
		double a = 25.45;
		double b = 13.23;		
		double result = classUnderTest.divide(a, b);
		assertEquals(1.92365835, result, 0.00000001);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void divideZeroTest() throws Exception {
		double a = 25.45;
		double b = 0;		
		double result = classUnderTest.divide(a, b);		
	}
	
}