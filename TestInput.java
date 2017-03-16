/*	Java Training Assignment 3 
	Date 3/14/2017
	Organizer: Jeshal Mehta
	Participant : Rehnuma Taraannum
	tarannum.rehnuma@gmail.com
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInput {
	/*	The divisible method that checks if the second 
	 *  input parameter is zero it throws an exception
	 *  else prints out a/b
 	*/
	public void divisible(int a , int b) throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException();
		}
		else{
			System.out.print(a+" / "+b+" = "+(double)a/b+"\n");
		}
			
		
	}

	public static void main(String[] args) {
		TestInput t = new TestInput();
		System.out.println("Java Training Assignment 4: Question 2\n");
		System.out.println("\tCREATED BY REHNUMA TARANNUM\n");
		System.out.println("Please enter two numbers");
		Scanner sc = new Scanner(System.in);
		/* The outer try catch block catches 
		 * exception due to user input
		 */
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			/*	The inner try catch block catches 
			 * 	exception thrown by divisible method
			 */
			try {
				t.divisible(a, b);
			} catch (Exception ae) {
				System.out.println(ae);
			}
		} catch (InputMismatchException ie) {
			System.out.println(ie);
		}
	}

}
