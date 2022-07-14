package Day11_Array2D;

public class ArrayInline2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{1,2,3} ,{4,5,6},{7,8,9,10}};
		
		System.out.println(a[1][2]);
		
		int rows=a.length;
		System.out.println(rows);	//--------->> Gives how many rows are available in total array.
		
		System.out.println(a[2].length);  	//---------->> Gives 2nd rows coloumns number i.e. 4.
	}

}
