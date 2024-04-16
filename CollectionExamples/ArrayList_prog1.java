//ArrayList example

package collectiondata;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_prog1 {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();  //arraylist accepts hetrogeneous value
		a1.add(987);   //arraylist follows indexing
		a1.add("Shweta");
		a1.add(true);
		a1.add(23.74);
		a1.add('P');
		
		a1.add(null);  //stores null value
		a1.add("Shweta");   //accepts duplicates value too
	
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(68);
		a2.add(6789);
		a2.add(986);
		a2.add(32);
		Collections.sort(a2);  //to sort in forward direction arraylist
		
		System.out.println(a2);
		
		Collections.sort(a2, Collections.reverseOrder()); //to reverse sort the arraylist
		
		System.out.println(a2);
		
	}

}
