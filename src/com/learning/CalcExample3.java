package com.learning;

public class CalcExample3 {

	public static void main(String[] args) {
		// using class, methods, setters and getters
		
		MathEquation1[] equations = new MathEquation1[4];
		equations[0] = create(25.0d ,92.0d, 'a');
		equations[1] = create(225.0d ,17.0d, 's');
		equations[2] = create(100.0d ,50.0d, 'd');
		equations[3] = create(11.0d ,3.0d, 'm');
  
		
		for(MathEquation1 equation : equations) {
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}
		

	}
	
	public static MathEquation1 create(double leftVal, double rightVal, char opCode) {
		  
		MathEquation1 equation = new MathEquation1();
		  
		   equation.setLefttVal(leftVal);
		   equation.setRightVal(rightVal);
		   equation.setOpCode(opCode);
		   
	       return equation;
		   
		   
	}

}
