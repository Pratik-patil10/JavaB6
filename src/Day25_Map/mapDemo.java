package Day25_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map is not a collection 
		//Map is known as key value pair, which always hold value with unique key and different value.
		
		Map hp=new HashMap(); //no insertion order
		Map lhm=new LinkedHashMap(); //maintain insertion order
		Map tm=new TreeMap(); //Prints in asc /aplhabetically order.
		
		hp.put(1, 25);	//To add any value in map need to use put method.
		hp.put(5, '@');
		hp.put(2, "hashMap");
		hp.put("name", "Pratik");
		hp.put(true,"PR");
		
		hp.put(null, 1);   // map accept unique null key
		hp.put(6, null); 	// map accept multiple null values
		hp.put(7, null);
		System.out.println(hp);
		
	
		System.out.println(hp);
		
		//  map.clear(); 	This Clear the map data.

		System.out.println(hp.containsKey(5));	//give T/F  if given key contain in amap
		
		System.out.println(hp.containsValue('@'));//give t/f if this value contains in map
		
		System.out.println(hp.get(6));	//gives value of specifies key 
		
		System.out.println(hp.get("name"));//----||--------
		
		System.out.println(hp.isEmpty());	//if map is empty gives true.
		
		System.out.println(hp.keySet()); 	//give the set of all keys.-->>Whys set not list,cz set only strore unique value and not duplictes allowed
		
		System.out.println(hp.values());  //all values in map
		
		System.out.println(hp.size()); 	//gives size of map
		
		hp.remove(1);			//removes specified key
		
		System.out.println(hp);
		System.out.println(hp.size());
		
		hp.replace(2, 77);		//replace the value for specified key.
		
		System.out.println(hp);
		
		hp.putIfAbsent(1, 68);	//lin#51 we removed the key no 1, using this we add the value and key if only the key is absent in map
		
		System.out.println(hp);
		
		
	
		

	}

}
