package Day20_Abstraction;

public interface InterfaceAbstraction {
	
	/*
Interface ABstraction:-
1.When a class having all method(i.e. 100%) as abstract then make class as "Interface" instead of "class".-->> No any single implemented class. all method unimplemented.
2.No any object can nbe possible to create.
3.We can create object using Inheritence. but instead of "extends" use "implements" keyword.
4.now it is possible to creat obj like -> child cc=new child(); or parent pc=new Child();
5.Interface can't have constructor.
6.CAn't have Initialize global variable.
7.If class is interface no any method is possible to create .but after java JDK1.8 only Java static & Default mthod is possible to create.		<<---IMP
8.global variable cant be initialized e.g. int a;, char c;, double d;

	 */
	
//	InterfaceAbstraction(){}		<-- constructor

	public abstract void m1() ;
	
	public abstract void m2() ;
	
	
	public static  void m3() {
		
	};

}
