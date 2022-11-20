package Labs;

public class week3 {

	public static void main(String[] args) {
		//create an array with the following values, 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, 13, 6};
		
		//print out the first element in the array
		System.out.println(array[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]);
		
		//out of bounds exception means it does not exist in the array
		//write a traditional for loop that prints out each element in the array
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		//write an enhanced for loop that prints out each element in the array
		for(int number : array)
		{
		System.out.println(number);	
		}
		//write a new variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for(int number : array)
		{
			sum += number;
		}
		System.out.println(sum);
		//create a new variable called average and assign the average value of the array to it
		double average = sum/array.length;
		System.out.println(average);
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int number : array)
		{
			if(number %2 != 0)
			{
				System.out.println(number);
			}
		System.out.println("-----------------------");
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for(String name : names)
		{
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		}
	}

} 