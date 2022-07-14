package GroupDiscussionProgrmmes;

public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="MOB";
		String output="";
		
		
		for(int i=input.length()-1;i>=0;i--) {
				
			output=output+input.charAt(i);
			
		}
		if(input.equals(output)) {
			System.out.println("String is palindrome!");
		}else {
			System.out.println("String isn't palindrome!");
		}
	}

}
