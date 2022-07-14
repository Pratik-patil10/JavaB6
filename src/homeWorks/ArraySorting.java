
package homeWorks;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the array in asc or desc order ---->>i.e. Array sorting

		int a[] = { 2, 3, 1, 4, 5 };
		System.out.println("Array Before Sorting Array is:- ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.println("Array After Sorting Array is:- ");

	
		System.out.println("------------------------------");
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) 
			{
				int temp=0;
				
				if(a[i]<a[j]){	//Swap number logic
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			
			System.out.print(a[i]+" ");
		}
		
//		Arrays.sort(a); //this method sort the array in asc order
//		
//		for (int i =a.length-1; i>=0; i--) {
//			System.out.print(a[i] + " ");
//		}

	}

}
