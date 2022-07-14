package homeWorks;

public class ReverseArray {
	public static void main(String[] args) {
		//Print the array in reverse direction
		int input[]= {2,5,9,13,15,17};
		
		for(int i=input.length-1;i>=0;i--) {
			System.out.print(input[i]+" ");
		}
	}

}
