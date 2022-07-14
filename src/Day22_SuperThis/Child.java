package Day22_SuperThis;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.m1();
		
		System.out.println("---------output using super keyword-----------");
		c.display();
		
	
		
	
		
	}
	
	int x=20;
	public void m1() {
		System.out.println("I am method M1 from Child");
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	
	
	
	public void display() {
		System.out.println(super.x);
		System.out.println("I am method M1 from Parent");
	}
	
	
	
}
