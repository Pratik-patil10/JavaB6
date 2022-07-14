package homeWorks;

public class ExpandString {
	// Input string=3a 2b 1c ouput=aaabbc

	public static void main(String[] args) {
		String input = "3a2b1c";
		String output = "";

		for (int i = 0; i < input.length(); i = i + 2) // instead of i++ -->i=i+2 beacuse string is present at 2 of gap
		{
			char num = input.charAt(i);
			int number = Character.getNumericValue(num);

			for (int j = 1; j <= number; j++) {
				output = output + input.charAt(i + 1);
			}

		}
		
		System.out.println(output);

	}

}
