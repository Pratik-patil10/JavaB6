package homeWorks;

public class fabonacciSeries {
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,count=20;
		System.out.println(n1);
		
		for(i=2;i<count;i++) {
			n3=n1+n2;				//1 2 3 
			System.out.println(n3);//1 2 3
			n1=n2;					//1 1 2
			n2=n3;					//1 2 3
			
		}
	}

}
