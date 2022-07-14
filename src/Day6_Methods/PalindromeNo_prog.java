package Day6_Methods;

public class PalindromeNo_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =545;
		int temp=input;
		int output=0;
		
		while(input>0) {
			int reminder=input%10;  //
			input=input/10;			//
			output=output*10+reminder;	//
			
		}
		System.out.println("Reverse no is "+output);
		
		System.out.println("----------------------- ");
		if(temp==output)
		{
			System.out.println("Given no is Palindrom");
		}
		else
		{System.out.println("Given no is Not Palindrom");}

	}

}
