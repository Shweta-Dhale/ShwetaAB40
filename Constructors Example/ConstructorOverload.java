package Assign5;

public class ConstructorOverload {

	int id;
	char gen;
	String name;
	boolean result;
	
	ConstructorOverload()
	{
	 
		System.out.println("I am a constructor");
		
	}
	ConstructorOverload(int a,String z)
	{
		id=a;
		name=z;
		System.out.println("ID: "+id+" Name: "+name);

	}
	ConstructorOverload(char g)
	{
		gen=g;
		System.out.println("Gender: "+gen);

	}
	
	ConstructorOverload(String n)
	{
		name=n;
		System.out.println("Name: "+name);
		
	}
	
	ConstructorOverload(boolean b)
	{
		result=b;
		System.out.println("Result: "+result);

	}
	
		public static void main(String[]args) {
		
			new ConstructorOverload();			
			new ConstructorOverload(250,"Ram");	
			new ConstructorOverload('F');	//can call both ways		
			ConstructorOverload c4=new ConstructorOverload("Shweta");	
			ConstructorOverload c5=new ConstructorOverload(true);	
		}	
	}	
