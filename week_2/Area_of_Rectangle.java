package week_2;
import java.util.Scanner;

public class Area_of_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double l = sc.nextDouble();
		System.out.print("Enter the width: ");
		double w= sc.nextDouble();
		sc.close();
		System.out.print("The Area of the Rectangle is " + l*w);

	}
}
