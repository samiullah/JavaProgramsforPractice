/**
 * 
 */
package naveenAutomationPractice;

import java.util.Scanner;

/**
 * @author sami
 *
 */
public class positiveOrNegative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number ");
		Scanner scan = new Scanner(System.in);
		int num  = scan.nextInt();
		

		
		if (num>=0) {
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}

	}

}
