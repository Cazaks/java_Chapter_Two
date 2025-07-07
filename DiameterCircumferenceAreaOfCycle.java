import java.util.Scanner;
public class DiameterCircumferenceAreaOfCycle {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius of a cycle: ");
		double radius = scan.nextDouble();

		System.out.printf("The cycle diameters is %.2f%n", 2 * radius, "The circumference is %.2f%n", 2 * Math.PI * radius);
		
		System.out.printf("The circumference is %.2f%n", 2 * Math.PI * radius);
		
		System.out.printf("The area of the cycle is %.2f%n", Math.PI * radius * radius);
		
	}	
}