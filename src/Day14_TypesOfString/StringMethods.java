package Day14_TypesOfString;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is string method Type ";
		String str2=" ";
		String s=" -Concat";

		String upperCase=str.toUpperCase();		//this will print all ur string in upper case.
		
		System.out.println(upperCase);
		
		System.out.println("------------------------------");
		
		System.out.println(str.toLowerCase());
		
		System.out.println("------------------------------");
		
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println("------------------------------");
		
		System.out.println(str2.isBlank());
		System.out.println("------------------------------");
		
		System.out.println(str.concat(s));	//concat thr strings
		
		System.out.println("------------------------------");
		
		System.out.println(str.length());  		//give the string length including the space.
		System.out.println("------------------------------");
		
		System.out.println(str.charAt(8));
		
		System.out.println(str.startsWith("Th"));
		System.out.println("------------------------------");
		System.out.println(str.endsWith("pe"));
		System.out.println("------------------------------");
		System.out.println(str.contains("hod"));
		System.out.println("------------------------------");
		System.out.println(str.toCharArray());
		str.split(str);
		
		
		/*
		 * 8. startsWith		//gives T/F is string startwith
			9. endsWith			//gives --||--------- endswith
			10. contains		//
			11. trim
			12. toCharArray
			13. split 
			14. indexOf(char)
			15. lastIndexOf(char)
			16. substring(int)
			17. substring(int,int)
		 */
		
	}

}
