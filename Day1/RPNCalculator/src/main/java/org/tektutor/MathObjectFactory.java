package org.tektutor;

import java.util.HashMap;

public class MathObjectFactory {

	private static HashMap<String,String> mathOperatorToClassNameMap 
			= new HashMap<String,String>();

	static {
		mathOperatorToClassNameMap.put( "+", "org.tektutor.Addition");
		mathOperatorToClassNameMap.put( "-", "org.tektutor.Subtraction");
		mathOperatorToClassNameMap.put( "*", "org.tektutor.Multiplication");
		mathOperatorToClassNameMap.put( "/", "org.tektutor.Division");
	}

	public static IMathOperation getObject ( String mathOperator ) {
		
		IMathOperation mathOperation = null;

		try {
			String className = mathOperatorToClassNameMap.get(mathOperator); 
			mathOperation = (IMathOperation) 
				Class.forName( className ).newInstance();
		}
		catch( Exception e ){
			e.printStackTrace();
		}

		return mathOperation;

	}

}
