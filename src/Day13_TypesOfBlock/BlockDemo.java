package Day13_TypesOfBlock;

public class BlockDemo {
	
	/*Java run process= 
	 Block -> Constructor -> Methods -> Varibables.
	  static block->Normal block -> Default constr.-> pArameterized constructor-> Mathod->varibles
	 */

	int a=10;
	
	BlockDemo(){
		System.out.println("I am constructor!");
	
	}
	
	public void m1() {
		System.out.println("I am Mehtod M1!");
	}
	
	{
		System.out.println("I am Block-1!");
	}
	
	{
		System.out.println("I am Block-2!");
	}
	
	static{
		System.out.println("I am Static Block!");
	}


}
