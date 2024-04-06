//find out average value present in given string

package javabasics;

public class Average_prog {

		public static void main(String[] args) 
		{
		int numbers[]=new int[5];
		numbers[0]=1; 
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		int sum=0; 
		
		for(int i=0;i<numbers.length;i++)
		{
				sum=sum	+	numbers[i];
		}
		
		System.out.println("Sum of all numbers: "+sum);
		
		double average=sum/numbers.length;
		
		System.out.println("Average is: "+average);	
			
	}

	}