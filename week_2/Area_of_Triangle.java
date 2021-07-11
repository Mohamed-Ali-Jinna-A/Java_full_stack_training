package week_2;
import java.util.Scanner;

public class Area_of_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		double h = sc.nextDouble();
		System.out.print("Enter the base: ");
		double b= sc.nextDouble();
		sc.close();
		System.out.print("The Area of the Triangle is " + (h*b)/2);
	}
}

