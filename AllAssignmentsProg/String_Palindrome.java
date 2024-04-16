package javabasics;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Enter the string: ");

			String a= s1.next();//store input
			
			String rev=""; //store output
			
			for(int i=a.length()-1;i>=0;i--) {
			
			rev=rev+a.charAt(i); //store reverse string
			
			}
			
			System.out.println(rev); //display reverse string
	
			if (rev.equals(a)) {
		
			System.out.println("String is palindrome");
	}
			
			else  {
	
			System.out.println("String is not palindrome");
			
			s1.close();
		}
	}
}

