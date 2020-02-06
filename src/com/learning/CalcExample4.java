package com.learning;

public class CalcExample4 {

	public static void main(String[] args) {
		
		//MathEquation2 testEquation = new MathEquation2();
		//testEquation.execute();
		//System.out.print("test=");
		//System.out.println(testEquation.getResult());
		
		
		MathEquation2[] equations = new MathEquation2[4];
		equations[0] = new MathEquation2('a', 25.0d ,92.0d);
		equations[1] = new MathEquation2('s', 225.0d ,17.0d);
		equations[2] = new MathEquation2('d', 100.0d ,50.0d);
		equations[3] = new MathEquation2('m', 11.0d ,3.0d);
  
		
		for(MathEquation2 equation : equations) {
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}
		

	}


}

