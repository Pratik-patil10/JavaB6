package GroupDiscussionProgrmmes;

public class uniqueString {

	public static void main(String[] args) {
	
		///input =testers	output=tesr
		
		String input="testers";
		String output="";
		
		for (int i=0;i<input.length();i++) {
			char c =input.charAt(i); 				//testers
			//this converts indexwise char
			
			String x=Character.toString(c);		//converts char to string
			
			if(output.contains(x)==false) {
				output=output+x;		//tesr
			}
			
		}
		
		System.out.println(output);

	}

}
