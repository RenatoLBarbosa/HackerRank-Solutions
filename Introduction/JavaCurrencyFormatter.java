package Introduction;
import java.util.*;
import java.text.*;
//Import full library from util and text

public class JavaCurrencyFormatter {
	public static void main(String[] args) {
		// Object instance and creation
		Scanner sc = new Scanner(System.in);
		// Variable creation and reading the Double
	    double payment = sc.nextDouble();
	    //Closing the Scanner
	    sc.close();
	    // Created a new Locale with English as the language and India as the country
	    Locale INDIA = new Locale("en", "IN");//Creates a new Locale with English as the language and India as teh country
	    
	    //Preparing the print with the payment format of your respective country using the NumberFormat class
	    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	    String india = NumberFormat.getCurrencyInstance(INDIA).format(payment); // Locale.INDIA doesn't exists by default
	    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	    
	    //Preparing the print like the sample output
	    System.out.println("US: " + us);
	    System.out.println("India: " + india);
	    System.out.println("China: " + china);
	    System.out.println("France: " + france);
	}
	
}
