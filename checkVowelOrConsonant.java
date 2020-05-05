/**
 * 
 */
package naveenAutomationPractice;

import java.util.Scanner;

/**
 * @author sami
 *
 */
public class checkVowelOrConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		
		System.out.println("Enter character u want to check is vowel or consonant");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if (ch ==a || ch == e ||ch == i || ch == o ||ch ==u) {
			System.out.println("character is vowel");
		}
		else {
			System.out.println("character is consonant");
		}
		

	}

}
