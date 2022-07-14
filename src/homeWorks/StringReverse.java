package homeWorks;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="PRATIK";
		
		String output="";
		
		System.out.println("String Before reversing = "+input);
		
		for(int i=(input.length()-1);i>=0;i--) {
			char x=input.charAt(i);
			output=output+x;
		}
		
		System.out.println("--------------------------");
		
		System.out.println("String After reversing = "+output);

	}

}
