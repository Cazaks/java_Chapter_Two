import java.util.Scanner;
public class SeperatingIntegerDigits {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a 5 digit numbers: ");
		int number = scan.nextInt();

		if(number < 10000 || number > 99999){
		System.out.println("The number you enter is not a five digit number. Please enter five digit numbers");
		}
		else{
		int digit1 = number / 10000;
		int digit2 = (number / 1000) % 10;
		int digit3 = (number / 100) % 10;
		int digit4 = (number / 10) % 10;
		int digit5 = number % 10;

		System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5 + "   ");
		}
	}	
}