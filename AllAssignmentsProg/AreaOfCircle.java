package javabasics;

import java.util.Scanner;

public class AreaOfCircle {
	
	 static double pi=3.14;

	public static void main(String[] args) {
		
	Scanner s1=new Scanner(System.in);
	{
	
	System.out.println("Enter the value of r1: ");
	
	int r1=s1.nextInt();
	
	System.out.println("Enter the value of r2: ");
	
	double r2=s1.nextDouble();
	
	System.out.println("Area of circle: "+ pi*r1*r2);
	
	s1.close();
	}

	}
}


