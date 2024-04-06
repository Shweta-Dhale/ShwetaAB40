//Execute the Scanner Class with all the methods using local Variable

package javabasics;

import java.util.Scanner;

public class SacannerClass_localvar {
	
	static void add(){
		
	int a, b, c;
	
	Scanner s1 = new Scanner(System.in);
	
	a=s1.nextInt();
	b=s1.nextInt();
	
	c = a+b;
	
	System.out.println("Addition is "+c);
	
	s1.close();
	} 
	
	static void sub(){
		
		int a,b,c;
	
		Scanner s1 = new Scanner(System.in);
		
		a=s1.nextInt();
		b=s1.nextInt();
		
		c = a-b;
	
	System.out.println("Subtraction is "+c);
	s1.close();
	
	}
	
	static void div(){
		
		int a,b,c;
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
		b=s1.nextInt();
		
		c= a/b;
		
		System.out.println("Division is "+c);
s1.close();
	}
	
	static void mul(){
	
		int a,b,c;
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
		b=s1.nextInt();
		
		c= a*b;
		
		System.out.println("Multiplication is "+c);
		s1.close();

	}
	
		void mod(){
		
		int a,b,c;
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
		b=s1.nextInt();
		
		c= a%b;
		
		System.out.println("Modulus is "+c);
		s1.close();
	}
		public static void main(String[] args) {
		
		
		//SacannerClass_localvar obj = new SacannerClass_localvar();
		
		add();
		sub();
		div();
		mul();
		SacannerClass_localvar m1=new SacannerClass_localvar();
		m1.mod();
		
	}
		
}
