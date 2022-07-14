package GroupDiscussionProgrmmes;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=158;
		int output=0;
		
		
		while(input>0) {
			int rem=input%10;
			input=input/10;
			
			output=output*10+rem;
			
		}
		
		System.out.println(output);

	}

}
