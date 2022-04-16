package Introduction;
import java.util.Scanner;
//Import the library from Scanner

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		// Object instance and creation
        Scanner scan = new Scanner(System.in);
        
        // Variable creation and reading the Integer and Double
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        
        // next() capture a String until the space in between the words
        // nextLine() capture a String until the new line
        scan.nextLine();
        String s = scan.nextLine();
        
        //Closing the Scanner
        scan.close();
        
        // Start printing out the Integers in the variables
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
