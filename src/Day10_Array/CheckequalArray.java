package Day10_Array;

import java.util.Arrays;

public class CheckequalArray {
	public static void main(String[] args) {

		int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};   
		int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};  
		
		if (Arrays.equals(a1, a2)) {
			System.out.println("Array are equal!");
		}else {
			System.out.println("Array are not equal!");
		}
	}

}
