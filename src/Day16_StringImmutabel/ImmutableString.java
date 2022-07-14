package Day16_StringImmutabel;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String p="abc";
		String q="abc";
		
		System.out.println(s.concat("Xyz"));
	//	String q="abcd";
		
		System.out.println(s);// s is concanited still it prints original value thats why it is immutable
		
		String x=new String("pqr");
		
		StringBuilder sb=new StringBuilder("pqr");
		
		System.out.println(x.concat("lmn"));
		System.out.println(sb.append("lmn"));
		
		//below for this we have attached the another string but stilll it gives same string thats why it is immutable. same for line#10,#20#21
		System.out.println(x);	
		System.out.println(sb);
			

	}

}
