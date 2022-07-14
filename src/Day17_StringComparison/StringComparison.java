package Day17_StringComparison;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="name";
		String s2="Name";
		String s3=new String("name");
		String s4="test";
		
		System.out.println(s1.equals(s2));   		//.equals string comparison check the both string content.
		System.out.println(s1.equalsIgnoreCase(s2)); //true beacasue it ignore case and check content only. 
		
		
		// = = method  -->> Check the reference in memory
		System.out.println(s1==s2);			//both string are in same memory i.e. SCP.
		System.out.println(s2==s3); 		//both the string memory are not same cz s3 having memory in heap as wel as SCP, but s2 is in only SCP.
		
		
		
		// .comparedTo -->>> check the string as per the dictionary wise -->> Output= negative,0,positive number
		String a1="abc";
		String a2="aabc";
		String a3="xyz";
		String a4="abc";
		
		System.out.println(a1.compareTo(a2));
		System.out.println(a2.compareTo(a1));
		System.out.println(a1.compareTo(a4));
		System.out.println(a1.compareTo(a3));
		
		
	}

}
