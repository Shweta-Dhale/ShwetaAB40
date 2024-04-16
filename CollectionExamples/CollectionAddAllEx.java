//Collection example with AddAll() and ContainsAll()

package collectiondata;

import java.util.ArrayList;

public class CollectionAddAllEx {

	public static void main(String[] args) {
		
		ArrayList a2=new ArrayList();
		a2.add("Suraj");  //add single object
		a2.add("Moon");
		a2.add("Water");
		a2.remove("Suraj"); //remove 1 object
		a2.clear(); //clear entire array
		System.out.println(a2);
		System.out.println(a2.contains("Shweta")); //checks 1 obj and print boolean output
		System.out.println(a2.isEmpty()); //check if its empty array
		
		
		ArrayList a3=new ArrayList();
		a3.addAll(a2);  //add entire collection
		a3.add("Air");  
		a3.add("Wind");
		a3.removeAll(a2); //remove entire collection of a2
		System.out.println(a3.size()); //print size of array

		
		System.out.println(a3);
		System.out.println(a3.containsAll(a2)); //check entire collection and print boolean output



	}

}
