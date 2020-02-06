package com.learning;

public class CalcExample1 {

	public static void main(String[] args) {
		
		
		 double[] leftVals = {20.0d,35.0d,40.0d,70.0d}; //double array 
		 double[] rightVals = {10.0d,20.0d,15.0d,50.0d};
		 char[] opCodes = {'a','s','m','d'};
		 double[] results = new double[opCodes.length];
		 
		 for(int i=0;i<opCodes.length;i++) {
			 
			 // calcExample if-else condition modified into switch case 
			 
			 switch(opCodes[i]) {
			 
			 case 'a':
			 
				      results[i] = leftVals[i] + rightVals[i];
				      break;
				 
			 case 's':	 
				 
				      results[i] = leftVals[i] - rightVals[i];
				      break;
			 
			 case 'm':
				       
				      results[i] = leftVals[i] * rightVals[i];
				      break;
				      
		
			 case 'd':	      
				   
				      results[i] = rightVals[i]!= 0.0d ? leftVals[i]/rightVals[i] : 0.0d;
				      break;
			 
			 default: 
			          {
				         System.out.println("Error - Invalid operation code");
				         results[i] = 0.0d;
				         break;
				 
			           }
			 
			 }
		 }
			 //for-each loop 
		    for(double theResults : results) {
			 
			 System.out.print("Results = " );
			 System.out.println(theResults);
		 }

	}

}
