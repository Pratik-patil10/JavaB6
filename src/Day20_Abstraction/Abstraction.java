package Day20_Abstraction;

public abstract class Abstraction {
	
	int x;
	public Abstraction() 	//constructor
	{
		
	}
	
	
/*
  Abstraction:-
  abstraction is process of hiding detalis and showing direct the result to the user.
  
Two types-
  		I.Abstract Class		 II.Interface
  		
 I.Abstract Class:-
	 1. When a class is don't have any body then it must declare as 'abstract method'' ---->ln#14
	 2.If class is having at least one abstract method then class need to declare as abstract class. 
	 3.Abstract class object can't be created.
	 4.Abstract class=Implemented method + unimplemented method
	 5.Flow for this ABSTRACTION->Test->Abstractionchild
	 6.Cann not create object of "Abstract Class".
	 7.We have to extends the abstractclass to child class->implement the unimplemented method.
	 8.the can create obj like-> child cc=new child(); or parent pc=new Child();
	 9.Abstract class is having constructor.
	 10.Abstract is used to hide data 0-99%.
	 11.Go to interface for 100% Abstraction
	 12.Can be possible to intialize a global variable like ln#5.
 */
	public  void m1() { 		//<<-------------0% data hiding
		// Method Body
		System.out.println("I am Method M1");  		

	}
	/*
	 public  void m2() ;
		// if Method Body removed i.e{} then it gives above error-->>
	 */
	public  abstract void m2() ;
		
	

}
