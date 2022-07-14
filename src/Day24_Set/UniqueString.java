package Day24_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  input="testers";
		Set output=new TreeSet();
		
		for(int i=0;i<input.length();i++) {
			output.add(input.charAt(i));
			
		}
		System.out.println(output);

	}

}
