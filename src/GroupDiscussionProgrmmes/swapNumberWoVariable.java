package GroupDiscussionProgrmmes;

public class swapNumberWoVariable {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		
		System.out.println("a before swapping number a="+a);
		System.out.println("b before swapping number b="+b);
		
		System.out.println("------------------------------");
		a=a+b;		//10+20=30
		b=a-b;		//30-20=10
		a=a-b;		//30-10=20
		
		System.out.println("a before swapping number a="+a);
		System.out.println("b before swapping number b="+b);
	}

}
