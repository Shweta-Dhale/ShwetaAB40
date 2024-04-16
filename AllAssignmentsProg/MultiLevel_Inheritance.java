package javabasics;

public class MultiLevel_Inheritance {
	
	void result(String r) {
	
	System.out.println("Final result: "+r);
	}
	
}
	 class GrandParent_class extends MultiLevel_Inheritance {
		
	 void classroom(int a) {
	
		System.out.println("Classroom no:"+a);
	    
		}
	
    }
	 
	 class Parent_class extends GrandParent_class {
		
		void gender(char b) {
		
			System.out.println("Gender: "+b);
		}
		
	}
	
	 class Child_class extends Parent_class {
		
		void student(int b,String c) {
		
			System.out.println("Name: "+c);
			System.out.println("Roll number: "+b);
			
		}
		
	}
	
	 class Kid_class extends Child_class {
		
		void percent(float f) {
		
			System.out.println("Percentage: "+f);
		}
	

	public static void main(String[] args) {
		
		Kid_class k1=new Kid_class();
		
		k1.student(10,"Shweta");
		k1.gender('F');
		k1.classroom(18);
		k1.percent(79.35f);
		k1.result("Pass");
	}
}

