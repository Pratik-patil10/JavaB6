package GroupDiscussionProgrmmes;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;

		for (int r = 1; r < row; r++) 
		{
			
			for (int c = 1; c <= r; c++) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
