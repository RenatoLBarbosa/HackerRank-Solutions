package Introduction;
import java.util.Scanner;
// Import the library from Scanner

public class JavaStdinAndStdoutI {

	
	public static void main(String[] args) {
		// Object instance and creation
		Scanner scanner = new Scanner(System.in);
		
		// Variable creation and reading the Integer
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//Closing the Scanner
		scanner.close();
		
		// Start printing out the Integers in the variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
