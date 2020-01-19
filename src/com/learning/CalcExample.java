package com.learning;

public class CalcExample {
	
	//writing code with if else condition ,for & for each loops and arrays

	public static void main(String[] args) {
		
		 double[] leftVals = {20.0d,35.0d,40.0d,70.0d};
		 double[] rightVals = {10.0d,20.0d,15.0d,50.0d};
		 char[] opCodes = {'a','s','m','d'};
		 double[] results = new double[opCodes.length];
		 
		 for(int i=0;i<opCodes.length;i++) {
			 
			 if(opCodes[i] == 'a')
				 results[i] = leftVals[i] + rightVals[i];
			 
			 else if(opCodes[i] == 's')
				 results[i] = leftVals[i] - rightVals[i];
			 
			 else if(opCodes[i] == 'm')
				 results[i] = leftVals[i] * rightVals[i];
			 
			 else if(opCodes[i] == 'd')
				 //results[i] = leftValue[i]/rightVal[i];
				 
				   results[i] = rightVals[i]!= 0.0d ? leftVals[i]/rightVals[i] : 0.0d;
			 else {
				   System.out.println("Error - Invalid operation code");
				   results[i] = 0.0d;
				 
			 }
					 
				 
		 }
		 
		 for(double theResults : results) {
			 
			 System.out.print("Results = " );
			 System.out.println(theResults);
		 }
		 

	}

}
