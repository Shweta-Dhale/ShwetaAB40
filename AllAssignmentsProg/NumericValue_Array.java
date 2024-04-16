//in a given string check which is numeric value//

package javabasics;

public class NumericValue_Array {

	public static void main(String[] args) {
		
		String name="She20age";boolean answer;
		
		char[] a1= name.toCharArray(); //divide char
		
		for(int i=0;i<name.length();i++) {
			
			answer=Character.isDigit(a1[i]); //find index of digit in boolean
			
			System.out.println(answer);
		
			if(answer==true)
			{
				System.out.println("Numeric value is at index: "+i);
			}
		}
	}
}
