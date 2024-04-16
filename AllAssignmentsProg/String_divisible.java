//If no. is divisible by 3 print Frog, if divisible by 5 print Cat, if no is divisible by both 3&5 then print Frog & Cat

package javabasics;
import java.util.Scanner;

public class String_divisible {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int output=sc.nextInt();
		
		if(output%3==0 && output%5==0) {
				
			System.out.println("Frog & Cat");
		}
		else if(output%5==0) {
			
			System.out.println("Cat");
		}
		else if(output%3==0) {
			
			System.out.println("Frog");
		}
		else {
			System.out.println("Wrong Number");
		}
		sc.close();
	}
}
