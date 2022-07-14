package GroupDiscussionProgrmmes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/* Armstrong  number =addition of each digit with each digit should be raised by total number digit power e.g 
		1)153=(1^3) + (5^3) + (3^3) = 153 ------------->>> Armstrong number.
		2)1634=(1^4)+(6^4)+(3^4)+(4^4) = 1634 ----------->>> Armstrong number
		 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:- ");
		
		int n=sc.nextInt();
		int temp=n;
		int r,sum=0;
		
		while(n>0) 
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}

		if(temp==sum) {
			System.out.println(temp +" is A armstrong number!");
		}else {
			System.out.println(temp +" is not Aarmstrong number!");
		}
	}

}
