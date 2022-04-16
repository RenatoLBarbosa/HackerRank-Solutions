package Introduction;
import java.util.*;
import java.io.*;
//Import full library from util and io

public class DataTypes {

	public static void main(String []argh)
    {
		// Object instance and creation
        Scanner sc = new Scanner(System.in);
        // Variable creation and reading the Integer
        int t=sc.nextInt();
        // Initialization the "for" for run while the index is lower than recorded number of T
        for(int i=0;i<t;i++)
        {
        	// "Try" to handle the possible exception
            try
            {
            	// Variable creation and reading the Long
                long x=sc.nextLong();
                // Printed default like the sample output
                System.out.println(x+" can be fitted in:");
                // Parameterizing test if the value of x fits like byte
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                //  Parameterizing test if the value of x fits like short
                if (x >= -(Math.pow(2, 16 - 1)) && x <= (Math.pow(2, 16 - 1) - 1))
                    System.out.println("* short");
                // Parameterizing test if the value of x fits like Integer
                if (x >= -(Math.pow(2, 32 - 1)) && x <= (Math.pow(2, 32 - 1) - 1))
                    System.out.println("* int");
                // Parameterizing test if the value of x fits like Long
                if (x >= -(Math.pow(2, 64 - 1)) && x <= (Math.pow(2, 64 - 1) - 1))
                    System.out.println("* long");
            }
            // If necessary, "Catch" will handle the Exception and execute the print like the sample output 
            catch(Exception e) 
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        //Closing the Scanner
        sc.close();
    }
}
