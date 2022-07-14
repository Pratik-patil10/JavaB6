package Day7_methods2;

public class CalulatorTest {

	public static void main(String[] args) {
		//Agenda- Calling one method to another method & using this both methods in main function.
		
		System.out.println(average(10,20));	
		
	//-->First it calls avg function then it calls additon function beacause it has ref of addition method.
		
	}
	//method-1
	public static int addition(int a, int b) {
		int c=a+b;
		return c;
	}
	
	//method/2
	public static int average(int x,int y) {
		int avg=addition(x,y)/2;
		return avg;
	}

}
