package Day25_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class characterCountString {

	public static void main(String[] args) {
		
		Map<Character,Integer> hp=new LinkedHashMap();
		
		String input="testers";
		
		for(int i=0;i<input.length();i++) {
			
			char c=input.charAt(i);
			
			if(hp.containsKey(c)) {
				hp.put(c,( hp.get(c)+1));
			}else
			{
				hp.put(c, 1);
			}
		}
		System.out.println(hp);
		

	}

}
