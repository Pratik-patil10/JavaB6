package GroupDiscussionProgrmmes;

public class FabonaccieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 1 1 2 3 5 8 13 21 34 55
		int n1=0,n2=1,n3,count=20;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i=2;i<=count;i++) {
			n3=n1+n2;			//1 2 3 5...............
			
			System.out.println(n3);	//1 2 3 5 .........
			
			n1=n2;			//1 1 2...........
			n2=n3;			//1 2 3.............
		}

	}

}
