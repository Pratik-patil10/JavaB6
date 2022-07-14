package GroupDiscussionProgrmmes;

public class reverseStringCharAtindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * input string='tester'	outputstring='reste
		 */

		String input="tester";
		String output="";
		
		System.out.println("Your string is "+input);
		
		for(int i=(input.length()-1); i>=0;i--) {
			
			char x=input.charAt(i);
			
			output=output+x;	//r, re.ret,rets,retse,retset
			}
		System.out.println("----------------");
		System.out.print("And Your reverse string is "+output);
		
	}

}
