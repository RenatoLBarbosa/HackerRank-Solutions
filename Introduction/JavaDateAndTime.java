package Introduction;
// Not editable on the challenge starts HERE
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	// Not editable on the challenge ends HERE
    	
    	// Object instance and creation - using Calendar from Java
    	Calendar cal = Calendar.getInstance();
    	// -1 because Java January is start from 0
    	// Setting the input values ​​for the object
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
        //Preparing the print like the sample output
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
        // Return necessary for the class
        return dayOfWeek;

    }

}
//Not editable on the challenge starts HERE
public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//Not editable on the challenge ends HERE







// Fastest way to develop the same answer

//import java.time.LocalDate;
//import java.util.Scanner;
//
//
//public class JavaDateAndTime {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		int year = sc.nextInt();
//		LocalDate dt = LocalDate.of(year, month, day);
//		System.out.println(dt.getDayOfWeek());
//		sc.close();
//	}
//}