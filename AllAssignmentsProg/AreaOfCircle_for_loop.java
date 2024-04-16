package javabasics;

import java.util.Scanner;

public class AreaOfCircle_for_loop {
	
	static double pi=3.14;

	public static void main(String[] args) {
		
		
		
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("enter value of r1: ");
		
		int r1=s1.nextInt();
		
		System.out.println("enter value of r2: ");
		
		int r2=s1.nextInt();
	
		
		for(int i=1;i<=10;i++)
		
		{
		
		//System.out.println(i);
		
		
		System.out.println("area of circle: "+pi*r1*r2);
		
		}
		
		s1.close();

	}

}
