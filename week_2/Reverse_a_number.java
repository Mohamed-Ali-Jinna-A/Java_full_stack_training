package week_2;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		int num= 0, reversenum=0;
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		while(num != 0) {
			reversenum = reversenum *10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is " + reversenum);
		
	}

}
