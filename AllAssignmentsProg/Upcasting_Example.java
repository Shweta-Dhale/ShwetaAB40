package javabasics;

class GrandPar_class {  //grandparent class
	
	void add() {
		
		System.out.println("this is add");

	}
	
}

class Par_class extends GrandPar_class {  //parent class
	
	void sub(){
		
		System.out.println("this is sub");

	}
	
}

public class Upcasting_Example extends Par_class {  //child class
	
	void div(){
		
		System.out.println("this is div");
	}

	public static void main(String[] args) {
		
		Par_class p1= new Upcasting_Example();  //upcasting implicitly & can also done explicitly
		p1.add();
		p1.sub();
		
		Upcasting_Example a2= (Upcasting_Example)p1;  //downcasting explicitly
		a2.add();
		a2.sub();
		a2.div(); //can call childclass method also with parent/grandparent class
		
   }

}
