//upcasting from arraylist to list interface

package collectiondata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {

List l1=new ArrayList(); //object creation
	l1.add(1234);
	l1.add(7864);
	l1.add(895); //accepts heterogeneous value
	//l1.add(null);  //accepts many null
	l1.add(69);
	//l1.add(null); 
	l1.add(7864); //accepts many duplicate value
	l1.add(7864); 
	l1.add(10);
	
	Collections.sort(l1); //with same data type
	System.out.println(l1);
	
	
		
		
		
		
		
		
		
	}

}
