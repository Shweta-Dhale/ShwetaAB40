package javabasics;

import java.util.Date; //package

public class Epoch_Time {

	public static void main(String[] args) {

		Date d1=new Date(); //object created for machine time
		
		System.out.println(d1.getTime()); //machine time i.e. EPOCH
		
		Date d2= new Date(d1.getTime()); //object created for human time//object created to invoke parameterized constructor
		
		String current_time= d2.toString(); //to utilize string function
		
		Date future_time=new Date(d1.getTime()+(1000*60*60*24*10)); //10 days future date/time
		
		System.out.println(future_time);
		
		String month= current_time.substring(4, 7);
		
		System.out.println(month);//to print month 
	}

}
