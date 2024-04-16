package javabasics;

public class ReplaceString {

	public static void main(String[] args) {

		String name="I am student of MBA 2024 ";
		
		System.out.println(name.replace('M', 'B')); //replace char to other char
		
		System.out.println(name.replaceAll("[A-Z]"," ")); //replace all capital letters
		
		System.out.println(name.replaceAll("[a-z]"," ")); //replace all small letters
		
		System.out.println(name.replaceAll("[0-9]"," ")); //replace numbers
		
		System.out.println(name.isEmpty()); //gives boolean output if string is empty or not
		 
		System.out.println(name.lastIndexOf('t'));  //check last index of 2nd t
		
		System.out.println(name.equalsIgnoreCase("I am Student of mba 2024 "));	//boolean output ignores upper/lower case
		
		System.out.println(name.repeat(5)); //print string 5 times
		
	}

}
