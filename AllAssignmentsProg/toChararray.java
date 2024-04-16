//convert string to char array 

package javabasics;

import java.util.Arrays;

public class toChararray {

	public static void main(String[] args) {

		String name = "Trishika";
		char[] ch= name.toCharArray();
		
		
		System.out.println(ch.length); //display string length
		
		System.out.println(Arrays.toString(ch)); //store array horizontal---
		
				
		for(int i=0;i<name.length();i++) {
			
			char a1=name.charAt(i); //display char at vertically
		
			System.out.println(a1);
	}
}
}