package week1.day2.assignments;

public class FindIntersection {
	public static void main(String[] args) {
//Declare An array for {3,2,11,4,6,7};
		int[] numbers = {3,2,11,4,6,7};
//Declare Another array for {1,2,8,4,9,7};		
		int[] numerics = {1,2,8,4,9,7};
		
//Declare for loop iterator from 0 to array length
		for (int i = 0; i < numbers.length; i++)	{
		for (int j = 0; j < numerics.length; j++)	{
		
		
//Compare Both the arrays using a condition statement
		if (numbers[i]==numerics[j])			{
//Print the first array (shoud match item in both arrays)
		System.out.println(numbers[i]);
		}
		}
		}
	}
}

	