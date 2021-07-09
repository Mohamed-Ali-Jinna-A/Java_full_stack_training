package knightingale;

import java.util.Scanner;

public class Find_Ascii_value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		System.out.print("Input a character: ");    
		char c = sc.next().charAt(0);
		sc.close();
		int ascii = c;
		System.out.println("The ASCII value is: " + ascii);
	     
	}

}
