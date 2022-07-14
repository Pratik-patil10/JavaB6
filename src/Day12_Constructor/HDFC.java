package Day12_Constructor;

public class HDFC {

	public static void main(String[] args) {
	
/*
		ConstructorDemo rbank=new ConstructorDemo();
		//only run from the above line constructor will called first
		
		System.out.println("--------------------------");
		
		rbank.m1(); 	//this will called m1 method
		System.out.println("--------------------------");

		rbank.RBI();*/
		
		//Below this intrest prog. is written
		
		RBI rObj=new RBI(9);		//object creation--->> Parameterized cons. called & rate of interest is =9
		
		int hdfcIntrest=rObj.calculateIntrest(400,5); 		// alloting new variable for output
		
		System.out.println("Your intrest is :- "+hdfcIntrest);		//output
		
	}

}
