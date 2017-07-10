package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class RPNCalculatorTest {
	
	@Test
	public void testSimpleAddition() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate( "10 15 +" );
		double expectedResult = 25.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate( "10 50 +" );
		expectedResult = 60.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

	}

	@Test
	public void testSimpleSubtraction() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate( "15 15 -" );
		double expectedResult = 0.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate( "50 40 -" );
		expectedResult = 10.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );
	}

	@Test
	public void testSimpleMultiplication() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate( "15 10 *" );
		double expectedResult = 150.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate( "50 20 *" );
		expectedResult = 1000.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );
	}

	@Test
	public void testSimpleDivision() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate( "100 10 /" );
		double expectedResult = 10.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate( "50 5 /" );
		expectedResult = 10.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );
	}

	@Test
	public void testComplexRPNExpression() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate( "100 20 / 20 5 * +" );
		double expectedResult = 105.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );
	}

}
