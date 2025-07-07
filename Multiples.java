import java.util.Scanner;
public class Multiples {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = scan.nextInt();

		System.out.print("Enter second number: ");
		int number2 = scan.nextInt();

		int triple = number1 * 3;
		int doub = number2 * 2;

		if(triple % doub == 0){
		System.out.println("First number triple is a multiple of the second number double");
		}

		else{
		System.out.println("It is not the multiple of the second number");
		}

	}	
}