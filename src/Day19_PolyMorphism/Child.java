package Day19_PolyMorphism;

public class Child extends Parent {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();
		
		Child c=new Child();
		c.m1();
		
		Parent pc=new Child(); //Run time polymorphism
	//  
		pc.m1();
		pc.m();
		
	}
	
	
//green up triangle indication for below line say that it is method overriding
	public  void m1() {
		System.out.println("I am child method M1");

	}
	
	public static  void m() {
		System.out.println("I am parent Static method M2");

	}

}
