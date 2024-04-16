//Create 4 static method with different name and call it inside the main method.

package maths;

public class Assignment2 {

	public static void main(String[] args) {
		
		Addition();
		Subtraction();
		Division();
		Multiply();
		
	}
	
	static void Addition() {
		int a, b, add;
		a=14;
		b=30;
		add=a+b;
		
		System.out.println(add);
		
	}
	
	static void Subtraction() {
		long a, b, sub;
		a=153467;
		b=589809;
		sub=a-b;
		
		System.out.println(sub); 
		
	}
	
	static void Division() {
		
		double a, b, div;
		a=203;
		b=32;
		div=a/b;
		
		System.out.println(div);
	}
	
	static void Multiply() {
		
		float a, b, mul;
		a= 43.1f;
		b= 12.6f;
		mul=a*b;
		
		System.out.println(mul);
	
		
	}
	
	
}

	

