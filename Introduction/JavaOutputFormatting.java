package Introduction;
import java.util.Scanner;
//Import the library from Scanner

public class JavaOutputFormatting {

	public static void main(String[] args) {
		// Object instance and creation
        Scanner sc=new Scanner(System.in);
        // Printed default like the sample output
        System.out.println("================================");
        
        // Initialization the "for" for three inputs
        for(int i=0;i<3;i++){
        	//Variable creation and reading the Integer and String
        	String s1=sc.next();
            int x=sc.nextInt();
            // Print with formatting requested 
            // % inform the formatting
            // - align at left
            // 15 fills the string up to 15 chars (add spaces)
            // s setting the format parameters for the String
            // 0 is the fill char if necessary 
            // 3 the width to setup the Integers, and will fill with 0's at left if necessary to complete the 3 digits
            // d setting the format parameters for the Integer
            System.out.printf("%-15s%03d\n", s1, x);
        }
        // Printed default like the sample output
        System.out.println("================================");
        //Closing the Scanner
        sc.close();
		
	}
	
}
