package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack = null;
	private double firstNumber, secondNumber, result;

	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
	}

	private void retrieveOperands() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

	private boolean isMathOperator( String rpnToken ) {
		String mathOperators = "+-*/";
		return mathOperators.contains( rpnToken );
	}

	private void add() {
		result = firstNumber + secondNumber;
	}

	private void subtract() {
		result = firstNumber - secondNumber;
	}

	private void multiply() {
		result = firstNumber * secondNumber;
	}

	private void divide() {
		result = firstNumber / secondNumber;
	}

	public double evaluate ( String rpnMathExpression ) {

		String rpnTokens[] = rpnMathExpression.split("\\s+");

		IMathOperation mathOperation = null;

		for ( String token : rpnTokens ) {

			if ( isMathOperator( token ) ) {
				retrieveOperands();
				mathOperation = MathObjectFactory.getObject( token );
				result = mathOperation.compute ( firstNumber, secondNumber );
				numberStack.push ( result );
			}
			else
				numberStack.push ( Double.parseDouble( token.trim() ) );
		}

		return numberStack.pop();
	}

}
