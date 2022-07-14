package Day23CollectionOfFramework;

import java.util.ArrayList;

public class UniqueString {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		String input="tester";
		ArrayList unique=new ArrayList();
		
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			
			if(unique.contains(c)==false) {
				unique.add(c);
			}
		}
		
		System.out.println(unique);
		

	}

}
