package GroupDiscussionProgrmmes;

public class countOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// input =testers output=tesr

		String input = "testers";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i); // testers
			// this converts indexwise char

			String x = Character.toString(c); // converts char to string

			if (output.contains(x) == false) {
				output = output + x; // tesr
			}

		}

		System.out.println(output);

		for (int p = 0; p <output.length(); p++) {

			char m = output.charAt(p);

			String s = Character.toString(m);

			int counter = 0;
			
			for (int q = 0; q <input.length(); q++) {

				char n = input.charAt(q);

				String b = Character.toString(n);
				
				if (s.equals(b)) {
					counter++;
				}

			}
			System.out.println("Counter of " + s + " is: " + counter+" ");
		}
		
	}

}
