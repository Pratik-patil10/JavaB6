package homeWorks;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// From given array of 1 to 100 unique nos. but in array only 99 are present
		// ,find missing no.

		int input[] = {1,2,3,5};
		int allAdd = 0;

		for (int i = 1; i <=5; i++) {

			allAdd = allAdd + i; // all addtion of array no.
		}

		int arrayAdd = 0;

		for (int j = 0; j < input.length; j++) {
			arrayAdd = arrayAdd + input[j];
		}

		int missingNumber =allAdd-arrayAdd;

		System.out.println(missingNumber);

	}

}
