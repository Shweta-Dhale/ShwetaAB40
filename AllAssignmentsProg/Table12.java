package javabasics;

import java.util.Scanner;

public class Table12 {
	
	int a;
	
	
	Scanner s1=new Scanner(System.in); {
    
	a=s1.nextInt();
	
	
	}
	
	public void tabledemo()
	{
		//System.out.println(a);
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i*a);
			
			
					
		}

	}
	
	
	public static void main(String args[])
	{
		System.out.print("which table to print: ");

		Table12 s1=new Table12();
		
		s1.tabledemo();
		
		//System.out.println("which table to print"+s1);

		
		
		
	}
}


