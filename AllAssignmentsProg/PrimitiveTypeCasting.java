package javabasics;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {

		double weight=83;   //implicit syntax of widening
		System.out.println(weight);  
		
		double weight1= (double) 83;   //explicit syntax of widening
		System.out.println(weight1);  
		
		
		   int a1 = (int)83.65;  //explicit syntax of narrowing
			System.out.println(a1);  

			double a2=90.87;
			 int b = (int)a2;  //explicit syntax of narrowing
				System.out.println(b);
		   
		   
		   
	}

}
