package homeWorks;

import java.util.Scanner;

public class PrimeNumber 
{
	
			@SuppressWarnings({ "resource", "unused" })
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number:- ");
				int num=sc.nextInt();
				
				
				boolean isPrime=true;
				
				for(int i=2;i<num/2;i++) {
					if(num%i==0)
					{
						isPrime=false;
						break;
						
					}
				}
				if(isPrime) {
					System.out.println(num+" is a Prime Number!");
				}
				else {
					System.out.println(num+" is not a Prime Number!");
				}
				
			}
}
