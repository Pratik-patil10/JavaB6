package Day6_Methods;

public class Methods_java {
	public static void main(String[] args) {
		boolean finding=verify(17);//-->Calling method in main method because java run only in main method.
		System.out.println(finding);}
	
			public static boolean verify(int age){
	//  aceess-modifier  static  return-type  methodName(input parameter)
				
			
			
			if(age>18) {
				System.out.println("You Are Adult!");
				return true;
				
			}
			else {
				System.out.println("You Are Teenager!");
				return false;
			}
		}
		
}	
	
