package Day20_Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Abstraction d=new Abstraction();<<---------- obj cant be possible to create.
		
		AbstractChild obj=new AbstractChild();
		//child cc=new child();
		obj.m1();
		obj.m2();
		
		System.out.println("-----------------------");
		Abstraction ab =new AbstractChild();
		//parent pc=new Child();
		ab.m1();
		ab.m2();

	}

}
