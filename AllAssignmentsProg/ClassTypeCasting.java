package javabasics;

class DataProvider {
	
	void username() {
		
		System.out.println("username");
	
	}
	
	void password() {
		
		System.out.println("password");

	}
	
}

public class ClassTypeCasting extends DataProvider

{
	void login_button()
	
	{
		System.out.println("login_button");
	}
	
	
	
	public static void main(String[] args) {
		
		DataProvider d1= new ClassTypeCasting();  //upcasting
		d1.username();
		d1.password();  //cannot call childclass method and can retrieve only parent class methods in upcasting
		
		ClassTypeCasting a2= (ClassTypeCasting)d1;  //downcasting explicitly
		a2.password(); //can call childclass method also with parent/grandparent class
		a2.username();
		a2.login_button();
	}
	

}
