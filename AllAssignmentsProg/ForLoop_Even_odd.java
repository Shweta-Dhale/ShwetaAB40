//From 1 to 100, print Even and Odd numbers

package javabasics;

public class ForLoop_Even_odd {

	public static void main(String[] args) 
	{

		for(int i=1;i<=100;i++)
			
		{
			if(i%2==0)
			{
				System.out.println("even number:  "+i);
			}
			
	}
		for(int i=1;i<=100;i++)
		
		{
			if(i%2!=0) 
			{
			System.out.println("odd number:  "+i);

			}
		}

    }
}
