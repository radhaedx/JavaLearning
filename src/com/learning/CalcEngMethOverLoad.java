package com.learning;

public class CalcEngMethOverLoad {

	public static void main(String[] args) {
		
		

		MathEquation3[] equations = new MathEquation3[4];
		equations[0] = new MathEquation3('a', 25.0d ,92.0d);
		equations[1] = new MathEquation3('s', 225.0d ,17.0d);
		equations[2] = new MathEquation3('d', 100.0d ,50.0d);
		equations[3] = new MathEquation3('m', 11.0d ,3.0d);
  
		
		for(MathEquation3 equation : equations) {
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}
		
		System.out.println();
		System.out.println("using Overloads");
		System.out.println();
		
		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		
		MathEquation3 equationOverload = new MathEquation3('d');
		equationOverload.execute(leftDouble, rightDouble);
		System.out.println(equationOverload.getResult());
		
		
	}

}
