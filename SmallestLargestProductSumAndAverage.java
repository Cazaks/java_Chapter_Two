import java.util.Scanner;
public class SmallestLargestProductSumAndAverage{
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int number2= scan.nextInt();

		System.out.println("Enter third number: ");
		int number3 = scan.nextInt();
		
		int sum = number1 + number2 + number3;
		int average = sum / 3;
		int product = number1 * number2 * number3;
		
		int largest = number1;
		int smallest = number1;
		
		if(number2 > largest){
		largest = number2;
		}

		if(number2 < smallest){
		smallest = number2;
		}

		if(number3 > largest){
		largest = number3;
		}

		if(number3 < smallest){
		smallest = number3;
		}

		System.out.println("The sum of the numbers entered by the user is: " + sum);

		System.out.println("The average of the numbers entered by the user is: " + average);

		System.out.println("The pruduct of the numbers entered by the user is: " + product);

		System.out.println("The largest number entered by the user is: " + largest);

		System.out.println("The smalest number entered by the user is: " + smallest);






	}
}