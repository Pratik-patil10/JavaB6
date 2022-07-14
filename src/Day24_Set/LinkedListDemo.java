package Day24_Set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new LinkedList();
		
		li.add(3);
		li.add('v');
		li.add('p');
		
		System.out.println(li);
		/*To iterate the arraylist /linked list we have 3 option 
		1.For loop
		2.foreach loop
		3.iterator interface*/
		//3.iterator interface
		
		Iterator itr=li.iterator();
		
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}
		
				
		

	}

}
