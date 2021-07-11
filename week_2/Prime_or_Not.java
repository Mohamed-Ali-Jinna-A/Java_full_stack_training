package week_2;
import java.util.Scanner;

public class Prime_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to search: "); 
		int num = sc.nextInt(); boolean boo = true;
		sc.close();
		for(int i = 2; i < num ; i++) {
			if (num == 2) {
				System.out.println("2 is a Prime number");
			}
			if(num%i==0) {
				boo = false;
				break;
			}
		}
		if(boo == true) {
			System.out.println(num + " is a Prime number");
		}
		else {
			System.out.println(num + " is  not a Prime number");
		}
		}	
	}

	
