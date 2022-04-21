package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		// Here is the input
		int[] numbers = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(numbers);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < numbers.length - 1; i++) {
			// check if the iterator variable is not equal to the array values respectively
			if (numbers[i] + 1 != numbers[i + 1])
			// print the number
			{
				System.out.println(numbers[i] + 1);
				// once printed break the iteration
				break;
			}
		}
	}
}
