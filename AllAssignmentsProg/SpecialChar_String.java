		// check in the given string how many Special characters are present

package javabasics; 

public class SpecialChar_String {

	public static void main(String[] args) {
		
	String s="Her #age !$ 20"; 
	
	int num=0, alpha=0, space=0, special=0;
	
	 for(char ch: s.toCharArray()) {
	 
		if(Character.isDigit(ch)) {
			
			num++;
		}
		
		else if(Character.isAlphabetic(ch)) {
			
			alpha++;
		}
	
		else if(Character.isSpaceChar(ch)) {
			
			space++;
		}
		else {
			
			special++;	
		}
	}
		System.out.println("no of digit in given string is:"+num);
		System.out.println("no of alphabet in given string is:"+alpha);
		System.out.println("no of space in given string is:"+space);
		System.out.println("no of special char in given string is:"+special);
	}
}
