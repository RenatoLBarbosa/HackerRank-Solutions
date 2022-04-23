package Introduction;

import java.util.Scanner;
//Import full library from Scanner

public class JavaIfElse {

	public static void main(String[] args) {
		// Object instance and creation
		Scanner sc = new Scanner(System.in);
		// Variable creation and reading the Integer
		int n = sc.nextInt();
		String ans = "";
		// "If" n is odd set for ans "weird"
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			// Else validate another tasks, if in the include range of 6 and 20 set for ans "weird" else "Not weird"
			if (n >= 6 && n <= 20) {
				ans = "Weird";
			} else {
				ans = "Not Weird";
			}
		// Print like the sample output 
		}
		System.out.println(ans);
		//Closing the Scanner
		sc.close();
	}
}
