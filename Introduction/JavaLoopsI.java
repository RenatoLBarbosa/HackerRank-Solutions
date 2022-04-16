package Introduction;
import java.util.Scanner;
//Import the library from Scanner

public class JavaLoopsI {

	public static void main(String[] args) {
		// Object instance and creation
        Scanner sc = new Scanner(System.in);
        // Variable creation and reading the Integer
        int n = sc.nextInt();
        //Closing the Scanner
        sc.close();
        
        // Initialization the "for" for 10 lines of calculation
        for (int i=1;i<=10;i++){
        	// Calculating the multiplication
            int result = n * i;
            // Printed default like the sample output
            System.out.println(n +" x "+i+" = "+result); 
        }
        
    }
}
