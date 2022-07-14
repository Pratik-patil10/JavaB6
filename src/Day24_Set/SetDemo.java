package Day24_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Set 
		 1.HashSet 2. TreeSet 3.LinkedSet
		 i.do not print duplicate values/not allowed.
		 ii.Do not maintain Insertion order. 
		 iii. Do not works on index.
		 */
		
		Set hs=new HashSet();
		//PARENT PC=NEW CHILD();
		System.out.println(hs);
		
		hs.add(1);	//addition
		hs.add(1);
		hs.add('a');
		hs.add("Pratik");
		
		System.out.println(hs);	//print only 3 values because 1 is duplicate
		//[1 a pratik]
		for(Object x:hs) {
			System.out.print(x+" ");
			
		}
		System.out.println();
		System.out.println("--------------------------");
		
//		Iterator itr=hs.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr);
//		}
		
		

	}

}
