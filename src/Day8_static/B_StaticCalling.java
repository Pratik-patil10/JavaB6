package Day8_static;

public class B_StaticCalling {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*way to call methods in one class to another class.
		1.using obj creation-------------->>>>>>>>>> as done in previous day.i.e. each obj is created its own heap memory
		2. using class name when method/variables are directly declared as static in original class. ----->>> 
		instead of heap it is called from class loader memory.  */
		
		A obj=new A();
		System.out.println(obj.age);  //-------->> using #1
		
		System.out.println("---------------------------------------");
		
		A.m2();
		System.out.println(A.age); //------------>> using #2
		
		A.age=50;
		System.out.println(A.age);
	}

}
