package Day26_exception;

public class tryCatch {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;

		//all logic should be written in try block
		try {
		int c=a/b;	//exception throw to this line
		System.out.println(c);
		
//		int x[]=new int[2];
//		x[2]=1;
		}
		
		//Arithmatic Exception will be handled------->>Child/individual exception class
		catch(ArithmeticException e) {
			e.printStackTrace(); 		//prints the exception information.	
			System.out.println("You are trying to divide by zero");
		}
		
		//Array Exception will be handled------->>Child/individual exception class
		catch(ArrayIndexOutOfBoundsException p) 
		{
			p.printStackTrace();
			System.out.println("Array index mismatch");
		}
		
		//Exception class  handle all exception------->>Parent/every exception class
		catch(Exception e) {
			
			System.out.println("cant divivde with zero");
		}
		
		
		//try with multiple catch above lines all try catch.
		
		finally {
			System.out.println("I am finally block!");
		}
		
		
		System.out.println("------------------------------");
		System.out.println("Program completed!");
		
	}

}
