import java.util.Scanner;
public class DivisibleBy3{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		if(number % 3 == 0){
		System.out.println(number + " is divisible by 3");
		}

		else{
		System.out.println(number + " is not divisible by 3");
		}

	}	
}