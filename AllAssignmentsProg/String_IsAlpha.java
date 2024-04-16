//Check if given String only consist of alpha

package javabasics;

public class String_IsAlpha {
	

	public static void main(String[] args) {
		
		int count_of_alpha=0;
		
		boolean output;
		
		String s="shweta"; //declared string
		
		char[] a1=s.toCharArray(); //to convert in char array
		
		System.out.println(s); //print org_string
		
		for(int i=0;i<a1.length;i++) {
			
			output=Character.isAlphabetic(a1[i]);
			
			if(output==true) {
				
				count_of_alpha++;
			}
		}
			if(count_of_alpha==a1.length) {
		
				System.out.println("string have only alphabets: "+count_of_alpha);
		
		}
			else {
	
				System.out.println("string does not have only alphabets: ");
		
	}		

	}
}
