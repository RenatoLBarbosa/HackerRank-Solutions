package Introduction;
import java.util.*;
import java.io.*;
//Import full library from util and io

public class JavaLoopsII {

	public static void main(String []argh){
		// Object instance and creation
        Scanner in = new Scanner(System.in);
        // Variable creation and reading the Integer
        int t=in.nextInt();
        // Initialization the "for" for run while the index is lower than recorded number of T
        for(int i=0;i<t;i++){
        	//Variable creation and reading the Integer and String
        	int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // temp created to use in calculation, acquiring value from a
            int temp = a;
            	// Initialization the "for" for run while the index is lower than recorded number of T
            	for (int j = 0; j < n; j++) {
                // += -> temp + (Math.pow(2, j) * b)
            	temp += (Math.pow(2, j) * b);
            	// Printed default like the sample output
            	System.out.print(temp + " ");
                }
            
            	System.out.println();
        }
        //Closing the Scanner
        in.close();
    }
        
}

