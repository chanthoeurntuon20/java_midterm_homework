package quiz;
import java.util.Random;
import java.util.Arrays;
public class Answer {

	public static void main(String[] args) {
		//Initiate the array of integer with 15 elements		
		int[] numbers = new int[15];
		//Assign random number between -5 to 5
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(11)-5;
			
		}
//		int[] numbers = {2,3,4};Test array
//		
		//Output the array as string in the console
		System.out.println(Arrays.toString(numbers));
		System.out.println("");
		//a. find the largest number in this array
		int largest = numbers[0];
		for(int i = 0 ; i < numbers.length; i++) {
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println(" The largest is"+" "+ largest);
		
		System.out.println("");
		//b. find the smallest number in this array
		int smallest = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println(" The smallest is"+" "+ smallest);
		System.out.println("");
		
		//c. Display the result of this Boolean assertion : “all numbers greater than zero”
		
		boolean isNegative = false;//we assume no negative numbers(true of false if we want )
		for(int i = 0; i < numbers.length; i++){
			if (numbers[i] < 0){
			isNegative = true;
			break;
		}
		}
		if(isNegative == false){
			System.out.println("All numbers are greater than zero");
		}

		
		System.out.println("");
		//d. Display the result of this Boolean assertion : “at least one number greater than zero”
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 0) {
				System.out.println("at least one number greater than zero");
				break;
			}
			
		}
		System.out.println("");
		//e. Display how many numbers greater than zero or even appears in this arrays
		int count = 0;
		for(int i =0; i < numbers.length; i++) {
			if(numbers[i] > 0 || numbers[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("The numbers greater than zero or even is"+" "+ count);
	}

}
