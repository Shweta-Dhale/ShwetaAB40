//Create array of size of 4 but store 5th value in it 

package javabasics;

public class ArraySize {

	public static void main(String[] args) {
		
		int age[]=new int[4];
		
			age[0]=55;
			age[1]=95;
			age[2]=73;
			age[3]=32;
			age[4]=20; //ArrayIndexOutOfBoundsException:array[4] but stored array[5]
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
	}

}
