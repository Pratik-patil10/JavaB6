package Day5_for_loop;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial of !5 = 5*4*3*2*1=120
		
		int factorial=1;
//		int number=5;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		int number=sc.nextInt();
		
		
		
//		while(number>=1)
//		{
//			factorial=factorial*number;
//			number--;
//		}
//		
		
		//factorial using for loop
		for(number=5;number>=1;number--) {
			factorial=factorial*number;
		}
		System.out.println("Factorial is:- "+factorial);
		

	}

}
