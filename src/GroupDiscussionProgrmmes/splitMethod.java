package GroupDiscussionProgrmmes;

public class splitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="My name is Pratik";
		
		
		//System.out.println(input.trim());	//trim space of start and end
		//char x[]=input.toCharArray();
		String output=" ";
		String x[]=input.split(" ");
		
		
		for(int i=(x.length-1);i>=0;i--) {
			output=output+x[i]+" ";
		}
		
		System.out.println(output);
	}

}
