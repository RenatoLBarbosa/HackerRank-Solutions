package Introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// imports not editable on the challenge

public class JavaStaticInitializerBlock {
	// Static utilization for access the variables and objects on static startup block and main
	// Object instance and creation
    static Scanner sc = new Scanner(System.in);
    // Variable creation and reading the Integer and Boolean
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag;
    // static startup block
    static {
    	// "Try" to handle the possible exception
        try {
        	// Validating variable B and H > 0 to return true on Flag
            if (B > 0 && H > 0) {
                flag = true;
            } else {
            	// If flag is false throw the new Exception created below
                throw new Exception("Breadth and height must be positive");
            }
        //If necessary, "Catch" will handle the Exception and execute the print obtained from the Exception class
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // main not editable on the challenge
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
