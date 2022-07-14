package Day6_Methods;

public class Reverse_no_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input =123;
		int output=0;
		
		while(input>0) {
			int reminder=input%10;  //3,2,1
			input=input/10;			//12,1,0
			output=output*10+reminder;	//3,32,321
			
		}
		System.out.println(output);

	}

}
