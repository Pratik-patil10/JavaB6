package GroupDiscussionProgrmmes;

public class tocharArrayReverse {
	public static void main(String[] args) {
		String s1="hello I am a String"; 
		
		char[] ch=s1.toCharArray();		//this method converts string to array.
		
		for(int i=(ch.length-1); i>=0; i--) {
			System.out.print(ch[i]);
		}
		
	}

}
