import java.util.Scanner;
public class SquareOfNumbers{
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scan.nextInt();

		int squarenumber1 = number1 * number1;
		int squarenumber2 = number2 * number2;

		int sum = squarenumber1 + squarenumber2;
		int difference = squarenumber1 - squarenumber2;

		System.out.println("The square of first number (" + number1 + ") entered by the user is: " + squarenumber1);

		System.out.println("The square of second number (" + number2 + ") entered by the user is: " + squarenumber2);

		System.out.println("The sum of their square is: " + sum);

		System.out.println("The differnece of their square is: " + difference);

	}
}