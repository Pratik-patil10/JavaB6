package Day8_static;

public class A {
	
	static int age=30;
	int b=10;
	
	public static void main(String[] args) {
		System.out.println(age);
	}
	
	public void m1() {
		System.out.println("I am a non static method M1!");
	}
	
	public static void m2() {
		System.out.println("I am a static method M2!");
	}
	

}
