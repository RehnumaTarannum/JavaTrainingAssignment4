/*	Java Training Assignment 3 
	Date 3/14/2017
	Organizer: Jeshal Mehta
	Participant : Rehnuma Taraannum
	tarannum.rehnuma@gmail.com
*/
import java.util.Scanner;

public class MyCalculator {
	/*	The power method that checks if either 
	 *  input parameters are zero it throws an exception
	 */
	public void power(double n, double p) throws Exception{
		if(n<0 || p<0){
			throw new Exception();
		}
		else{
			System.out.println((int)n+" to the power "+(int)p+": "+(int) Math.pow(n, p));
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Java Training Assignment 4: MyCalculator\n");
		System.out.println("\tCREATED BY REHNUMA TARANNUM\n");
		MyCalculator cal = new MyCalculator();
		try {
			/*	Calling power method with 
			 *  provided sample test cases
			 */
			cal.power(3, 5);
			cal.power(2, 4);
			cal.power(1, -9);
			cal.power(-1, -2);
			cal.power(-1, 3);
		} catch (Exception e) {
			/*	Printing out the type of caught exception 
			 *  and a custom message
			 */
			System.out.println(e+": n and p should be non-negative");
		}
	}

}
