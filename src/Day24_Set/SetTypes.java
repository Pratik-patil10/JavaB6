package Day24_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set hs=new HashSet();
		//Do not maintain Insertion order.
		hs.add(1);
		hs.add('p');
		hs.add("Hi");
		
		System.out.println("HashSet is: "+hs);
		
		
		Set ls=new LinkedHashSet();
		//Add the data / maintain Insertion order
		ls.add(1);
		ls.add('p');
		ls.add("Hi");
		
		System.out.println("LinknedHashSet is: "+ls);
		
		Set ts=new TreeSet();
		//maintain elements in sorting way.-->>Alphabetically or asc order. e.g. line#23 
		ts.add(3);
		ts.add(1);
		//ts.add("Pratik"); //cant add string if initial datatype is integer throws exception
		System.out.println("TreeSet is: "+ts);
	}

}
