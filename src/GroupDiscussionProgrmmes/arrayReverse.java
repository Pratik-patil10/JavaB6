package GroupDiscussionProgrmmes;

public class arrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={10,20,50,65,84};
		int i;
		System.out.println("Array in forwrad is:- ");
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("------------------------------------ ");
		
		System.out.println("Array in reverse direction is:- ");
		for(i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		

	}

}
