//calculate no. of numeric value in given string//

package javabasics;

public class NumbrOfNumeric_array {

	public static void main(String[] args) {
		
		String name="h129";boolean answer;int count_of_num=0;
		
		char[] a= name.toCharArray();
		
		for(int i=0;i<name.length();i++)  {
			
			answer= Character.isDigit(a[i]);
			
			System.out.println(answer);
		
			if(answer==true) {
				
				count_of_num++;
				
			}
			
				System.out.println("number of numeric value in string: "+count_of_num);
			}
}	

}
