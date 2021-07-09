package knightingale;
import java.util.Scanner;

public class Swap_two_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		float f1 = sc.nextFloat();
		System.out.print("Enter the second number: ");
		float f2 = sc.nextFloat();
		sc.close();
		System.out.println("!_______Before swap________!");
		System.out.println("First number = " + f1);
		System.out.println("Second number = " + f2);
		float temp = f1;
		f1 = f2; 
		f2 = temp;
		System.out.println("!_______After swap_________!");
		System.out.println("First number = " + f1);
		System.out.println("Second number = " + f2);
	}
}
