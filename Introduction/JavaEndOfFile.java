package Introduction;
import java.util.Scanner;
//Import the library from Scanner

public class JavaEndOfFile {

	public static void main(String[] args) {
		// Object instance and creation
        Scanner sc = new Scanner(System.in);
        // Variable creation and set value 1, for counting start at 1.
        int counter = 1;
        // "While" with condition hasNext for while exists a next input continue the execution 
        while (sc.hasNext()) {
        	// Print like the sample output, entering the count and execute nextLine method
            System.out.println(counter++ + " " + sc.nextLine());
        }
        //Closing the Scanner
        sc.close();
        
    }

}
