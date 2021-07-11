package week_2;
import java.util.Scanner;

public class Area_of_Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double a = sc.nextDouble();
		sc.close();
		System.out.print("The Area of the Square is " + a*a );
	}
}
