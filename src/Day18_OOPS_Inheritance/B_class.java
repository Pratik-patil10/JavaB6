package Day18_OOPS_Inheritance;

public class B_class extends Inheritance_A {
	
	int b=20;
	public static void m2()	{
		System.out.println("I am Child class -M2");
	}
	
	//	Overriding the m3 class from parent
	public void m3() {
		System.out.println("I am Override -class M3");	//m3 class override now next to this anywhere this o/p is printed.
	}

}
