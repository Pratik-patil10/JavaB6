package Day7_methods2;

public class averageClass {
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*communication between two classes
			when want to use methods from another class follow below.
		 	here avergae & addition method is used without creating in this class.*/
		
		
		//class-name objectReferenceName= new className(); --->>>> object creation signature.
		
		CalulatorTest obj=new CalulatorTest();
		
		
		System.out.println("Addition is " +obj.addition(25, 45));
		
		System.out.println("---------------------------------------");
		
		System.out.println(" & Multiplication is "+obj.average(10, 20)); //-------->>> called averge method.
	}
	
	
	
	
}
