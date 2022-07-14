package homeWorks;

public class ReverseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Pratik,is,My,Name";
		 
		String[] arr=s.split(",");
		
		String output=" ";
		
		for(int i=arr.length-1;i>=0;i--) {
			output=output+arr[i];
			
		}
		
		System.out.println(output);

	}

}
