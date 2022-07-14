package Day17_StringComparison;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="MOM";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}

		if(input.equals(output)) {
			System.out.println("String IS palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
