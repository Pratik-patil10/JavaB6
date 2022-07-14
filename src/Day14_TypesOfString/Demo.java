package Day14_TypesOfString;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="String Literal_Pratik";		//Literal String which use SCP memory to allocate string .
				
		System.out.println(str);
		
		System.out.println("-----------------------------");
		
		String obj=new String(" object String ");	//This is string with object creation
		
		System.out.println(obj);
		
		
		System.out.println("-------------------------------------------------");
		
		/* */
		String upperCase=str.toUpperCase();
		
		System.out.println(upperCase);
	}

}
