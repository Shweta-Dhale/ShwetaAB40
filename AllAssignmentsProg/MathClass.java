package javabasics;

public class MathClass {

	public static void main(String[] args) {

		double pivalue=Math.PI;
		System.out.println(pivalue);
		
		System.out.println(Math.addExact(100, 900));
		System.out.println(Math.subtractExact(900,100));
		System.out.println(Math.multiplyExact(10, 90));
		System.out.println(Math.random());  //generate unique no always
		System.out.println(Math.max(20.36, pivalue)); //print max value from 2 values
		System.out.println(Math.min(67, 45));   //print min value from 2 values
		System.out.println(Math.sqrt(100));
	}

}
