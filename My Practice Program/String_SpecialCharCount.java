//check in the given string how many Special characters are present

package javabasics;

public class String_SpecialCharCount {

	public static void main(String[] args) {

		String s="$hwet@23";
		
		char[] ch=s.toCharArray();//convert string into char array 
		
		int count_of_special=0;
		
		boolean output=true;
		
		for(int i=0;i<ch.length;i++) {
			
			output=Character.isAlphabetic(ch[i])||Character.isDigit(ch[i]);
			
			if(output==false){
				
		count_of_special++;
	}
		}
			if(count_of_special>0) {
				
				System.out.println("Count of special character is: "+count_of_special);
			}
			
			else {
				
				System.out.println("Sorry no special character present: ");

			}
			
		}
	}

