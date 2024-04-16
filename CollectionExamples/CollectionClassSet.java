//upcasting from TreeSet to Set interface (set does not follow order of insertion but list follows
package collectiondata;

import java.util.Set;
import java.util.TreeSet;

public class CollectionClassSet {

	public static void main(String[] args) {
		
	Set s1=	new TreeSet(); //upcasting
	s1.add(1234);
	s1.add(765);
	s1.add(9865);
	s1.add(987);
	s1.add(22);
	s1.add(45);  //set gets added based on hashcode value
	s1.add(1234);
	s1.add(1234); //doest not follow duplicates
	s1.add(null); //no null value accepted
	
	System.out.println(s1);
	
	

	}

}
