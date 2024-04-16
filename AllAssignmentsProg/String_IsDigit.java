//Check if given String only consist of digits

package javabasics;

public class String_IsDigit {
	
	public static void main(String[] args) {

		String s="7892";
		char[] a1=s.toCharArray();
		boolean ans=true;
		int count_of_digit=0;
		
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)  {
			
			ans=Character.isDigit(a1[i]);
			 			
			if(ans==true) {
				
				count_of_digit++;
			}
		}

		if(count_of_digit==s.length()) {
		
				
				System.out.println("string have digits: "+count_of_digit);
			}
			
			else {
				
				System.out.println("sorry string do not have only digits");
			}
		}
	}



