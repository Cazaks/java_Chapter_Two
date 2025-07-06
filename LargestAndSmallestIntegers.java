import java.util.Scanner;
public class LargestAndSmallestIntegers{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter integer one: ");
		int firstInteger = scan.nextInt();

		System.out.print("Enter integer two: ");
		int secondInteger = scan.nextInt();

		System.out.print("Enter integer three: ");
		int thirdInteger = scan.nextInt();

		System.out.print("Enter integer four: ");
		int fourthInteger = scan.nextInt();

		System.out.print("Enter integer five: ");
		int fifthInteger = scan.nextInt();

		int largest = firstInteger;
		int smallest = firstInteger;

		if(secondInteger > largest){
		largest = secondInteger;
		}

		if(secondInteger < smallest){
		smallest = secondInteger;
		}
		
		if(thirdInteger > largest){
		largest = thirdInteger;
		}

		if(thirdInteger < smallest){
		smallest = thirdInteger;
		}

		if(fourthInteger > largest){
		largest = fourthInteger;
		}

		if(fourthInteger < smallest){
		smallest = fourthInteger;
		}

		if(fifthInteger > largest){
		largest = fifthInteger;
		}

		if(fifthInteger < smallest){
		smallest = fifthInteger;
		}
		
		System.out.println("The largest number entered is: " + largest);
		
		System.out.println("The smallest number entered is: " + smallest);


	}	
}