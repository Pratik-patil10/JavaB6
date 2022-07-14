package Day23CollectionOfFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		// List = new List(); cant create object of list interface directly
		List al = new ArrayList(); // parent pc=new child()
		ArrayList ali = new ArrayList(); // child cc=new child()

		System.out.println(al);		//empty arrayList
		System.out.println("--------------------------");
		al.add(1); // to add data in array.
		al.add('C');
		al.add(true);
		al.add("Pratik");
		System.out.println(al);
		System.out.println("--------------------------");
		System.out.println(al.get(1)); // to read the data from array index wise.
		System.out.println("--------------------------");
		System.out.println(al.size()); // Return number of elements in array list
		System.out.println("--------------------------");
		System.out.println(al.isEmpty());// Check arrayList is empty or not
		System.out.println("--------------------------");
		//	al.clear();							//clear the all list array
		
		System.out.println(al.contains(1));	//check whether the given obj is present or not in arrayList
		System.out.println("--------------------------");
		
		//al.add(2);	//add this element at the last to the arrayList index.
		al.add(3, "King"); //add this element at Given index no of  the arrayList.
		System.out.println(al);
		
		System.out.println("--------------------------");
		//belowe ali collection is created
		ali.add(3);
		ali.add(5);
		
		al.addAll(ali);	//this add one collection to another collection. ali is added in ali at the last.
		
		System.out.println(al);
		System.out.println("--------------------------");
		
		al.remove(3);	//remove the data by specific index
		al.remove(true);	//remove the data by specific object name
		System.out.println(al);
		
		System.out.println("--------------------------");
		System.out.println(al.indexOf(1));	//give index no of object.
		System.out.println("--------------------------");
		
		al.set(0, 5);//replace the value of particular index number.
		
		System.out.println(al);
		System.out.println("--------------------------");
		
		
		
		

	}

}
