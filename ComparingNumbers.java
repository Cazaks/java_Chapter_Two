import java.util.Scanner;
public class ComparingNumbers{
	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter anumber: ");
		int number = scan.nextInt();
		int squareOfNumber = number * number;
		
		if(number > 100){
		System.out.printf("The number %d and its square %d are greater than 100", number,);
		}

		else if(number == 100 && squareOfNumber == 100){
		System.out.printf("The number %d and its square %d are equal to 100", number, squareOfNumber);
		}

		else {
		System.out.printf("The number %d and its square %d are less than 100", number, squareOfNumber);
		}



	}
}