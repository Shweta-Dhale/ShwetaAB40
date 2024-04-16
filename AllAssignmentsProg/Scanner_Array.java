//Create Array of length [5] with int datatype & Store value in it using scanner class

package javabasics;
import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Array {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=sc.nextInt();
		}
			System.out.println(Arrays.toString(num));
			
					sc.close();
		}
	}


