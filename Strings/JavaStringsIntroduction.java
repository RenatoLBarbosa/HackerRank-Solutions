package Strings;

import java.util.Scanner;
//Import the library from Scanner

public class JavaStringsIntroduction {

    public static void main(String[] args) {
    	// Object instance and creation
        Scanner sc = new Scanner(System.in);
        
        // Variable creation and reading the String until the blank space / line
        String A = sc.next();
        String B = sc.next();
        
        // Performs the sum between the number of characters in A and B and prints
        System.out.println(A.length() + B.length());
        // Condition -> ? - If  : - Else
        int l = A.length() > B.length() ? B.length() : A.length();
        // Initialize the variable
        String str = "";
        
        for (int i = 0; i < l; i++) {
        	// If the first char of A comes before the first character of B assigns value Yes to the variable str and break the execution
        	// cast to int converting char to ansi table
        	if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
                str = "Yes";
                break;
            }else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
                str = "No";
                break;
            } // Break for validation only the first char
        } // Validation in case of str don't have "Yes" or "No"
        if (str == "") {
            if (A.length() > B.length()) {
                str = "Yes";
            } else {
                str = "No";
            }
        }
        // Print the second line of the sample output
        System.out.println(str);
        // Print like the sample output, setting the first char UpperCase and with an space between the value of B following the same pattern
        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
                + B.substring(1, B.length()));
        //Closing the Scanner
        sc.close();
    }
}
