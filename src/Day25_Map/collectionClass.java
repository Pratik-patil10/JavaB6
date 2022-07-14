package Day25_Map;

import java.util.ArrayList;
import java.util.Collections;

public class collectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li = new ArrayList();

		li.add(1);
		li.add(3);
		li.add(2);

		// collection - interface collections ->class

		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);

	}

}
