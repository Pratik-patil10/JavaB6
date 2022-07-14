package Day11_Array2D;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3} ,{4,5,6},{7,8,9,10}};	//length=3 
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		/*
		 
		 line no 13 prints the value as per the index no as= 
		 
		 a[0][0]=1 a[0][1]=2 a[0][2]=3
		 a[1][0]=4 a[1][1]=5 a[1][2]=6
		 a[2][0]=7 a[2][1]=8 a[2][2]=9 a[2][3]=10 
		 													
		 */

	}

}
