package Day12_Constructor;

public class RBI {
	
	public RBI() {
		//Default constructor-no input parameter
	}
	
	int r;
	public RBI(int rate) {
		r=rate;
		//parameterized constructor - takes one input value whenever this class is called with object creation
	}
	

	public int calculateIntrest(int p,int t) {
		
		int interest=(p*r*t)/100;
		return interest;
	}

}
