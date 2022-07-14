package homeWorks;

public class StringCountSpecialChar {

	public static void main(String[] args) {
		// Print Count alphabates,digits and special characters in the String
		// input a1b%$av1 -> alphabates-4 , digit/number->2 specialchar ->2

		String input = "a1b%$av1";
		int alphabet = 0;
		String allAlphabet = "";

		int digit = 0;
		String allDigit = "";

		int speicalChar = 0;
		String allspeicalChar = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isAlphabetic(c)) {
				alphabet = alphabet + 1;
				allAlphabet = allAlphabet + c;
			} else if (Character.isDigit(c)) {
				digit = digit + 1;
				allDigit = allDigit + c;
			} else {
				speicalChar = speicalChar + 1;
				allspeicalChar = allspeicalChar + c;
			}

		}
		System.out.println("count of alphabates : " + alphabet + ", list : " + allAlphabet);
		System.out.println("count of digit : " + digit + ", list : " + allDigit);
		System.out.println("count of speicalChar : " + speicalChar + ", list : " + allspeicalChar);

	}

}
