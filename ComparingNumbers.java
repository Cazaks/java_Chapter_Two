import java.util.Scanner;
public class ComparingNumbers{
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter anumber: ");
		int number = scan.nextInt();
		int squareOfNumber = number * number;
		
		if(number > 100){
		System.out.printf("%d is greater than 100 %n", number);
		}

		if(squareOfNumber > 100){
		System.out.printf("The sqaure of %d  which is %d, is greater than 100 %n", number, squareOfNumber); 
		}
		
		if(number < 100){
		System.out.printf("%d is less than 100 %n", number);
		}

		if(squareOfNumber < 100){
		System.out.printf("The sqaure of %d  which is %d, is less than 100 %n", number, squareOfNumber); 
		}

		if(number == 100){
		System.out.printf("%d is equal to 100 %n", number);
		}

		if(squareOfNumber == 100){
		System.out.printf("The sqaure of %d  which is %d, is equal to 100 %n", number, squareOfNumber); 
		}

		if(number != 100){
		System.out.printf("%d is not equal to 100 %n", number);
		}

		if(squareOfNumber != 100){
		System.out.printf("The sqaure of %d  which is %d, is not equal to 100%n", number, squareOfNumber); 
		}

	}
}