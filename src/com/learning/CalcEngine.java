package com.learning;

public class CalcEngine {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Using Inheritence");
		System.out.println();
		
		CalculateBase[] calculators = {
				new Divider(50.0d, 10.0d),
				new Adder(25.0d, 30.0d),
				new Subtractor(73.0d, 25.0d),
				new Multiplier(20.0d, 15.0d)
				
				
		};
		
		for(CalculateBase calculator:calculators) {
			
			calculator.calculate();
			System.out.print("result = ");
			System.out.println(calculator.getResult());
			
		}

	}

}
