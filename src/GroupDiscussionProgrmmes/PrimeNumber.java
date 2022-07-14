package GroupDiscussionProgrmmes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number:- ");
		
		int num=sc.nextInt();
		
		boolean flag=false;
		
		
		for(int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				flag=true;
				break;
			}
			
			
		}
		if(flag == false) {
			System.out.println("Given Number Is Prime nUmber!");
		}else {
			System.out.println("Given Number Is Not Prime nUmber!");
		}

	}

}
