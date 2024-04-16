package javabasics;

import java.util.Scanner;

public class ScannerClass_GloVar {

	int a,b,c;
	
	Scanner s1=new Scanner(System.in); {
			
	a=s1.nextInt();
	
	b=s1.nextInt();
	
	s1.close();
	
	}
	
	 void add() {
		 c=a+b;	
	System.out.println("Addition is:"+c);	
	
	 }
	
	 void sub() {
		 c=a-b;
		System.out.println("Subtraction is:"+c);	
	
	}
	 
	void mul() {
		c=a*b;
		System.out.println("Mutiplication is:"+c);	

	}
	
    void div() {
    	c=a/b;
		System.out.println("Division is:"+c);	
	
	}
	
	void mod() {
		c=a%b;
		System.out.println("Modulus is:"+c);	

	} 
	
	public static void main(String[] args) {
		
		ScannerClass_GloVar a1=new ScannerClass_GloVar();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();	
		
	}
	
}
