package javabasics;

import java.util.Scanner;

public class CircumferanceOfCircle {
	
	static final double pi=3.14;

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		{
		
		System.out.println("enter the value of r");
		
		int r=s1.nextInt();
		
		System.out.println("circumference of circle="+2*pi*r);
		
		s1.close();

	}
		
	}

}
