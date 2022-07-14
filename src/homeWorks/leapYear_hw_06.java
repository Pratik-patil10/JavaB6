package homeWorks;

import java.util.Scanner;

public class leapYear_hw_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q.Find the year is leap or not?

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Year= ");
				
			int year=sc.nextInt();
			
		if((year%4==0) &&(year/100!=0) ||  (year%400==0) )
		{
			System.out.println(year+" is a Leap Year!");
		}
		else {
			System.out.println(year+" is not a Leap Year!");
		}
	}

}
