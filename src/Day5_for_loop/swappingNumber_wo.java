package Day5_for_loop;

public class swappingNumber_wo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping of 2 number without 3rd variable.
		//a=10,b=20 	---> a=20 , b=10
		int a=10;
		int b=20;
		
		System.out.println("a before swapping number a="+a);
		System.out.println("b before swapping number b="+b);
		
		a=a+b; //a=30
		b=a-b; //b=20
		a=a-b; //a=10
		
		System.out.println("--------------------------------");
		System.out.println("a after swapping number a="+a);
		System.out.println("b after swapping number b="+b);
		
		
	}

}
