package knightingale;
import java.util.Scanner;

public class Vowel_or_Not {
	public static void main(String[] args) {
		System.out.print("Enter the character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println(ch + " is a Vowel");
		}
		else 
		{
			System.out.println(ch + " is consonant");
		}
	}
}
