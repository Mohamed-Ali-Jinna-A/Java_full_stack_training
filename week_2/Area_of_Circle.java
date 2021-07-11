package week_2;
import java.util.Scanner;

public class Area_of_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float r = sc.nextFloat();
		sc.close();
		System.out.println("The Area of the Circle is " + Math.PI*r*r);
		System.out.print("The Circumference of the Cicle is " + 2*r*Math.PI);
	}
}

