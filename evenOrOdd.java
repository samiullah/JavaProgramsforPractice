/**
 * 
 */
package naveenAutomationPractice;

import java.util.Scanner;

/**
 * @author sami
 *
 */
public class evenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number you want to know is even or odd");
		Scanner num = new Scanner(System.in);
		int numb = num.nextInt();
		evenOrOdd obj = new evenOrOdd();
		System.out.print(obj.evenodd(numb));
		
		

	}
	
	public int evenodd(int a) {
		
		if (a%2 == 0)
		{
			System.out.println(a + " is even");
		}
		
		else
		{
			System.out.println(a + " is odd");
		}
		
		return a;
		
	}

}
