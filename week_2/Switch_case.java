package week_2;
import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Java class Schedule....\n" + "Enter the day : ");
		String s = sc.next();
		sc.close();
		switch(s){
			case "Monday", "Wednesday", "Friday" :
				System.out.println("Java class - 7 to 9 PM");
				break;
			case "Tuesday" , "Thursday":
				System.out.println("No Java class");
				break;
			case "Saturday" , "Sunday":
				System.out.println("Holiday");
				break;
			default:
				System.out.println("Please enter a valid day..!");
		}
	}
}
