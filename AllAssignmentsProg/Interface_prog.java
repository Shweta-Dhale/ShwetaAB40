package javabasics;

interface Google_Maps {
	
	 void login();
	 void registration();  //2 by default public and abstract methods in interface
}
 
class Interface_prog implements Google_Maps {
	
	static void career() {   //concrete method
		
		System.out.println("i am career");
	}

	public static void main(String[] args) {
		
		Interface_prog m1=new Interface_prog();
		m1.login();
		m1.registration();
		career();	
	}
	
		public void login() {
			
			System.out.println("login method");		
		}

	public void registration()
	
	{
		System.out.println("registration method");

	}
	
}

