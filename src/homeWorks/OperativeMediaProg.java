package homeWorks;

public class OperativeMediaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input=AAAaaAAabbaaAAA
		//output=AAAAAAAAbbAAAAA
		
		String input="AAAaaAAabbaaAAA";
		String output="";
		System.out.println("Your input STring is:"+input);
		
		for(int i=0;i<input.length();i++) {
			
			char c =input.charAt(i);
			String x=Character.toString(c);
			if(x.contains("a")) {
				output=output+x.toUpperCase();
			}else{
				output=output+x;
			}
			
		}
		System.out.println("=================================================");
		System.out.println("Your output STring is:"+output);

	}

}
