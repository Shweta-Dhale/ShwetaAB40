package javabasics;

abstract class College { //grandparent class
	
	abstract void login(); //abstract method1
	
	abstract void registration(); //abstract method2

	
	void method1() { //concrete method
		
		System.out.println("This is method 1");
	}
}

abstract class Student extends College { //parent class
	
	abstract void homepage(); //abstract method1
	
	abstract void careers(); //abstract method1
	
	
	static void method2() {  //concrete method
		
		System.out.println("This is method 2");
	}
}
	

public class Website extends Student { //child class
	
	void method3() { //concrete method1
		
		System.out.println("This is method 3");

	}
	void method4() { //concrete method2
	
		System.out.println("This is method 4");
	
	}
	
	public static void main(String[] args) {
		
		Website a1=new Website();
		a1.homepage();
		a1.careers();
		a1.login();
		a1.registration();
		a1.method1();
		method2();
		a1.method3();
		a1.method4();
		
	}
	@Override
	void homepage() {
		
		System.out.println("I am homepage");
		
	}
	@Override
	void careers() {
		
		System.out.println("I am careers page");
		
	}
	@Override
	void login() {
		
		System.out.println("I am login page");
	}
	@Override
	void registration() {
		
		System.out.println("I am registration page");
	}

}
