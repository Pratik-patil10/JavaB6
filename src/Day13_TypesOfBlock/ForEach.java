package Day13_TypesOfBlock;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,4,5};
				
		for(int i=0;i<a.length;i++) {			//normal for loop
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		int b[]= {2,3,1,4,5};
		
		for(int p:b) {			//foreach loop-here p is new varible assigned to call in ouptput,foreach loop same as per Angular
			System.out.print(p + " ");
		}

	}

}
