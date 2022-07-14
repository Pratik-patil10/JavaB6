package Day19_PolyMorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(1,5,1);
		add(8,5);
		add('c',1);

	}
	
	
	public static void main(int[] args) {
		
	}
	//Method overloading-->>Multiple methods with same method name in class but not duplicating input parameter
	//by changing Number of parameter-> 2,3
	//by changing data type of parameter-->> int ,int, char,int
	//It is not possible by changing return data type of method & access modifier.
	//Method Overloading applies static & non-static both methods.
	//Main method also overloads.following above points.
	//JVM always run first main methods which contains string[] args.
	//Constructor can be overloaded
	
	
	public static void add(int a ,int b) //-->> 2 Parameters
	{
		System.out.println(a+b);
	}
	
	public static void add(int a ,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void add(char a ,int b) //-->> 2 paramters but different datatype
	{
		System.out.println("Hello " +a+" "+b);
	}
	
	
	public void sub() 
	{
		
	}
	
	public void sub(int a) 
	{
		
	}
	
	
	
	
}
